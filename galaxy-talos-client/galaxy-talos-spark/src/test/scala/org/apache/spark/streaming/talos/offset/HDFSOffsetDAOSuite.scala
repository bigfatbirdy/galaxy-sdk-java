package org.apache.spark.streaming.talos.offset

import java.io.{File, FileOutputStream}

import org.apache.commons.io.{FileUtils, IOUtils}
import org.apache.hadoop.conf.Configuration
import org.apache.spark.streaming.Time
import org.apache.spark.streaming.talos.TopicPartition
import org.apache.spark.util.Utils
import org.scalatest.{BeforeAndAfter, FunSuite}

class HDFSOffsetDAOSuite extends FunSuite with BeforeAndAfter {
  private val dir = "/tmp/galaxy-talos-spark-test/"
  private var dao: HDFSOffsetDAO = _

  before {
    dao = new HDFSOffsetDAO(dir, new Configuration())
    FileUtils.deleteDirectory(new File(dir))
    new File(dir).mkdir()
  }

  after {
    dao = null
    //    FileUtils.deleteDirectory(new File(dir))
  }

  test("get offset files ordered by oldest-first.") {
    val Array(file000, file001, file002) = Array("offset-000", "offset-001", "offset-002")

    new File(dir + file002).createNewFile()
    new File(dir + file001).createNewFile()
    new File(dir + file000).createNewFile()
    val offsetFiles = dao.getOffsetFiles().toArray
    assert(offsetFiles(0).getName.endsWith(file000))
    assert(offsetFiles(1).getName.endsWith(file001))
    assert(offsetFiles(2).getName.endsWith(file002))
  }

  test("save offsets") {
    (1 to 11).foreach { i =>
      val time = Time(i.toLong)
      val offsets = Map(
        TopicPartition("test", 0) -> 1L,
        TopicPartition("test", 1) -> 2L
      )
      dao.doSave(time, offsets)
    }
    import scala.collection.JavaConverters._
    val filesNum = FileUtils.listFiles(new File(dir), null, false)
      .asScala.filter(_.getName.startsWith("offset")).size
    assert(filesNum == 10)
    val files = dao.getOffsetFiles()
    assert(files.head.getName === "offset-2")
    assert(files.last.getName == "offset-11")
  }

  test("restore offsets") {
    val emptyOffsets = dao.restore()
    assert(emptyOffsets.isEmpty)

    val offsets = Map(
      ("test", 0) -> 1L,
      ("test", 1) -> 2L
    )

    val offsetFile = new File(dir + "offset-000")
    IOUtils.write(Utils.serialize(offsets), new FileOutputStream(offsetFile))
    val restoredOffsets = dao.restore()
    assert(restoredOffsets.get === offsets.map { case (key, value) =>
      TopicPartition(key._1, key._2) -> value
    })
  }

}

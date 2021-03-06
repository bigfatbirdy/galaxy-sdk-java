/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * internal mutation log entry
 * 
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-12-27")
public class InternalMutationLogEntry implements libthrift091.TBase<InternalMutationLogEntry, InternalMutationLogEntry._Fields>, java.io.Serializable, Cloneable, Comparable<InternalMutationLogEntry> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("InternalMutationLogEntry");

  private static final libthrift091.protocol.TField RECORD_FIELD_DESC = new libthrift091.protocol.TField("record", libthrift091.protocol.TType.MAP, (short)1);
  private static final libthrift091.protocol.TField TYPE_FIELD_DESC = new libthrift091.protocol.TField("type", libthrift091.protocol.TType.I32, (short)2);
  private static final libthrift091.protocol.TField ROW_DELETED_FIELD_DESC = new libthrift091.protocol.TField("rowDeleted", libthrift091.protocol.TType.BOOL, (short)3);
  private static final libthrift091.protocol.TField AMOUNTS_FIELD_DESC = new libthrift091.protocol.TField("amounts", libthrift091.protocol.TType.MAP, (short)4);
  private static final libthrift091.protocol.TField TOPIC_NAME_FIELD_DESC = new libthrift091.protocol.TField("topicName", libthrift091.protocol.TType.STRING, (short)5);
  private static final libthrift091.protocol.TField STREAM_TYPE_FIELD_DESC = new libthrift091.protocol.TField("streamType", libthrift091.protocol.TType.I32, (short)6);
  private static final libthrift091.protocol.TField PARTITION_NUM_FIELD_DESC = new libthrift091.protocol.TField("partitionNum", libthrift091.protocol.TType.I32, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new InternalMutationLogEntryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new InternalMutationLogEntryTupleSchemeFactory());
  }

  /**
   * row key and items
   */
  public Map<String,Datum> record; // optional
  /**
   * mutation type
   * 
   * @see MutationType
   */
  public MutationType type; // optional
  /**
   * is row deleted or not
   */
  public boolean rowDeleted; // optional
  /**
   * increment amounts
   */
  public Map<String,Datum> amounts; // optional
  /**
   * mq topic name
   */
  public String topicName; // optional
  /**
   * stream type
   * 
   * @see StreamViewType
   */
  public StreamViewType streamType; // optional
  /**
   * topic partition number
   */
  public int partitionNum; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * row key and items
     */
    RECORD((short)1, "record"),
    /**
     * mutation type
     * 
     * @see MutationType
     */
    TYPE((short)2, "type"),
    /**
     * is row deleted or not
     */
    ROW_DELETED((short)3, "rowDeleted"),
    /**
     * increment amounts
     */
    AMOUNTS((short)4, "amounts"),
    /**
     * mq topic name
     */
    TOPIC_NAME((short)5, "topicName"),
    /**
     * stream type
     * 
     * @see StreamViewType
     */
    STREAM_TYPE((short)6, "streamType"),
    /**
     * topic partition number
     */
    PARTITION_NUM((short)7, "partitionNum");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // RECORD
          return RECORD;
        case 2: // TYPE
          return TYPE;
        case 3: // ROW_DELETED
          return ROW_DELETED;
        case 4: // AMOUNTS
          return AMOUNTS;
        case 5: // TOPIC_NAME
          return TOPIC_NAME;
        case 6: // STREAM_TYPE
          return STREAM_TYPE;
        case 7: // PARTITION_NUM
          return PARTITION_NUM;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ROWDELETED_ISSET_ID = 0;
  private static final int __PARTITIONNUM_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.RECORD,_Fields.TYPE,_Fields.ROW_DELETED,_Fields.AMOUNTS,_Fields.TOPIC_NAME,_Fields.STREAM_TYPE,_Fields.PARTITION_NUM};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RECORD, new libthrift091.meta_data.FieldMetaData("record", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.MAP        , "Dictionary")));
    tmpMap.put(_Fields.TYPE, new libthrift091.meta_data.FieldMetaData("type", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, MutationType.class)));
    tmpMap.put(_Fields.ROW_DELETED, new libthrift091.meta_data.FieldMetaData("rowDeleted", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    tmpMap.put(_Fields.AMOUNTS, new libthrift091.meta_data.FieldMetaData("amounts", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.MAP        , "Dictionary")));
    tmpMap.put(_Fields.TOPIC_NAME, new libthrift091.meta_data.FieldMetaData("topicName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.STREAM_TYPE, new libthrift091.meta_data.FieldMetaData("streamType", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, StreamViewType.class)));
    tmpMap.put(_Fields.PARTITION_NUM, new libthrift091.meta_data.FieldMetaData("partitionNum", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(InternalMutationLogEntry.class, metaDataMap);
  }

  public InternalMutationLogEntry() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public InternalMutationLogEntry(InternalMutationLogEntry other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetRecord()) {
      this.record = other.record;
    }
    if (other.isSetType()) {
      this.type = other.type;
    }
    this.rowDeleted = other.rowDeleted;
    if (other.isSetAmounts()) {
      this.amounts = other.amounts;
    }
    if (other.isSetTopicName()) {
      this.topicName = other.topicName;
    }
    if (other.isSetStreamType()) {
      this.streamType = other.streamType;
    }
    this.partitionNum = other.partitionNum;
  }

  public InternalMutationLogEntry deepCopy() {
    return new InternalMutationLogEntry(this);
  }

  @Override
  public void clear() {
    this.record = null;
    this.type = null;
    setRowDeletedIsSet(false);
    this.rowDeleted = false;
    this.amounts = null;
    this.topicName = null;
    this.streamType = null;
    setPartitionNumIsSet(false);
    this.partitionNum = 0;
  }

  public int getRecordSize() {
    return (this.record == null) ? 0 : this.record.size();
  }

  public void putToRecord(String key, Datum val) {
    if (this.record == null) {
      this.record = new HashMap<String,Datum>();
    }
    this.record.put(key, val);
  }

  /**
   * row key and items
   */
  public Map<String,Datum> getRecord() {
    return this.record;
  }

  /**
   * row key and items
   */
  public InternalMutationLogEntry setRecord(Map<String,Datum> record) {
    this.record = record;
    return this;
  }

  public void unsetRecord() {
    this.record = null;
  }

  /** Returns true if field record is set (has been assigned a value) and false otherwise */
  public boolean isSetRecord() {
    return this.record != null;
  }

  public void setRecordIsSet(boolean value) {
    if (!value) {
      this.record = null;
    }
  }

  /**
   * mutation type
   * 
   * @see MutationType
   */
  public MutationType getType() {
    return this.type;
  }

  /**
   * mutation type
   * 
   * @see MutationType
   */
  public InternalMutationLogEntry setType(MutationType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  /**
   * is row deleted or not
   */
  public boolean isRowDeleted() {
    return this.rowDeleted;
  }

  /**
   * is row deleted or not
   */
  public InternalMutationLogEntry setRowDeleted(boolean rowDeleted) {
    this.rowDeleted = rowDeleted;
    setRowDeletedIsSet(true);
    return this;
  }

  public void unsetRowDeleted() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ROWDELETED_ISSET_ID);
  }

  /** Returns true if field rowDeleted is set (has been assigned a value) and false otherwise */
  public boolean isSetRowDeleted() {
    return EncodingUtils.testBit(__isset_bitfield, __ROWDELETED_ISSET_ID);
  }

  public void setRowDeletedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ROWDELETED_ISSET_ID, value);
  }

  public int getAmountsSize() {
    return (this.amounts == null) ? 0 : this.amounts.size();
  }

  public void putToAmounts(String key, Datum val) {
    if (this.amounts == null) {
      this.amounts = new HashMap<String,Datum>();
    }
    this.amounts.put(key, val);
  }

  /**
   * increment amounts
   */
  public Map<String,Datum> getAmounts() {
    return this.amounts;
  }

  /**
   * increment amounts
   */
  public InternalMutationLogEntry setAmounts(Map<String,Datum> amounts) {
    this.amounts = amounts;
    return this;
  }

  public void unsetAmounts() {
    this.amounts = null;
  }

  /** Returns true if field amounts is set (has been assigned a value) and false otherwise */
  public boolean isSetAmounts() {
    return this.amounts != null;
  }

  public void setAmountsIsSet(boolean value) {
    if (!value) {
      this.amounts = null;
    }
  }

  /**
   * mq topic name
   */
  public String getTopicName() {
    return this.topicName;
  }

  /**
   * mq topic name
   */
  public InternalMutationLogEntry setTopicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

  public void unsetTopicName() {
    this.topicName = null;
  }

  /** Returns true if field topicName is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicName() {
    return this.topicName != null;
  }

  public void setTopicNameIsSet(boolean value) {
    if (!value) {
      this.topicName = null;
    }
  }

  /**
   * stream type
   * 
   * @see StreamViewType
   */
  public StreamViewType getStreamType() {
    return this.streamType;
  }

  /**
   * stream type
   * 
   * @see StreamViewType
   */
  public InternalMutationLogEntry setStreamType(StreamViewType streamType) {
    this.streamType = streamType;
    return this;
  }

  public void unsetStreamType() {
    this.streamType = null;
  }

  /** Returns true if field streamType is set (has been assigned a value) and false otherwise */
  public boolean isSetStreamType() {
    return this.streamType != null;
  }

  public void setStreamTypeIsSet(boolean value) {
    if (!value) {
      this.streamType = null;
    }
  }

  /**
   * topic partition number
   */
  public int getPartitionNum() {
    return this.partitionNum;
  }

  /**
   * topic partition number
   */
  public InternalMutationLogEntry setPartitionNum(int partitionNum) {
    this.partitionNum = partitionNum;
    setPartitionNumIsSet(true);
    return this;
  }

  public void unsetPartitionNum() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PARTITIONNUM_ISSET_ID);
  }

  /** Returns true if field partitionNum is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionNum() {
    return EncodingUtils.testBit(__isset_bitfield, __PARTITIONNUM_ISSET_ID);
  }

  public void setPartitionNumIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PARTITIONNUM_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RECORD:
      if (value == null) {
        unsetRecord();
      } else {
        setRecord((Map<String,Datum>)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((MutationType)value);
      }
      break;

    case ROW_DELETED:
      if (value == null) {
        unsetRowDeleted();
      } else {
        setRowDeleted((Boolean)value);
      }
      break;

    case AMOUNTS:
      if (value == null) {
        unsetAmounts();
      } else {
        setAmounts((Map<String,Datum>)value);
      }
      break;

    case TOPIC_NAME:
      if (value == null) {
        unsetTopicName();
      } else {
        setTopicName((String)value);
      }
      break;

    case STREAM_TYPE:
      if (value == null) {
        unsetStreamType();
      } else {
        setStreamType((StreamViewType)value);
      }
      break;

    case PARTITION_NUM:
      if (value == null) {
        unsetPartitionNum();
      } else {
        setPartitionNum((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RECORD:
      return getRecord();

    case TYPE:
      return getType();

    case ROW_DELETED:
      return Boolean.valueOf(isRowDeleted());

    case AMOUNTS:
      return getAmounts();

    case TOPIC_NAME:
      return getTopicName();

    case STREAM_TYPE:
      return getStreamType();

    case PARTITION_NUM:
      return Integer.valueOf(getPartitionNum());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RECORD:
      return isSetRecord();
    case TYPE:
      return isSetType();
    case ROW_DELETED:
      return isSetRowDeleted();
    case AMOUNTS:
      return isSetAmounts();
    case TOPIC_NAME:
      return isSetTopicName();
    case STREAM_TYPE:
      return isSetStreamType();
    case PARTITION_NUM:
      return isSetPartitionNum();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof InternalMutationLogEntry)
      return this.equals((InternalMutationLogEntry)that);
    return false;
  }

  public boolean equals(InternalMutationLogEntry that) {
    if (that == null)
      return false;

    boolean this_present_record = true && this.isSetRecord();
    boolean that_present_record = true && that.isSetRecord();
    if (this_present_record || that_present_record) {
      if (!(this_present_record && that_present_record))
        return false;
      if (!this.record.equals(that.record))
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_rowDeleted = true && this.isSetRowDeleted();
    boolean that_present_rowDeleted = true && that.isSetRowDeleted();
    if (this_present_rowDeleted || that_present_rowDeleted) {
      if (!(this_present_rowDeleted && that_present_rowDeleted))
        return false;
      if (this.rowDeleted != that.rowDeleted)
        return false;
    }

    boolean this_present_amounts = true && this.isSetAmounts();
    boolean that_present_amounts = true && that.isSetAmounts();
    if (this_present_amounts || that_present_amounts) {
      if (!(this_present_amounts && that_present_amounts))
        return false;
      if (!this.amounts.equals(that.amounts))
        return false;
    }

    boolean this_present_topicName = true && this.isSetTopicName();
    boolean that_present_topicName = true && that.isSetTopicName();
    if (this_present_topicName || that_present_topicName) {
      if (!(this_present_topicName && that_present_topicName))
        return false;
      if (!this.topicName.equals(that.topicName))
        return false;
    }

    boolean this_present_streamType = true && this.isSetStreamType();
    boolean that_present_streamType = true && that.isSetStreamType();
    if (this_present_streamType || that_present_streamType) {
      if (!(this_present_streamType && that_present_streamType))
        return false;
      if (!this.streamType.equals(that.streamType))
        return false;
    }

    boolean this_present_partitionNum = true && this.isSetPartitionNum();
    boolean that_present_partitionNum = true && that.isSetPartitionNum();
    if (this_present_partitionNum || that_present_partitionNum) {
      if (!(this_present_partitionNum && that_present_partitionNum))
        return false;
      if (this.partitionNum != that.partitionNum)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_record = true && (isSetRecord());
    list.add(present_record);
    if (present_record)
      list.add(record);

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type.getValue());

    boolean present_rowDeleted = true && (isSetRowDeleted());
    list.add(present_rowDeleted);
    if (present_rowDeleted)
      list.add(rowDeleted);

    boolean present_amounts = true && (isSetAmounts());
    list.add(present_amounts);
    if (present_amounts)
      list.add(amounts);

    boolean present_topicName = true && (isSetTopicName());
    list.add(present_topicName);
    if (present_topicName)
      list.add(topicName);

    boolean present_streamType = true && (isSetStreamType());
    list.add(present_streamType);
    if (present_streamType)
      list.add(streamType.getValue());

    boolean present_partitionNum = true && (isSetPartitionNum());
    list.add(present_partitionNum);
    if (present_partitionNum)
      list.add(partitionNum);

    return list.hashCode();
  }

  @Override
  public int compareTo(InternalMutationLogEntry other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRecord()).compareTo(other.isSetRecord());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecord()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.record, other.record);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRowDeleted()).compareTo(other.isSetRowDeleted());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRowDeleted()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.rowDeleted, other.rowDeleted);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAmounts()).compareTo(other.isSetAmounts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAmounts()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.amounts, other.amounts);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTopicName()).compareTo(other.isSetTopicName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicName, other.topicName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStreamType()).compareTo(other.isSetStreamType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStreamType()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.streamType, other.streamType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartitionNum()).compareTo(other.isSetPartitionNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionNum()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.partitionNum, other.partitionNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("InternalMutationLogEntry(");
    boolean first = true;

    if (isSetRecord()) {
      sb.append("record:");
      if (this.record == null) {
        sb.append("null");
      } else {
        sb.append(this.record);
      }
      first = false;
    }
    if (isSetType()) {
      if (!first) sb.append(", ");
      sb.append("type:");
      if (this.type == null) {
        sb.append("null");
      } else {
        sb.append(this.type);
      }
      first = false;
    }
    if (isSetRowDeleted()) {
      if (!first) sb.append(", ");
      sb.append("rowDeleted:");
      sb.append(this.rowDeleted);
      first = false;
    }
    if (isSetAmounts()) {
      if (!first) sb.append(", ");
      sb.append("amounts:");
      if (this.amounts == null) {
        sb.append("null");
      } else {
        sb.append(this.amounts);
      }
      first = false;
    }
    if (isSetTopicName()) {
      if (!first) sb.append(", ");
      sb.append("topicName:");
      if (this.topicName == null) {
        sb.append("null");
      } else {
        sb.append(this.topicName);
      }
      first = false;
    }
    if (isSetStreamType()) {
      if (!first) sb.append(", ");
      sb.append("streamType:");
      if (this.streamType == null) {
        sb.append("null");
      } else {
        sb.append(this.streamType);
      }
      first = false;
    }
    if (isSetPartitionNum()) {
      if (!first) sb.append(", ");
      sb.append("partitionNum:");
      sb.append(this.partitionNum);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class InternalMutationLogEntryStandardSchemeFactory implements SchemeFactory {
    public InternalMutationLogEntryStandardScheme getScheme() {
      return new InternalMutationLogEntryStandardScheme();
    }
  }

  private static class InternalMutationLogEntryStandardScheme extends StandardScheme<InternalMutationLogEntry> {

    public void read(libthrift091.protocol.TProtocol iprot, InternalMutationLogEntry struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RECORD
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map374 = iprot.readMapBegin();
                struct.record = new HashMap<String,Datum>(2*_map374.size);
                String _key375;
                Datum _val376;
                for (int _i377 = 0; _i377 < _map374.size; ++_i377)
                {
                  _key375 = iprot.readString();
                  _val376 = new Datum();
                  _val376.read(iprot);
                  struct.record.put(_key375, _val376);
                }
                iprot.readMapEnd();
              }
              struct.setRecordIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TYPE
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.type = com.xiaomi.infra.galaxy.sds.thrift.MutationType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ROW_DELETED
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.rowDeleted = iprot.readBool();
              struct.setRowDeletedIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // AMOUNTS
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map378 = iprot.readMapBegin();
                struct.amounts = new HashMap<String,Datum>(2*_map378.size);
                String _key379;
                Datum _val380;
                for (int _i381 = 0; _i381 < _map378.size; ++_i381)
                {
                  _key379 = iprot.readString();
                  _val380 = new Datum();
                  _val380.read(iprot);
                  struct.amounts.put(_key379, _val380);
                }
                iprot.readMapEnd();
              }
              struct.setAmountsIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TOPIC_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.topicName = iprot.readString();
              struct.setTopicNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // STREAM_TYPE
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.streamType = com.xiaomi.infra.galaxy.sds.thrift.StreamViewType.findByValue(iprot.readI32());
              struct.setStreamTypeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // PARTITION_NUM
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.partitionNum = iprot.readI32();
              struct.setPartitionNumIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, InternalMutationLogEntry struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.record != null) {
        if (struct.isSetRecord()) {
          oprot.writeFieldBegin(RECORD_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, struct.record.size()));
            for (Map.Entry<String, Datum> _iter382 : struct.record.entrySet())
            {
              oprot.writeString(_iter382.getKey());
              _iter382.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.type != null) {
        if (struct.isSetType()) {
          oprot.writeFieldBegin(TYPE_FIELD_DESC);
          oprot.writeI32(struct.type.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetRowDeleted()) {
        oprot.writeFieldBegin(ROW_DELETED_FIELD_DESC);
        oprot.writeBool(struct.rowDeleted);
        oprot.writeFieldEnd();
      }
      if (struct.amounts != null) {
        if (struct.isSetAmounts()) {
          oprot.writeFieldBegin(AMOUNTS_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, struct.amounts.size()));
            for (Map.Entry<String, Datum> _iter383 : struct.amounts.entrySet())
            {
              oprot.writeString(_iter383.getKey());
              _iter383.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.topicName != null) {
        if (struct.isSetTopicName()) {
          oprot.writeFieldBegin(TOPIC_NAME_FIELD_DESC);
          oprot.writeString(struct.topicName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.streamType != null) {
        if (struct.isSetStreamType()) {
          oprot.writeFieldBegin(STREAM_TYPE_FIELD_DESC);
          oprot.writeI32(struct.streamType.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetPartitionNum()) {
        oprot.writeFieldBegin(PARTITION_NUM_FIELD_DESC);
        oprot.writeI32(struct.partitionNum);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class InternalMutationLogEntryTupleSchemeFactory implements SchemeFactory {
    public InternalMutationLogEntryTupleScheme getScheme() {
      return new InternalMutationLogEntryTupleScheme();
    }
  }

  private static class InternalMutationLogEntryTupleScheme extends TupleScheme<InternalMutationLogEntry> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, InternalMutationLogEntry struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRecord()) {
        optionals.set(0);
      }
      if (struct.isSetType()) {
        optionals.set(1);
      }
      if (struct.isSetRowDeleted()) {
        optionals.set(2);
      }
      if (struct.isSetAmounts()) {
        optionals.set(3);
      }
      if (struct.isSetTopicName()) {
        optionals.set(4);
      }
      if (struct.isSetStreamType()) {
        optionals.set(5);
      }
      if (struct.isSetPartitionNum()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetRecord()) {
        {
          oprot.writeI32(struct.record.size());
          for (Map.Entry<String, Datum> _iter384 : struct.record.entrySet())
          {
            oprot.writeString(_iter384.getKey());
            _iter384.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetRowDeleted()) {
        oprot.writeBool(struct.rowDeleted);
      }
      if (struct.isSetAmounts()) {
        {
          oprot.writeI32(struct.amounts.size());
          for (Map.Entry<String, Datum> _iter385 : struct.amounts.entrySet())
          {
            oprot.writeString(_iter385.getKey());
            _iter385.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetTopicName()) {
        oprot.writeString(struct.topicName);
      }
      if (struct.isSetStreamType()) {
        oprot.writeI32(struct.streamType.getValue());
      }
      if (struct.isSetPartitionNum()) {
        oprot.writeI32(struct.partitionNum);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, InternalMutationLogEntry struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TMap _map386 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.record = new HashMap<String,Datum>(2*_map386.size);
          String _key387;
          Datum _val388;
          for (int _i389 = 0; _i389 < _map386.size; ++_i389)
          {
            _key387 = iprot.readString();
            _val388 = new Datum();
            _val388.read(iprot);
            struct.record.put(_key387, _val388);
          }
        }
        struct.setRecordIsSet(true);
      }
      if (incoming.get(1)) {
        struct.type = com.xiaomi.infra.galaxy.sds.thrift.MutationType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.rowDeleted = iprot.readBool();
        struct.setRowDeletedIsSet(true);
      }
      if (incoming.get(3)) {
        {
          libthrift091.protocol.TMap _map390 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.amounts = new HashMap<String,Datum>(2*_map390.size);
          String _key391;
          Datum _val392;
          for (int _i393 = 0; _i393 < _map390.size; ++_i393)
          {
            _key391 = iprot.readString();
            _val392 = new Datum();
            _val392.read(iprot);
            struct.amounts.put(_key391, _val392);
          }
        }
        struct.setAmountsIsSet(true);
      }
      if (incoming.get(4)) {
        struct.topicName = iprot.readString();
        struct.setTopicNameIsSet(true);
      }
      if (incoming.get(5)) {
        struct.streamType = com.xiaomi.infra.galaxy.sds.thrift.StreamViewType.findByValue(iprot.readI32());
        struct.setStreamTypeIsSet(true);
      }
      if (incoming.get(6)) {
        struct.partitionNum = iprot.readI32();
        struct.setPartitionNumIsSet(true);
      }
    }
  }

}


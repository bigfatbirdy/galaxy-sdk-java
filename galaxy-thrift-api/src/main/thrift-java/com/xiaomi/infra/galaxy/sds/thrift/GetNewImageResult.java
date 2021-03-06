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
 * get new image result
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-5-12")
public class GetNewImageResult implements libthrift091.TBase<GetNewImageResult, GetNewImageResult._Fields>, java.io.Serializable, Cloneable, Comparable<GetNewImageResult> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("GetNewImageResult");

  private static final libthrift091.protocol.TField NEXT_START_OFFSET_FIELD_DESC = new libthrift091.protocol.TField("nextStartOffset", libthrift091.protocol.TType.I64, (short)1);
  private static final libthrift091.protocol.TField RECORDS_FIELD_DESC = new libthrift091.protocol.TField("records", libthrift091.protocol.TType.LIST, (short)2);
  private static final libthrift091.protocol.TField THROTTLED_FIELD_DESC = new libthrift091.protocol.TField("throttled", libthrift091.protocol.TType.BOOL, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetNewImageResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetNewImageResultTupleSchemeFactory());
  }

  /**
   * 下一个开始消费的增量数据的偏移，NULL表示达到当前表分片的结束位置
   */
  public long nextStartOffset; // optional
  /**
   * 消费的增量数据
   */
  public List<Map<String,Datum>> records; // optional
  /**
   * 是否超过表的qps quota
   */
  public boolean throttled; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 下一个开始消费的增量数据的偏移，NULL表示达到当前表分片的结束位置
     */
    NEXT_START_OFFSET((short)1, "nextStartOffset"),
    /**
     * 消费的增量数据
     */
    RECORDS((short)2, "records"),
    /**
     * 是否超过表的qps quota
     */
    THROTTLED((short)3, "throttled");

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
        case 1: // NEXT_START_OFFSET
          return NEXT_START_OFFSET;
        case 2: // RECORDS
          return RECORDS;
        case 3: // THROTTLED
          return THROTTLED;
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
  private static final int __NEXTSTARTOFFSET_ISSET_ID = 0;
  private static final int __THROTTLED_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.NEXT_START_OFFSET,_Fields.RECORDS,_Fields.THROTTLED};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NEXT_START_OFFSET, new libthrift091.meta_data.FieldMetaData("nextStartOffset", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.RECORDS, new libthrift091.meta_data.FieldMetaData("records", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.MAP            , "Dictionary"))));
    tmpMap.put(_Fields.THROTTLED, new libthrift091.meta_data.FieldMetaData("throttled", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(GetNewImageResult.class, metaDataMap);
  }

  public GetNewImageResult() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetNewImageResult(GetNewImageResult other) {
    __isset_bitfield = other.__isset_bitfield;
    this.nextStartOffset = other.nextStartOffset;
    if (other.isSetRecords()) {
      List<Map<String,Datum>> __this__records = new ArrayList<Map<String,Datum>>(other.records.size());
      for (Map<String,Datum> other_element : other.records) {
        __this__records.add(other_element);
      }
      this.records = __this__records;
    }
    this.throttled = other.throttled;
  }

  public GetNewImageResult deepCopy() {
    return new GetNewImageResult(this);
  }

  @Override
  public void clear() {
    setNextStartOffsetIsSet(false);
    this.nextStartOffset = 0;
    this.records = null;
    setThrottledIsSet(false);
    this.throttled = false;
  }

  /**
   * 下一个开始消费的增量数据的偏移，NULL表示达到当前表分片的结束位置
   */
  public long getNextStartOffset() {
    return this.nextStartOffset;
  }

  /**
   * 下一个开始消费的增量数据的偏移，NULL表示达到当前表分片的结束位置
   */
  public GetNewImageResult setNextStartOffset(long nextStartOffset) {
    this.nextStartOffset = nextStartOffset;
    setNextStartOffsetIsSet(true);
    return this;
  }

  public void unsetNextStartOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NEXTSTARTOFFSET_ISSET_ID);
  }

  /** Returns true if field nextStartOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetNextStartOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __NEXTSTARTOFFSET_ISSET_ID);
  }

  public void setNextStartOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NEXTSTARTOFFSET_ISSET_ID, value);
  }

  public int getRecordsSize() {
    return (this.records == null) ? 0 : this.records.size();
  }

  public java.util.Iterator<Map<String,Datum>> getRecordsIterator() {
    return (this.records == null) ? null : this.records.iterator();
  }

  public void addToRecords(Map<String,Datum> elem) {
    if (this.records == null) {
      this.records = new ArrayList<Map<String,Datum>>();
    }
    this.records.add(elem);
  }

  /**
   * 消费的增量数据
   */
  public List<Map<String,Datum>> getRecords() {
    return this.records;
  }

  /**
   * 消费的增量数据
   */
  public GetNewImageResult setRecords(List<Map<String,Datum>> records) {
    this.records = records;
    return this;
  }

  public void unsetRecords() {
    this.records = null;
  }

  /** Returns true if field records is set (has been assigned a value) and false otherwise */
  public boolean isSetRecords() {
    return this.records != null;
  }

  public void setRecordsIsSet(boolean value) {
    if (!value) {
      this.records = null;
    }
  }

  /**
   * 是否超过表的qps quota
   */
  public boolean isThrottled() {
    return this.throttled;
  }

  /**
   * 是否超过表的qps quota
   */
  public GetNewImageResult setThrottled(boolean throttled) {
    this.throttled = throttled;
    setThrottledIsSet(true);
    return this;
  }

  public void unsetThrottled() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __THROTTLED_ISSET_ID);
  }

  /** Returns true if field throttled is set (has been assigned a value) and false otherwise */
  public boolean isSetThrottled() {
    return EncodingUtils.testBit(__isset_bitfield, __THROTTLED_ISSET_ID);
  }

  public void setThrottledIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __THROTTLED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NEXT_START_OFFSET:
      if (value == null) {
        unsetNextStartOffset();
      } else {
        setNextStartOffset((Long)value);
      }
      break;

    case RECORDS:
      if (value == null) {
        unsetRecords();
      } else {
        setRecords((List<Map<String,Datum>>)value);
      }
      break;

    case THROTTLED:
      if (value == null) {
        unsetThrottled();
      } else {
        setThrottled((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NEXT_START_OFFSET:
      return Long.valueOf(getNextStartOffset());

    case RECORDS:
      return getRecords();

    case THROTTLED:
      return Boolean.valueOf(isThrottled());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NEXT_START_OFFSET:
      return isSetNextStartOffset();
    case RECORDS:
      return isSetRecords();
    case THROTTLED:
      return isSetThrottled();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetNewImageResult)
      return this.equals((GetNewImageResult)that);
    return false;
  }

  public boolean equals(GetNewImageResult that) {
    if (that == null)
      return false;

    boolean this_present_nextStartOffset = true && this.isSetNextStartOffset();
    boolean that_present_nextStartOffset = true && that.isSetNextStartOffset();
    if (this_present_nextStartOffset || that_present_nextStartOffset) {
      if (!(this_present_nextStartOffset && that_present_nextStartOffset))
        return false;
      if (this.nextStartOffset != that.nextStartOffset)
        return false;
    }

    boolean this_present_records = true && this.isSetRecords();
    boolean that_present_records = true && that.isSetRecords();
    if (this_present_records || that_present_records) {
      if (!(this_present_records && that_present_records))
        return false;
      if (!this.records.equals(that.records))
        return false;
    }

    boolean this_present_throttled = true && this.isSetThrottled();
    boolean that_present_throttled = true && that.isSetThrottled();
    if (this_present_throttled || that_present_throttled) {
      if (!(this_present_throttled && that_present_throttled))
        return false;
      if (this.throttled != that.throttled)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_nextStartOffset = true && (isSetNextStartOffset());
    list.add(present_nextStartOffset);
    if (present_nextStartOffset)
      list.add(nextStartOffset);

    boolean present_records = true && (isSetRecords());
    list.add(present_records);
    if (present_records)
      list.add(records);

    boolean present_throttled = true && (isSetThrottled());
    list.add(present_throttled);
    if (present_throttled)
      list.add(throttled);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetNewImageResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNextStartOffset()).compareTo(other.isSetNextStartOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNextStartOffset()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.nextStartOffset, other.nextStartOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRecords()).compareTo(other.isSetRecords());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecords()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.records, other.records);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetThrottled()).compareTo(other.isSetThrottled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThrottled()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.throttled, other.throttled);
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
    StringBuilder sb = new StringBuilder("GetNewImageResult(");
    boolean first = true;

    if (isSetNextStartOffset()) {
      sb.append("nextStartOffset:");
      sb.append(this.nextStartOffset);
      first = false;
    }
    if (isSetRecords()) {
      if (!first) sb.append(", ");
      sb.append("records:");
      if (this.records == null) {
        sb.append("null");
      } else {
        sb.append(this.records);
      }
      first = false;
    }
    if (isSetThrottled()) {
      if (!first) sb.append(", ");
      sb.append("throttled:");
      sb.append(this.throttled);
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

  private static class GetNewImageResultStandardSchemeFactory implements SchemeFactory {
    public GetNewImageResultStandardScheme getScheme() {
      return new GetNewImageResultStandardScheme();
    }
  }

  private static class GetNewImageResultStandardScheme extends StandardScheme<GetNewImageResult> {

    public void read(libthrift091.protocol.TProtocol iprot, GetNewImageResult struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NEXT_START_OFFSET
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.nextStartOffset = iprot.readI64();
              struct.setNextStartOffsetIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RECORDS
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list352 = iprot.readListBegin();
                struct.records = new ArrayList<Map<String,Datum>>(_list352.size);
                Map<String,Datum> _elem353;
                for (int _i354 = 0; _i354 < _list352.size; ++_i354)
                {
                  {
                    libthrift091.protocol.TMap _map355 = iprot.readMapBegin();
                    _elem353 = new HashMap<String,Datum>(2*_map355.size);
                    String _key356;
                    Datum _val357;
                    for (int _i358 = 0; _i358 < _map355.size; ++_i358)
                    {
                      _key356 = iprot.readString();
                      _val357 = new Datum();
                      _val357.read(iprot);
                      _elem353.put(_key356, _val357);
                    }
                    iprot.readMapEnd();
                  }
                  struct.records.add(_elem353);
                }
                iprot.readListEnd();
              }
              struct.setRecordsIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // THROTTLED
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.throttled = iprot.readBool();
              struct.setThrottledIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, GetNewImageResult struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetNextStartOffset()) {
        oprot.writeFieldBegin(NEXT_START_OFFSET_FIELD_DESC);
        oprot.writeI64(struct.nextStartOffset);
        oprot.writeFieldEnd();
      }
      if (struct.records != null) {
        if (struct.isSetRecords()) {
          oprot.writeFieldBegin(RECORDS_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.MAP, struct.records.size()));
            for (Map<String,Datum> _iter359 : struct.records)
            {
              {
                oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, _iter359.size()));
                for (Map.Entry<String, Datum> _iter360 : _iter359.entrySet())
                {
                  oprot.writeString(_iter360.getKey());
                  _iter360.getValue().write(oprot);
                }
                oprot.writeMapEnd();
              }
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetThrottled()) {
        oprot.writeFieldBegin(THROTTLED_FIELD_DESC);
        oprot.writeBool(struct.throttled);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetNewImageResultTupleSchemeFactory implements SchemeFactory {
    public GetNewImageResultTupleScheme getScheme() {
      return new GetNewImageResultTupleScheme();
    }
  }

  private static class GetNewImageResultTupleScheme extends TupleScheme<GetNewImageResult> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, GetNewImageResult struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetNextStartOffset()) {
        optionals.set(0);
      }
      if (struct.isSetRecords()) {
        optionals.set(1);
      }
      if (struct.isSetThrottled()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetNextStartOffset()) {
        oprot.writeI64(struct.nextStartOffset);
      }
      if (struct.isSetRecords()) {
        {
          oprot.writeI32(struct.records.size());
          for (Map<String,Datum> _iter361 : struct.records)
          {
            {
              oprot.writeI32(_iter361.size());
              for (Map.Entry<String, Datum> _iter362 : _iter361.entrySet())
              {
                oprot.writeString(_iter362.getKey());
                _iter362.getValue().write(oprot);
              }
            }
          }
        }
      }
      if (struct.isSetThrottled()) {
        oprot.writeBool(struct.throttled);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, GetNewImageResult struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.nextStartOffset = iprot.readI64();
        struct.setNextStartOffsetIsSet(true);
      }
      if (incoming.get(1)) {
        {
          libthrift091.protocol.TList _list363 = new libthrift091.protocol.TList(libthrift091.protocol.TType.MAP, iprot.readI32());
          struct.records = new ArrayList<Map<String,Datum>>(_list363.size);
          Map<String,Datum> _elem364;
          for (int _i365 = 0; _i365 < _list363.size; ++_i365)
          {
            {
              libthrift091.protocol.TMap _map366 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
              _elem364 = new HashMap<String,Datum>(2*_map366.size);
              String _key367;
              Datum _val368;
              for (int _i369 = 0; _i369 < _map366.size; ++_i369)
              {
                _key367 = iprot.readString();
                _val368 = new Datum();
                _val368.read(iprot);
                _elem364.put(_key367, _val368);
              }
            }
            struct.records.add(_elem364);
          }
        }
        struct.setRecordsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.throttled = iprot.readBool();
        struct.setThrottledIsSet(true);
      }
    }
  }

}


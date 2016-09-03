/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-9-3")
public class LockWorkerResponse implements libthrift091.TBase<LockWorkerResponse, LockWorkerResponse._Fields>, java.io.Serializable, Cloneable, Comparable<LockWorkerResponse> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("LockWorkerResponse");

  private static final libthrift091.protocol.TField REGISTER_SUCCESS_FIELD_DESC = new libthrift091.protocol.TField("registerSuccess", libthrift091.protocol.TType.BOOL, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LockWorkerResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LockWorkerResponseTupleSchemeFactory());
  }

  /**
   * lock worker heartbeat result
   */
  public boolean registerSuccess; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * lock worker heartbeat result
     */
    REGISTER_SUCCESS((short)1, "registerSuccess");

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
        case 1: // REGISTER_SUCCESS
          return REGISTER_SUCCESS;
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
  private static final int __REGISTERSUCCESS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REGISTER_SUCCESS, new libthrift091.meta_data.FieldMetaData("registerSuccess", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(LockWorkerResponse.class, metaDataMap);
  }

  public LockWorkerResponse() {
  }

  public LockWorkerResponse(
    boolean registerSuccess)
  {
    this();
    this.registerSuccess = registerSuccess;
    setRegisterSuccessIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LockWorkerResponse(LockWorkerResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    this.registerSuccess = other.registerSuccess;
  }

  public LockWorkerResponse deepCopy() {
    return new LockWorkerResponse(this);
  }

  @Override
  public void clear() {
    setRegisterSuccessIsSet(false);
    this.registerSuccess = false;
  }

  /**
   * lock worker heartbeat result
   */
  public boolean isRegisterSuccess() {
    return this.registerSuccess;
  }

  /**
   * lock worker heartbeat result
   */
  public LockWorkerResponse setRegisterSuccess(boolean registerSuccess) {
    this.registerSuccess = registerSuccess;
    setRegisterSuccessIsSet(true);
    return this;
  }

  public void unsetRegisterSuccess() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REGISTERSUCCESS_ISSET_ID);
  }

  /** Returns true if field registerSuccess is set (has been assigned a value) and false otherwise */
  public boolean isSetRegisterSuccess() {
    return EncodingUtils.testBit(__isset_bitfield, __REGISTERSUCCESS_ISSET_ID);
  }

  public void setRegisterSuccessIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REGISTERSUCCESS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REGISTER_SUCCESS:
      if (value == null) {
        unsetRegisterSuccess();
      } else {
        setRegisterSuccess((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REGISTER_SUCCESS:
      return Boolean.valueOf(isRegisterSuccess());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REGISTER_SUCCESS:
      return isSetRegisterSuccess();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LockWorkerResponse)
      return this.equals((LockWorkerResponse)that);
    return false;
  }

  public boolean equals(LockWorkerResponse that) {
    if (that == null)
      return false;

    boolean this_present_registerSuccess = true;
    boolean that_present_registerSuccess = true;
    if (this_present_registerSuccess || that_present_registerSuccess) {
      if (!(this_present_registerSuccess && that_present_registerSuccess))
        return false;
      if (this.registerSuccess != that.registerSuccess)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_registerSuccess = true;
    list.add(present_registerSuccess);
    if (present_registerSuccess)
      list.add(registerSuccess);

    return list.hashCode();
  }

  @Override
  public int compareTo(LockWorkerResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRegisterSuccess()).compareTo(other.isSetRegisterSuccess());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRegisterSuccess()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.registerSuccess, other.registerSuccess);
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
    StringBuilder sb = new StringBuilder("LockWorkerResponse(");
    boolean first = true;

    sb.append("registerSuccess:");
    sb.append(this.registerSuccess);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // alas, we cannot check 'registerSuccess' because it's a primitive and you chose the non-beans generator.
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

  private static class LockWorkerResponseStandardSchemeFactory implements SchemeFactory {
    public LockWorkerResponseStandardScheme getScheme() {
      return new LockWorkerResponseStandardScheme();
    }
  }

  private static class LockWorkerResponseStandardScheme extends StandardScheme<LockWorkerResponse> {

    public void read(libthrift091.protocol.TProtocol iprot, LockWorkerResponse struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REGISTER_SUCCESS
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.registerSuccess = iprot.readBool();
              struct.setRegisterSuccessIsSet(true);
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
      if (!struct.isSetRegisterSuccess()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'registerSuccess' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, LockWorkerResponse struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(REGISTER_SUCCESS_FIELD_DESC);
      oprot.writeBool(struct.registerSuccess);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LockWorkerResponseTupleSchemeFactory implements SchemeFactory {
    public LockWorkerResponseTupleScheme getScheme() {
      return new LockWorkerResponseTupleScheme();
    }
  }

  private static class LockWorkerResponseTupleScheme extends TupleScheme<LockWorkerResponse> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, LockWorkerResponse struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBool(struct.registerSuccess);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, LockWorkerResponse struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.registerSuccess = iprot.readBool();
      struct.setRegisterSuccessIsSet(true);
    }
  }

}


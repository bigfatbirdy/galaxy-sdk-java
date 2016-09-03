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
public class MessageAndOffset implements libthrift091.TBase<MessageAndOffset, MessageAndOffset._Fields>, java.io.Serializable, Cloneable, Comparable<MessageAndOffset> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("MessageAndOffset");

  private static final libthrift091.protocol.TField MESSAGE_FIELD_DESC = new libthrift091.protocol.TField("message", libthrift091.protocol.TType.STRUCT, (short)1);
  private static final libthrift091.protocol.TField MESSAGE_OFFSET_FIELD_DESC = new libthrift091.protocol.TField("messageOffset", libthrift091.protocol.TType.I64, (short)2);
  private static final libthrift091.protocol.TField UN_HANDLED_MESSAGE_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("unHandledMessageNumber", libthrift091.protocol.TType.I64, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MessageAndOffsetStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MessageAndOffsetTupleSchemeFactory());
  }

  /**
   * The message
   * 
   */
  public Message message; // required
  /**
   * The messageOffset for this message;
   * 
   */
  public long messageOffset; // required
  /**
   * The message number of unHandledMessageNumber
   * 
   */
  public long unHandledMessageNumber; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The message
     * 
     */
    MESSAGE((short)1, "message"),
    /**
     * The messageOffset for this message;
     * 
     */
    MESSAGE_OFFSET((short)2, "messageOffset"),
    /**
     * The message number of unHandledMessageNumber
     * 
     */
    UN_HANDLED_MESSAGE_NUMBER((short)3, "unHandledMessageNumber");

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
        case 1: // MESSAGE
          return MESSAGE;
        case 2: // MESSAGE_OFFSET
          return MESSAGE_OFFSET;
        case 3: // UN_HANDLED_MESSAGE_NUMBER
          return UN_HANDLED_MESSAGE_NUMBER;
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
  private static final int __MESSAGEOFFSET_ISSET_ID = 0;
  private static final int __UNHANDLEDMESSAGENUMBER_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.UN_HANDLED_MESSAGE_NUMBER};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MESSAGE, new libthrift091.meta_data.FieldMetaData("message", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, Message.class)));
    tmpMap.put(_Fields.MESSAGE_OFFSET, new libthrift091.meta_data.FieldMetaData("messageOffset", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.UN_HANDLED_MESSAGE_NUMBER, new libthrift091.meta_data.FieldMetaData("unHandledMessageNumber", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(MessageAndOffset.class, metaDataMap);
  }

  public MessageAndOffset() {
  }

  public MessageAndOffset(
    Message message,
    long messageOffset)
  {
    this();
    this.message = message;
    this.messageOffset = messageOffset;
    setMessageOffsetIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MessageAndOffset(MessageAndOffset other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMessage()) {
      this.message = new Message(other.message);
    }
    this.messageOffset = other.messageOffset;
    this.unHandledMessageNumber = other.unHandledMessageNumber;
  }

  public MessageAndOffset deepCopy() {
    return new MessageAndOffset(this);
  }

  @Override
  public void clear() {
    this.message = null;
    setMessageOffsetIsSet(false);
    this.messageOffset = 0;
    setUnHandledMessageNumberIsSet(false);
    this.unHandledMessageNumber = 0;
  }

  /**
   * The message
   * 
   */
  public Message getMessage() {
    return this.message;
  }

  /**
   * The message
   * 
   */
  public MessageAndOffset setMessage(Message message) {
    this.message = message;
    return this;
  }

  public void unsetMessage() {
    this.message = null;
  }

  /** Returns true if field message is set (has been assigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  /**
   * The messageOffset for this message;
   * 
   */
  public long getMessageOffset() {
    return this.messageOffset;
  }

  /**
   * The messageOffset for this message;
   * 
   */
  public MessageAndOffset setMessageOffset(long messageOffset) {
    this.messageOffset = messageOffset;
    setMessageOffsetIsSet(true);
    return this;
  }

  public void unsetMessageOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MESSAGEOFFSET_ISSET_ID);
  }

  /** Returns true if field messageOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __MESSAGEOFFSET_ISSET_ID);
  }

  public void setMessageOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MESSAGEOFFSET_ISSET_ID, value);
  }

  /**
   * The message number of unHandledMessageNumber
   * 
   */
  public long getUnHandledMessageNumber() {
    return this.unHandledMessageNumber;
  }

  /**
   * The message number of unHandledMessageNumber
   * 
   */
  public MessageAndOffset setUnHandledMessageNumber(long unHandledMessageNumber) {
    this.unHandledMessageNumber = unHandledMessageNumber;
    setUnHandledMessageNumberIsSet(true);
    return this;
  }

  public void unsetUnHandledMessageNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UNHANDLEDMESSAGENUMBER_ISSET_ID);
  }

  /** Returns true if field unHandledMessageNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetUnHandledMessageNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __UNHANDLEDMESSAGENUMBER_ISSET_ID);
  }

  public void setUnHandledMessageNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UNHANDLEDMESSAGENUMBER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((Message)value);
      }
      break;

    case MESSAGE_OFFSET:
      if (value == null) {
        unsetMessageOffset();
      } else {
        setMessageOffset((Long)value);
      }
      break;

    case UN_HANDLED_MESSAGE_NUMBER:
      if (value == null) {
        unsetUnHandledMessageNumber();
      } else {
        setUnHandledMessageNumber((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MESSAGE:
      return getMessage();

    case MESSAGE_OFFSET:
      return Long.valueOf(getMessageOffset());

    case UN_HANDLED_MESSAGE_NUMBER:
      return Long.valueOf(getUnHandledMessageNumber());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MESSAGE:
      return isSetMessage();
    case MESSAGE_OFFSET:
      return isSetMessageOffset();
    case UN_HANDLED_MESSAGE_NUMBER:
      return isSetUnHandledMessageNumber();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MessageAndOffset)
      return this.equals((MessageAndOffset)that);
    return false;
  }

  public boolean equals(MessageAndOffset that) {
    if (that == null)
      return false;

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    boolean this_present_messageOffset = true;
    boolean that_present_messageOffset = true;
    if (this_present_messageOffset || that_present_messageOffset) {
      if (!(this_present_messageOffset && that_present_messageOffset))
        return false;
      if (this.messageOffset != that.messageOffset)
        return false;
    }

    boolean this_present_unHandledMessageNumber = true && this.isSetUnHandledMessageNumber();
    boolean that_present_unHandledMessageNumber = true && that.isSetUnHandledMessageNumber();
    if (this_present_unHandledMessageNumber || that_present_unHandledMessageNumber) {
      if (!(this_present_unHandledMessageNumber && that_present_unHandledMessageNumber))
        return false;
      if (this.unHandledMessageNumber != that.unHandledMessageNumber)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_message = true && (isSetMessage());
    list.add(present_message);
    if (present_message)
      list.add(message);

    boolean present_messageOffset = true;
    list.add(present_messageOffset);
    if (present_messageOffset)
      list.add(messageOffset);

    boolean present_unHandledMessageNumber = true && (isSetUnHandledMessageNumber());
    list.add(present_unHandledMessageNumber);
    if (present_unHandledMessageNumber)
      list.add(unHandledMessageNumber);

    return list.hashCode();
  }

  @Override
  public int compareTo(MessageAndOffset other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMessage()).compareTo(other.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.message, other.message);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageOffset()).compareTo(other.isSetMessageOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageOffset()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.messageOffset, other.messageOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUnHandledMessageNumber()).compareTo(other.isSetUnHandledMessageNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnHandledMessageNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.unHandledMessageNumber, other.unHandledMessageNumber);
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
    StringBuilder sb = new StringBuilder("MessageAndOffset(");
    boolean first = true;

    sb.append("message:");
    if (this.message == null) {
      sb.append("null");
    } else {
      sb.append(this.message);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageOffset:");
    sb.append(this.messageOffset);
    first = false;
    if (isSetUnHandledMessageNumber()) {
      if (!first) sb.append(", ");
      sb.append("unHandledMessageNumber:");
      sb.append(this.unHandledMessageNumber);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (message == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'message' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'messageOffset' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (message != null) {
      message.validate();
    }
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

  private static class MessageAndOffsetStandardSchemeFactory implements SchemeFactory {
    public MessageAndOffsetStandardScheme getScheme() {
      return new MessageAndOffsetStandardScheme();
    }
  }

  private static class MessageAndOffsetStandardScheme extends StandardScheme<MessageAndOffset> {

    public void read(libthrift091.protocol.TProtocol iprot, MessageAndOffset struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MESSAGE
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.message = new Message();
              struct.message.read(iprot);
              struct.setMessageIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MESSAGE_OFFSET
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.messageOffset = iprot.readI64();
              struct.setMessageOffsetIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // UN_HANDLED_MESSAGE_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.unHandledMessageNumber = iprot.readI64();
              struct.setUnHandledMessageNumberIsSet(true);
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
      if (!struct.isSetMessageOffset()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'messageOffset' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, MessageAndOffset struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.message != null) {
        oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
        struct.message.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(MESSAGE_OFFSET_FIELD_DESC);
      oprot.writeI64(struct.messageOffset);
      oprot.writeFieldEnd();
      if (struct.isSetUnHandledMessageNumber()) {
        oprot.writeFieldBegin(UN_HANDLED_MESSAGE_NUMBER_FIELD_DESC);
        oprot.writeI64(struct.unHandledMessageNumber);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MessageAndOffsetTupleSchemeFactory implements SchemeFactory {
    public MessageAndOffsetTupleScheme getScheme() {
      return new MessageAndOffsetTupleScheme();
    }
  }

  private static class MessageAndOffsetTupleScheme extends TupleScheme<MessageAndOffset> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, MessageAndOffset struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.message.write(oprot);
      oprot.writeI64(struct.messageOffset);
      BitSet optionals = new BitSet();
      if (struct.isSetUnHandledMessageNumber()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetUnHandledMessageNumber()) {
        oprot.writeI64(struct.unHandledMessageNumber);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, MessageAndOffset struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.message = new Message();
      struct.message.read(iprot);
      struct.setMessageIsSet(true);
      struct.messageOffset = iprot.readI64();
      struct.setMessageOffsetIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.unHandledMessageNumber = iprot.readI64();
        struct.setUnHandledMessageNumberIsSet(true);
      }
    }
  }

}


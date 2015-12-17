/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cloudera.impala.thrift;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TCreateDropRoleParams implements org.apache.thrift.TBase<TCreateDropRoleParams, TCreateDropRoleParams._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCreateDropRoleParams");

  private static final org.apache.thrift.protocol.TField IS_DROP_FIELD_DESC = new org.apache.thrift.protocol.TField("is_drop", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField ROLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("role_name", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TCreateDropRoleParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TCreateDropRoleParamsTupleSchemeFactory());
  }

  public boolean is_drop; // required
  public String role_name; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IS_DROP((short)1, "is_drop"),
    ROLE_NAME((short)2, "role_name");

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
        case 1: // IS_DROP
          return IS_DROP;
        case 2: // ROLE_NAME
          return ROLE_NAME;
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
  private static final int __IS_DROP_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IS_DROP, new org.apache.thrift.meta_data.FieldMetaData("is_drop", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ROLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("role_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCreateDropRoleParams.class, metaDataMap);
  }

  public TCreateDropRoleParams() {
  }

  public TCreateDropRoleParams(
    boolean is_drop,
    String role_name)
  {
    this();
    this.is_drop = is_drop;
    setIs_dropIsSet(true);
    this.role_name = role_name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCreateDropRoleParams(TCreateDropRoleParams other) {
    __isset_bitfield = other.__isset_bitfield;
    this.is_drop = other.is_drop;
    if (other.isSetRole_name()) {
      this.role_name = other.role_name;
    }
  }

  public TCreateDropRoleParams deepCopy() {
    return new TCreateDropRoleParams(this);
  }

  @Override
  public void clear() {
    setIs_dropIsSet(false);
    this.is_drop = false;
    this.role_name = null;
  }

  public boolean isIs_drop() {
    return this.is_drop;
  }

  public TCreateDropRoleParams setIs_drop(boolean is_drop) {
    this.is_drop = is_drop;
    setIs_dropIsSet(true);
    return this;
  }

  public void unsetIs_drop() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IS_DROP_ISSET_ID);
  }

  /** Returns true if field is_drop is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_drop() {
    return EncodingUtils.testBit(__isset_bitfield, __IS_DROP_ISSET_ID);
  }

  public void setIs_dropIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IS_DROP_ISSET_ID, value);
  }

  public String getRole_name() {
    return this.role_name;
  }

  public TCreateDropRoleParams setRole_name(String role_name) {
    this.role_name = role_name;
    return this;
  }

  public void unsetRole_name() {
    this.role_name = null;
  }

  /** Returns true if field role_name is set (has been assigned a value) and false otherwise */
  public boolean isSetRole_name() {
    return this.role_name != null;
  }

  public void setRole_nameIsSet(boolean value) {
    if (!value) {
      this.role_name = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IS_DROP:
      if (value == null) {
        unsetIs_drop();
      } else {
        setIs_drop((Boolean)value);
      }
      break;

    case ROLE_NAME:
      if (value == null) {
        unsetRole_name();
      } else {
        setRole_name((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IS_DROP:
      return Boolean.valueOf(isIs_drop());

    case ROLE_NAME:
      return getRole_name();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IS_DROP:
      return isSetIs_drop();
    case ROLE_NAME:
      return isSetRole_name();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TCreateDropRoleParams)
      return this.equals((TCreateDropRoleParams)that);
    return false;
  }

  public boolean equals(TCreateDropRoleParams that) {
    if (that == null)
      return false;

    boolean this_present_is_drop = true;
    boolean that_present_is_drop = true;
    if (this_present_is_drop || that_present_is_drop) {
      if (!(this_present_is_drop && that_present_is_drop))
        return false;
      if (this.is_drop != that.is_drop)
        return false;
    }

    boolean this_present_role_name = true && this.isSetRole_name();
    boolean that_present_role_name = true && that.isSetRole_name();
    if (this_present_role_name || that_present_role_name) {
      if (!(this_present_role_name && that_present_role_name))
        return false;
      if (!this.role_name.equals(that.role_name))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_is_drop = true;
    builder.append(present_is_drop);
    if (present_is_drop)
      builder.append(is_drop);

    boolean present_role_name = true && (isSetRole_name());
    builder.append(present_role_name);
    if (present_role_name)
      builder.append(role_name);

    return builder.toHashCode();
  }

  public int compareTo(TCreateDropRoleParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TCreateDropRoleParams typedOther = (TCreateDropRoleParams)other;

    lastComparison = Boolean.valueOf(isSetIs_drop()).compareTo(typedOther.isSetIs_drop());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_drop()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_drop, typedOther.is_drop);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRole_name()).compareTo(typedOther.isSetRole_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRole_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.role_name, typedOther.role_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TCreateDropRoleParams(");
    boolean first = true;

    sb.append("is_drop:");
    sb.append(this.is_drop);
    first = false;
    if (!first) sb.append(", ");
    sb.append("role_name:");
    if (this.role_name == null) {
      sb.append("null");
    } else {
      sb.append(this.role_name);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'is_drop' because it's a primitive and you chose the non-beans generator.
    if (role_name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'role_name' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TCreateDropRoleParamsStandardSchemeFactory implements SchemeFactory {
    public TCreateDropRoleParamsStandardScheme getScheme() {
      return new TCreateDropRoleParamsStandardScheme();
    }
  }

  private static class TCreateDropRoleParamsStandardScheme extends StandardScheme<TCreateDropRoleParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCreateDropRoleParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IS_DROP
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_drop = iprot.readBool();
              struct.setIs_dropIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ROLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.role_name = iprot.readString();
              struct.setRole_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetIs_drop()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'is_drop' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCreateDropRoleParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(IS_DROP_FIELD_DESC);
      oprot.writeBool(struct.is_drop);
      oprot.writeFieldEnd();
      if (struct.role_name != null) {
        oprot.writeFieldBegin(ROLE_NAME_FIELD_DESC);
        oprot.writeString(struct.role_name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCreateDropRoleParamsTupleSchemeFactory implements SchemeFactory {
    public TCreateDropRoleParamsTupleScheme getScheme() {
      return new TCreateDropRoleParamsTupleScheme();
    }
  }

  private static class TCreateDropRoleParamsTupleScheme extends TupleScheme<TCreateDropRoleParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCreateDropRoleParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBool(struct.is_drop);
      oprot.writeString(struct.role_name);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCreateDropRoleParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.is_drop = iprot.readBool();
      struct.setIs_dropIsSet(true);
      struct.role_name = iprot.readString();
      struct.setRole_nameIsSet(true);
    }
  }

}


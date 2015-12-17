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

public class TShowRolesResult implements org.apache.thrift.TBase<TShowRolesResult, TShowRolesResult._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TShowRolesResult");

  private static final org.apache.thrift.protocol.TField ROLE_NAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("role_names", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TShowRolesResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TShowRolesResultTupleSchemeFactory());
  }

  public List<String> role_names; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ROLE_NAMES((short)1, "role_names");

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
        case 1: // ROLE_NAMES
          return ROLE_NAMES;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROLE_NAMES, new org.apache.thrift.meta_data.FieldMetaData("role_names", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TShowRolesResult.class, metaDataMap);
  }

  public TShowRolesResult() {
  }

  public TShowRolesResult(
    List<String> role_names)
  {
    this();
    this.role_names = role_names;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TShowRolesResult(TShowRolesResult other) {
    if (other.isSetRole_names()) {
      List<String> __this__role_names = new ArrayList<String>();
      for (String other_element : other.role_names) {
        __this__role_names.add(other_element);
      }
      this.role_names = __this__role_names;
    }
  }

  public TShowRolesResult deepCopy() {
    return new TShowRolesResult(this);
  }

  @Override
  public void clear() {
    this.role_names = null;
  }

  public int getRole_namesSize() {
    return (this.role_names == null) ? 0 : this.role_names.size();
  }

  public java.util.Iterator<String> getRole_namesIterator() {
    return (this.role_names == null) ? null : this.role_names.iterator();
  }

  public void addToRole_names(String elem) {
    if (this.role_names == null) {
      this.role_names = new ArrayList<String>();
    }
    this.role_names.add(elem);
  }

  public List<String> getRole_names() {
    return this.role_names;
  }

  public TShowRolesResult setRole_names(List<String> role_names) {
    this.role_names = role_names;
    return this;
  }

  public void unsetRole_names() {
    this.role_names = null;
  }

  /** Returns true if field role_names is set (has been assigned a value) and false otherwise */
  public boolean isSetRole_names() {
    return this.role_names != null;
  }

  public void setRole_namesIsSet(boolean value) {
    if (!value) {
      this.role_names = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ROLE_NAMES:
      if (value == null) {
        unsetRole_names();
      } else {
        setRole_names((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ROLE_NAMES:
      return getRole_names();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ROLE_NAMES:
      return isSetRole_names();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TShowRolesResult)
      return this.equals((TShowRolesResult)that);
    return false;
  }

  public boolean equals(TShowRolesResult that) {
    if (that == null)
      return false;

    boolean this_present_role_names = true && this.isSetRole_names();
    boolean that_present_role_names = true && that.isSetRole_names();
    if (this_present_role_names || that_present_role_names) {
      if (!(this_present_role_names && that_present_role_names))
        return false;
      if (!this.role_names.equals(that.role_names))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_role_names = true && (isSetRole_names());
    builder.append(present_role_names);
    if (present_role_names)
      builder.append(role_names);

    return builder.toHashCode();
  }

  public int compareTo(TShowRolesResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TShowRolesResult typedOther = (TShowRolesResult)other;

    lastComparison = Boolean.valueOf(isSetRole_names()).compareTo(typedOther.isSetRole_names());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRole_names()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.role_names, typedOther.role_names);
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
    StringBuilder sb = new StringBuilder("TShowRolesResult(");
    boolean first = true;

    sb.append("role_names:");
    if (this.role_names == null) {
      sb.append("null");
    } else {
      sb.append(this.role_names);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (role_names == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'role_names' was not present! Struct: " + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TShowRolesResultStandardSchemeFactory implements SchemeFactory {
    public TShowRolesResultStandardScheme getScheme() {
      return new TShowRolesResultStandardScheme();
    }
  }

  private static class TShowRolesResultStandardScheme extends StandardScheme<TShowRolesResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TShowRolesResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ROLE_NAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list64 = iprot.readListBegin();
                struct.role_names = new ArrayList<String>(_list64.size);
                for (int _i65 = 0; _i65 < _list64.size; ++_i65)
                {
                  String _elem66; // required
                  _elem66 = iprot.readString();
                  struct.role_names.add(_elem66);
                }
                iprot.readListEnd();
              }
              struct.setRole_namesIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TShowRolesResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.role_names != null) {
        oprot.writeFieldBegin(ROLE_NAMES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.role_names.size()));
          for (String _iter67 : struct.role_names)
          {
            oprot.writeString(_iter67);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TShowRolesResultTupleSchemeFactory implements SchemeFactory {
    public TShowRolesResultTupleScheme getScheme() {
      return new TShowRolesResultTupleScheme();
    }
  }

  private static class TShowRolesResultTupleScheme extends TupleScheme<TShowRolesResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TShowRolesResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.role_names.size());
        for (String _iter68 : struct.role_names)
        {
          oprot.writeString(_iter68);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TShowRolesResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list69 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.role_names = new ArrayList<String>(_list69.size);
        for (int _i70 = 0; _i70 < _list69.size; ++_i70)
        {
          String _elem71; // required
          _elem71 = iprot.readString();
          struct.role_names.add(_elem71);
        }
      }
      struct.setRole_namesIsSet(true);
    }
  }

}


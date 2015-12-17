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

public class TInsertResult implements org.apache.thrift.TBase<TInsertResult, TInsertResult._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TInsertResult");

  private static final org.apache.thrift.protocol.TField ROWS_APPENDED_FIELD_DESC = new org.apache.thrift.protocol.TField("rows_appended", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TInsertResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TInsertResultTupleSchemeFactory());
  }

  public Map<String,Long> rows_appended; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ROWS_APPENDED((short)1, "rows_appended");

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
        case 1: // ROWS_APPENDED
          return ROWS_APPENDED;
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
    tmpMap.put(_Fields.ROWS_APPENDED, new org.apache.thrift.meta_data.FieldMetaData("rows_appended", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TInsertResult.class, metaDataMap);
  }

  public TInsertResult() {
  }

  public TInsertResult(
    Map<String,Long> rows_appended)
  {
    this();
    this.rows_appended = rows_appended;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TInsertResult(TInsertResult other) {
    if (other.isSetRows_appended()) {
      Map<String,Long> __this__rows_appended = new HashMap<String,Long>();
      for (Map.Entry<String, Long> other_element : other.rows_appended.entrySet()) {

        String other_element_key = other_element.getKey();
        Long other_element_value = other_element.getValue();

        String __this__rows_appended_copy_key = other_element_key;

        Long __this__rows_appended_copy_value = other_element_value;

        __this__rows_appended.put(__this__rows_appended_copy_key, __this__rows_appended_copy_value);
      }
      this.rows_appended = __this__rows_appended;
    }
  }

  public TInsertResult deepCopy() {
    return new TInsertResult(this);
  }

  @Override
  public void clear() {
    this.rows_appended = null;
  }

  public int getRows_appendedSize() {
    return (this.rows_appended == null) ? 0 : this.rows_appended.size();
  }

  public void putToRows_appended(String key, long val) {
    if (this.rows_appended == null) {
      this.rows_appended = new HashMap<String,Long>();
    }
    this.rows_appended.put(key, val);
  }

  public Map<String,Long> getRows_appended() {
    return this.rows_appended;
  }

  public TInsertResult setRows_appended(Map<String,Long> rows_appended) {
    this.rows_appended = rows_appended;
    return this;
  }

  public void unsetRows_appended() {
    this.rows_appended = null;
  }

  /** Returns true if field rows_appended is set (has been assigned a value) and false otherwise */
  public boolean isSetRows_appended() {
    return this.rows_appended != null;
  }

  public void setRows_appendedIsSet(boolean value) {
    if (!value) {
      this.rows_appended = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ROWS_APPENDED:
      if (value == null) {
        unsetRows_appended();
      } else {
        setRows_appended((Map<String,Long>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ROWS_APPENDED:
      return getRows_appended();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ROWS_APPENDED:
      return isSetRows_appended();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TInsertResult)
      return this.equals((TInsertResult)that);
    return false;
  }

  public boolean equals(TInsertResult that) {
    if (that == null)
      return false;

    boolean this_present_rows_appended = true && this.isSetRows_appended();
    boolean that_present_rows_appended = true && that.isSetRows_appended();
    if (this_present_rows_appended || that_present_rows_appended) {
      if (!(this_present_rows_appended && that_present_rows_appended))
        return false;
      if (!this.rows_appended.equals(that.rows_appended))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_rows_appended = true && (isSetRows_appended());
    builder.append(present_rows_appended);
    if (present_rows_appended)
      builder.append(rows_appended);

    return builder.toHashCode();
  }

  public int compareTo(TInsertResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TInsertResult typedOther = (TInsertResult)other;

    lastComparison = Boolean.valueOf(isSetRows_appended()).compareTo(typedOther.isSetRows_appended());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRows_appended()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rows_appended, typedOther.rows_appended);
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
    StringBuilder sb = new StringBuilder("TInsertResult(");
    boolean first = true;

    sb.append("rows_appended:");
    if (this.rows_appended == null) {
      sb.append("null");
    } else {
      sb.append(this.rows_appended);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (rows_appended == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'rows_appended' was not present! Struct: " + toString());
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

  private static class TInsertResultStandardSchemeFactory implements SchemeFactory {
    public TInsertResultStandardScheme getScheme() {
      return new TInsertResultStandardScheme();
    }
  }

  private static class TInsertResultStandardScheme extends StandardScheme<TInsertResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TInsertResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ROWS_APPENDED
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.rows_appended = new HashMap<String,Long>(2*_map0.size);
                for (int _i1 = 0; _i1 < _map0.size; ++_i1)
                {
                  String _key2; // required
                  long _val3; // required
                  _key2 = iprot.readString();
                  _val3 = iprot.readI64();
                  struct.rows_appended.put(_key2, _val3);
                }
                iprot.readMapEnd();
              }
              struct.setRows_appendedIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TInsertResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.rows_appended != null) {
        oprot.writeFieldBegin(ROWS_APPENDED_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I64, struct.rows_appended.size()));
          for (Map.Entry<String, Long> _iter4 : struct.rows_appended.entrySet())
          {
            oprot.writeString(_iter4.getKey());
            oprot.writeI64(_iter4.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TInsertResultTupleSchemeFactory implements SchemeFactory {
    public TInsertResultTupleScheme getScheme() {
      return new TInsertResultTupleScheme();
    }
  }

  private static class TInsertResultTupleScheme extends TupleScheme<TInsertResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TInsertResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.rows_appended.size());
        for (Map.Entry<String, Long> _iter5 : struct.rows_appended.entrySet())
        {
          oprot.writeString(_iter5.getKey());
          oprot.writeI64(_iter5.getValue());
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TInsertResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I64, iprot.readI32());
        struct.rows_appended = new HashMap<String,Long>(2*_map6.size);
        for (int _i7 = 0; _i7 < _map6.size; ++_i7)
        {
          String _key8; // required
          long _val9; // required
          _key8 = iprot.readString();
          _val9 = iprot.readI64();
          struct.rows_appended.put(_key8, _val9);
        }
      }
      struct.setRows_appendedIsSet(true);
    }
  }

}


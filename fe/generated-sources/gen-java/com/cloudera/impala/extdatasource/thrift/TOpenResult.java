/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cloudera.impala.extdatasource.thrift;

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

public class TOpenResult implements org.apache.thrift.TBase<TOpenResult, TOpenResult._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TOpenResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField SCAN_HANDLE_FIELD_DESC = new org.apache.thrift.protocol.TField("scan_handle", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TOpenResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TOpenResultTupleSchemeFactory());
  }

  public com.cloudera.impala.thrift.TStatus status; // required
  public String scan_handle; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    SCAN_HANDLE((short)2, "scan_handle");

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
        case 1: // STATUS
          return STATUS;
        case 2: // SCAN_HANDLE
          return SCAN_HANDLE;
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
  private _Fields optionals[] = {_Fields.SCAN_HANDLE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.impala.thrift.TStatus.class)));
    tmpMap.put(_Fields.SCAN_HANDLE, new org.apache.thrift.meta_data.FieldMetaData("scan_handle", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TOpenResult.class, metaDataMap);
  }

  public TOpenResult() {
  }

  public TOpenResult(
    com.cloudera.impala.thrift.TStatus status)
  {
    this();
    this.status = status;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TOpenResult(TOpenResult other) {
    if (other.isSetStatus()) {
      this.status = new com.cloudera.impala.thrift.TStatus(other.status);
    }
    if (other.isSetScan_handle()) {
      this.scan_handle = other.scan_handle;
    }
  }

  public TOpenResult deepCopy() {
    return new TOpenResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.scan_handle = null;
  }

  public com.cloudera.impala.thrift.TStatus getStatus() {
    return this.status;
  }

  public TOpenResult setStatus(com.cloudera.impala.thrift.TStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public String getScan_handle() {
    return this.scan_handle;
  }

  public TOpenResult setScan_handle(String scan_handle) {
    this.scan_handle = scan_handle;
    return this;
  }

  public void unsetScan_handle() {
    this.scan_handle = null;
  }

  /** Returns true if field scan_handle is set (has been assigned a value) and false otherwise */
  public boolean isSetScan_handle() {
    return this.scan_handle != null;
  }

  public void setScan_handleIsSet(boolean value) {
    if (!value) {
      this.scan_handle = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((com.cloudera.impala.thrift.TStatus)value);
      }
      break;

    case SCAN_HANDLE:
      if (value == null) {
        unsetScan_handle();
      } else {
        setScan_handle((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case SCAN_HANDLE:
      return getScan_handle();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case SCAN_HANDLE:
      return isSetScan_handle();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TOpenResult)
      return this.equals((TOpenResult)that);
    return false;
  }

  public boolean equals(TOpenResult that) {
    if (that == null)
      return false;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_scan_handle = true && this.isSetScan_handle();
    boolean that_present_scan_handle = true && that.isSetScan_handle();
    if (this_present_scan_handle || that_present_scan_handle) {
      if (!(this_present_scan_handle && that_present_scan_handle))
        return false;
      if (!this.scan_handle.equals(that.scan_handle))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_status = true && (isSetStatus());
    builder.append(present_status);
    if (present_status)
      builder.append(status);

    boolean present_scan_handle = true && (isSetScan_handle());
    builder.append(present_scan_handle);
    if (present_scan_handle)
      builder.append(scan_handle);

    return builder.toHashCode();
  }

  public int compareTo(TOpenResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TOpenResult typedOther = (TOpenResult)other;

    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(typedOther.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, typedOther.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetScan_handle()).compareTo(typedOther.isSetScan_handle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScan_handle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scan_handle, typedOther.scan_handle);
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
    StringBuilder sb = new StringBuilder("TOpenResult(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (isSetScan_handle()) {
      if (!first) sb.append(", ");
      sb.append("scan_handle:");
      if (this.scan_handle == null) {
        sb.append("null");
      } else {
        sb.append(this.scan_handle);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (status == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'status' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (status != null) {
      status.validate();
    }
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

  private static class TOpenResultStandardSchemeFactory implements SchemeFactory {
    public TOpenResultStandardScheme getScheme() {
      return new TOpenResultStandardScheme();
    }
  }

  private static class TOpenResultStandardScheme extends StandardScheme<TOpenResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TOpenResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new com.cloudera.impala.thrift.TStatus();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SCAN_HANDLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.scan_handle = iprot.readString();
              struct.setScan_handleIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TOpenResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.scan_handle != null) {
        if (struct.isSetScan_handle()) {
          oprot.writeFieldBegin(SCAN_HANDLE_FIELD_DESC);
          oprot.writeString(struct.scan_handle);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TOpenResultTupleSchemeFactory implements SchemeFactory {
    public TOpenResultTupleScheme getScheme() {
      return new TOpenResultTupleScheme();
    }
  }

  private static class TOpenResultTupleScheme extends TupleScheme<TOpenResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TOpenResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.status.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetScan_handle()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetScan_handle()) {
        oprot.writeString(struct.scan_handle);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TOpenResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.status = new com.cloudera.impala.thrift.TStatus();
      struct.status.read(iprot);
      struct.setStatusIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.scan_handle = iprot.readString();
        struct.setScan_handleIsSet(true);
      }
    }
  }

}


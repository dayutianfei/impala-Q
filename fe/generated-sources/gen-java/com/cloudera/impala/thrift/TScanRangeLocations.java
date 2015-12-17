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

public class TScanRangeLocations implements org.apache.thrift.TBase<TScanRangeLocations, TScanRangeLocations._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TScanRangeLocations");

  private static final org.apache.thrift.protocol.TField SCAN_RANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("scan_range", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField LOCATIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("locations", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TScanRangeLocationsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TScanRangeLocationsTupleSchemeFactory());
  }

  public com.cloudera.impala.thrift.TScanRange scan_range; // required
  public List<TScanRangeLocation> locations; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SCAN_RANGE((short)1, "scan_range"),
    LOCATIONS((short)2, "locations");

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
        case 1: // SCAN_RANGE
          return SCAN_RANGE;
        case 2: // LOCATIONS
          return LOCATIONS;
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
    tmpMap.put(_Fields.SCAN_RANGE, new org.apache.thrift.meta_data.FieldMetaData("scan_range", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.impala.thrift.TScanRange.class)));
    tmpMap.put(_Fields.LOCATIONS, new org.apache.thrift.meta_data.FieldMetaData("locations", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TScanRangeLocation.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TScanRangeLocations.class, metaDataMap);
  }

  public TScanRangeLocations() {
  }

  public TScanRangeLocations(
    com.cloudera.impala.thrift.TScanRange scan_range,
    List<TScanRangeLocation> locations)
  {
    this();
    this.scan_range = scan_range;
    this.locations = locations;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TScanRangeLocations(TScanRangeLocations other) {
    if (other.isSetScan_range()) {
      this.scan_range = new com.cloudera.impala.thrift.TScanRange(other.scan_range);
    }
    if (other.isSetLocations()) {
      List<TScanRangeLocation> __this__locations = new ArrayList<TScanRangeLocation>();
      for (TScanRangeLocation other_element : other.locations) {
        __this__locations.add(new TScanRangeLocation(other_element));
      }
      this.locations = __this__locations;
    }
  }

  public TScanRangeLocations deepCopy() {
    return new TScanRangeLocations(this);
  }

  @Override
  public void clear() {
    this.scan_range = null;
    this.locations = null;
  }

  public com.cloudera.impala.thrift.TScanRange getScan_range() {
    return this.scan_range;
  }

  public TScanRangeLocations setScan_range(com.cloudera.impala.thrift.TScanRange scan_range) {
    this.scan_range = scan_range;
    return this;
  }

  public void unsetScan_range() {
    this.scan_range = null;
  }

  /** Returns true if field scan_range is set (has been assigned a value) and false otherwise */
  public boolean isSetScan_range() {
    return this.scan_range != null;
  }

  public void setScan_rangeIsSet(boolean value) {
    if (!value) {
      this.scan_range = null;
    }
  }

  public int getLocationsSize() {
    return (this.locations == null) ? 0 : this.locations.size();
  }

  public java.util.Iterator<TScanRangeLocation> getLocationsIterator() {
    return (this.locations == null) ? null : this.locations.iterator();
  }

  public void addToLocations(TScanRangeLocation elem) {
    if (this.locations == null) {
      this.locations = new ArrayList<TScanRangeLocation>();
    }
    this.locations.add(elem);
  }

  public List<TScanRangeLocation> getLocations() {
    return this.locations;
  }

  public TScanRangeLocations setLocations(List<TScanRangeLocation> locations) {
    this.locations = locations;
    return this;
  }

  public void unsetLocations() {
    this.locations = null;
  }

  /** Returns true if field locations is set (has been assigned a value) and false otherwise */
  public boolean isSetLocations() {
    return this.locations != null;
  }

  public void setLocationsIsSet(boolean value) {
    if (!value) {
      this.locations = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SCAN_RANGE:
      if (value == null) {
        unsetScan_range();
      } else {
        setScan_range((com.cloudera.impala.thrift.TScanRange)value);
      }
      break;

    case LOCATIONS:
      if (value == null) {
        unsetLocations();
      } else {
        setLocations((List<TScanRangeLocation>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SCAN_RANGE:
      return getScan_range();

    case LOCATIONS:
      return getLocations();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SCAN_RANGE:
      return isSetScan_range();
    case LOCATIONS:
      return isSetLocations();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TScanRangeLocations)
      return this.equals((TScanRangeLocations)that);
    return false;
  }

  public boolean equals(TScanRangeLocations that) {
    if (that == null)
      return false;

    boolean this_present_scan_range = true && this.isSetScan_range();
    boolean that_present_scan_range = true && that.isSetScan_range();
    if (this_present_scan_range || that_present_scan_range) {
      if (!(this_present_scan_range && that_present_scan_range))
        return false;
      if (!this.scan_range.equals(that.scan_range))
        return false;
    }

    boolean this_present_locations = true && this.isSetLocations();
    boolean that_present_locations = true && that.isSetLocations();
    if (this_present_locations || that_present_locations) {
      if (!(this_present_locations && that_present_locations))
        return false;
      if (!this.locations.equals(that.locations))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_scan_range = true && (isSetScan_range());
    builder.append(present_scan_range);
    if (present_scan_range)
      builder.append(scan_range);

    boolean present_locations = true && (isSetLocations());
    builder.append(present_locations);
    if (present_locations)
      builder.append(locations);

    return builder.toHashCode();
  }

  public int compareTo(TScanRangeLocations other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TScanRangeLocations typedOther = (TScanRangeLocations)other;

    lastComparison = Boolean.valueOf(isSetScan_range()).compareTo(typedOther.isSetScan_range());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScan_range()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scan_range, typedOther.scan_range);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLocations()).compareTo(typedOther.isSetLocations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocations()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.locations, typedOther.locations);
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
    StringBuilder sb = new StringBuilder("TScanRangeLocations(");
    boolean first = true;

    sb.append("scan_range:");
    if (this.scan_range == null) {
      sb.append("null");
    } else {
      sb.append(this.scan_range);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("locations:");
    if (this.locations == null) {
      sb.append("null");
    } else {
      sb.append(this.locations);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (scan_range == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'scan_range' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (scan_range != null) {
      scan_range.validate();
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

  private static class TScanRangeLocationsStandardSchemeFactory implements SchemeFactory {
    public TScanRangeLocationsStandardScheme getScheme() {
      return new TScanRangeLocationsStandardScheme();
    }
  }

  private static class TScanRangeLocationsStandardScheme extends StandardScheme<TScanRangeLocations> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TScanRangeLocations struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SCAN_RANGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.scan_range = new com.cloudera.impala.thrift.TScanRange();
              struct.scan_range.read(iprot);
              struct.setScan_rangeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOCATIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.locations = new ArrayList<TScanRangeLocation>(_list8.size);
                for (int _i9 = 0; _i9 < _list8.size; ++_i9)
                {
                  TScanRangeLocation _elem10; // required
                  _elem10 = new TScanRangeLocation();
                  _elem10.read(iprot);
                  struct.locations.add(_elem10);
                }
                iprot.readListEnd();
              }
              struct.setLocationsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TScanRangeLocations struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.scan_range != null) {
        oprot.writeFieldBegin(SCAN_RANGE_FIELD_DESC);
        struct.scan_range.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.locations != null) {
        oprot.writeFieldBegin(LOCATIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.locations.size()));
          for (TScanRangeLocation _iter11 : struct.locations)
          {
            _iter11.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TScanRangeLocationsTupleSchemeFactory implements SchemeFactory {
    public TScanRangeLocationsTupleScheme getScheme() {
      return new TScanRangeLocationsTupleScheme();
    }
  }

  private static class TScanRangeLocationsTupleScheme extends TupleScheme<TScanRangeLocations> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TScanRangeLocations struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.scan_range.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetLocations()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetLocations()) {
        {
          oprot.writeI32(struct.locations.size());
          for (TScanRangeLocation _iter12 : struct.locations)
          {
            _iter12.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TScanRangeLocations struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.scan_range = new com.cloudera.impala.thrift.TScanRange();
      struct.scan_range.read(iprot);
      struct.setScan_rangeIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.locations = new ArrayList<TScanRangeLocation>(_list13.size);
          for (int _i14 = 0; _i14 < _list13.size; ++_i14)
          {
            TScanRangeLocation _elem15; // required
            _elem15 = new TScanRangeLocation();
            _elem15.read(iprot);
            struct.locations.add(_elem15);
          }
        }
        struct.setLocationsIsSet(true);
      }
    }
  }

}


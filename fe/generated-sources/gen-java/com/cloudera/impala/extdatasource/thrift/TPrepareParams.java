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

public class TPrepareParams implements org.apache.thrift.TBase<TPrepareParams, TPrepareParams._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPrepareParams");

  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("table_name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField INIT_STRING_FIELD_DESC = new org.apache.thrift.protocol.TField("init_string", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PREDICATES_FIELD_DESC = new org.apache.thrift.protocol.TField("predicates", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TPrepareParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TPrepareParamsTupleSchemeFactory());
  }

  public String table_name; // optional
  public String init_string; // optional
  public List<List<TBinaryPredicate>> predicates; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLE_NAME((short)1, "table_name"),
    INIT_STRING((short)2, "init_string"),
    PREDICATES((short)3, "predicates");

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
        case 1: // TABLE_NAME
          return TABLE_NAME;
        case 2: // INIT_STRING
          return INIT_STRING;
        case 3: // PREDICATES
          return PREDICATES;
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
  private _Fields optionals[] = {_Fields.TABLE_NAME,_Fields.INIT_STRING,_Fields.PREDICATES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("table_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INIT_STRING, new org.apache.thrift.meta_data.FieldMetaData("init_string", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PREDICATES, new org.apache.thrift.meta_data.FieldMetaData("predicates", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TBinaryPredicate.class)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPrepareParams.class, metaDataMap);
  }

  public TPrepareParams() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPrepareParams(TPrepareParams other) {
    if (other.isSetTable_name()) {
      this.table_name = other.table_name;
    }
    if (other.isSetInit_string()) {
      this.init_string = other.init_string;
    }
    if (other.isSetPredicates()) {
      List<List<TBinaryPredicate>> __this__predicates = new ArrayList<List<TBinaryPredicate>>();
      for (List<TBinaryPredicate> other_element : other.predicates) {
        List<TBinaryPredicate> __this__predicates_copy = new ArrayList<TBinaryPredicate>();
        for (TBinaryPredicate other_element_element : other_element) {
          __this__predicates_copy.add(new TBinaryPredicate(other_element_element));
        }
        __this__predicates.add(__this__predicates_copy);
      }
      this.predicates = __this__predicates;
    }
  }

  public TPrepareParams deepCopy() {
    return new TPrepareParams(this);
  }

  @Override
  public void clear() {
    this.table_name = null;
    this.init_string = null;
    this.predicates = null;
  }

  public String getTable_name() {
    return this.table_name;
  }

  public TPrepareParams setTable_name(String table_name) {
    this.table_name = table_name;
    return this;
  }

  public void unsetTable_name() {
    this.table_name = null;
  }

  /** Returns true if field table_name is set (has been assigned a value) and false otherwise */
  public boolean isSetTable_name() {
    return this.table_name != null;
  }

  public void setTable_nameIsSet(boolean value) {
    if (!value) {
      this.table_name = null;
    }
  }

  public String getInit_string() {
    return this.init_string;
  }

  public TPrepareParams setInit_string(String init_string) {
    this.init_string = init_string;
    return this;
  }

  public void unsetInit_string() {
    this.init_string = null;
  }

  /** Returns true if field init_string is set (has been assigned a value) and false otherwise */
  public boolean isSetInit_string() {
    return this.init_string != null;
  }

  public void setInit_stringIsSet(boolean value) {
    if (!value) {
      this.init_string = null;
    }
  }

  public int getPredicatesSize() {
    return (this.predicates == null) ? 0 : this.predicates.size();
  }

  public java.util.Iterator<List<TBinaryPredicate>> getPredicatesIterator() {
    return (this.predicates == null) ? null : this.predicates.iterator();
  }

  public void addToPredicates(List<TBinaryPredicate> elem) {
    if (this.predicates == null) {
      this.predicates = new ArrayList<List<TBinaryPredicate>>();
    }
    this.predicates.add(elem);
  }

  public List<List<TBinaryPredicate>> getPredicates() {
    return this.predicates;
  }

  public TPrepareParams setPredicates(List<List<TBinaryPredicate>> predicates) {
    this.predicates = predicates;
    return this;
  }

  public void unsetPredicates() {
    this.predicates = null;
  }

  /** Returns true if field predicates is set (has been assigned a value) and false otherwise */
  public boolean isSetPredicates() {
    return this.predicates != null;
  }

  public void setPredicatesIsSet(boolean value) {
    if (!value) {
      this.predicates = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TABLE_NAME:
      if (value == null) {
        unsetTable_name();
      } else {
        setTable_name((String)value);
      }
      break;

    case INIT_STRING:
      if (value == null) {
        unsetInit_string();
      } else {
        setInit_string((String)value);
      }
      break;

    case PREDICATES:
      if (value == null) {
        unsetPredicates();
      } else {
        setPredicates((List<List<TBinaryPredicate>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE_NAME:
      return getTable_name();

    case INIT_STRING:
      return getInit_string();

    case PREDICATES:
      return getPredicates();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TABLE_NAME:
      return isSetTable_name();
    case INIT_STRING:
      return isSetInit_string();
    case PREDICATES:
      return isSetPredicates();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TPrepareParams)
      return this.equals((TPrepareParams)that);
    return false;
  }

  public boolean equals(TPrepareParams that) {
    if (that == null)
      return false;

    boolean this_present_table_name = true && this.isSetTable_name();
    boolean that_present_table_name = true && that.isSetTable_name();
    if (this_present_table_name || that_present_table_name) {
      if (!(this_present_table_name && that_present_table_name))
        return false;
      if (!this.table_name.equals(that.table_name))
        return false;
    }

    boolean this_present_init_string = true && this.isSetInit_string();
    boolean that_present_init_string = true && that.isSetInit_string();
    if (this_present_init_string || that_present_init_string) {
      if (!(this_present_init_string && that_present_init_string))
        return false;
      if (!this.init_string.equals(that.init_string))
        return false;
    }

    boolean this_present_predicates = true && this.isSetPredicates();
    boolean that_present_predicates = true && that.isSetPredicates();
    if (this_present_predicates || that_present_predicates) {
      if (!(this_present_predicates && that_present_predicates))
        return false;
      if (!this.predicates.equals(that.predicates))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_table_name = true && (isSetTable_name());
    builder.append(present_table_name);
    if (present_table_name)
      builder.append(table_name);

    boolean present_init_string = true && (isSetInit_string());
    builder.append(present_init_string);
    if (present_init_string)
      builder.append(init_string);

    boolean present_predicates = true && (isSetPredicates());
    builder.append(present_predicates);
    if (present_predicates)
      builder.append(predicates);

    return builder.toHashCode();
  }

  public int compareTo(TPrepareParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TPrepareParams typedOther = (TPrepareParams)other;

    lastComparison = Boolean.valueOf(isSetTable_name()).compareTo(typedOther.isSetTable_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTable_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table_name, typedOther.table_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInit_string()).compareTo(typedOther.isSetInit_string());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInit_string()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.init_string, typedOther.init_string);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPredicates()).compareTo(typedOther.isSetPredicates());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPredicates()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.predicates, typedOther.predicates);
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
    StringBuilder sb = new StringBuilder("TPrepareParams(");
    boolean first = true;

    if (isSetTable_name()) {
      sb.append("table_name:");
      if (this.table_name == null) {
        sb.append("null");
      } else {
        sb.append(this.table_name);
      }
      first = false;
    }
    if (isSetInit_string()) {
      if (!first) sb.append(", ");
      sb.append("init_string:");
      if (this.init_string == null) {
        sb.append("null");
      } else {
        sb.append(this.init_string);
      }
      first = false;
    }
    if (isSetPredicates()) {
      if (!first) sb.append(", ");
      sb.append("predicates:");
      if (this.predicates == null) {
        sb.append("null");
      } else {
        sb.append(this.predicates);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class TPrepareParamsStandardSchemeFactory implements SchemeFactory {
    public TPrepareParamsStandardScheme getScheme() {
      return new TPrepareParamsStandardScheme();
    }
  }

  private static class TPrepareParamsStandardScheme extends StandardScheme<TPrepareParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TPrepareParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.table_name = iprot.readString();
              struct.setTable_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INIT_STRING
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.init_string = iprot.readString();
              struct.setInit_stringIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PREDICATES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.predicates = new ArrayList<List<TBinaryPredicate>>(_list16.size);
                for (int _i17 = 0; _i17 < _list16.size; ++_i17)
                {
                  List<TBinaryPredicate> _elem18; // required
                  {
                    org.apache.thrift.protocol.TList _list19 = iprot.readListBegin();
                    _elem18 = new ArrayList<TBinaryPredicate>(_list19.size);
                    for (int _i20 = 0; _i20 < _list19.size; ++_i20)
                    {
                      TBinaryPredicate _elem21; // required
                      _elem21 = new TBinaryPredicate();
                      _elem21.read(iprot);
                      _elem18.add(_elem21);
                    }
                    iprot.readListEnd();
                  }
                  struct.predicates.add(_elem18);
                }
                iprot.readListEnd();
              }
              struct.setPredicatesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TPrepareParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.table_name != null) {
        if (struct.isSetTable_name()) {
          oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
          oprot.writeString(struct.table_name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.init_string != null) {
        if (struct.isSetInit_string()) {
          oprot.writeFieldBegin(INIT_STRING_FIELD_DESC);
          oprot.writeString(struct.init_string);
          oprot.writeFieldEnd();
        }
      }
      if (struct.predicates != null) {
        if (struct.isSetPredicates()) {
          oprot.writeFieldBegin(PREDICATES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.predicates.size()));
            for (List<TBinaryPredicate> _iter22 : struct.predicates)
            {
              {
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter22.size()));
                for (TBinaryPredicate _iter23 : _iter22)
                {
                  _iter23.write(oprot);
                }
                oprot.writeListEnd();
              }
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPrepareParamsTupleSchemeFactory implements SchemeFactory {
    public TPrepareParamsTupleScheme getScheme() {
      return new TPrepareParamsTupleScheme();
    }
  }

  private static class TPrepareParamsTupleScheme extends TupleScheme<TPrepareParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPrepareParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTable_name()) {
        optionals.set(0);
      }
      if (struct.isSetInit_string()) {
        optionals.set(1);
      }
      if (struct.isSetPredicates()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTable_name()) {
        oprot.writeString(struct.table_name);
      }
      if (struct.isSetInit_string()) {
        oprot.writeString(struct.init_string);
      }
      if (struct.isSetPredicates()) {
        {
          oprot.writeI32(struct.predicates.size());
          for (List<TBinaryPredicate> _iter24 : struct.predicates)
          {
            {
              oprot.writeI32(_iter24.size());
              for (TBinaryPredicate _iter25 : _iter24)
              {
                _iter25.write(oprot);
              }
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPrepareParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.table_name = iprot.readString();
        struct.setTable_nameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.init_string = iprot.readString();
        struct.setInit_stringIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list26 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, iprot.readI32());
          struct.predicates = new ArrayList<List<TBinaryPredicate>>(_list26.size);
          for (int _i27 = 0; _i27 < _list26.size; ++_i27)
          {
            List<TBinaryPredicate> _elem28; // required
            {
              org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
              _elem28 = new ArrayList<TBinaryPredicate>(_list29.size);
              for (int _i30 = 0; _i30 < _list29.size; ++_i30)
              {
                TBinaryPredicate _elem31; // required
                _elem31 = new TBinaryPredicate();
                _elem31.read(iprot);
                _elem28.add(_elem31);
              }
            }
            struct.predicates.add(_elem28);
          }
        }
        struct.setPredicatesIsSet(true);
      }
    }
  }

}


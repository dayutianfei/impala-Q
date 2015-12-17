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

public class TGetAllHadoopConfigsResponse implements org.apache.thrift.TBase<TGetAllHadoopConfigsResponse, TGetAllHadoopConfigsResponse._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetAllHadoopConfigsResponse");

  private static final org.apache.thrift.protocol.TField CONFIGS_FIELD_DESC = new org.apache.thrift.protocol.TField("configs", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TGetAllHadoopConfigsResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TGetAllHadoopConfigsResponseTupleSchemeFactory());
  }

  public Map<String,String> configs; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CONFIGS((short)1, "configs");

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
        case 1: // CONFIGS
          return CONFIGS;
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
  private _Fields optionals[] = {_Fields.CONFIGS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CONFIGS, new org.apache.thrift.meta_data.FieldMetaData("configs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetAllHadoopConfigsResponse.class, metaDataMap);
  }

  public TGetAllHadoopConfigsResponse() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetAllHadoopConfigsResponse(TGetAllHadoopConfigsResponse other) {
    if (other.isSetConfigs()) {
      Map<String,String> __this__configs = new HashMap<String,String>();
      for (Map.Entry<String, String> other_element : other.configs.entrySet()) {

        String other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        String __this__configs_copy_key = other_element_key;

        String __this__configs_copy_value = other_element_value;

        __this__configs.put(__this__configs_copy_key, __this__configs_copy_value);
      }
      this.configs = __this__configs;
    }
  }

  public TGetAllHadoopConfigsResponse deepCopy() {
    return new TGetAllHadoopConfigsResponse(this);
  }

  @Override
  public void clear() {
    this.configs = null;
  }

  public int getConfigsSize() {
    return (this.configs == null) ? 0 : this.configs.size();
  }

  public void putToConfigs(String key, String val) {
    if (this.configs == null) {
      this.configs = new HashMap<String,String>();
    }
    this.configs.put(key, val);
  }

  public Map<String,String> getConfigs() {
    return this.configs;
  }

  public TGetAllHadoopConfigsResponse setConfigs(Map<String,String> configs) {
    this.configs = configs;
    return this;
  }

  public void unsetConfigs() {
    this.configs = null;
  }

  /** Returns true if field configs is set (has been assigned a value) and false otherwise */
  public boolean isSetConfigs() {
    return this.configs != null;
  }

  public void setConfigsIsSet(boolean value) {
    if (!value) {
      this.configs = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CONFIGS:
      if (value == null) {
        unsetConfigs();
      } else {
        setConfigs((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CONFIGS:
      return getConfigs();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CONFIGS:
      return isSetConfigs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TGetAllHadoopConfigsResponse)
      return this.equals((TGetAllHadoopConfigsResponse)that);
    return false;
  }

  public boolean equals(TGetAllHadoopConfigsResponse that) {
    if (that == null)
      return false;

    boolean this_present_configs = true && this.isSetConfigs();
    boolean that_present_configs = true && that.isSetConfigs();
    if (this_present_configs || that_present_configs) {
      if (!(this_present_configs && that_present_configs))
        return false;
      if (!this.configs.equals(that.configs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_configs = true && (isSetConfigs());
    builder.append(present_configs);
    if (present_configs)
      builder.append(configs);

    return builder.toHashCode();
  }

  public int compareTo(TGetAllHadoopConfigsResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TGetAllHadoopConfigsResponse typedOther = (TGetAllHadoopConfigsResponse)other;

    lastComparison = Boolean.valueOf(isSetConfigs()).compareTo(typedOther.isSetConfigs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConfigs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.configs, typedOther.configs);
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
    StringBuilder sb = new StringBuilder("TGetAllHadoopConfigsResponse(");
    boolean first = true;

    if (isSetConfigs()) {
      sb.append("configs:");
      if (this.configs == null) {
        sb.append("null");
      } else {
        sb.append(this.configs);
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

  private static class TGetAllHadoopConfigsResponseStandardSchemeFactory implements SchemeFactory {
    public TGetAllHadoopConfigsResponseStandardScheme getScheme() {
      return new TGetAllHadoopConfigsResponseStandardScheme();
    }
  }

  private static class TGetAllHadoopConfigsResponseStandardScheme extends StandardScheme<TGetAllHadoopConfigsResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetAllHadoopConfigsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONFIGS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map210 = iprot.readMapBegin();
                struct.configs = new HashMap<String,String>(2*_map210.size);
                for (int _i211 = 0; _i211 < _map210.size; ++_i211)
                {
                  String _key212; // required
                  String _val213; // required
                  _key212 = iprot.readString();
                  _val213 = iprot.readString();
                  struct.configs.put(_key212, _val213);
                }
                iprot.readMapEnd();
              }
              struct.setConfigsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetAllHadoopConfigsResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.configs != null) {
        if (struct.isSetConfigs()) {
          oprot.writeFieldBegin(CONFIGS_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.configs.size()));
            for (Map.Entry<String, String> _iter214 : struct.configs.entrySet())
            {
              oprot.writeString(_iter214.getKey());
              oprot.writeString(_iter214.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetAllHadoopConfigsResponseTupleSchemeFactory implements SchemeFactory {
    public TGetAllHadoopConfigsResponseTupleScheme getScheme() {
      return new TGetAllHadoopConfigsResponseTupleScheme();
    }
  }

  private static class TGetAllHadoopConfigsResponseTupleScheme extends TupleScheme<TGetAllHadoopConfigsResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetAllHadoopConfigsResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetConfigs()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetConfigs()) {
        {
          oprot.writeI32(struct.configs.size());
          for (Map.Entry<String, String> _iter215 : struct.configs.entrySet())
          {
            oprot.writeString(_iter215.getKey());
            oprot.writeString(_iter215.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetAllHadoopConfigsResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map216 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.configs = new HashMap<String,String>(2*_map216.size);
          for (int _i217 = 0; _i217 < _map216.size; ++_i217)
          {
            String _key218; // required
            String _val219; // required
            _key218 = iprot.readString();
            _val219 = iprot.readString();
            struct.configs.put(_key218, _val219);
          }
        }
        struct.setConfigsIsSet(true);
      }
    }
  }

}


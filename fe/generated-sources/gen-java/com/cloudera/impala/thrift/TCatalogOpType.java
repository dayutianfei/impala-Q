/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cloudera.impala.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TCatalogOpType implements org.apache.thrift.TEnum {
  SHOW_TABLES(0),
  SHOW_DBS(1),
  SHOW_STATS(2),
  USE(3),
  DESCRIBE(4),
  SHOW_FUNCTIONS(5),
  RESET_METADATA(6),
  DDL(7),
  SHOW_CREATE_TABLE(8),
  SHOW_DATA_SRCS(9),
  SHOW_ROLES(10),
  SHOW_GRANT_ROLE(11),
  DESCRIBE_INDEX(12),
  SHOW_INDICES(13);

  private final int value;

  private TCatalogOpType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TCatalogOpType findByValue(int value) { 
    switch (value) {
      case 0:
        return SHOW_TABLES;
      case 1:
        return SHOW_DBS;
      case 2:
        return SHOW_STATS;
      case 3:
        return USE;
      case 4:
        return DESCRIBE;
      case 5:
        return SHOW_FUNCTIONS;
      case 6:
        return RESET_METADATA;
      case 7:
        return DDL;
      case 8:
        return SHOW_CREATE_TABLE;
      case 9:
        return SHOW_DATA_SRCS;
      case 10:
        return SHOW_ROLES;
      case 11:
        return SHOW_GRANT_ROLE;
      case 12:
        return DESCRIBE_INDEX;
      case 13:
        return SHOW_INDICES;
      default:
        return null;
    }
  }
}

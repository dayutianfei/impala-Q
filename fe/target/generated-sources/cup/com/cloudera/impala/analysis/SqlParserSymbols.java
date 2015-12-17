
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Thu Dec 17 18:54:32 CST 2015
//----------------------------------------------------

package com.cloudera.impala.analysis;

/** CUP generated class containing symbol constants. */
public class SqlParserSymbols {
  /* terminals */
  public static final int KW_EXISTS = 49;
  public static final int KW_PRECEDING = 108;
  public static final int KW_DATABASE = 34;
  public static final int KW_INTO = 79;
  public static final int KW_NOT = 93;
  public static final int KW_STRUCT = 138;
  public static final int STRING_LITERAL = 190;
  public static final int KW_SEQUENCEFILE = 129;
  public static final int KW_SCHEMA = 125;
  public static final int KW_SERDEPROPERTIES = 130;
  public static final int KW_FLOAT = 57;
  public static final int BITAND = 176;
  public static final int COMMENTED_PLAN_HINTS = 187;
  public static final int RPAREN = 169;
  public static final int KW_REGEXP = 114;
  public static final int KW_FOR = 59;
  public static final int KW_LIMIT = 86;
  public static final int KW_ORDER = 99;
  public static final int KW_SELECT = 127;
  public static final int KW_ROLE = 121;
  public static final int KW_PARTITIONED = 106;
  public static final int KW_FUNCTION = 64;
  public static final int KW_WHERE = 161;
  public static final int KW_GRANT = 66;
  public static final int KW_USE = 155;
  public static final int KW_FUNCTIONS = 65;
  public static final int KW_INIT_FN = 72;
  public static final int KW_NULL = 94;
  public static final int KW_PARTITION = 105;
  public static final int KW_DATETIME = 37;
  public static final int KW_IS = 81;
  public static final int KW_ROWS = 124;
  public static final int KW_EXPLAIN = 50;
  public static final int ADD = 174;
  public static final int MOD = 173;
  public static final int KW_UNION = 153;
  public static final int KW_IN = 70;
  public static final int KW_DOUBLE = 44;
  public static final int KW_OFFSET = 96;
  public static final int KW_COLUMN = 26;
  public static final int KW_UNCACHED = 152;
  public static final int KW_IF = 69;
  public static final int EMPTY_IDENT = 185;
  public static final int KW_OVERWRITE = 102;
  public static final int KW_ARRAY = 10;
  public static final int NUMERIC_OVERFLOW = 186;
  public static final int DOTDOTDOT = 166;
  public static final int BITXOR = 178;
  public static final int UNMATCHED_STRING_LITERAL = 191;
  public static final int KW_ELSE = 46;
  public static final int KW_SYMBOL = 139;
  public static final int EOF = 0;
  public static final int KW_SET = 132;
  public static final int KW_FOLLOWING = 58;
  public static final int KW_ANTI = 8;
  public static final int KW_DROP = 45;
  public static final int KW_CHAR = 23;
  public static final int KW_STRING = 137;
  public static final int KW_TRUE = 150;
  public static final int KW_INSERT = 75;
  public static final int KW_PRODUCED = 110;
  public static final int KW_WHEN = 160;
  public static final int KW_TO = 149;
  public static final int KW_REFRESH = 113;
  public static final int KW_REVOKE = 118;
  public static final int KW_FORMAT = 60;
  public static final int KW_INTERVAL = 78;
  public static final int BITNOT = 179;
  public static final int KW_SEMI = 128;
  public static final int EQUAL = 180;
  public static final int KW_LAST = 83;
  public static final int LESSTHAN = 182;
  public static final int KW_ASC = 12;
  public static final int KW_TBLPROPERTIES = 142;
  public static final int KW_LEFT = 84;
  public static final int KW_AVRO = 13;
  public static final int KW_RANGE = 111;
  public static final int KW_DISTINCT = 42;
  public static final int KW_USING = 156;
  public static final int KW_CAST = 21;
  public static final int SUBTRACT = 175;
  public static final int KW_RCFILE = 112;
  public static final int KW_NULLS = 95;
  public static final int KW_FIRST = 56;
  public static final int KW_CASE = 20;
  public static final int KW_VARCHAR = 158;
  public static final int KW_OVER = 101;
  public static final int KW_INVALIDATE = 80;
  public static final int KW_FULL = 63;
  public static final int KW_CLOSE_FN = 25;
  public static final int KW_UNBOUNDED = 151;
  public static final int IDENT = 184;
  public static final int KW_FIELDS = 53;
  public static final int KW_GROUP = 67;
  public static final int KW_DELIMITED = 39;
  public static final int KW_FINALIZE_FN = 55;
  public static final int KW_COLUMNS = 27;
  public static final int GREATERTHAN = 183;
  public static final int KW_CREATE = 30;
  public static final int KW_TABLE = 140;
  public static final int KW_CACHED = 19;
  public static final int LPAREN = 168;
  public static final int KW_ROLES = 122;
  public static final int KW_RIGHT = 119;
  public static final int KW_REPLACE = 116;
  public static final int RBRACKET = 171;
  public static final int KW_TIMESTAMP = 146;
  public static final int KW_COMMENT = 28;
  public static final int KW_INPATH = 74;
  public static final int KW_RENAME = 115;
  public static final int KW_VIEW = 159;
  public static final int KW_ADD = 2;
  public static final int KW_DATE = 36;
  public static final int KW_DATA = 33;
  public static final int KW_DIV = 43;
  public static final int KW_BIGINT = 15;
  public static final int KW_CLASS = 24;
  public static final int KW_FILEFORMAT = 54;
  public static final int KW_COMPUTE = 29;
  public static final int COMMA = 164;
  public static final int KW_WITH = 162;
  public static final int KW_JOIN = 82;
  public static final int KW_PREPARE_FN = 109;
  public static final int KW_SHOW = 133;
  public static final int KW_ALTER = 5;
  public static final int KW_TABLES = 141;
  public static final int KW_OUTER = 100;
  public static final int KW_DESC = 40;
  public static final int KW_INT = 76;
  public static final int KW_STRAIGHT_JOIN = 136;
  public static final int NOT = 181;
  public static final int KW_THEN = 145;
  public static final int LBRACKET = 170;
  public static final int KW_MAP = 90;
  public static final int KW_HAVING = 68;
  public static final int KW_INTERMEDIATE = 77;
  public static final int KW_SMALLINT = 134;
  public static final int KW_PARQUET = 103;
  public static final int KW_SCHEMAS = 126;
  public static final int KW_OR = 98;
  public static final int KW_LOAD = 88;
  public static final int KW_API_VERSION = 9;
  public static final int KW_VALUES = 157;
  public static final int KW_END = 47;
  public static final int KW_ON = 97;
  public static final int STAR = 167;
  public static final int KW_STATS = 148;
  public static final int KW_TEXTFILE = 144;
  public static final int KW_FROM = 62;
  public static final int KW_BY = 18;
  public static final int DOT = 165;
  public static final int KW_AND = 7;
  public static final int KW_SERIALIZE_FN = 131;
  public static final int KW_CROSS = 31;
  public static final int DIVIDE = 172;
  public static final int KW_CURRENT = 32;
  public static final int KW_TERMINATED = 143;
  public static final int KW_RETURNS = 117;
  public static final int KW_FALSE = 52;
  public static final int KW_PARTITIONS = 107;
  public static final int KW_STORED = 135;
  public static final int KW_FORMATTED = 61;
  public static final int KW_MERGE_FN = 91;
  public static final int BITOR = 177;
  public static final int KW_BOOLEAN = 17;
  public static final int INTEGER_LITERAL = 188;
  public static final int KW_DESCRIBE = 41;
  public static final int KW_AGGREGATE = 3;
  public static final int KW_INCREMENTAL = 71;
  public static final int KW_BINARY = 16;
  public static final int KW_DECIMAL = 38;
  public static final int KW_AS = 11;
  public static final int DECIMAL_LITERAL = 189;
  public static final int KW_INNER = 73;
  public static final int KW_LOCATION = 89;
  public static final int KW_DATABASES = 35;
  public static final int error = 1;
  public static final int KW_BETWEEN = 14;
  public static final int KW_CHANGE = 22;
  public static final int KW_TINYINT = 147;
  public static final int KW_ALL = 4;
  public static final int KW_ESCAPED = 48;
  public static final int KW_ANALYTIC = 6;
  public static final int KW_LINES = 87;
  public static final int COLON = 163;
  public static final int KW_UPDATE_FN = 154;
  public static final int KW_LIKE = 85;
  public static final int KW_RLIKE = 120;
  public static final int KW_ROW = 123;
  public static final int KW_EXTERNAL = 51;
  public static final int KW_PARQUETFILE = 104;
  public static final int KW_METADATA = 92;
}


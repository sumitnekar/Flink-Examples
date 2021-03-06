/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.flink.avro;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class UserInfo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -985226602038248747L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserInfo\",\"namespace\":\"com.example.flink.avro\",\"fields\":[{\"name\":\"name\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public int name;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public UserInfo() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   */
  public UserInfo(java.lang.Integer name) {
    this.name = name;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.Integer getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.Integer value) {
    this.name = value;
  }

  /**
   * Creates a new UserInfo RecordBuilder.
   * @return A new UserInfo RecordBuilder
   */
  public static com.example.flink.avro.UserInfo.Builder newBuilder() {
    return new com.example.flink.avro.UserInfo.Builder();
  }

  /**
   * Creates a new UserInfo RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new UserInfo RecordBuilder
   */
  public static com.example.flink.avro.UserInfo.Builder newBuilder(com.example.flink.avro.UserInfo.Builder other) {
    return new com.example.flink.avro.UserInfo.Builder(other);
  }

  /**
   * Creates a new UserInfo RecordBuilder by copying an existing UserInfo instance.
   * @param other The existing instance to copy.
   * @return A new UserInfo RecordBuilder
   */
  public static com.example.flink.avro.UserInfo.Builder newBuilder(com.example.flink.avro.UserInfo other) {
    return new com.example.flink.avro.UserInfo.Builder(other);
  }

  /**
   * RecordBuilder for UserInfo instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UserInfo>
    implements org.apache.avro.data.RecordBuilder<UserInfo> {

    private int name;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.flink.avro.UserInfo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing UserInfo instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.flink.avro.UserInfo other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.Integer getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.example.flink.avro.UserInfo.Builder setName(int value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.example.flink.avro.UserInfo.Builder clearName() {
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public UserInfo build() {
      try {
        UserInfo record = new UserInfo();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.Integer) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package com.subscriptionserver.proto;

/**
 * Protobuf type {@code com.subscriptionmanager.RenewSubscriptionRequest}
 */
public final class RenewSubscriptionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.subscriptionmanager.RenewSubscriptionRequest)
    RenewSubscriptionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RenewSubscriptionRequest.newBuilder() to construct.
  private RenewSubscriptionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RenewSubscriptionRequest() {
    subscriptionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RenewSubscriptionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.subscriptionserver.proto.Service.internal_static_com_subscriptionmanager_RenewSubscriptionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.subscriptionserver.proto.Service.internal_static_com_subscriptionmanager_RenewSubscriptionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.subscriptionserver.proto.RenewSubscriptionRequest.class, com.subscriptionserver.proto.RenewSubscriptionRequest.Builder.class);
  }

  public static final int SUBSCRIPTION_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object subscriptionId_;
  /**
   * <code>string subscription_id = 1;</code>
   * @return The subscriptionId.
   */
  @java.lang.Override
  public java.lang.String getSubscriptionId() {
    java.lang.Object ref = subscriptionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subscriptionId_ = s;
      return s;
    }
  }
  /**
   * <code>string subscription_id = 1;</code>
   * @return The bytes for subscriptionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubscriptionIdBytes() {
    java.lang.Object ref = subscriptionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subscriptionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subscriptionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, subscriptionId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subscriptionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, subscriptionId_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.subscriptionserver.proto.RenewSubscriptionRequest)) {
      return super.equals(obj);
    }
    com.subscriptionserver.proto.RenewSubscriptionRequest other = (com.subscriptionserver.proto.RenewSubscriptionRequest) obj;

    if (!getSubscriptionId()
        .equals(other.getSubscriptionId())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SUBSCRIPTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSubscriptionId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.subscriptionserver.proto.RenewSubscriptionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.subscriptionserver.proto.RenewSubscriptionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.subscriptionserver.proto.RenewSubscriptionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.subscriptionserver.proto.RenewSubscriptionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.subscriptionserver.proto.RenewSubscriptionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.subscriptionserver.proto.RenewSubscriptionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.subscriptionserver.proto.RenewSubscriptionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.subscriptionserver.proto.RenewSubscriptionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.subscriptionserver.proto.RenewSubscriptionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.subscriptionserver.proto.RenewSubscriptionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.subscriptionserver.proto.RenewSubscriptionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.subscriptionserver.proto.RenewSubscriptionRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.subscriptionserver.proto.RenewSubscriptionRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.subscriptionmanager.RenewSubscriptionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.subscriptionmanager.RenewSubscriptionRequest)
      com.subscriptionserver.proto.RenewSubscriptionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.subscriptionserver.proto.Service.internal_static_com_subscriptionmanager_RenewSubscriptionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.subscriptionserver.proto.Service.internal_static_com_subscriptionmanager_RenewSubscriptionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.subscriptionserver.proto.RenewSubscriptionRequest.class, com.subscriptionserver.proto.RenewSubscriptionRequest.Builder.class);
    }

    // Construct using com.subscriptionserver.proto.RenewSubscriptionRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      subscriptionId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.subscriptionserver.proto.Service.internal_static_com_subscriptionmanager_RenewSubscriptionRequest_descriptor;
    }

    @java.lang.Override
    public com.subscriptionserver.proto.RenewSubscriptionRequest getDefaultInstanceForType() {
      return com.subscriptionserver.proto.RenewSubscriptionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.subscriptionserver.proto.RenewSubscriptionRequest build() {
      com.subscriptionserver.proto.RenewSubscriptionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.subscriptionserver.proto.RenewSubscriptionRequest buildPartial() {
      com.subscriptionserver.proto.RenewSubscriptionRequest result = new com.subscriptionserver.proto.RenewSubscriptionRequest(this);
      result.subscriptionId_ = subscriptionId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.subscriptionserver.proto.RenewSubscriptionRequest) {
        return mergeFrom((com.subscriptionserver.proto.RenewSubscriptionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.subscriptionserver.proto.RenewSubscriptionRequest other) {
      if (other == com.subscriptionserver.proto.RenewSubscriptionRequest.getDefaultInstance()) return this;
      if (!other.getSubscriptionId().isEmpty()) {
        subscriptionId_ = other.subscriptionId_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              subscriptionId_ = input.readStringRequireUtf8();

              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object subscriptionId_ = "";
    /**
     * <code>string subscription_id = 1;</code>
     * @return The subscriptionId.
     */
    public java.lang.String getSubscriptionId() {
      java.lang.Object ref = subscriptionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subscriptionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string subscription_id = 1;</code>
     * @return The bytes for subscriptionId.
     */
    public com.google.protobuf.ByteString
        getSubscriptionIdBytes() {
      java.lang.Object ref = subscriptionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subscriptionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string subscription_id = 1;</code>
     * @param value The subscriptionId to set.
     * @return This builder for chaining.
     */
    public Builder setSubscriptionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      subscriptionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string subscription_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubscriptionId() {
      
      subscriptionId_ = getDefaultInstance().getSubscriptionId();
      onChanged();
      return this;
    }
    /**
     * <code>string subscription_id = 1;</code>
     * @param value The bytes for subscriptionId to set.
     * @return This builder for chaining.
     */
    public Builder setSubscriptionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      subscriptionId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.subscriptionmanager.RenewSubscriptionRequest)
  }

  // @@protoc_insertion_point(class_scope:com.subscriptionmanager.RenewSubscriptionRequest)
  private static final com.subscriptionserver.proto.RenewSubscriptionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.subscriptionserver.proto.RenewSubscriptionRequest();
  }

  public static com.subscriptionserver.proto.RenewSubscriptionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RenewSubscriptionRequest>
      PARSER = new com.google.protobuf.AbstractParser<RenewSubscriptionRequest>() {
    @java.lang.Override
    public RenewSubscriptionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<RenewSubscriptionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RenewSubscriptionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.subscriptionserver.proto.RenewSubscriptionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


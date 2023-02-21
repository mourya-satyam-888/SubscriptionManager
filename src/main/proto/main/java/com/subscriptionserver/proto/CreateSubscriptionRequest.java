// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package com.subscriptionserver.proto;

/**
 * Protobuf type {@code com.subscriptionmanager.CreateSubscriptionRequest}
 */
public final class CreateSubscriptionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.subscriptionmanager.CreateSubscriptionRequest)
    CreateSubscriptionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSubscriptionRequest.newBuilder() to construct.
  private CreateSubscriptionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSubscriptionRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateSubscriptionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.subscriptionserver.proto.Service.internal_static_com_subscriptionmanager_CreateSubscriptionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.subscriptionserver.proto.Service.internal_static_com_subscriptionmanager_CreateSubscriptionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.subscriptionserver.proto.CreateSubscriptionRequest.class, com.subscriptionserver.proto.CreateSubscriptionRequest.Builder.class);
  }

  public static final int SUBSCRIPTION_FIELD_NUMBER = 1;
  private com.subscriptionserver.proto.Subscription subscription_;
  /**
   * <code>.com.subscriptionmanager.Subscription subscription = 1;</code>
   * @return Whether the subscription field is set.
   */
  @java.lang.Override
  public boolean hasSubscription() {
    return subscription_ != null;
  }
  /**
   * <code>.com.subscriptionmanager.Subscription subscription = 1;</code>
   * @return The subscription.
   */
  @java.lang.Override
  public com.subscriptionserver.proto.Subscription getSubscription() {
    return subscription_ == null ? com.subscriptionserver.proto.Subscription.getDefaultInstance() : subscription_;
  }
  /**
   * <code>.com.subscriptionmanager.Subscription subscription = 1;</code>
   */
  @java.lang.Override
  public com.subscriptionserver.proto.SubscriptionOrBuilder getSubscriptionOrBuilder() {
    return getSubscription();
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
    if (subscription_ != null) {
      output.writeMessage(1, getSubscription());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (subscription_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSubscription());
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
    if (!(obj instanceof com.subscriptionserver.proto.CreateSubscriptionRequest)) {
      return super.equals(obj);
    }
    com.subscriptionserver.proto.CreateSubscriptionRequest other = (com.subscriptionserver.proto.CreateSubscriptionRequest) obj;

    if (hasSubscription() != other.hasSubscription()) return false;
    if (hasSubscription()) {
      if (!getSubscription()
          .equals(other.getSubscription())) return false;
    }
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
    if (hasSubscription()) {
      hash = (37 * hash) + SUBSCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getSubscription().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.subscriptionserver.proto.CreateSubscriptionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.subscriptionserver.proto.CreateSubscriptionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.subscriptionserver.proto.CreateSubscriptionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.subscriptionserver.proto.CreateSubscriptionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.subscriptionserver.proto.CreateSubscriptionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.subscriptionserver.proto.CreateSubscriptionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.subscriptionserver.proto.CreateSubscriptionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.subscriptionserver.proto.CreateSubscriptionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.subscriptionserver.proto.CreateSubscriptionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.subscriptionserver.proto.CreateSubscriptionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.subscriptionserver.proto.CreateSubscriptionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.subscriptionserver.proto.CreateSubscriptionRequest parseFrom(
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
  public static Builder newBuilder(com.subscriptionserver.proto.CreateSubscriptionRequest prototype) {
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
   * Protobuf type {@code com.subscriptionmanager.CreateSubscriptionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.subscriptionmanager.CreateSubscriptionRequest)
      com.subscriptionserver.proto.CreateSubscriptionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.subscriptionserver.proto.Service.internal_static_com_subscriptionmanager_CreateSubscriptionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.subscriptionserver.proto.Service.internal_static_com_subscriptionmanager_CreateSubscriptionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.subscriptionserver.proto.CreateSubscriptionRequest.class, com.subscriptionserver.proto.CreateSubscriptionRequest.Builder.class);
    }

    // Construct using com.subscriptionserver.proto.CreateSubscriptionRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (subscriptionBuilder_ == null) {
        subscription_ = null;
      } else {
        subscription_ = null;
        subscriptionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.subscriptionserver.proto.Service.internal_static_com_subscriptionmanager_CreateSubscriptionRequest_descriptor;
    }

    @java.lang.Override
    public com.subscriptionserver.proto.CreateSubscriptionRequest getDefaultInstanceForType() {
      return com.subscriptionserver.proto.CreateSubscriptionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.subscriptionserver.proto.CreateSubscriptionRequest build() {
      com.subscriptionserver.proto.CreateSubscriptionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.subscriptionserver.proto.CreateSubscriptionRequest buildPartial() {
      com.subscriptionserver.proto.CreateSubscriptionRequest result = new com.subscriptionserver.proto.CreateSubscriptionRequest(this);
      if (subscriptionBuilder_ == null) {
        result.subscription_ = subscription_;
      } else {
        result.subscription_ = subscriptionBuilder_.build();
      }
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
      if (other instanceof com.subscriptionserver.proto.CreateSubscriptionRequest) {
        return mergeFrom((com.subscriptionserver.proto.CreateSubscriptionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.subscriptionserver.proto.CreateSubscriptionRequest other) {
      if (other == com.subscriptionserver.proto.CreateSubscriptionRequest.getDefaultInstance()) return this;
      if (other.hasSubscription()) {
        mergeSubscription(other.getSubscription());
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
              input.readMessage(
                  getSubscriptionFieldBuilder().getBuilder(),
                  extensionRegistry);

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

    private com.subscriptionserver.proto.Subscription subscription_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.subscriptionserver.proto.Subscription, com.subscriptionserver.proto.Subscription.Builder, com.subscriptionserver.proto.SubscriptionOrBuilder> subscriptionBuilder_;
    /**
     * <code>.com.subscriptionmanager.Subscription subscription = 1;</code>
     * @return Whether the subscription field is set.
     */
    public boolean hasSubscription() {
      return subscriptionBuilder_ != null || subscription_ != null;
    }
    /**
     * <code>.com.subscriptionmanager.Subscription subscription = 1;</code>
     * @return The subscription.
     */
    public com.subscriptionserver.proto.Subscription getSubscription() {
      if (subscriptionBuilder_ == null) {
        return subscription_ == null ? com.subscriptionserver.proto.Subscription.getDefaultInstance() : subscription_;
      } else {
        return subscriptionBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.subscriptionmanager.Subscription subscription = 1;</code>
     */
    public Builder setSubscription(com.subscriptionserver.proto.Subscription value) {
      if (subscriptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        subscription_ = value;
        onChanged();
      } else {
        subscriptionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.subscriptionmanager.Subscription subscription = 1;</code>
     */
    public Builder setSubscription(
        com.subscriptionserver.proto.Subscription.Builder builderForValue) {
      if (subscriptionBuilder_ == null) {
        subscription_ = builderForValue.build();
        onChanged();
      } else {
        subscriptionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.subscriptionmanager.Subscription subscription = 1;</code>
     */
    public Builder mergeSubscription(com.subscriptionserver.proto.Subscription value) {
      if (subscriptionBuilder_ == null) {
        if (subscription_ != null) {
          subscription_ =
            com.subscriptionserver.proto.Subscription.newBuilder(subscription_).mergeFrom(value).buildPartial();
        } else {
          subscription_ = value;
        }
        onChanged();
      } else {
        subscriptionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.subscriptionmanager.Subscription subscription = 1;</code>
     */
    public Builder clearSubscription() {
      if (subscriptionBuilder_ == null) {
        subscription_ = null;
        onChanged();
      } else {
        subscription_ = null;
        subscriptionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.subscriptionmanager.Subscription subscription = 1;</code>
     */
    public com.subscriptionserver.proto.Subscription.Builder getSubscriptionBuilder() {
      
      onChanged();
      return getSubscriptionFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.subscriptionmanager.Subscription subscription = 1;</code>
     */
    public com.subscriptionserver.proto.SubscriptionOrBuilder getSubscriptionOrBuilder() {
      if (subscriptionBuilder_ != null) {
        return subscriptionBuilder_.getMessageOrBuilder();
      } else {
        return subscription_ == null ?
            com.subscriptionserver.proto.Subscription.getDefaultInstance() : subscription_;
      }
    }
    /**
     * <code>.com.subscriptionmanager.Subscription subscription = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.subscriptionserver.proto.Subscription, com.subscriptionserver.proto.Subscription.Builder, com.subscriptionserver.proto.SubscriptionOrBuilder> 
        getSubscriptionFieldBuilder() {
      if (subscriptionBuilder_ == null) {
        subscriptionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.subscriptionserver.proto.Subscription, com.subscriptionserver.proto.Subscription.Builder, com.subscriptionserver.proto.SubscriptionOrBuilder>(
                getSubscription(),
                getParentForChildren(),
                isClean());
        subscription_ = null;
      }
      return subscriptionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.subscriptionmanager.CreateSubscriptionRequest)
  }

  // @@protoc_insertion_point(class_scope:com.subscriptionmanager.CreateSubscriptionRequest)
  private static final com.subscriptionserver.proto.CreateSubscriptionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.subscriptionserver.proto.CreateSubscriptionRequest();
  }

  public static com.subscriptionserver.proto.CreateSubscriptionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSubscriptionRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateSubscriptionRequest>() {
    @java.lang.Override
    public CreateSubscriptionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateSubscriptionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSubscriptionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.subscriptionserver.proto.CreateSubscriptionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


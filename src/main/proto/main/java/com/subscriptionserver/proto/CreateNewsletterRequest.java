// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package com.subscriptionserver.proto;

/**
 * Protobuf type {@code com.subscriptionmanager.CreateNewsletterRequest}
 */
public final class CreateNewsletterRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.subscriptionmanager.CreateNewsletterRequest)
    CreateNewsletterRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateNewsletterRequest.newBuilder() to construct.
  private CreateNewsletterRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateNewsletterRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateNewsletterRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.subscriptionserver.proto.Service.internal_static_com_subscriptionmanager_CreateNewsletterRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.subscriptionserver.proto.Service.internal_static_com_subscriptionmanager_CreateNewsletterRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.subscriptionserver.proto.CreateNewsletterRequest.class, com.subscriptionserver.proto.CreateNewsletterRequest.Builder.class);
  }

  public static final int NEWSLETTER_FIELD_NUMBER = 1;
  private com.subscriptionserver.proto.NewsletterDetails newsletter_;
  /**
   * <code>.com.subscriptionmanager.NewsletterDetails newsletter = 1;</code>
   * @return Whether the newsletter field is set.
   */
  @java.lang.Override
  public boolean hasNewsletter() {
    return newsletter_ != null;
  }
  /**
   * <code>.com.subscriptionmanager.NewsletterDetails newsletter = 1;</code>
   * @return The newsletter.
   */
  @java.lang.Override
  public com.subscriptionserver.proto.NewsletterDetails getNewsletter() {
    return newsletter_ == null ? com.subscriptionserver.proto.NewsletterDetails.getDefaultInstance() : newsletter_;
  }
  /**
   * <code>.com.subscriptionmanager.NewsletterDetails newsletter = 1;</code>
   */
  @java.lang.Override
  public com.subscriptionserver.proto.NewsletterDetailsOrBuilder getNewsletterOrBuilder() {
    return getNewsletter();
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
    if (newsletter_ != null) {
      output.writeMessage(1, getNewsletter());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (newsletter_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNewsletter());
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
    if (!(obj instanceof com.subscriptionserver.proto.CreateNewsletterRequest)) {
      return super.equals(obj);
    }
    com.subscriptionserver.proto.CreateNewsletterRequest other = (com.subscriptionserver.proto.CreateNewsletterRequest) obj;

    if (hasNewsletter() != other.hasNewsletter()) return false;
    if (hasNewsletter()) {
      if (!getNewsletter()
          .equals(other.getNewsletter())) return false;
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
    if (hasNewsletter()) {
      hash = (37 * hash) + NEWSLETTER_FIELD_NUMBER;
      hash = (53 * hash) + getNewsletter().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.subscriptionserver.proto.CreateNewsletterRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.subscriptionserver.proto.CreateNewsletterRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.subscriptionserver.proto.CreateNewsletterRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.subscriptionserver.proto.CreateNewsletterRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.subscriptionserver.proto.CreateNewsletterRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.subscriptionserver.proto.CreateNewsletterRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.subscriptionserver.proto.CreateNewsletterRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.subscriptionserver.proto.CreateNewsletterRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.subscriptionserver.proto.CreateNewsletterRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.subscriptionserver.proto.CreateNewsletterRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.subscriptionserver.proto.CreateNewsletterRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.subscriptionserver.proto.CreateNewsletterRequest parseFrom(
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
  public static Builder newBuilder(com.subscriptionserver.proto.CreateNewsletterRequest prototype) {
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
   * Protobuf type {@code com.subscriptionmanager.CreateNewsletterRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.subscriptionmanager.CreateNewsletterRequest)
      com.subscriptionserver.proto.CreateNewsletterRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.subscriptionserver.proto.Service.internal_static_com_subscriptionmanager_CreateNewsletterRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.subscriptionserver.proto.Service.internal_static_com_subscriptionmanager_CreateNewsletterRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.subscriptionserver.proto.CreateNewsletterRequest.class, com.subscriptionserver.proto.CreateNewsletterRequest.Builder.class);
    }

    // Construct using com.subscriptionserver.proto.CreateNewsletterRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (newsletterBuilder_ == null) {
        newsletter_ = null;
      } else {
        newsletter_ = null;
        newsletterBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.subscriptionserver.proto.Service.internal_static_com_subscriptionmanager_CreateNewsletterRequest_descriptor;
    }

    @java.lang.Override
    public com.subscriptionserver.proto.CreateNewsletterRequest getDefaultInstanceForType() {
      return com.subscriptionserver.proto.CreateNewsletterRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.subscriptionserver.proto.CreateNewsletterRequest build() {
      com.subscriptionserver.proto.CreateNewsletterRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.subscriptionserver.proto.CreateNewsletterRequest buildPartial() {
      com.subscriptionserver.proto.CreateNewsletterRequest result = new com.subscriptionserver.proto.CreateNewsletterRequest(this);
      if (newsletterBuilder_ == null) {
        result.newsletter_ = newsletter_;
      } else {
        result.newsletter_ = newsletterBuilder_.build();
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
      if (other instanceof com.subscriptionserver.proto.CreateNewsletterRequest) {
        return mergeFrom((com.subscriptionserver.proto.CreateNewsletterRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.subscriptionserver.proto.CreateNewsletterRequest other) {
      if (other == com.subscriptionserver.proto.CreateNewsletterRequest.getDefaultInstance()) return this;
      if (other.hasNewsletter()) {
        mergeNewsletter(other.getNewsletter());
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
                  getNewsletterFieldBuilder().getBuilder(),
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

    private com.subscriptionserver.proto.NewsletterDetails newsletter_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.subscriptionserver.proto.NewsletterDetails, com.subscriptionserver.proto.NewsletterDetails.Builder, com.subscriptionserver.proto.NewsletterDetailsOrBuilder> newsletterBuilder_;
    /**
     * <code>.com.subscriptionmanager.NewsletterDetails newsletter = 1;</code>
     * @return Whether the newsletter field is set.
     */
    public boolean hasNewsletter() {
      return newsletterBuilder_ != null || newsletter_ != null;
    }
    /**
     * <code>.com.subscriptionmanager.NewsletterDetails newsletter = 1;</code>
     * @return The newsletter.
     */
    public com.subscriptionserver.proto.NewsletterDetails getNewsletter() {
      if (newsletterBuilder_ == null) {
        return newsletter_ == null ? com.subscriptionserver.proto.NewsletterDetails.getDefaultInstance() : newsletter_;
      } else {
        return newsletterBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.subscriptionmanager.NewsletterDetails newsletter = 1;</code>
     */
    public Builder setNewsletter(com.subscriptionserver.proto.NewsletterDetails value) {
      if (newsletterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        newsletter_ = value;
        onChanged();
      } else {
        newsletterBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.subscriptionmanager.NewsletterDetails newsletter = 1;</code>
     */
    public Builder setNewsletter(
        com.subscriptionserver.proto.NewsletterDetails.Builder builderForValue) {
      if (newsletterBuilder_ == null) {
        newsletter_ = builderForValue.build();
        onChanged();
      } else {
        newsletterBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.subscriptionmanager.NewsletterDetails newsletter = 1;</code>
     */
    public Builder mergeNewsletter(com.subscriptionserver.proto.NewsletterDetails value) {
      if (newsletterBuilder_ == null) {
        if (newsletter_ != null) {
          newsletter_ =
            com.subscriptionserver.proto.NewsletterDetails.newBuilder(newsletter_).mergeFrom(value).buildPartial();
        } else {
          newsletter_ = value;
        }
        onChanged();
      } else {
        newsletterBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.subscriptionmanager.NewsletterDetails newsletter = 1;</code>
     */
    public Builder clearNewsletter() {
      if (newsletterBuilder_ == null) {
        newsletter_ = null;
        onChanged();
      } else {
        newsletter_ = null;
        newsletterBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.subscriptionmanager.NewsletterDetails newsletter = 1;</code>
     */
    public com.subscriptionserver.proto.NewsletterDetails.Builder getNewsletterBuilder() {
      
      onChanged();
      return getNewsletterFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.subscriptionmanager.NewsletterDetails newsletter = 1;</code>
     */
    public com.subscriptionserver.proto.NewsletterDetailsOrBuilder getNewsletterOrBuilder() {
      if (newsletterBuilder_ != null) {
        return newsletterBuilder_.getMessageOrBuilder();
      } else {
        return newsletter_ == null ?
            com.subscriptionserver.proto.NewsletterDetails.getDefaultInstance() : newsletter_;
      }
    }
    /**
     * <code>.com.subscriptionmanager.NewsletterDetails newsletter = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.subscriptionserver.proto.NewsletterDetails, com.subscriptionserver.proto.NewsletterDetails.Builder, com.subscriptionserver.proto.NewsletterDetailsOrBuilder> 
        getNewsletterFieldBuilder() {
      if (newsletterBuilder_ == null) {
        newsletterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.subscriptionserver.proto.NewsletterDetails, com.subscriptionserver.proto.NewsletterDetails.Builder, com.subscriptionserver.proto.NewsletterDetailsOrBuilder>(
                getNewsletter(),
                getParentForChildren(),
                isClean());
        newsletter_ = null;
      }
      return newsletterBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.subscriptionmanager.CreateNewsletterRequest)
  }

  // @@protoc_insertion_point(class_scope:com.subscriptionmanager.CreateNewsletterRequest)
  private static final com.subscriptionserver.proto.CreateNewsletterRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.subscriptionserver.proto.CreateNewsletterRequest();
  }

  public static com.subscriptionserver.proto.CreateNewsletterRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateNewsletterRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateNewsletterRequest>() {
    @java.lang.Override
    public CreateNewsletterRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateNewsletterRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateNewsletterRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.subscriptionserver.proto.CreateNewsletterRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


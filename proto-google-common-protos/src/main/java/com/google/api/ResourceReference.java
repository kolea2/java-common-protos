/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/resource.proto

package com.google.api;

/**
 *
 *
 * <pre>
 * Defines a proto annotation that describes a string field that refers to
 * an API resource.
 * </pre>
 *
 * Protobuf type {@code google.api.ResourceReference}
 */
public final class ResourceReference extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.ResourceReference)
    ResourceReferenceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ResourceReference.newBuilder() to construct.
  private ResourceReference(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ResourceReference() {
    type_ = "";
    childType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ResourceReference();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ResourceReference(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              type_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              childType_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.ResourceProto.internal_static_google_api_ResourceReference_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.ResourceProto
        .internal_static_google_api_ResourceReference_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.ResourceReference.class, com.google.api.ResourceReference.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object type_;
  /**
   *
   *
   * <pre>
   * The resource type that the annotated field references.
   * Example:
   *     message Subscription {
   *       string topic = 2 [(google.api.resource_reference) = {
   *         type: "pubsub.googleapis.com/Topic"
   *       }];
   *     }
   * </pre>
   *
   * <code>string type = 1;</code>
   *
   * @return The type.
   */
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The resource type that the annotated field references.
   * Example:
   *     message Subscription {
   *       string topic = 2 [(google.api.resource_reference) = {
   *         type: "pubsub.googleapis.com/Topic"
   *       }];
   *     }
   * </pre>
   *
   * <code>string type = 1;</code>
   *
   * @return The bytes for type.
   */
  public com.google.protobuf.ByteString getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHILD_TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object childType_;
  /**
   *
   *
   * <pre>
   * The resource type of a child collection that the annotated field
   * references. This is useful for annotating the `parent` field that
   * doesn't have a fixed resource type.
   * Example:
   *     message ListLogEntriesRequest {
   *       string parent = 1 [(google.api.resource_reference) = {
   *         child_type: "logging.googleapis.com/LogEntry"
   *       };
   *     }
   * </pre>
   *
   * <code>string child_type = 2;</code>
   *
   * @return The childType.
   */
  public java.lang.String getChildType() {
    java.lang.Object ref = childType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      childType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The resource type of a child collection that the annotated field
   * references. This is useful for annotating the `parent` field that
   * doesn't have a fixed resource type.
   * Example:
   *     message ListLogEntriesRequest {
   *       string parent = 1 [(google.api.resource_reference) = {
   *         child_type: "logging.googleapis.com/LogEntry"
   *       };
   *     }
   * </pre>
   *
   * <code>string child_type = 2;</code>
   *
   * @return The bytes for childType.
   */
  public com.google.protobuf.ByteString getChildTypeBytes() {
    java.lang.Object ref = childType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      childType_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
    }
    if (!getChildTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, childType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
    }
    if (!getChildTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, childType_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.api.ResourceReference)) {
      return super.equals(obj);
    }
    com.google.api.ResourceReference other = (com.google.api.ResourceReference) obj;

    if (!getType().equals(other.getType())) return false;
    if (!getChildType().equals(other.getChildType())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + CHILD_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getChildType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.ResourceReference parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.ResourceReference parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.ResourceReference parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.ResourceReference parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.ResourceReference parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.ResourceReference parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.ResourceReference parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.ResourceReference parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.ResourceReference parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.ResourceReference parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.ResourceReference parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.ResourceReference parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.api.ResourceReference prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Defines a proto annotation that describes a string field that refers to
   * an API resource.
   * </pre>
   *
   * Protobuf type {@code google.api.ResourceReference}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.ResourceReference)
      com.google.api.ResourceReferenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.ResourceProto.internal_static_google_api_ResourceReference_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.ResourceProto
          .internal_static_google_api_ResourceReference_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.ResourceReference.class,
              com.google.api.ResourceReference.Builder.class);
    }

    // Construct using com.google.api.ResourceReference.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = "";

      childType_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.ResourceProto.internal_static_google_api_ResourceReference_descriptor;
    }

    @java.lang.Override
    public com.google.api.ResourceReference getDefaultInstanceForType() {
      return com.google.api.ResourceReference.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.ResourceReference build() {
      com.google.api.ResourceReference result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.ResourceReference buildPartial() {
      com.google.api.ResourceReference result = new com.google.api.ResourceReference(this);
      result.type_ = type_;
      result.childType_ = childType_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.ResourceReference) {
        return mergeFrom((com.google.api.ResourceReference) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.ResourceReference other) {
      if (other == com.google.api.ResourceReference.getDefaultInstance()) return this;
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (!other.getChildType().isEmpty()) {
        childType_ = other.childType_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.api.ResourceReference parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.ResourceReference) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     *
     *
     * <pre>
     * The resource type that the annotated field references.
     * Example:
     *     message Subscription {
     *       string topic = 2 [(google.api.resource_reference) = {
     *         type: "pubsub.googleapis.com/Topic"
     *       }];
     *     }
     * </pre>
     *
     * <code>string type = 1;</code>
     *
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource type that the annotated field references.
     * Example:
     *     message Subscription {
     *       string topic = 2 [(google.api.resource_reference) = {
     *         type: "pubsub.googleapis.com/Topic"
     *       }];
     *     }
     * </pre>
     *
     * <code>string type = 1;</code>
     *
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource type that the annotated field references.
     * Example:
     *     message Subscription {
     *       string topic = 2 [(google.api.resource_reference) = {
     *         type: "pubsub.googleapis.com/Topic"
     *       }];
     *     }
     * </pre>
     *
     * <code>string type = 1;</code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      type_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource type that the annotated field references.
     * Example:
     *     message Subscription {
     *       string topic = 2 [(google.api.resource_reference) = {
     *         type: "pubsub.googleapis.com/Topic"
     *       }];
     *     }
     * </pre>
     *
     * <code>string type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {

      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource type that the annotated field references.
     * Example:
     *     message Subscription {
     *       string topic = 2 [(google.api.resource_reference) = {
     *         type: "pubsub.googleapis.com/Topic"
     *       }];
     *     }
     * </pre>
     *
     * <code>string type = 1;</code>
     *
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      type_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object childType_ = "";
    /**
     *
     *
     * <pre>
     * The resource type of a child collection that the annotated field
     * references. This is useful for annotating the `parent` field that
     * doesn't have a fixed resource type.
     * Example:
     *     message ListLogEntriesRequest {
     *       string parent = 1 [(google.api.resource_reference) = {
     *         child_type: "logging.googleapis.com/LogEntry"
     *       };
     *     }
     * </pre>
     *
     * <code>string child_type = 2;</code>
     *
     * @return The childType.
     */
    public java.lang.String getChildType() {
      java.lang.Object ref = childType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        childType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource type of a child collection that the annotated field
     * references. This is useful for annotating the `parent` field that
     * doesn't have a fixed resource type.
     * Example:
     *     message ListLogEntriesRequest {
     *       string parent = 1 [(google.api.resource_reference) = {
     *         child_type: "logging.googleapis.com/LogEntry"
     *       };
     *     }
     * </pre>
     *
     * <code>string child_type = 2;</code>
     *
     * @return The bytes for childType.
     */
    public com.google.protobuf.ByteString getChildTypeBytes() {
      java.lang.Object ref = childType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        childType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource type of a child collection that the annotated field
     * references. This is useful for annotating the `parent` field that
     * doesn't have a fixed resource type.
     * Example:
     *     message ListLogEntriesRequest {
     *       string parent = 1 [(google.api.resource_reference) = {
     *         child_type: "logging.googleapis.com/LogEntry"
     *       };
     *     }
     * </pre>
     *
     * <code>string child_type = 2;</code>
     *
     * @param value The childType to set.
     * @return This builder for chaining.
     */
    public Builder setChildType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      childType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource type of a child collection that the annotated field
     * references. This is useful for annotating the `parent` field that
     * doesn't have a fixed resource type.
     * Example:
     *     message ListLogEntriesRequest {
     *       string parent = 1 [(google.api.resource_reference) = {
     *         child_type: "logging.googleapis.com/LogEntry"
     *       };
     *     }
     * </pre>
     *
     * <code>string child_type = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearChildType() {

      childType_ = getDefaultInstance().getChildType();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource type of a child collection that the annotated field
     * references. This is useful for annotating the `parent` field that
     * doesn't have a fixed resource type.
     * Example:
     *     message ListLogEntriesRequest {
     *       string parent = 1 [(google.api.resource_reference) = {
     *         child_type: "logging.googleapis.com/LogEntry"
     *       };
     *     }
     * </pre>
     *
     * <code>string child_type = 2;</code>
     *
     * @param value The bytes for childType to set.
     * @return This builder for chaining.
     */
    public Builder setChildTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      childType_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.api.ResourceReference)
  }

  // @@protoc_insertion_point(class_scope:google.api.ResourceReference)
  private static final com.google.api.ResourceReference DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.ResourceReference();
  }

  public static com.google.api.ResourceReference getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceReference> PARSER =
      new com.google.protobuf.AbstractParser<ResourceReference>() {
        @java.lang.Override
        public ResourceReference parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ResourceReference(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ResourceReference> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceReference> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.ResourceReference getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
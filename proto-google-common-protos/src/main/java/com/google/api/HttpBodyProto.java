// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/httpbody.proto

package com.google.api;

public final class HttpBodyProto {
  private HttpBodyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_HttpBody_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_HttpBody_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031google/api/httpbody.proto\022\ngoogle.api\032" +
      "\031google/protobuf/any.proto\"X\n\010HttpBody\022\024" +
      "\n\014content_type\030\001 \001(\t\022\014\n\004data\030\002 \001(\014\022(\n\nex" +
      "tensions\030\003 \003(\0132\024.google.protobuf.AnyBe\n\016" +
      "com.google.apiB\rHttpBodyProtoP\001Z;google." +
      "golang.org/genproto/googleapis/api/httpb" +
      "ody;httpbody\242\002\004GAPIb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
        }, assigner);
    internal_static_google_api_HttpBody_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_HttpBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_HttpBody_descriptor,
        new java.lang.String[] { "ContentType", "Data", "Extensions", });
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

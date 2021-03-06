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
// source: google/cloud/audit/audit_log.proto

package com.google.cloud.audit;

public interface AuthenticationInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.audit.AuthenticationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The email address of the authenticated user making the request.
   * </pre>
   *
   * <code>string principal_email = 1;</code>
   *
   * @return The principalEmail.
   */
  java.lang.String getPrincipalEmail();
  /**
   *
   *
   * <pre>
   * The email address of the authenticated user making the request.
   * </pre>
   *
   * <code>string principal_email = 1;</code>
   *
   * @return The bytes for principalEmail.
   */
  com.google.protobuf.ByteString getPrincipalEmailBytes();
}

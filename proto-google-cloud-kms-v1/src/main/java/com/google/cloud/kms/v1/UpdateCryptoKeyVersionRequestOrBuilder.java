/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

public interface UpdateCryptoKeyVersionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.UpdateCryptoKeyVersionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with updated values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 1;</code>
   */
  boolean hasCryptoKeyVersion();
  /**
   *
   *
   * <pre>
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with updated values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 1;</code>
   */
  com.google.cloud.kms.v1.CryptoKeyVersion getCryptoKeyVersion();
  /**
   *
   *
   * <pre>
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with updated values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 1;</code>
   */
  com.google.cloud.kms.v1.CryptoKeyVersionOrBuilder getCryptoKeyVersionOrBuilder();

  /**
   *
   *
   * <pre>
   * Required list of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required list of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required list of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}

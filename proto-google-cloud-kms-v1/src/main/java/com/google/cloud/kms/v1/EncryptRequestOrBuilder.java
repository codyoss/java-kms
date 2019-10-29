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

public interface EncryptRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.EncryptRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the [CryptoKey][google.cloud.kms.v1.CryptoKey] or [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]
   * to use for encryption.
   * If a [CryptoKey][google.cloud.kms.v1.CryptoKey] is specified, the server will use its
   * [primary version][google.cloud.kms.v1.CryptoKey.primary].
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the [CryptoKey][google.cloud.kms.v1.CryptoKey] or [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]
   * to use for encryption.
   * If a [CryptoKey][google.cloud.kms.v1.CryptoKey] is specified, the server will use its
   * [primary version][google.cloud.kms.v1.CryptoKey.primary].
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The data to encrypt. Must be no larger than 64KiB.
   * The maximum size depends on the key version's
   * [protection_level][google.cloud.kms.v1.CryptoKeyVersionTemplate.protection_level]. For
   * [SOFTWARE][google.cloud.kms.v1.ProtectionLevel.SOFTWARE] keys, the plaintext must be no larger
   * than 64KiB. For [HSM][google.cloud.kms.v1.ProtectionLevel.HSM] keys, the combined length of the
   * plaintext and additional_authenticated_data fields must be no larger than
   * 8KiB.
   * </pre>
   *
   * <code>bytes plaintext = 2;</code>
   */
  com.google.protobuf.ByteString getPlaintext();

  /**
   *
   *
   * <pre>
   * Optional data that, if specified, must also be provided during decryption
   * through [DecryptRequest.additional_authenticated_data][google.cloud.kms.v1.DecryptRequest.additional_authenticated_data].
   * The maximum size depends on the key version's
   * [protection_level][google.cloud.kms.v1.CryptoKeyVersionTemplate.protection_level]. For
   * [SOFTWARE][google.cloud.kms.v1.ProtectionLevel.SOFTWARE] keys, the AAD must be no larger than
   * 64KiB. For [HSM][google.cloud.kms.v1.ProtectionLevel.HSM] keys, the combined length of the
   * plaintext and additional_authenticated_data fields must be no larger than
   * 8KiB.
   * </pre>
   *
   * <code>bytes additional_authenticated_data = 3;</code>
   */
  com.google.protobuf.ByteString getAdditionalAuthenticatedData();
}

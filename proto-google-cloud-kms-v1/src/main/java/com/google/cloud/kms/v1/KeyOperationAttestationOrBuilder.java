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
// source: google/cloud/kms/v1/resources.proto

package com.google.cloud.kms.v1;

public interface KeyOperationAttestationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.KeyOperationAttestation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The format of the attestation data.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat format = 4;</code>
   */
  int getFormatValue();
  /**
   *
   *
   * <pre>
   * Output only. The format of the attestation data.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat format = 4;</code>
   */
  com.google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat getFormat();

  /**
   *
   *
   * <pre>
   * Output only. The attestation data provided by the HSM when the key
   * operation was performed.
   * </pre>
   *
   * <code>bytes content = 5;</code>
   */
  com.google.protobuf.ByteString getContent();
}

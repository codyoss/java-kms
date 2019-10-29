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

public interface ListCryptoKeysRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.ListCryptoKeysRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the [KeyRing][google.cloud.kms.v1.KeyRing] to list, in the format
   * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the [KeyRing][google.cloud.kms.v1.KeyRing] to list, in the format
   * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional limit on the number of [CryptoKeys][google.cloud.kms.v1.CryptoKey] to include in the
   * response.  Further [CryptoKeys][google.cloud.kms.v1.CryptoKey] can subsequently be obtained by
   * including the [ListCryptoKeysResponse.next_page_token][google.cloud.kms.v1.ListCryptoKeysResponse.next_page_token] in a subsequent
   * request.  If unspecified, the server will pick an appropriate default.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional pagination token, returned earlier via
   * [ListCryptoKeysResponse.next_page_token][google.cloud.kms.v1.ListCryptoKeysResponse.next_page_token].
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional pagination token, returned earlier via
   * [ListCryptoKeysResponse.next_page_token][google.cloud.kms.v1.ListCryptoKeysResponse.next_page_token].
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The fields of the primary version to include in the response.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionView version_view = 4;</code>
   */
  int getVersionViewValue();
  /**
   *
   *
   * <pre>
   * The fields of the primary version to include in the response.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionView version_view = 4;</code>
   */
  com.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionView getVersionView();

  /**
   *
   *
   * <pre>
   * Optional. Only include resources that match the filter in the response.
   * </pre>
   *
   * <code>string filter = 5;</code>
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. Only include resources that match the filter in the response.
   * </pre>
   *
   * <code>string filter = 5;</code>
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. Specify how the results should be sorted. If not specified, the
   * results will be sorted in the default order.
   * </pre>
   *
   * <code>string order_by = 6;</code>
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Optional. Specify how the results should be sorted. If not specified, the
   * results will be sorted in the default order.
   * </pre>
   *
   * <code>string order_by = 6;</code>
   */
  com.google.protobuf.ByteString getOrderByBytes();
}

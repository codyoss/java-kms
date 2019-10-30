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

public final class KmsResourcesProto {
  private KmsResourcesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_KeyRing_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_KeyRing_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_CryptoKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_CryptoKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_KeyOperationAttestation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_KeyOperationAttestation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_CryptoKeyVersion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_CryptoKeyVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_PublicKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_PublicKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_ImportJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_ImportJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_ImportJob_WrappingPublicKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_ImportJob_WrappingPublicKey_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n#google/cloud/kms/v1/resources.proto\022\023g"
          + "oogle.cloud.kms.v1\032\034google/api/annotatio"
          + "ns.proto\032\036google/protobuf/duration.proto"
          + "\032\037google/protobuf/timestamp.proto\"H\n\007Key"
          + "Ring\022\014\n\004name\030\001 \001(\t\022/\n\013create_time\030\002 \001(\0132"
          + "\032.google.protobuf.Timestamp\"\365\004\n\tCryptoKe"
          + "y\022\014\n\004name\030\001 \001(\t\0226\n\007primary\030\002 \001(\0132%.googl"
          + "e.cloud.kms.v1.CryptoKeyVersion\022@\n\007purpo"
          + "se\030\003 \001(\0162/.google.cloud.kms.v1.CryptoKey"
          + ".CryptoKeyPurpose\022/\n\013create_time\030\005 \001(\0132\032"
          + ".google.protobuf.Timestamp\0226\n\022next_rotat"
          + "ion_time\030\007 \001(\0132\032.google.protobuf.Timesta"
          + "mp\0224\n\017rotation_period\030\010 \001(\0132\031.google.pro"
          + "tobuf.DurationH\000\022G\n\020version_template\030\013 \001"
          + "(\0132-.google.cloud.kms.v1.CryptoKeyVersio"
          + "nTemplate\022:\n\006labels\030\n \003(\0132*.google.cloud"
          + ".kms.v1.CryptoKey.LabelsEntry\032-\n\013LabelsE"
          + "ntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"x\n\020"
          + "CryptoKeyPurpose\022\"\n\036CRYPTO_KEY_PURPOSE_U"
          + "NSPECIFIED\020\000\022\023\n\017ENCRYPT_DECRYPT\020\001\022\023\n\017ASY"
          + "MMETRIC_SIGN\020\005\022\026\n\022ASYMMETRIC_DECRYPT\020\006B\023"
          + "\n\021rotation_schedule\"\256\001\n\030CryptoKeyVersion"
          + "Template\022>\n\020protection_level\030\001 \001(\0162$.goo"
          + "gle.cloud.kms.v1.ProtectionLevel\022R\n\talgo"
          + "rithm\030\003 \001(\0162?.google.cloud.kms.v1.Crypto"
          + "KeyVersion.CryptoKeyVersionAlgorithm\"\347\001\n"
          + "\027KeyOperationAttestation\022N\n\006format\030\004 \001(\016"
          + "2>.google.cloud.kms.v1.KeyOperationAttes"
          + "tation.AttestationFormat\022\017\n\007content\030\005 \001("
          + "\014\"k\n\021AttestationFormat\022\"\n\036ATTESTATION_FO"
          + "RMAT_UNSPECIFIED\020\000\022\030\n\024CAVIUM_V1_COMPRESS"
          + "ED\020\003\022\030\n\024CAVIUM_V2_COMPRESSED\020\004\"\243\013\n\020Crypt"
          + "oKeyVersion\022\014\n\004name\030\001 \001(\t\022J\n\005state\030\003 \001(\016"
          + "2;.google.cloud.kms.v1.CryptoKeyVersion."
          + "CryptoKeyVersionState\022>\n\020protection_leve"
          + "l\030\007 \001(\0162$.google.cloud.kms.v1.Protection"
          + "Level\022R\n\talgorithm\030\n \001(\0162?.google.cloud."
          + "kms.v1.CryptoKeyVersion.CryptoKeyVersion"
          + "Algorithm\022A\n\013attestation\030\010 \001(\0132,.google."
          + "cloud.kms.v1.KeyOperationAttestation\022/\n\013"
          + "create_time\030\004 \001(\0132\032.google.protobuf.Time"
          + "stamp\0221\n\rgenerate_time\030\013 \001(\0132\032.google.pr"
          + "otobuf.Timestamp\0220\n\014destroy_time\030\005 \001(\0132\032"
          + ".google.protobuf.Timestamp\0226\n\022destroy_ev"
          + "ent_time\030\006 \001(\0132\032.google.protobuf.Timesta"
          + "mp\022\022\n\nimport_job\030\016 \001(\t\022/\n\013import_time\030\017 "
          + "\001(\0132\032.google.protobuf.Timestamp\022\035\n\025impor"
          + "t_failure_reason\030\020 \001(\t\"\234\004\n\031CryptoKeyVers"
          + "ionAlgorithm\022,\n(CRYPTO_KEY_VERSION_ALGOR"
          + "ITHM_UNSPECIFIED\020\000\022\037\n\033GOOGLE_SYMMETRIC_E"
          + "NCRYPTION\020\001\022\034\n\030RSA_SIGN_PSS_2048_SHA256\020"
          + "\002\022\034\n\030RSA_SIGN_PSS_3072_SHA256\020\003\022\034\n\030RSA_S"
          + "IGN_PSS_4096_SHA256\020\004\022\034\n\030RSA_SIGN_PSS_40"
          + "96_SHA512\020\017\022\036\n\032RSA_SIGN_PKCS1_2048_SHA25"
          + "6\020\005\022\036\n\032RSA_SIGN_PKCS1_3072_SHA256\020\006\022\036\n\032R"
          + "SA_SIGN_PKCS1_4096_SHA256\020\007\022\036\n\032RSA_SIGN_"
          + "PKCS1_4096_SHA512\020\020\022 \n\034RSA_DECRYPT_OAEP_"
          + "2048_SHA256\020\010\022 \n\034RSA_DECRYPT_OAEP_3072_S"
          + "HA256\020\t\022 \n\034RSA_DECRYPT_OAEP_4096_SHA256\020"
          + "\n\022 \n\034RSA_DECRYPT_OAEP_4096_SHA512\020\021\022\027\n\023E"
          + "C_SIGN_P256_SHA256\020\014\022\027\n\023EC_SIGN_P384_SHA"
          + "384\020\r\"\301\001\n\025CryptoKeyVersionState\022(\n$CRYPT"
          + "O_KEY_VERSION_STATE_UNSPECIFIED\020\000\022\026\n\022PEN"
          + "DING_GENERATION\020\005\022\013\n\007ENABLED\020\001\022\014\n\010DISABL"
          + "ED\020\002\022\r\n\tDESTROYED\020\003\022\025\n\021DESTROY_SCHEDULED"
          + "\020\004\022\022\n\016PENDING_IMPORT\020\006\022\021\n\rIMPORT_FAILED\020"
          + "\007\"I\n\024CryptoKeyVersionView\022\'\n#CRYPTO_KEY_"
          + "VERSION_VIEW_UNSPECIFIED\020\000\022\010\n\004FULL\020\001\"l\n\t"
          + "PublicKey\022\013\n\003pem\030\001 \001(\t\022R\n\talgorithm\030\002 \001("
          + "\0162?.google.cloud.kms.v1.CryptoKeyVersion"
          + ".CryptoKeyVersionAlgorithm\"\246\006\n\tImportJob"
          + "\022\014\n\004name\030\001 \001(\t\022B\n\rimport_method\030\002 \001(\0162+."
          + "google.cloud.kms.v1.ImportJob.ImportMeth"
          + "od\022>\n\020protection_level\030\t \001(\0162$.google.cl"
          + "oud.kms.v1.ProtectionLevel\022/\n\013create_tim"
          + "e\030\003 \001(\0132\032.google.protobuf.Timestamp\0221\n\rg"
          + "enerate_time\030\004 \001(\0132\032.google.protobuf.Tim"
          + "estamp\022/\n\013expire_time\030\005 \001(\0132\032.google.pro"
          + "tobuf.Timestamp\0225\n\021expire_event_time\030\n \001"
          + "(\0132\032.google.protobuf.Timestamp\022<\n\005state\030"
          + "\006 \001(\0162-.google.cloud.kms.v1.ImportJob.Im"
          + "portJobState\022D\n\npublic_key\030\007 \001(\01320.googl"
          + "e.cloud.kms.v1.ImportJob.WrappingPublicK"
          + "ey\022A\n\013attestation\030\010 \001(\0132,.google.cloud.k"
          + "ms.v1.KeyOperationAttestation\032 \n\021Wrappin"
          + "gPublicKey\022\013\n\003pem\030\001 \001(\t\"m\n\014ImportMethod\022"
          + "\035\n\031IMPORT_METHOD_UNSPECIFIED\020\000\022\036\n\032RSA_OA"
          + "EP_3072_SHA1_AES_256\020\001\022\036\n\032RSA_OAEP_4096_"
          + "SHA1_AES_256\020\002\"c\n\016ImportJobState\022 \n\034IMPO"
          + "RT_JOB_STATE_UNSPECIFIED\020\000\022\026\n\022PENDING_GE"
          + "NERATION\020\001\022\n\n\006ACTIVE\020\002\022\013\n\007EXPIRED\020\003*J\n\017P"
          + "rotectionLevel\022 \n\034PROTECTION_LEVEL_UNSPE"
          + "CIFIED\020\000\022\014\n\010SOFTWARE\020\001\022\007\n\003HSM\020\002B\225\001\n\027com."
          + "google.cloud.kms.v1B\021KmsResourcesProtoP\001"
          + "Z6google.golang.org/genproto/googleapis/"
          + "cloud/kms/v1;kms\370\001\001\252\002\023Google.Cloud.Kms.V"
          + "1\312\002\023Google\\Cloud\\Kms\\V1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_kms_v1_KeyRing_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_kms_v1_KeyRing_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_KeyRing_descriptor,
            new java.lang.String[] {
              "Name", "CreateTime",
            });
    internal_static_google_cloud_kms_v1_CryptoKey_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_kms_v1_CryptoKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_CryptoKey_descriptor,
            new java.lang.String[] {
              "Name",
              "Primary",
              "Purpose",
              "CreateTime",
              "NextRotationTime",
              "RotationPeriod",
              "VersionTemplate",
              "Labels",
              "RotationSchedule",
            });
    internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_descriptor =
        internal_static_google_cloud_kms_v1_CryptoKey_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_descriptor,
            new java.lang.String[] {
              "ProtectionLevel", "Algorithm",
            });
    internal_static_google_cloud_kms_v1_KeyOperationAttestation_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_kms_v1_KeyOperationAttestation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_KeyOperationAttestation_descriptor,
            new java.lang.String[] {
              "Format", "Content",
            });
    internal_static_google_cloud_kms_v1_CryptoKeyVersion_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_kms_v1_CryptoKeyVersion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_CryptoKeyVersion_descriptor,
            new java.lang.String[] {
              "Name",
              "State",
              "ProtectionLevel",
              "Algorithm",
              "Attestation",
              "CreateTime",
              "GenerateTime",
              "DestroyTime",
              "DestroyEventTime",
              "ImportJob",
              "ImportTime",
              "ImportFailureReason",
            });
    internal_static_google_cloud_kms_v1_PublicKey_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_kms_v1_PublicKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_PublicKey_descriptor,
            new java.lang.String[] {
              "Pem", "Algorithm",
            });
    internal_static_google_cloud_kms_v1_ImportJob_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_kms_v1_ImportJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_ImportJob_descriptor,
            new java.lang.String[] {
              "Name",
              "ImportMethod",
              "ProtectionLevel",
              "CreateTime",
              "GenerateTime",
              "ExpireTime",
              "ExpireEventTime",
              "State",
              "PublicKey",
              "Attestation",
            });
    internal_static_google_cloud_kms_v1_ImportJob_WrappingPublicKey_descriptor =
        internal_static_google_cloud_kms_v1_ImportJob_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_kms_v1_ImportJob_WrappingPublicKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_ImportJob_WrappingPublicKey_descriptor,
            new java.lang.String[] {
              "Pem",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

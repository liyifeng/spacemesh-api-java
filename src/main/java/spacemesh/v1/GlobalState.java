// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spacemesh/v1/global_state.proto

// Protobuf Java Version: 3.25.1
package spacemesh.v1;

public final class GlobalState {
  private GlobalState() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037spacemesh/v1/global_state.proto\022\014space" +
      "mesh.v1\032\034google/api/annotations.proto\032%s" +
      "pacemesh/v1/global_state_types.proto2\314\007\n" +
      "\022GlobalStateService\022\212\001\n\017GlobalStateHash\022" +
      "$.spacemesh.v1.GlobalStateHashRequest\032%." +
      "spacemesh.v1.GlobalStateHashResponse\"*\202\323" +
      "\344\223\002$\"\037/v1/globalstate/globalstatehash:\001*" +
      "\022j\n\007Account\022\034.spacemesh.v1.AccountReques" +
      "t\032\035.spacemesh.v1.AccountResponse\"\"\202\323\344\223\002\034" +
      "\"\027/v1/globalstate/account:\001*\022\216\001\n\020Account" +
      "DataQuery\022%.spacemesh.v1.AccountDataQuer" +
      "yRequest\032&.spacemesh.v1.AccountDataQuery" +
      "Response\"+\202\323\344\223\002%\" /v1/globalstate/accoun" +
      "tdataquery:\001*\022\216\001\n\020SmesherDataQuery\022%.spa" +
      "cemesh.v1.SmesherDataQueryRequest\032&.spac" +
      "emesh.v1.SmesherDataQueryResponse\"+\202\323\344\223\002" +
      "%\" /v1/globalstate/smesherdataquery:\001*\022f" +
      "\n\021AccountDataStream\022&.spacemesh.v1.Accou" +
      "ntDataStreamRequest\032\'.spacemesh.v1.Accou" +
      "ntDataStreamResponse0\001\022l\n\023SmesherRewardS" +
      "tream\022(.spacemesh.v1.SmesherRewardStream" +
      "Request\032).spacemesh.v1.SmesherRewardStre" +
      "amResponse0\001\022]\n\016AppEventStream\022#.spaceme" +
      "sh.v1.AppEventStreamRequest\032$.spacemesh." +
      "v1.AppEventStreamResponse0\001\022f\n\021GlobalSta" +
      "teStream\022&.spacemesh.v1.GlobalStateStrea" +
      "mRequest\032\'.spacemesh.v1.GlobalStateStrea" +
      "mResponse0\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          spacemesh.v1.GlobalStateTypes.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    spacemesh.v1.GlobalStateTypes.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
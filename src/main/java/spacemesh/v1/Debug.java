// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spacemesh/v1/debug.proto

// Protobuf Java Version: 3.25.1
package spacemesh.v1;

public final class Debug {
  private Debug() {}
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
      "\n\030spacemesh/v1/debug.proto\022\014spacemesh.v1" +
      "\032\034google/api/annotations.proto\032\033google/p" +
      "rotobuf/empty.proto\032\036spacemesh/v1/debug_" +
      "types.proto2\325\002\n\014DebugService\022H\n\013NetworkI" +
      "nfo\022\026.google.protobuf.Empty\032!.spacemesh." +
      "v1.NetworkInfoResponse\022h\n\010Accounts\022\035.spa" +
      "cemesh.v1.AccountsRequest\032\036.spacemesh.v1" +
      ".AccountsResponse\"\035\202\323\344\223\002\027\"\022/v1/debug/acc" +
      "ounts:\001*\022L\n\tActiveSet\022\036.spacemesh.v1.Act" +
      "iveSetRequest\032\037.spacemesh.v1.ActiveSetRe" +
      "sponse\022C\n\017ProposalsStream\022\026.google.proto" +
      "buf.Empty\032\026.spacemesh.v1.Proposal0\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          spacemesh.v1.DebugTypes.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    spacemesh.v1.DebugTypes.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

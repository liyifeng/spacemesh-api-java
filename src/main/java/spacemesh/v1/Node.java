// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spacemesh/v1/node.proto

// Protobuf Java Version: 3.25.1
package spacemesh.v1;

public final class Node {
  private Node() {}
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
      "\n\027spacemesh/v1/node.proto\022\014spacemesh.v1\032" +
      "\034google/api/annotations.proto\032\033google/pr" +
      "otobuf/empty.proto\032\035spacemesh/v1/node_ty" +
      "pes.proto2\354\004\n\013NodeService\022W\n\004Echo\022\031.spac" +
      "emesh.v1.EchoRequest\032\032.spacemesh.v1.Echo" +
      "Response\"\030\202\323\344\223\002\022\"\r/v1/node/echo:\001*\022Z\n\007Ve" +
      "rsion\022\026.google.protobuf.Empty\032\035.spacemes" +
      "h.v1.VersionResponse\"\030\202\323\344\223\002\022\"\020/v1/node/v" +
      "ersion\022T\n\005Build\022\026.google.protobuf.Empty\032" +
      "\033.spacemesh.v1.BuildResponse\"\026\202\323\344\223\002\020\"\016/v" +
      "1/node/build\022_\n\006Status\022\033.spacemesh.v1.St" +
      "atusRequest\032\034.spacemesh.v1.StatusRespons" +
      "e\"\032\202\323\344\223\002\024\"\017/v1/node/status:\001*\022B\n\010NodeInf" +
      "o\022\026.google.protobuf.Empty\032\036.spacemesh.v1" +
      ".NodeInfoResponse\022W\n\014StatusStream\022!.spac" +
      "emesh.v1.StatusStreamRequest\032\".spacemesh" +
      ".v1.StatusStreamResponse0\001\022T\n\013ErrorStrea" +
      "m\022 .spacemesh.v1.ErrorStreamRequest\032!.sp" +
      "acemesh.v1.ErrorStreamResponse0\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          spacemesh.v1.NodeTypes.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    spacemesh.v1.NodeTypes.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

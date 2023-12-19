package spacemesh.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Readonly basic node data
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: spacemesh/v1/node.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NodeServiceGrpc {

  private NodeServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "spacemesh.v1.NodeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.NodeTypes.EchoRequest,
      spacemesh.v1.NodeTypes.EchoResponse> getEchoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Echo",
      requestType = spacemesh.v1.NodeTypes.EchoRequest.class,
      responseType = spacemesh.v1.NodeTypes.EchoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.NodeTypes.EchoRequest,
      spacemesh.v1.NodeTypes.EchoResponse> getEchoMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.NodeTypes.EchoRequest, spacemesh.v1.NodeTypes.EchoResponse> getEchoMethod;
    if ((getEchoMethod = NodeServiceGrpc.getEchoMethod) == null) {
      synchronized (NodeServiceGrpc.class) {
        if ((getEchoMethod = NodeServiceGrpc.getEchoMethod) == null) {
          NodeServiceGrpc.getEchoMethod = getEchoMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.NodeTypes.EchoRequest, spacemesh.v1.NodeTypes.EchoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Echo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.NodeTypes.EchoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.NodeTypes.EchoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NodeServiceMethodDescriptorSupplier("Echo"))
              .build();
        }
      }
    }
    return getEchoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.NodeTypes.VersionResponse> getVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Version",
      requestType = com.google.protobuf.Empty.class,
      responseType = spacemesh.v1.NodeTypes.VersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.NodeTypes.VersionResponse> getVersionMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, spacemesh.v1.NodeTypes.VersionResponse> getVersionMethod;
    if ((getVersionMethod = NodeServiceGrpc.getVersionMethod) == null) {
      synchronized (NodeServiceGrpc.class) {
        if ((getVersionMethod = NodeServiceGrpc.getVersionMethod) == null) {
          NodeServiceGrpc.getVersionMethod = getVersionMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, spacemesh.v1.NodeTypes.VersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Version"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.NodeTypes.VersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NodeServiceMethodDescriptorSupplier("Version"))
              .build();
        }
      }
    }
    return getVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.NodeTypes.BuildResponse> getBuildMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Build",
      requestType = com.google.protobuf.Empty.class,
      responseType = spacemesh.v1.NodeTypes.BuildResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.NodeTypes.BuildResponse> getBuildMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, spacemesh.v1.NodeTypes.BuildResponse> getBuildMethod;
    if ((getBuildMethod = NodeServiceGrpc.getBuildMethod) == null) {
      synchronized (NodeServiceGrpc.class) {
        if ((getBuildMethod = NodeServiceGrpc.getBuildMethod) == null) {
          NodeServiceGrpc.getBuildMethod = getBuildMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, spacemesh.v1.NodeTypes.BuildResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Build"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.NodeTypes.BuildResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NodeServiceMethodDescriptorSupplier("Build"))
              .build();
        }
      }
    }
    return getBuildMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.NodeTypes.StatusRequest,
      spacemesh.v1.NodeTypes.StatusResponse> getStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Status",
      requestType = spacemesh.v1.NodeTypes.StatusRequest.class,
      responseType = spacemesh.v1.NodeTypes.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.NodeTypes.StatusRequest,
      spacemesh.v1.NodeTypes.StatusResponse> getStatusMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.NodeTypes.StatusRequest, spacemesh.v1.NodeTypes.StatusResponse> getStatusMethod;
    if ((getStatusMethod = NodeServiceGrpc.getStatusMethod) == null) {
      synchronized (NodeServiceGrpc.class) {
        if ((getStatusMethod = NodeServiceGrpc.getStatusMethod) == null) {
          NodeServiceGrpc.getStatusMethod = getStatusMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.NodeTypes.StatusRequest, spacemesh.v1.NodeTypes.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Status"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.NodeTypes.StatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.NodeTypes.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NodeServiceMethodDescriptorSupplier("Status"))
              .build();
        }
      }
    }
    return getStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.NodeTypes.NodeInfoResponse> getNodeInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NodeInfo",
      requestType = com.google.protobuf.Empty.class,
      responseType = spacemesh.v1.NodeTypes.NodeInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.NodeTypes.NodeInfoResponse> getNodeInfoMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, spacemesh.v1.NodeTypes.NodeInfoResponse> getNodeInfoMethod;
    if ((getNodeInfoMethod = NodeServiceGrpc.getNodeInfoMethod) == null) {
      synchronized (NodeServiceGrpc.class) {
        if ((getNodeInfoMethod = NodeServiceGrpc.getNodeInfoMethod) == null) {
          NodeServiceGrpc.getNodeInfoMethod = getNodeInfoMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, spacemesh.v1.NodeTypes.NodeInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NodeInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.NodeTypes.NodeInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NodeServiceMethodDescriptorSupplier("NodeInfo"))
              .build();
        }
      }
    }
    return getNodeInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.NodeTypes.StatusStreamRequest,
      spacemesh.v1.NodeTypes.StatusStreamResponse> getStatusStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatusStream",
      requestType = spacemesh.v1.NodeTypes.StatusStreamRequest.class,
      responseType = spacemesh.v1.NodeTypes.StatusStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<spacemesh.v1.NodeTypes.StatusStreamRequest,
      spacemesh.v1.NodeTypes.StatusStreamResponse> getStatusStreamMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.NodeTypes.StatusStreamRequest, spacemesh.v1.NodeTypes.StatusStreamResponse> getStatusStreamMethod;
    if ((getStatusStreamMethod = NodeServiceGrpc.getStatusStreamMethod) == null) {
      synchronized (NodeServiceGrpc.class) {
        if ((getStatusStreamMethod = NodeServiceGrpc.getStatusStreamMethod) == null) {
          NodeServiceGrpc.getStatusStreamMethod = getStatusStreamMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.NodeTypes.StatusStreamRequest, spacemesh.v1.NodeTypes.StatusStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StatusStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.NodeTypes.StatusStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.NodeTypes.StatusStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NodeServiceMethodDescriptorSupplier("StatusStream"))
              .build();
        }
      }
    }
    return getStatusStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.NodeTypes.ErrorStreamRequest,
      spacemesh.v1.NodeTypes.ErrorStreamResponse> getErrorStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ErrorStream",
      requestType = spacemesh.v1.NodeTypes.ErrorStreamRequest.class,
      responseType = spacemesh.v1.NodeTypes.ErrorStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<spacemesh.v1.NodeTypes.ErrorStreamRequest,
      spacemesh.v1.NodeTypes.ErrorStreamResponse> getErrorStreamMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.NodeTypes.ErrorStreamRequest, spacemesh.v1.NodeTypes.ErrorStreamResponse> getErrorStreamMethod;
    if ((getErrorStreamMethod = NodeServiceGrpc.getErrorStreamMethod) == null) {
      synchronized (NodeServiceGrpc.class) {
        if ((getErrorStreamMethod = NodeServiceGrpc.getErrorStreamMethod) == null) {
          NodeServiceGrpc.getErrorStreamMethod = getErrorStreamMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.NodeTypes.ErrorStreamRequest, spacemesh.v1.NodeTypes.ErrorStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ErrorStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.NodeTypes.ErrorStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.NodeTypes.ErrorStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NodeServiceMethodDescriptorSupplier("ErrorStream"))
              .build();
        }
      }
    }
    return getErrorStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NodeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NodeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NodeServiceStub>() {
        @java.lang.Override
        public NodeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NodeServiceStub(channel, callOptions);
        }
      };
    return NodeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NodeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NodeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NodeServiceBlockingStub>() {
        @java.lang.Override
        public NodeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NodeServiceBlockingStub(channel, callOptions);
        }
      };
    return NodeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NodeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NodeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NodeServiceFutureStub>() {
        @java.lang.Override
        public NodeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NodeServiceFutureStub(channel, callOptions);
        }
      };
    return NodeServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Readonly basic node data
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * A simple test endpoint
     * </pre>
     */
    default void echo(spacemesh.v1.NodeTypes.EchoRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.NodeTypes.EchoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEchoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the version of the node software as a semver string
     * </pre>
     */
    default void version(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.NodeTypes.VersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the github commit hash used to build the node
     * </pre>
     */
    default void build(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.NodeTypes.BuildResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuildMethod(), responseObserver);
    }

    /**
     * <pre>
     * Current node status (net and sync)
     * </pre>
     */
    default void status(spacemesh.v1.NodeTypes.StatusRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.NodeTypes.StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * NodeInfo is a node configuration info.
     * </pre>
     */
    default void nodeInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.NodeTypes.NodeInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNodeInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Node status events (sync and net)
     * </pre>
     */
    default void statusStream(spacemesh.v1.NodeTypes.StatusStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.NodeTypes.StatusStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStatusStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Node error events
     * </pre>
     */
    default void errorStream(spacemesh.v1.NodeTypes.ErrorStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.NodeTypes.ErrorStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getErrorStreamMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service NodeService.
   * <pre>
   * Readonly basic node data
   * </pre>
   */
  public static abstract class NodeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return NodeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service NodeService.
   * <pre>
   * Readonly basic node data
   * </pre>
   */
  public static final class NodeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<NodeServiceStub> {
    private NodeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NodeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * A simple test endpoint
     * </pre>
     */
    public void echo(spacemesh.v1.NodeTypes.EchoRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.NodeTypes.EchoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the version of the node software as a semver string
     * </pre>
     */
    public void version(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.NodeTypes.VersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the github commit hash used to build the node
     * </pre>
     */
    public void build(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.NodeTypes.BuildResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuildMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Current node status (net and sync)
     * </pre>
     */
    public void status(spacemesh.v1.NodeTypes.StatusRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.NodeTypes.StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NodeInfo is a node configuration info.
     * </pre>
     */
    public void nodeInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.NodeTypes.NodeInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNodeInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Node status events (sync and net)
     * </pre>
     */
    public void statusStream(spacemesh.v1.NodeTypes.StatusStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.NodeTypes.StatusStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStatusStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Node error events
     * </pre>
     */
    public void errorStream(spacemesh.v1.NodeTypes.ErrorStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.NodeTypes.ErrorStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getErrorStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service NodeService.
   * <pre>
   * Readonly basic node data
   * </pre>
   */
  public static final class NodeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<NodeServiceBlockingStub> {
    private NodeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NodeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * A simple test endpoint
     * </pre>
     */
    public spacemesh.v1.NodeTypes.EchoResponse echo(spacemesh.v1.NodeTypes.EchoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEchoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the version of the node software as a semver string
     * </pre>
     */
    public spacemesh.v1.NodeTypes.VersionResponse version(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the github commit hash used to build the node
     * </pre>
     */
    public spacemesh.v1.NodeTypes.BuildResponse build(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuildMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Current node status (net and sync)
     * </pre>
     */
    public spacemesh.v1.NodeTypes.StatusResponse status(spacemesh.v1.NodeTypes.StatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NodeInfo is a node configuration info.
     * </pre>
     */
    public spacemesh.v1.NodeTypes.NodeInfoResponse nodeInfo(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNodeInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Node status events (sync and net)
     * </pre>
     */
    public java.util.Iterator<spacemesh.v1.NodeTypes.StatusStreamResponse> statusStream(
        spacemesh.v1.NodeTypes.StatusStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStatusStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Node error events
     * </pre>
     */
    public java.util.Iterator<spacemesh.v1.NodeTypes.ErrorStreamResponse> errorStream(
        spacemesh.v1.NodeTypes.ErrorStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getErrorStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service NodeService.
   * <pre>
   * Readonly basic node data
   * </pre>
   */
  public static final class NodeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<NodeServiceFutureStub> {
    private NodeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NodeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * A simple test endpoint
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.NodeTypes.EchoResponse> echo(
        spacemesh.v1.NodeTypes.EchoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the version of the node software as a semver string
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.NodeTypes.VersionResponse> version(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the github commit hash used to build the node
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.NodeTypes.BuildResponse> build(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuildMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Current node status (net and sync)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.NodeTypes.StatusResponse> status(
        spacemesh.v1.NodeTypes.StatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NodeInfo is a node configuration info.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.NodeTypes.NodeInfoResponse> nodeInfo(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNodeInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ECHO = 0;
  private static final int METHODID_VERSION = 1;
  private static final int METHODID_BUILD = 2;
  private static final int METHODID_STATUS = 3;
  private static final int METHODID_NODE_INFO = 4;
  private static final int METHODID_STATUS_STREAM = 5;
  private static final int METHODID_ERROR_STREAM = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ECHO:
          serviceImpl.echo((spacemesh.v1.NodeTypes.EchoRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.NodeTypes.EchoResponse>) responseObserver);
          break;
        case METHODID_VERSION:
          serviceImpl.version((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.NodeTypes.VersionResponse>) responseObserver);
          break;
        case METHODID_BUILD:
          serviceImpl.build((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.NodeTypes.BuildResponse>) responseObserver);
          break;
        case METHODID_STATUS:
          serviceImpl.status((spacemesh.v1.NodeTypes.StatusRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.NodeTypes.StatusResponse>) responseObserver);
          break;
        case METHODID_NODE_INFO:
          serviceImpl.nodeInfo((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.NodeTypes.NodeInfoResponse>) responseObserver);
          break;
        case METHODID_STATUS_STREAM:
          serviceImpl.statusStream((spacemesh.v1.NodeTypes.StatusStreamRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.NodeTypes.StatusStreamResponse>) responseObserver);
          break;
        case METHODID_ERROR_STREAM:
          serviceImpl.errorStream((spacemesh.v1.NodeTypes.ErrorStreamRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.NodeTypes.ErrorStreamResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getEchoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.NodeTypes.EchoRequest,
              spacemesh.v1.NodeTypes.EchoResponse>(
                service, METHODID_ECHO)))
        .addMethod(
          getVersionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              spacemesh.v1.NodeTypes.VersionResponse>(
                service, METHODID_VERSION)))
        .addMethod(
          getBuildMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              spacemesh.v1.NodeTypes.BuildResponse>(
                service, METHODID_BUILD)))
        .addMethod(
          getStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.NodeTypes.StatusRequest,
              spacemesh.v1.NodeTypes.StatusResponse>(
                service, METHODID_STATUS)))
        .addMethod(
          getNodeInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              spacemesh.v1.NodeTypes.NodeInfoResponse>(
                service, METHODID_NODE_INFO)))
        .addMethod(
          getStatusStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              spacemesh.v1.NodeTypes.StatusStreamRequest,
              spacemesh.v1.NodeTypes.StatusStreamResponse>(
                service, METHODID_STATUS_STREAM)))
        .addMethod(
          getErrorStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              spacemesh.v1.NodeTypes.ErrorStreamRequest,
              spacemesh.v1.NodeTypes.ErrorStreamResponse>(
                service, METHODID_ERROR_STREAM)))
        .build();
  }

  private static abstract class NodeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NodeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return spacemesh.v1.Node.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NodeService");
    }
  }

  private static final class NodeServiceFileDescriptorSupplier
      extends NodeServiceBaseDescriptorSupplier {
    NodeServiceFileDescriptorSupplier() {}
  }

  private static final class NodeServiceMethodDescriptorSupplier
      extends NodeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    NodeServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (NodeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NodeServiceFileDescriptorSupplier())
              .addMethod(getEchoMethod())
              .addMethod(getVersionMethod())
              .addMethod(getBuildMethod())
              .addMethod(getStatusMethod())
              .addMethod(getNodeInfoMethod())
              .addMethod(getStatusStreamMethod())
              .addMethod(getErrorStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}

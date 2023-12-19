package spacemesh.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * AdminService offers the set of administrative RPCs.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: spacemesh/v1/admin.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AdminServiceGrpc {

  private AdminServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "spacemesh.v1.AdminService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.AdminTypes.CheckpointStreamRequest,
      spacemesh.v1.AdminTypes.CheckpointStreamResponse> getCheckpointStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckpointStream",
      requestType = spacemesh.v1.AdminTypes.CheckpointStreamRequest.class,
      responseType = spacemesh.v1.AdminTypes.CheckpointStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<spacemesh.v1.AdminTypes.CheckpointStreamRequest,
      spacemesh.v1.AdminTypes.CheckpointStreamResponse> getCheckpointStreamMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.AdminTypes.CheckpointStreamRequest, spacemesh.v1.AdminTypes.CheckpointStreamResponse> getCheckpointStreamMethod;
    if ((getCheckpointStreamMethod = AdminServiceGrpc.getCheckpointStreamMethod) == null) {
      synchronized (AdminServiceGrpc.class) {
        if ((getCheckpointStreamMethod = AdminServiceGrpc.getCheckpointStreamMethod) == null) {
          AdminServiceGrpc.getCheckpointStreamMethod = getCheckpointStreamMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.AdminTypes.CheckpointStreamRequest, spacemesh.v1.AdminTypes.CheckpointStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckpointStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.AdminTypes.CheckpointStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.AdminTypes.CheckpointStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminServiceMethodDescriptorSupplier("CheckpointStream"))
              .build();
        }
      }
    }
    return getCheckpointStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.AdminTypes.RecoverRequest,
      com.google.protobuf.Empty> getRecoverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Recover",
      requestType = spacemesh.v1.AdminTypes.RecoverRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.AdminTypes.RecoverRequest,
      com.google.protobuf.Empty> getRecoverMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.AdminTypes.RecoverRequest, com.google.protobuf.Empty> getRecoverMethod;
    if ((getRecoverMethod = AdminServiceGrpc.getRecoverMethod) == null) {
      synchronized (AdminServiceGrpc.class) {
        if ((getRecoverMethod = AdminServiceGrpc.getRecoverMethod) == null) {
          AdminServiceGrpc.getRecoverMethod = getRecoverMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.AdminTypes.RecoverRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Recover"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.AdminTypes.RecoverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AdminServiceMethodDescriptorSupplier("Recover"))
              .build();
        }
      }
    }
    return getRecoverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.AdminTypes.EventStreamRequest,
      spacemesh.v1.AdminTypes.Event> getEventsStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EventsStream",
      requestType = spacemesh.v1.AdminTypes.EventStreamRequest.class,
      responseType = spacemesh.v1.AdminTypes.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<spacemesh.v1.AdminTypes.EventStreamRequest,
      spacemesh.v1.AdminTypes.Event> getEventsStreamMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.AdminTypes.EventStreamRequest, spacemesh.v1.AdminTypes.Event> getEventsStreamMethod;
    if ((getEventsStreamMethod = AdminServiceGrpc.getEventsStreamMethod) == null) {
      synchronized (AdminServiceGrpc.class) {
        if ((getEventsStreamMethod = AdminServiceGrpc.getEventsStreamMethod) == null) {
          AdminServiceGrpc.getEventsStreamMethod = getEventsStreamMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.AdminTypes.EventStreamRequest, spacemesh.v1.AdminTypes.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EventsStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.AdminTypes.EventStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.AdminTypes.Event.getDefaultInstance()))
              .setSchemaDescriptor(new AdminServiceMethodDescriptorSupplier("EventsStream"))
              .build();
        }
      }
    }
    return getEventsStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.AdminTypes.PeerInfo> getPeerInfoStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PeerInfoStream",
      requestType = com.google.protobuf.Empty.class,
      responseType = spacemesh.v1.AdminTypes.PeerInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.AdminTypes.PeerInfo> getPeerInfoStreamMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, spacemesh.v1.AdminTypes.PeerInfo> getPeerInfoStreamMethod;
    if ((getPeerInfoStreamMethod = AdminServiceGrpc.getPeerInfoStreamMethod) == null) {
      synchronized (AdminServiceGrpc.class) {
        if ((getPeerInfoStreamMethod = AdminServiceGrpc.getPeerInfoStreamMethod) == null) {
          AdminServiceGrpc.getPeerInfoStreamMethod = getPeerInfoStreamMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, spacemesh.v1.AdminTypes.PeerInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PeerInfoStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.AdminTypes.PeerInfo.getDefaultInstance()))
              .setSchemaDescriptor(new AdminServiceMethodDescriptorSupplier("PeerInfoStream"))
              .build();
        }
      }
    }
    return getPeerInfoStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdminServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdminServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdminServiceStub>() {
        @java.lang.Override
        public AdminServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdminServiceStub(channel, callOptions);
        }
      };
    return AdminServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdminServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdminServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdminServiceBlockingStub>() {
        @java.lang.Override
        public AdminServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdminServiceBlockingStub(channel, callOptions);
        }
      };
    return AdminServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdminServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdminServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdminServiceFutureStub>() {
        @java.lang.Override
        public AdminServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdminServiceFutureStub(channel, callOptions);
        }
      };
    return AdminServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * AdminService offers the set of administrative RPCs.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns the checkpoint data.
     * </pre>
     */
    default void checkpointStream(spacemesh.v1.AdminTypes.CheckpointStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.AdminTypes.CheckpointStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckpointStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Recovers from the provided checkpoint data.
     * </pre>
     */
    default void recover(spacemesh.v1.AdminTypes.RecoverRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecoverMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events that are relevant for node operator
     * </pre>
     */
    default void eventsStream(spacemesh.v1.AdminTypes.EventStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.AdminTypes.Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEventsStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * PeerInfo returns info for all connected peers. 
     * </pre>
     */
    default void peerInfoStream(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.AdminTypes.PeerInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPeerInfoStreamMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AdminService.
   * <pre>
   * AdminService offers the set of administrative RPCs.
   * </pre>
   */
  public static abstract class AdminServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AdminServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AdminService.
   * <pre>
   * AdminService offers the set of administrative RPCs.
   * </pre>
   */
  public static final class AdminServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AdminServiceStub> {
    private AdminServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdminServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the checkpoint data.
     * </pre>
     */
    public void checkpointStream(spacemesh.v1.AdminTypes.CheckpointStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.AdminTypes.CheckpointStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getCheckpointStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Recovers from the provided checkpoint data.
     * </pre>
     */
    public void recover(spacemesh.v1.AdminTypes.RecoverRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecoverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events that are relevant for node operator
     * </pre>
     */
    public void eventsStream(spacemesh.v1.AdminTypes.EventStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.AdminTypes.Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEventsStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PeerInfo returns info for all connected peers. 
     * </pre>
     */
    public void peerInfoStream(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.AdminTypes.PeerInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getPeerInfoStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AdminService.
   * <pre>
   * AdminService offers the set of administrative RPCs.
   * </pre>
   */
  public static final class AdminServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AdminServiceBlockingStub> {
    private AdminServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdminServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the checkpoint data.
     * </pre>
     */
    public java.util.Iterator<spacemesh.v1.AdminTypes.CheckpointStreamResponse> checkpointStream(
        spacemesh.v1.AdminTypes.CheckpointStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getCheckpointStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Recovers from the provided checkpoint data.
     * </pre>
     */
    public com.google.protobuf.Empty recover(spacemesh.v1.AdminTypes.RecoverRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecoverMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events that are relevant for node operator
     * </pre>
     */
    public java.util.Iterator<spacemesh.v1.AdminTypes.Event> eventsStream(
        spacemesh.v1.AdminTypes.EventStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEventsStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PeerInfo returns info for all connected peers. 
     * </pre>
     */
    public java.util.Iterator<spacemesh.v1.AdminTypes.PeerInfo> peerInfoStream(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getPeerInfoStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AdminService.
   * <pre>
   * AdminService offers the set of administrative RPCs.
   * </pre>
   */
  public static final class AdminServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AdminServiceFutureStub> {
    private AdminServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdminServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Recovers from the provided checkpoint data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> recover(
        spacemesh.v1.AdminTypes.RecoverRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecoverMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECKPOINT_STREAM = 0;
  private static final int METHODID_RECOVER = 1;
  private static final int METHODID_EVENTS_STREAM = 2;
  private static final int METHODID_PEER_INFO_STREAM = 3;

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
        case METHODID_CHECKPOINT_STREAM:
          serviceImpl.checkpointStream((spacemesh.v1.AdminTypes.CheckpointStreamRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.AdminTypes.CheckpointStreamResponse>) responseObserver);
          break;
        case METHODID_RECOVER:
          serviceImpl.recover((spacemesh.v1.AdminTypes.RecoverRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_EVENTS_STREAM:
          serviceImpl.eventsStream((spacemesh.v1.AdminTypes.EventStreamRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.AdminTypes.Event>) responseObserver);
          break;
        case METHODID_PEER_INFO_STREAM:
          serviceImpl.peerInfoStream((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.AdminTypes.PeerInfo>) responseObserver);
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
          getCheckpointStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              spacemesh.v1.AdminTypes.CheckpointStreamRequest,
              spacemesh.v1.AdminTypes.CheckpointStreamResponse>(
                service, METHODID_CHECKPOINT_STREAM)))
        .addMethod(
          getRecoverMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.AdminTypes.RecoverRequest,
              com.google.protobuf.Empty>(
                service, METHODID_RECOVER)))
        .addMethod(
          getEventsStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              spacemesh.v1.AdminTypes.EventStreamRequest,
              spacemesh.v1.AdminTypes.Event>(
                service, METHODID_EVENTS_STREAM)))
        .addMethod(
          getPeerInfoStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              spacemesh.v1.AdminTypes.PeerInfo>(
                service, METHODID_PEER_INFO_STREAM)))
        .build();
  }

  private static abstract class AdminServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdminServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return spacemesh.v1.Admin.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdminService");
    }
  }

  private static final class AdminServiceFileDescriptorSupplier
      extends AdminServiceBaseDescriptorSupplier {
    AdminServiceFileDescriptorSupplier() {}
  }

  private static final class AdminServiceMethodDescriptorSupplier
      extends AdminServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AdminServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AdminServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdminServiceFileDescriptorSupplier())
              .addMethod(getCheckpointStreamMethod())
              .addMethod(getRecoverMethod())
              .addMethod(getEventsStreamMethod())
              .addMethod(getPeerInfoStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}

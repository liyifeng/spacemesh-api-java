package spacemesh.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Exposes services to query activation transactions
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: spacemesh/v1/activation.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ActivationServiceGrpc {

  private ActivationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "spacemesh.v1.ActivationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.ActivationTypes.GetRequest,
      spacemesh.v1.ActivationTypes.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = spacemesh.v1.ActivationTypes.GetRequest.class,
      responseType = spacemesh.v1.ActivationTypes.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.ActivationTypes.GetRequest,
      spacemesh.v1.ActivationTypes.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.ActivationTypes.GetRequest, spacemesh.v1.ActivationTypes.GetResponse> getGetMethod;
    if ((getGetMethod = ActivationServiceGrpc.getGetMethod) == null) {
      synchronized (ActivationServiceGrpc.class) {
        if ((getGetMethod = ActivationServiceGrpc.getGetMethod) == null) {
          ActivationServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.ActivationTypes.GetRequest, spacemesh.v1.ActivationTypes.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.ActivationTypes.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.ActivationTypes.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ActivationServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.ActivationTypes.HighestResponse> getHighestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Highest",
      requestType = com.google.protobuf.Empty.class,
      responseType = spacemesh.v1.ActivationTypes.HighestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.ActivationTypes.HighestResponse> getHighestMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, spacemesh.v1.ActivationTypes.HighestResponse> getHighestMethod;
    if ((getHighestMethod = ActivationServiceGrpc.getHighestMethod) == null) {
      synchronized (ActivationServiceGrpc.class) {
        if ((getHighestMethod = ActivationServiceGrpc.getHighestMethod) == null) {
          ActivationServiceGrpc.getHighestMethod = getHighestMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, spacemesh.v1.ActivationTypes.HighestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Highest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.ActivationTypes.HighestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ActivationServiceMethodDescriptorSupplier("Highest"))
              .build();
        }
      }
    }
    return getHighestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ActivationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ActivationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ActivationServiceStub>() {
        @java.lang.Override
        public ActivationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ActivationServiceStub(channel, callOptions);
        }
      };
    return ActivationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ActivationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ActivationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ActivationServiceBlockingStub>() {
        @java.lang.Override
        public ActivationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ActivationServiceBlockingStub(channel, callOptions);
        }
      };
    return ActivationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ActivationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ActivationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ActivationServiceFutureStub>() {
        @java.lang.Override
        public ActivationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ActivationServiceFutureStub(channel, callOptions);
        }
      };
    return ActivationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Exposes services to query activation transactions
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Get a single activation transaction
     * </pre>
     */
    default void get(spacemesh.v1.ActivationTypes.GetRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.ActivationTypes.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Highest returns the atx id with the highest tick count.
     * </pre>
     */
    default void highest(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.ActivationTypes.HighestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHighestMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ActivationService.
   * <pre>
   * Exposes services to query activation transactions
   * </pre>
   */
  public static abstract class ActivationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ActivationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ActivationService.
   * <pre>
   * Exposes services to query activation transactions
   * </pre>
   */
  public static final class ActivationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ActivationServiceStub> {
    private ActivationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ActivationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ActivationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a single activation transaction
     * </pre>
     */
    public void get(spacemesh.v1.ActivationTypes.GetRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.ActivationTypes.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Highest returns the atx id with the highest tick count.
     * </pre>
     */
    public void highest(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.ActivationTypes.HighestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHighestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ActivationService.
   * <pre>
   * Exposes services to query activation transactions
   * </pre>
   */
  public static final class ActivationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ActivationServiceBlockingStub> {
    private ActivationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ActivationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ActivationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a single activation transaction
     * </pre>
     */
    public spacemesh.v1.ActivationTypes.GetResponse get(spacemesh.v1.ActivationTypes.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Highest returns the atx id with the highest tick count.
     * </pre>
     */
    public spacemesh.v1.ActivationTypes.HighestResponse highest(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHighestMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ActivationService.
   * <pre>
   * Exposes services to query activation transactions
   * </pre>
   */
  public static final class ActivationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ActivationServiceFutureStub> {
    private ActivationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ActivationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ActivationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a single activation transaction
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.ActivationTypes.GetResponse> get(
        spacemesh.v1.ActivationTypes.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Highest returns the atx id with the highest tick count.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.ActivationTypes.HighestResponse> highest(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHighestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_HIGHEST = 1;

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
        case METHODID_GET:
          serviceImpl.get((spacemesh.v1.ActivationTypes.GetRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.ActivationTypes.GetResponse>) responseObserver);
          break;
        case METHODID_HIGHEST:
          serviceImpl.highest((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.ActivationTypes.HighestResponse>) responseObserver);
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
          getGetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.ActivationTypes.GetRequest,
              spacemesh.v1.ActivationTypes.GetResponse>(
                service, METHODID_GET)))
        .addMethod(
          getHighestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              spacemesh.v1.ActivationTypes.HighestResponse>(
                service, METHODID_HIGHEST)))
        .build();
  }

  private static abstract class ActivationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ActivationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return spacemesh.v1.Activation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ActivationService");
    }
  }

  private static final class ActivationServiceFileDescriptorSupplier
      extends ActivationServiceBaseDescriptorSupplier {
    ActivationServiceFileDescriptorSupplier() {}
  }

  private static final class ActivationServiceMethodDescriptorSupplier
      extends ActivationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ActivationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ActivationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ActivationServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getHighestMethod())
              .build();
        }
      }
    }
    return result;
  }
}

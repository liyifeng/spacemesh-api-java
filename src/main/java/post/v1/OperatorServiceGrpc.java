package post.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: post/v1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OperatorServiceGrpc {

  private OperatorServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "post.v1.OperatorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<post.v1.Service.OperatorStatusRequest,
      post.v1.Service.OperatorStatusResponse> getStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Status",
      requestType = post.v1.Service.OperatorStatusRequest.class,
      responseType = post.v1.Service.OperatorStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<post.v1.Service.OperatorStatusRequest,
      post.v1.Service.OperatorStatusResponse> getStatusMethod() {
    io.grpc.MethodDescriptor<post.v1.Service.OperatorStatusRequest, post.v1.Service.OperatorStatusResponse> getStatusMethod;
    if ((getStatusMethod = OperatorServiceGrpc.getStatusMethod) == null) {
      synchronized (OperatorServiceGrpc.class) {
        if ((getStatusMethod = OperatorServiceGrpc.getStatusMethod) == null) {
          OperatorServiceGrpc.getStatusMethod = getStatusMethod =
              io.grpc.MethodDescriptor.<post.v1.Service.OperatorStatusRequest, post.v1.Service.OperatorStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Status"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  post.v1.Service.OperatorStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  post.v1.Service.OperatorStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OperatorServiceMethodDescriptorSupplier("Status"))
              .build();
        }
      }
    }
    return getStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OperatorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperatorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperatorServiceStub>() {
        @java.lang.Override
        public OperatorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperatorServiceStub(channel, callOptions);
        }
      };
    return OperatorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OperatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperatorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperatorServiceBlockingStub>() {
        @java.lang.Override
        public OperatorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperatorServiceBlockingStub(channel, callOptions);
        }
      };
    return OperatorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OperatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperatorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperatorServiceFutureStub>() {
        @java.lang.Override
        public OperatorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperatorServiceFutureStub(channel, callOptions);
        }
      };
    return OperatorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void status(post.v1.Service.OperatorStatusRequest request,
        io.grpc.stub.StreamObserver<post.v1.Service.OperatorStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStatusMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OperatorService.
   */
  public static abstract class OperatorServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OperatorServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OperatorService.
   */
  public static final class OperatorServiceStub
      extends io.grpc.stub.AbstractAsyncStub<OperatorServiceStub> {
    private OperatorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperatorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperatorServiceStub(channel, callOptions);
    }

    /**
     */
    public void status(post.v1.Service.OperatorStatusRequest request,
        io.grpc.stub.StreamObserver<post.v1.Service.OperatorStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OperatorService.
   */
  public static final class OperatorServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OperatorServiceBlockingStub> {
    private OperatorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperatorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperatorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public post.v1.Service.OperatorStatusResponse status(post.v1.Service.OperatorStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OperatorService.
   */
  public static final class OperatorServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<OperatorServiceFutureStub> {
    private OperatorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperatorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperatorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<post.v1.Service.OperatorStatusResponse> status(
        post.v1.Service.OperatorStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STATUS = 0;

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
        case METHODID_STATUS:
          serviceImpl.status((post.v1.Service.OperatorStatusRequest) request,
              (io.grpc.stub.StreamObserver<post.v1.Service.OperatorStatusResponse>) responseObserver);
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
          getStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              post.v1.Service.OperatorStatusRequest,
              post.v1.Service.OperatorStatusResponse>(
                service, METHODID_STATUS)))
        .build();
  }

  private static abstract class OperatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OperatorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return post.v1.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OperatorService");
    }
  }

  private static final class OperatorServiceFileDescriptorSupplier
      extends OperatorServiceBaseDescriptorSupplier {
    OperatorServiceFileDescriptorSupplier() {}
  }

  private static final class OperatorServiceMethodDescriptorSupplier
      extends OperatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OperatorServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OperatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OperatorServiceFileDescriptorSupplier())
              .addMethod(getStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}

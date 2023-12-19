package spacemesh.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * DebugService exposes methods used for mostly debugging and tests
 * NOTE: The endpoints in this service are experimental and subject to change without notice.
 * They should not be used in production.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: spacemesh/v1/debug.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DebugServiceGrpc {

  private DebugServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "spacemesh.v1.DebugService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.DebugTypes.NetworkInfoResponse> getNetworkInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NetworkInfo",
      requestType = com.google.protobuf.Empty.class,
      responseType = spacemesh.v1.DebugTypes.NetworkInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.DebugTypes.NetworkInfoResponse> getNetworkInfoMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, spacemesh.v1.DebugTypes.NetworkInfoResponse> getNetworkInfoMethod;
    if ((getNetworkInfoMethod = DebugServiceGrpc.getNetworkInfoMethod) == null) {
      synchronized (DebugServiceGrpc.class) {
        if ((getNetworkInfoMethod = DebugServiceGrpc.getNetworkInfoMethod) == null) {
          DebugServiceGrpc.getNetworkInfoMethod = getNetworkInfoMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, spacemesh.v1.DebugTypes.NetworkInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NetworkInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.DebugTypes.NetworkInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DebugServiceMethodDescriptorSupplier("NetworkInfo"))
              .build();
        }
      }
    }
    return getNetworkInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.DebugTypes.AccountsRequest,
      spacemesh.v1.DebugTypes.AccountsResponse> getAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Accounts",
      requestType = spacemesh.v1.DebugTypes.AccountsRequest.class,
      responseType = spacemesh.v1.DebugTypes.AccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.DebugTypes.AccountsRequest,
      spacemesh.v1.DebugTypes.AccountsResponse> getAccountsMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.DebugTypes.AccountsRequest, spacemesh.v1.DebugTypes.AccountsResponse> getAccountsMethod;
    if ((getAccountsMethod = DebugServiceGrpc.getAccountsMethod) == null) {
      synchronized (DebugServiceGrpc.class) {
        if ((getAccountsMethod = DebugServiceGrpc.getAccountsMethod) == null) {
          DebugServiceGrpc.getAccountsMethod = getAccountsMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.DebugTypes.AccountsRequest, spacemesh.v1.DebugTypes.AccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Accounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.DebugTypes.AccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.DebugTypes.AccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DebugServiceMethodDescriptorSupplier("Accounts"))
              .build();
        }
      }
    }
    return getAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.DebugTypes.ActiveSetRequest,
      spacemesh.v1.DebugTypes.ActiveSetResponse> getActiveSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActiveSet",
      requestType = spacemesh.v1.DebugTypes.ActiveSetRequest.class,
      responseType = spacemesh.v1.DebugTypes.ActiveSetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.DebugTypes.ActiveSetRequest,
      spacemesh.v1.DebugTypes.ActiveSetResponse> getActiveSetMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.DebugTypes.ActiveSetRequest, spacemesh.v1.DebugTypes.ActiveSetResponse> getActiveSetMethod;
    if ((getActiveSetMethod = DebugServiceGrpc.getActiveSetMethod) == null) {
      synchronized (DebugServiceGrpc.class) {
        if ((getActiveSetMethod = DebugServiceGrpc.getActiveSetMethod) == null) {
          DebugServiceGrpc.getActiveSetMethod = getActiveSetMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.DebugTypes.ActiveSetRequest, spacemesh.v1.DebugTypes.ActiveSetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActiveSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.DebugTypes.ActiveSetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.DebugTypes.ActiveSetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DebugServiceMethodDescriptorSupplier("ActiveSet"))
              .build();
        }
      }
    }
    return getActiveSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.DebugTypes.Proposal> getProposalsStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProposalsStream",
      requestType = com.google.protobuf.Empty.class,
      responseType = spacemesh.v1.DebugTypes.Proposal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.DebugTypes.Proposal> getProposalsStreamMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, spacemesh.v1.DebugTypes.Proposal> getProposalsStreamMethod;
    if ((getProposalsStreamMethod = DebugServiceGrpc.getProposalsStreamMethod) == null) {
      synchronized (DebugServiceGrpc.class) {
        if ((getProposalsStreamMethod = DebugServiceGrpc.getProposalsStreamMethod) == null) {
          DebugServiceGrpc.getProposalsStreamMethod = getProposalsStreamMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, spacemesh.v1.DebugTypes.Proposal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProposalsStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.DebugTypes.Proposal.getDefaultInstance()))
              .setSchemaDescriptor(new DebugServiceMethodDescriptorSupplier("ProposalsStream"))
              .build();
        }
      }
    }
    return getProposalsStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DebugServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DebugServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DebugServiceStub>() {
        @java.lang.Override
        public DebugServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DebugServiceStub(channel, callOptions);
        }
      };
    return DebugServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DebugServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DebugServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DebugServiceBlockingStub>() {
        @java.lang.Override
        public DebugServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DebugServiceBlockingStub(channel, callOptions);
        }
      };
    return DebugServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DebugServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DebugServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DebugServiceFutureStub>() {
        @java.lang.Override
        public DebugServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DebugServiceFutureStub(channel, callOptions);
        }
      };
    return DebugServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * DebugService exposes methods used for mostly debugging and tests
   * NOTE: The endpoints in this service are experimental and subject to change without notice.
   * They should not be used in production.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * NetworkInfo returns p2p network information. Mostly required for integration with deployment 
     * and testing tooling.
     * </pre>
     */
    default void networkInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.DebugTypes.NetworkInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNetworkInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Accounts returns data for all the accounts currently in the node's current global state.
     * This includes each account's address, nonce and balance but excludes projection of account state.
     * </pre>
     */
    default void accounts(spacemesh.v1.DebugTypes.AccountsRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.DebugTypes.AccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ActiveSet returns the active set used by hare in a given epoch.
     * </pre>
     */
    default void activeSet(spacemesh.v1.DebugTypes.ActiveSetRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.DebugTypes.ActiveSetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActiveSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * ProposalsStream streams all proposals that are confirmed by hare.
     * </pre>
     */
    default void proposalsStream(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.DebugTypes.Proposal> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProposalsStreamMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DebugService.
   * <pre>
   * DebugService exposes methods used for mostly debugging and tests
   * NOTE: The endpoints in this service are experimental and subject to change without notice.
   * They should not be used in production.
   * </pre>
   */
  public static abstract class DebugServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DebugServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DebugService.
   * <pre>
   * DebugService exposes methods used for mostly debugging and tests
   * NOTE: The endpoints in this service are experimental and subject to change without notice.
   * They should not be used in production.
   * </pre>
   */
  public static final class DebugServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DebugServiceStub> {
    private DebugServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DebugServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DebugServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * NetworkInfo returns p2p network information. Mostly required for integration with deployment 
     * and testing tooling.
     * </pre>
     */
    public void networkInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.DebugTypes.NetworkInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNetworkInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Accounts returns data for all the accounts currently in the node's current global state.
     * This includes each account's address, nonce and balance but excludes projection of account state.
     * </pre>
     */
    public void accounts(spacemesh.v1.DebugTypes.AccountsRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.DebugTypes.AccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ActiveSet returns the active set used by hare in a given epoch.
     * </pre>
     */
    public void activeSet(spacemesh.v1.DebugTypes.ActiveSetRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.DebugTypes.ActiveSetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActiveSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ProposalsStream streams all proposals that are confirmed by hare.
     * </pre>
     */
    public void proposalsStream(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.DebugTypes.Proposal> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getProposalsStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DebugService.
   * <pre>
   * DebugService exposes methods used for mostly debugging and tests
   * NOTE: The endpoints in this service are experimental and subject to change without notice.
   * They should not be used in production.
   * </pre>
   */
  public static final class DebugServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DebugServiceBlockingStub> {
    private DebugServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DebugServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DebugServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * NetworkInfo returns p2p network information. Mostly required for integration with deployment 
     * and testing tooling.
     * </pre>
     */
    public spacemesh.v1.DebugTypes.NetworkInfoResponse networkInfo(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNetworkInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Accounts returns data for all the accounts currently in the node's current global state.
     * This includes each account's address, nonce and balance but excludes projection of account state.
     * </pre>
     */
    public spacemesh.v1.DebugTypes.AccountsResponse accounts(spacemesh.v1.DebugTypes.AccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ActiveSet returns the active set used by hare in a given epoch.
     * </pre>
     */
    public spacemesh.v1.DebugTypes.ActiveSetResponse activeSet(spacemesh.v1.DebugTypes.ActiveSetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActiveSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ProposalsStream streams all proposals that are confirmed by hare.
     * </pre>
     */
    public java.util.Iterator<spacemesh.v1.DebugTypes.Proposal> proposalsStream(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getProposalsStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DebugService.
   * <pre>
   * DebugService exposes methods used for mostly debugging and tests
   * NOTE: The endpoints in this service are experimental and subject to change without notice.
   * They should not be used in production.
   * </pre>
   */
  public static final class DebugServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DebugServiceFutureStub> {
    private DebugServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DebugServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DebugServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * NetworkInfo returns p2p network information. Mostly required for integration with deployment 
     * and testing tooling.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.DebugTypes.NetworkInfoResponse> networkInfo(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNetworkInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Accounts returns data for all the accounts currently in the node's current global state.
     * This includes each account's address, nonce and balance but excludes projection of account state.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.DebugTypes.AccountsResponse> accounts(
        spacemesh.v1.DebugTypes.AccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ActiveSet returns the active set used by hare in a given epoch.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.DebugTypes.ActiveSetResponse> activeSet(
        spacemesh.v1.DebugTypes.ActiveSetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActiveSetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NETWORK_INFO = 0;
  private static final int METHODID_ACCOUNTS = 1;
  private static final int METHODID_ACTIVE_SET = 2;
  private static final int METHODID_PROPOSALS_STREAM = 3;

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
        case METHODID_NETWORK_INFO:
          serviceImpl.networkInfo((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.DebugTypes.NetworkInfoResponse>) responseObserver);
          break;
        case METHODID_ACCOUNTS:
          serviceImpl.accounts((spacemesh.v1.DebugTypes.AccountsRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.DebugTypes.AccountsResponse>) responseObserver);
          break;
        case METHODID_ACTIVE_SET:
          serviceImpl.activeSet((spacemesh.v1.DebugTypes.ActiveSetRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.DebugTypes.ActiveSetResponse>) responseObserver);
          break;
        case METHODID_PROPOSALS_STREAM:
          serviceImpl.proposalsStream((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.DebugTypes.Proposal>) responseObserver);
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
          getNetworkInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              spacemesh.v1.DebugTypes.NetworkInfoResponse>(
                service, METHODID_NETWORK_INFO)))
        .addMethod(
          getAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.DebugTypes.AccountsRequest,
              spacemesh.v1.DebugTypes.AccountsResponse>(
                service, METHODID_ACCOUNTS)))
        .addMethod(
          getActiveSetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.DebugTypes.ActiveSetRequest,
              spacemesh.v1.DebugTypes.ActiveSetResponse>(
                service, METHODID_ACTIVE_SET)))
        .addMethod(
          getProposalsStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              spacemesh.v1.DebugTypes.Proposal>(
                service, METHODID_PROPOSALS_STREAM)))
        .build();
  }

  private static abstract class DebugServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DebugServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return spacemesh.v1.Debug.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DebugService");
    }
  }

  private static final class DebugServiceFileDescriptorSupplier
      extends DebugServiceBaseDescriptorSupplier {
    DebugServiceFileDescriptorSupplier() {}
  }

  private static final class DebugServiceMethodDescriptorSupplier
      extends DebugServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DebugServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DebugServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DebugServiceFileDescriptorSupplier())
              .addMethod(getNetworkInfoMethod())
              .addMethod(getAccountsMethod())
              .addMethod(getActiveSetMethod())
              .addMethod(getProposalsStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}

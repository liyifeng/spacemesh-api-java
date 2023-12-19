package spacemesh.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Readonly global state data - current and historical.
 * Global state data is data which is not explicitly stored in the mesh.
 * Global state is modified only by the state transition function.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: spacemesh/v1/global_state.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GlobalStateServiceGrpc {

  private GlobalStateServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "spacemesh.v1.GlobalStateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.GlobalStateTypes.GlobalStateHashRequest,
      spacemesh.v1.GlobalStateTypes.GlobalStateHashResponse> getGlobalStateHashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GlobalStateHash",
      requestType = spacemesh.v1.GlobalStateTypes.GlobalStateHashRequest.class,
      responseType = spacemesh.v1.GlobalStateTypes.GlobalStateHashResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.GlobalStateTypes.GlobalStateHashRequest,
      spacemesh.v1.GlobalStateTypes.GlobalStateHashResponse> getGlobalStateHashMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.GlobalStateTypes.GlobalStateHashRequest, spacemesh.v1.GlobalStateTypes.GlobalStateHashResponse> getGlobalStateHashMethod;
    if ((getGlobalStateHashMethod = GlobalStateServiceGrpc.getGlobalStateHashMethod) == null) {
      synchronized (GlobalStateServiceGrpc.class) {
        if ((getGlobalStateHashMethod = GlobalStateServiceGrpc.getGlobalStateHashMethod) == null) {
          GlobalStateServiceGrpc.getGlobalStateHashMethod = getGlobalStateHashMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.GlobalStateTypes.GlobalStateHashRequest, spacemesh.v1.GlobalStateTypes.GlobalStateHashResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GlobalStateHash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.GlobalStateTypes.GlobalStateHashRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.GlobalStateTypes.GlobalStateHashResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalStateServiceMethodDescriptorSupplier("GlobalStateHash"))
              .build();
        }
      }
    }
    return getGlobalStateHashMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.GlobalStateTypes.AccountRequest,
      spacemesh.v1.GlobalStateTypes.AccountResponse> getAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Account",
      requestType = spacemesh.v1.GlobalStateTypes.AccountRequest.class,
      responseType = spacemesh.v1.GlobalStateTypes.AccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.GlobalStateTypes.AccountRequest,
      spacemesh.v1.GlobalStateTypes.AccountResponse> getAccountMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.GlobalStateTypes.AccountRequest, spacemesh.v1.GlobalStateTypes.AccountResponse> getAccountMethod;
    if ((getAccountMethod = GlobalStateServiceGrpc.getAccountMethod) == null) {
      synchronized (GlobalStateServiceGrpc.class) {
        if ((getAccountMethod = GlobalStateServiceGrpc.getAccountMethod) == null) {
          GlobalStateServiceGrpc.getAccountMethod = getAccountMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.GlobalStateTypes.AccountRequest, spacemesh.v1.GlobalStateTypes.AccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Account"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.GlobalStateTypes.AccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.GlobalStateTypes.AccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalStateServiceMethodDescriptorSupplier("Account"))
              .build();
        }
      }
    }
    return getAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.GlobalStateTypes.AccountDataQueryRequest,
      spacemesh.v1.GlobalStateTypes.AccountDataQueryResponse> getAccountDataQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountDataQuery",
      requestType = spacemesh.v1.GlobalStateTypes.AccountDataQueryRequest.class,
      responseType = spacemesh.v1.GlobalStateTypes.AccountDataQueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.GlobalStateTypes.AccountDataQueryRequest,
      spacemesh.v1.GlobalStateTypes.AccountDataQueryResponse> getAccountDataQueryMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.GlobalStateTypes.AccountDataQueryRequest, spacemesh.v1.GlobalStateTypes.AccountDataQueryResponse> getAccountDataQueryMethod;
    if ((getAccountDataQueryMethod = GlobalStateServiceGrpc.getAccountDataQueryMethod) == null) {
      synchronized (GlobalStateServiceGrpc.class) {
        if ((getAccountDataQueryMethod = GlobalStateServiceGrpc.getAccountDataQueryMethod) == null) {
          GlobalStateServiceGrpc.getAccountDataQueryMethod = getAccountDataQueryMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.GlobalStateTypes.AccountDataQueryRequest, spacemesh.v1.GlobalStateTypes.AccountDataQueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountDataQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.GlobalStateTypes.AccountDataQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.GlobalStateTypes.AccountDataQueryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalStateServiceMethodDescriptorSupplier("AccountDataQuery"))
              .build();
        }
      }
    }
    return getAccountDataQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.GlobalStateTypes.SmesherDataQueryRequest,
      spacemesh.v1.GlobalStateTypes.SmesherDataQueryResponse> getSmesherDataQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SmesherDataQuery",
      requestType = spacemesh.v1.GlobalStateTypes.SmesherDataQueryRequest.class,
      responseType = spacemesh.v1.GlobalStateTypes.SmesherDataQueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.GlobalStateTypes.SmesherDataQueryRequest,
      spacemesh.v1.GlobalStateTypes.SmesherDataQueryResponse> getSmesherDataQueryMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.GlobalStateTypes.SmesherDataQueryRequest, spacemesh.v1.GlobalStateTypes.SmesherDataQueryResponse> getSmesherDataQueryMethod;
    if ((getSmesherDataQueryMethod = GlobalStateServiceGrpc.getSmesherDataQueryMethod) == null) {
      synchronized (GlobalStateServiceGrpc.class) {
        if ((getSmesherDataQueryMethod = GlobalStateServiceGrpc.getSmesherDataQueryMethod) == null) {
          GlobalStateServiceGrpc.getSmesherDataQueryMethod = getSmesherDataQueryMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.GlobalStateTypes.SmesherDataQueryRequest, spacemesh.v1.GlobalStateTypes.SmesherDataQueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SmesherDataQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.GlobalStateTypes.SmesherDataQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.GlobalStateTypes.SmesherDataQueryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalStateServiceMethodDescriptorSupplier("SmesherDataQuery"))
              .build();
        }
      }
    }
    return getSmesherDataQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.GlobalStateTypes.AccountDataStreamRequest,
      spacemesh.v1.GlobalStateTypes.AccountDataStreamResponse> getAccountDataStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountDataStream",
      requestType = spacemesh.v1.GlobalStateTypes.AccountDataStreamRequest.class,
      responseType = spacemesh.v1.GlobalStateTypes.AccountDataStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<spacemesh.v1.GlobalStateTypes.AccountDataStreamRequest,
      spacemesh.v1.GlobalStateTypes.AccountDataStreamResponse> getAccountDataStreamMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.GlobalStateTypes.AccountDataStreamRequest, spacemesh.v1.GlobalStateTypes.AccountDataStreamResponse> getAccountDataStreamMethod;
    if ((getAccountDataStreamMethod = GlobalStateServiceGrpc.getAccountDataStreamMethod) == null) {
      synchronized (GlobalStateServiceGrpc.class) {
        if ((getAccountDataStreamMethod = GlobalStateServiceGrpc.getAccountDataStreamMethod) == null) {
          GlobalStateServiceGrpc.getAccountDataStreamMethod = getAccountDataStreamMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.GlobalStateTypes.AccountDataStreamRequest, spacemesh.v1.GlobalStateTypes.AccountDataStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountDataStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.GlobalStateTypes.AccountDataStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.GlobalStateTypes.AccountDataStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalStateServiceMethodDescriptorSupplier("AccountDataStream"))
              .build();
        }
      }
    }
    return getAccountDataStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.GlobalStateTypes.SmesherRewardStreamRequest,
      spacemesh.v1.GlobalStateTypes.SmesherRewardStreamResponse> getSmesherRewardStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SmesherRewardStream",
      requestType = spacemesh.v1.GlobalStateTypes.SmesherRewardStreamRequest.class,
      responseType = spacemesh.v1.GlobalStateTypes.SmesherRewardStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<spacemesh.v1.GlobalStateTypes.SmesherRewardStreamRequest,
      spacemesh.v1.GlobalStateTypes.SmesherRewardStreamResponse> getSmesherRewardStreamMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.GlobalStateTypes.SmesherRewardStreamRequest, spacemesh.v1.GlobalStateTypes.SmesherRewardStreamResponse> getSmesherRewardStreamMethod;
    if ((getSmesherRewardStreamMethod = GlobalStateServiceGrpc.getSmesherRewardStreamMethod) == null) {
      synchronized (GlobalStateServiceGrpc.class) {
        if ((getSmesherRewardStreamMethod = GlobalStateServiceGrpc.getSmesherRewardStreamMethod) == null) {
          GlobalStateServiceGrpc.getSmesherRewardStreamMethod = getSmesherRewardStreamMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.GlobalStateTypes.SmesherRewardStreamRequest, spacemesh.v1.GlobalStateTypes.SmesherRewardStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SmesherRewardStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.GlobalStateTypes.SmesherRewardStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.GlobalStateTypes.SmesherRewardStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalStateServiceMethodDescriptorSupplier("SmesherRewardStream"))
              .build();
        }
      }
    }
    return getSmesherRewardStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.GlobalStateTypes.AppEventStreamRequest,
      spacemesh.v1.GlobalStateTypes.AppEventStreamResponse> getAppEventStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AppEventStream",
      requestType = spacemesh.v1.GlobalStateTypes.AppEventStreamRequest.class,
      responseType = spacemesh.v1.GlobalStateTypes.AppEventStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<spacemesh.v1.GlobalStateTypes.AppEventStreamRequest,
      spacemesh.v1.GlobalStateTypes.AppEventStreamResponse> getAppEventStreamMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.GlobalStateTypes.AppEventStreamRequest, spacemesh.v1.GlobalStateTypes.AppEventStreamResponse> getAppEventStreamMethod;
    if ((getAppEventStreamMethod = GlobalStateServiceGrpc.getAppEventStreamMethod) == null) {
      synchronized (GlobalStateServiceGrpc.class) {
        if ((getAppEventStreamMethod = GlobalStateServiceGrpc.getAppEventStreamMethod) == null) {
          GlobalStateServiceGrpc.getAppEventStreamMethod = getAppEventStreamMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.GlobalStateTypes.AppEventStreamRequest, spacemesh.v1.GlobalStateTypes.AppEventStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AppEventStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.GlobalStateTypes.AppEventStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.GlobalStateTypes.AppEventStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalStateServiceMethodDescriptorSupplier("AppEventStream"))
              .build();
        }
      }
    }
    return getAppEventStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.GlobalStateTypes.GlobalStateStreamRequest,
      spacemesh.v1.GlobalStateTypes.GlobalStateStreamResponse> getGlobalStateStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GlobalStateStream",
      requestType = spacemesh.v1.GlobalStateTypes.GlobalStateStreamRequest.class,
      responseType = spacemesh.v1.GlobalStateTypes.GlobalStateStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<spacemesh.v1.GlobalStateTypes.GlobalStateStreamRequest,
      spacemesh.v1.GlobalStateTypes.GlobalStateStreamResponse> getGlobalStateStreamMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.GlobalStateTypes.GlobalStateStreamRequest, spacemesh.v1.GlobalStateTypes.GlobalStateStreamResponse> getGlobalStateStreamMethod;
    if ((getGlobalStateStreamMethod = GlobalStateServiceGrpc.getGlobalStateStreamMethod) == null) {
      synchronized (GlobalStateServiceGrpc.class) {
        if ((getGlobalStateStreamMethod = GlobalStateServiceGrpc.getGlobalStateStreamMethod) == null) {
          GlobalStateServiceGrpc.getGlobalStateStreamMethod = getGlobalStateStreamMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.GlobalStateTypes.GlobalStateStreamRequest, spacemesh.v1.GlobalStateTypes.GlobalStateStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GlobalStateStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.GlobalStateTypes.GlobalStateStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.GlobalStateTypes.GlobalStateStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalStateServiceMethodDescriptorSupplier("GlobalStateStream"))
              .build();
        }
      }
    }
    return getGlobalStateStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GlobalStateServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GlobalStateServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GlobalStateServiceStub>() {
        @java.lang.Override
        public GlobalStateServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GlobalStateServiceStub(channel, callOptions);
        }
      };
    return GlobalStateServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GlobalStateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GlobalStateServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GlobalStateServiceBlockingStub>() {
        @java.lang.Override
        public GlobalStateServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GlobalStateServiceBlockingStub(channel, callOptions);
        }
      };
    return GlobalStateServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GlobalStateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GlobalStateServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GlobalStateServiceFutureStub>() {
        @java.lang.Override
        public GlobalStateServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GlobalStateServiceFutureStub(channel, callOptions);
        }
      };
    return GlobalStateServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Readonly global state data - current and historical.
   * Global state data is data which is not explicitly stored in the mesh.
   * Global state is modified only by the state transition function.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Latest computed global state - layer and its root hash
     * </pre>
     */
    default void globalStateHash(spacemesh.v1.GlobalStateTypes.GlobalStateHashRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.GlobalStateTypes.GlobalStateHashResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGlobalStateHashMethod(), responseObserver);
    }

    /**
     * <pre>
     * Account info in the current global state.
     * </pre>
     */
    default void account(spacemesh.v1.GlobalStateTypes.AccountRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.GlobalStateTypes.AccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query for account related data such as rewards, tx receipts and account info
     * Note: it might be too expensive to add a param for layer to get these results from
     * as it may require indexing all global state changes per account by layer.
     * If it is possible to index by layer then we should add param start_layer to
     * AccountDataParams. Currently it will return data from genesis.
     * </pre>
     */
    default void accountDataQuery(spacemesh.v1.GlobalStateTypes.AccountDataQueryRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.GlobalStateTypes.AccountDataQueryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountDataQueryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query for smesher data. Currently returns smesher rewards.
     * Note: Not supporting start_layer yet as it may require to index all rewards by
     * smesher and by layer id or allow for queries from a layer and later....
     * </pre>
     */
    default void smesherDataQuery(spacemesh.v1.GlobalStateTypes.SmesherDataQueryRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.GlobalStateTypes.SmesherDataQueryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSmesherDataQueryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a stream of account related changes such as account balance change,
     * tx receipts and rewards
     * </pre>
     */
    default void accountDataStream(spacemesh.v1.GlobalStateTypes.AccountDataStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.GlobalStateTypes.AccountDataStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountDataStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Rewards awarded to a smesher id
     * </pre>
     */
    default void smesherRewardStream(spacemesh.v1.GlobalStateTypes.SmesherRewardStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.GlobalStateTypes.SmesherRewardStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSmesherRewardStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * App Events - emitted by app methods impl code trigged by an
     * app transaction
     * </pre>
     */
    default void appEventStream(spacemesh.v1.GlobalStateTypes.AppEventStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.GlobalStateTypes.AppEventStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAppEventStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * New global state computed for a layer by the STF
     * </pre>
     */
    default void globalStateStream(spacemesh.v1.GlobalStateTypes.GlobalStateStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.GlobalStateTypes.GlobalStateStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGlobalStateStreamMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GlobalStateService.
   * <pre>
   * Readonly global state data - current and historical.
   * Global state data is data which is not explicitly stored in the mesh.
   * Global state is modified only by the state transition function.
   * </pre>
   */
  public static abstract class GlobalStateServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GlobalStateServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GlobalStateService.
   * <pre>
   * Readonly global state data - current and historical.
   * Global state data is data which is not explicitly stored in the mesh.
   * Global state is modified only by the state transition function.
   * </pre>
   */
  public static final class GlobalStateServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GlobalStateServiceStub> {
    private GlobalStateServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GlobalStateServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GlobalStateServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Latest computed global state - layer and its root hash
     * </pre>
     */
    public void globalStateHash(spacemesh.v1.GlobalStateTypes.GlobalStateHashRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.GlobalStateTypes.GlobalStateHashResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGlobalStateHashMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Account info in the current global state.
     * </pre>
     */
    public void account(spacemesh.v1.GlobalStateTypes.AccountRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.GlobalStateTypes.AccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query for account related data such as rewards, tx receipts and account info
     * Note: it might be too expensive to add a param for layer to get these results from
     * as it may require indexing all global state changes per account by layer.
     * If it is possible to index by layer then we should add param start_layer to
     * AccountDataParams. Currently it will return data from genesis.
     * </pre>
     */
    public void accountDataQuery(spacemesh.v1.GlobalStateTypes.AccountDataQueryRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.GlobalStateTypes.AccountDataQueryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountDataQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query for smesher data. Currently returns smesher rewards.
     * Note: Not supporting start_layer yet as it may require to index all rewards by
     * smesher and by layer id or allow for queries from a layer and later....
     * </pre>
     */
    public void smesherDataQuery(spacemesh.v1.GlobalStateTypes.SmesherDataQueryRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.GlobalStateTypes.SmesherDataQueryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSmesherDataQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a stream of account related changes such as account balance change,
     * tx receipts and rewards
     * </pre>
     */
    public void accountDataStream(spacemesh.v1.GlobalStateTypes.AccountDataStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.GlobalStateTypes.AccountDataStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getAccountDataStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Rewards awarded to a smesher id
     * </pre>
     */
    public void smesherRewardStream(spacemesh.v1.GlobalStateTypes.SmesherRewardStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.GlobalStateTypes.SmesherRewardStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSmesherRewardStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * App Events - emitted by app methods impl code trigged by an
     * app transaction
     * </pre>
     */
    public void appEventStream(spacemesh.v1.GlobalStateTypes.AppEventStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.GlobalStateTypes.AppEventStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getAppEventStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * New global state computed for a layer by the STF
     * </pre>
     */
    public void globalStateStream(spacemesh.v1.GlobalStateTypes.GlobalStateStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.GlobalStateTypes.GlobalStateStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGlobalStateStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GlobalStateService.
   * <pre>
   * Readonly global state data - current and historical.
   * Global state data is data which is not explicitly stored in the mesh.
   * Global state is modified only by the state transition function.
   * </pre>
   */
  public static final class GlobalStateServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GlobalStateServiceBlockingStub> {
    private GlobalStateServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GlobalStateServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GlobalStateServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Latest computed global state - layer and its root hash
     * </pre>
     */
    public spacemesh.v1.GlobalStateTypes.GlobalStateHashResponse globalStateHash(spacemesh.v1.GlobalStateTypes.GlobalStateHashRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGlobalStateHashMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Account info in the current global state.
     * </pre>
     */
    public spacemesh.v1.GlobalStateTypes.AccountResponse account(spacemesh.v1.GlobalStateTypes.AccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query for account related data such as rewards, tx receipts and account info
     * Note: it might be too expensive to add a param for layer to get these results from
     * as it may require indexing all global state changes per account by layer.
     * If it is possible to index by layer then we should add param start_layer to
     * AccountDataParams. Currently it will return data from genesis.
     * </pre>
     */
    public spacemesh.v1.GlobalStateTypes.AccountDataQueryResponse accountDataQuery(spacemesh.v1.GlobalStateTypes.AccountDataQueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountDataQueryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query for smesher data. Currently returns smesher rewards.
     * Note: Not supporting start_layer yet as it may require to index all rewards by
     * smesher and by layer id or allow for queries from a layer and later....
     * </pre>
     */
    public spacemesh.v1.GlobalStateTypes.SmesherDataQueryResponse smesherDataQuery(spacemesh.v1.GlobalStateTypes.SmesherDataQueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSmesherDataQueryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a stream of account related changes such as account balance change,
     * tx receipts and rewards
     * </pre>
     */
    public java.util.Iterator<spacemesh.v1.GlobalStateTypes.AccountDataStreamResponse> accountDataStream(
        spacemesh.v1.GlobalStateTypes.AccountDataStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getAccountDataStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Rewards awarded to a smesher id
     * </pre>
     */
    public java.util.Iterator<spacemesh.v1.GlobalStateTypes.SmesherRewardStreamResponse> smesherRewardStream(
        spacemesh.v1.GlobalStateTypes.SmesherRewardStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSmesherRewardStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * App Events - emitted by app methods impl code trigged by an
     * app transaction
     * </pre>
     */
    public java.util.Iterator<spacemesh.v1.GlobalStateTypes.AppEventStreamResponse> appEventStream(
        spacemesh.v1.GlobalStateTypes.AppEventStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getAppEventStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * New global state computed for a layer by the STF
     * </pre>
     */
    public java.util.Iterator<spacemesh.v1.GlobalStateTypes.GlobalStateStreamResponse> globalStateStream(
        spacemesh.v1.GlobalStateTypes.GlobalStateStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGlobalStateStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GlobalStateService.
   * <pre>
   * Readonly global state data - current and historical.
   * Global state data is data which is not explicitly stored in the mesh.
   * Global state is modified only by the state transition function.
   * </pre>
   */
  public static final class GlobalStateServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GlobalStateServiceFutureStub> {
    private GlobalStateServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GlobalStateServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GlobalStateServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Latest computed global state - layer and its root hash
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.GlobalStateTypes.GlobalStateHashResponse> globalStateHash(
        spacemesh.v1.GlobalStateTypes.GlobalStateHashRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGlobalStateHashMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Account info in the current global state.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.GlobalStateTypes.AccountResponse> account(
        spacemesh.v1.GlobalStateTypes.AccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query for account related data such as rewards, tx receipts and account info
     * Note: it might be too expensive to add a param for layer to get these results from
     * as it may require indexing all global state changes per account by layer.
     * If it is possible to index by layer then we should add param start_layer to
     * AccountDataParams. Currently it will return data from genesis.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.GlobalStateTypes.AccountDataQueryResponse> accountDataQuery(
        spacemesh.v1.GlobalStateTypes.AccountDataQueryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountDataQueryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query for smesher data. Currently returns smesher rewards.
     * Note: Not supporting start_layer yet as it may require to index all rewards by
     * smesher and by layer id or allow for queries from a layer and later....
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.GlobalStateTypes.SmesherDataQueryResponse> smesherDataQuery(
        spacemesh.v1.GlobalStateTypes.SmesherDataQueryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSmesherDataQueryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GLOBAL_STATE_HASH = 0;
  private static final int METHODID_ACCOUNT = 1;
  private static final int METHODID_ACCOUNT_DATA_QUERY = 2;
  private static final int METHODID_SMESHER_DATA_QUERY = 3;
  private static final int METHODID_ACCOUNT_DATA_STREAM = 4;
  private static final int METHODID_SMESHER_REWARD_STREAM = 5;
  private static final int METHODID_APP_EVENT_STREAM = 6;
  private static final int METHODID_GLOBAL_STATE_STREAM = 7;

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
        case METHODID_GLOBAL_STATE_HASH:
          serviceImpl.globalStateHash((spacemesh.v1.GlobalStateTypes.GlobalStateHashRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.GlobalStateTypes.GlobalStateHashResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT:
          serviceImpl.account((spacemesh.v1.GlobalStateTypes.AccountRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.GlobalStateTypes.AccountResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_DATA_QUERY:
          serviceImpl.accountDataQuery((spacemesh.v1.GlobalStateTypes.AccountDataQueryRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.GlobalStateTypes.AccountDataQueryResponse>) responseObserver);
          break;
        case METHODID_SMESHER_DATA_QUERY:
          serviceImpl.smesherDataQuery((spacemesh.v1.GlobalStateTypes.SmesherDataQueryRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.GlobalStateTypes.SmesherDataQueryResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_DATA_STREAM:
          serviceImpl.accountDataStream((spacemesh.v1.GlobalStateTypes.AccountDataStreamRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.GlobalStateTypes.AccountDataStreamResponse>) responseObserver);
          break;
        case METHODID_SMESHER_REWARD_STREAM:
          serviceImpl.smesherRewardStream((spacemesh.v1.GlobalStateTypes.SmesherRewardStreamRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.GlobalStateTypes.SmesherRewardStreamResponse>) responseObserver);
          break;
        case METHODID_APP_EVENT_STREAM:
          serviceImpl.appEventStream((spacemesh.v1.GlobalStateTypes.AppEventStreamRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.GlobalStateTypes.AppEventStreamResponse>) responseObserver);
          break;
        case METHODID_GLOBAL_STATE_STREAM:
          serviceImpl.globalStateStream((spacemesh.v1.GlobalStateTypes.GlobalStateStreamRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.GlobalStateTypes.GlobalStateStreamResponse>) responseObserver);
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
          getGlobalStateHashMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.GlobalStateTypes.GlobalStateHashRequest,
              spacemesh.v1.GlobalStateTypes.GlobalStateHashResponse>(
                service, METHODID_GLOBAL_STATE_HASH)))
        .addMethod(
          getAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.GlobalStateTypes.AccountRequest,
              spacemesh.v1.GlobalStateTypes.AccountResponse>(
                service, METHODID_ACCOUNT)))
        .addMethod(
          getAccountDataQueryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.GlobalStateTypes.AccountDataQueryRequest,
              spacemesh.v1.GlobalStateTypes.AccountDataQueryResponse>(
                service, METHODID_ACCOUNT_DATA_QUERY)))
        .addMethod(
          getSmesherDataQueryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.GlobalStateTypes.SmesherDataQueryRequest,
              spacemesh.v1.GlobalStateTypes.SmesherDataQueryResponse>(
                service, METHODID_SMESHER_DATA_QUERY)))
        .addMethod(
          getAccountDataStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              spacemesh.v1.GlobalStateTypes.AccountDataStreamRequest,
              spacemesh.v1.GlobalStateTypes.AccountDataStreamResponse>(
                service, METHODID_ACCOUNT_DATA_STREAM)))
        .addMethod(
          getSmesherRewardStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              spacemesh.v1.GlobalStateTypes.SmesherRewardStreamRequest,
              spacemesh.v1.GlobalStateTypes.SmesherRewardStreamResponse>(
                service, METHODID_SMESHER_REWARD_STREAM)))
        .addMethod(
          getAppEventStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              spacemesh.v1.GlobalStateTypes.AppEventStreamRequest,
              spacemesh.v1.GlobalStateTypes.AppEventStreamResponse>(
                service, METHODID_APP_EVENT_STREAM)))
        .addMethod(
          getGlobalStateStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              spacemesh.v1.GlobalStateTypes.GlobalStateStreamRequest,
              spacemesh.v1.GlobalStateTypes.GlobalStateStreamResponse>(
                service, METHODID_GLOBAL_STATE_STREAM)))
        .build();
  }

  private static abstract class GlobalStateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GlobalStateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return spacemesh.v1.GlobalState.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GlobalStateService");
    }
  }

  private static final class GlobalStateServiceFileDescriptorSupplier
      extends GlobalStateServiceBaseDescriptorSupplier {
    GlobalStateServiceFileDescriptorSupplier() {}
  }

  private static final class GlobalStateServiceMethodDescriptorSupplier
      extends GlobalStateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GlobalStateServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (GlobalStateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GlobalStateServiceFileDescriptorSupplier())
              .addMethod(getGlobalStateHashMethod())
              .addMethod(getAccountMethod())
              .addMethod(getAccountDataQueryMethod())
              .addMethod(getSmesherDataQueryMethod())
              .addMethod(getAccountDataStreamMethod())
              .addMethod(getSmesherRewardStreamMethod())
              .addMethod(getAppEventStreamMethod())
              .addMethod(getGlobalStateStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}

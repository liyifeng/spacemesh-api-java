package spacemesh.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Provides clients a way to submit a tx to the network for processing, and to
 * check or follow the "journey" of a tx from mempool to block inclusion to
 * mesh to STF processing. This service is separate from the Mesh and
 * GlobalState services because txs move across both.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: spacemesh/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TransactionServiceGrpc {

  private TransactionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "spacemesh.v1.TransactionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.TxTypes.SubmitTransactionRequest,
      spacemesh.v1.TxTypes.SubmitTransactionResponse> getSubmitTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitTransaction",
      requestType = spacemesh.v1.TxTypes.SubmitTransactionRequest.class,
      responseType = spacemesh.v1.TxTypes.SubmitTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.TxTypes.SubmitTransactionRequest,
      spacemesh.v1.TxTypes.SubmitTransactionResponse> getSubmitTransactionMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.TxTypes.SubmitTransactionRequest, spacemesh.v1.TxTypes.SubmitTransactionResponse> getSubmitTransactionMethod;
    if ((getSubmitTransactionMethod = TransactionServiceGrpc.getSubmitTransactionMethod) == null) {
      synchronized (TransactionServiceGrpc.class) {
        if ((getSubmitTransactionMethod = TransactionServiceGrpc.getSubmitTransactionMethod) == null) {
          TransactionServiceGrpc.getSubmitTransactionMethod = getSubmitTransactionMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.TxTypes.SubmitTransactionRequest, spacemesh.v1.TxTypes.SubmitTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.TxTypes.SubmitTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.TxTypes.SubmitTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionServiceMethodDescriptorSupplier("SubmitTransaction"))
              .build();
        }
      }
    }
    return getSubmitTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.TxTypes.ParseTransactionRequest,
      spacemesh.v1.TxTypes.ParseTransactionResponse> getParseTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParseTransaction",
      requestType = spacemesh.v1.TxTypes.ParseTransactionRequest.class,
      responseType = spacemesh.v1.TxTypes.ParseTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.TxTypes.ParseTransactionRequest,
      spacemesh.v1.TxTypes.ParseTransactionResponse> getParseTransactionMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.TxTypes.ParseTransactionRequest, spacemesh.v1.TxTypes.ParseTransactionResponse> getParseTransactionMethod;
    if ((getParseTransactionMethod = TransactionServiceGrpc.getParseTransactionMethod) == null) {
      synchronized (TransactionServiceGrpc.class) {
        if ((getParseTransactionMethod = TransactionServiceGrpc.getParseTransactionMethod) == null) {
          TransactionServiceGrpc.getParseTransactionMethod = getParseTransactionMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.TxTypes.ParseTransactionRequest, spacemesh.v1.TxTypes.ParseTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParseTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.TxTypes.ParseTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.TxTypes.ParseTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionServiceMethodDescriptorSupplier("ParseTransaction"))
              .build();
        }
      }
    }
    return getParseTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.TxTypes.TransactionsStateRequest,
      spacemesh.v1.TxTypes.TransactionsStateResponse> getTransactionsStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransactionsState",
      requestType = spacemesh.v1.TxTypes.TransactionsStateRequest.class,
      responseType = spacemesh.v1.TxTypes.TransactionsStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.TxTypes.TransactionsStateRequest,
      spacemesh.v1.TxTypes.TransactionsStateResponse> getTransactionsStateMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.TxTypes.TransactionsStateRequest, spacemesh.v1.TxTypes.TransactionsStateResponse> getTransactionsStateMethod;
    if ((getTransactionsStateMethod = TransactionServiceGrpc.getTransactionsStateMethod) == null) {
      synchronized (TransactionServiceGrpc.class) {
        if ((getTransactionsStateMethod = TransactionServiceGrpc.getTransactionsStateMethod) == null) {
          TransactionServiceGrpc.getTransactionsStateMethod = getTransactionsStateMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.TxTypes.TransactionsStateRequest, spacemesh.v1.TxTypes.TransactionsStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransactionsState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.TxTypes.TransactionsStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.TxTypes.TransactionsStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionServiceMethodDescriptorSupplier("TransactionsState"))
              .build();
        }
      }
    }
    return getTransactionsStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.TxTypes.TransactionsStateStreamRequest,
      spacemesh.v1.TxTypes.TransactionsStateStreamResponse> getTransactionsStateStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransactionsStateStream",
      requestType = spacemesh.v1.TxTypes.TransactionsStateStreamRequest.class,
      responseType = spacemesh.v1.TxTypes.TransactionsStateStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<spacemesh.v1.TxTypes.TransactionsStateStreamRequest,
      spacemesh.v1.TxTypes.TransactionsStateStreamResponse> getTransactionsStateStreamMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.TxTypes.TransactionsStateStreamRequest, spacemesh.v1.TxTypes.TransactionsStateStreamResponse> getTransactionsStateStreamMethod;
    if ((getTransactionsStateStreamMethod = TransactionServiceGrpc.getTransactionsStateStreamMethod) == null) {
      synchronized (TransactionServiceGrpc.class) {
        if ((getTransactionsStateStreamMethod = TransactionServiceGrpc.getTransactionsStateStreamMethod) == null) {
          TransactionServiceGrpc.getTransactionsStateStreamMethod = getTransactionsStateStreamMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.TxTypes.TransactionsStateStreamRequest, spacemesh.v1.TxTypes.TransactionsStateStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransactionsStateStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.TxTypes.TransactionsStateStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.TxTypes.TransactionsStateStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionServiceMethodDescriptorSupplier("TransactionsStateStream"))
              .build();
        }
      }
    }
    return getTransactionsStateStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.TxTypes.TransactionResultsRequest,
      spacemesh.v1.TxTypes.TransactionResult> getStreamResultsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamResults",
      requestType = spacemesh.v1.TxTypes.TransactionResultsRequest.class,
      responseType = spacemesh.v1.TxTypes.TransactionResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<spacemesh.v1.TxTypes.TransactionResultsRequest,
      spacemesh.v1.TxTypes.TransactionResult> getStreamResultsMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.TxTypes.TransactionResultsRequest, spacemesh.v1.TxTypes.TransactionResult> getStreamResultsMethod;
    if ((getStreamResultsMethod = TransactionServiceGrpc.getStreamResultsMethod) == null) {
      synchronized (TransactionServiceGrpc.class) {
        if ((getStreamResultsMethod = TransactionServiceGrpc.getStreamResultsMethod) == null) {
          TransactionServiceGrpc.getStreamResultsMethod = getStreamResultsMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.TxTypes.TransactionResultsRequest, spacemesh.v1.TxTypes.TransactionResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamResults"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.TxTypes.TransactionResultsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.TxTypes.TransactionResult.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionServiceMethodDescriptorSupplier("StreamResults"))
              .build();
        }
      }
    }
    return getStreamResultsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TransactionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionServiceStub>() {
        @java.lang.Override
        public TransactionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionServiceStub(channel, callOptions);
        }
      };
    return TransactionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TransactionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionServiceBlockingStub>() {
        @java.lang.Override
        public TransactionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionServiceBlockingStub(channel, callOptions);
        }
      };
    return TransactionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TransactionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionServiceFutureStub>() {
        @java.lang.Override
        public TransactionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionServiceFutureStub(channel, callOptions);
        }
      };
    return TransactionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Provides clients a way to submit a tx to the network for processing, and to
   * check or follow the "journey" of a tx from mempool to block inclusion to
   * mesh to STF processing. This service is separate from the Mesh and
   * GlobalState services because txs move across both.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Submit a new tx to the node for processing. The response
     * TransactionState message contains both the txid of the new tx, as well
     * as whether or not it was admitted into the mempool.
     * </pre>
     */
    default void submitTransaction(spacemesh.v1.TxTypes.SubmitTransactionRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.TxTypes.SubmitTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ParseTransaction without submitting it to the mempool.
     * It has a limitation that it will work only for an already spawned accounts,
     * and for initial spawn transactions. Client is expected to wait until spawn transaction
     * executes before it will submit other transactions.
     * </pre>
     */
    default void parseTransaction(spacemesh.v1.TxTypes.ParseTransactionRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.TxTypes.ParseTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParseTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns current tx state for one or more txs which indicates if a tx is
     * on the mesh, on its way to the mesh or was rejected and will never get
     * to the mesh
     * </pre>
     */
    default void transactionsState(spacemesh.v1.TxTypes.TransactionsStateRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.TxTypes.TransactionsStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransactionsStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns tx state for one or more txs every time the tx state changes for
     * one of these txs
     * </pre>
     */
    default void transactionsStateStream(spacemesh.v1.TxTypes.TransactionsStateStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.TxTypes.TransactionsStateStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransactionsStateStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * StreamResults streams historical data and watch live events with transaction results. 
     * </pre>
     */
    default void streamResults(spacemesh.v1.TxTypes.TransactionResultsRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.TxTypes.TransactionResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamResultsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TransactionService.
   * <pre>
   * Provides clients a way to submit a tx to the network for processing, and to
   * check or follow the "journey" of a tx from mempool to block inclusion to
   * mesh to STF processing. This service is separate from the Mesh and
   * GlobalState services because txs move across both.
   * </pre>
   */
  public static abstract class TransactionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TransactionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TransactionService.
   * <pre>
   * Provides clients a way to submit a tx to the network for processing, and to
   * check or follow the "journey" of a tx from mempool to block inclusion to
   * mesh to STF processing. This service is separate from the Mesh and
   * GlobalState services because txs move across both.
   * </pre>
   */
  public static final class TransactionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TransactionServiceStub> {
    private TransactionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Submit a new tx to the node for processing. The response
     * TransactionState message contains both the txid of the new tx, as well
     * as whether or not it was admitted into the mempool.
     * </pre>
     */
    public void submitTransaction(spacemesh.v1.TxTypes.SubmitTransactionRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.TxTypes.SubmitTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ParseTransaction without submitting it to the mempool.
     * It has a limitation that it will work only for an already spawned accounts,
     * and for initial spawn transactions. Client is expected to wait until spawn transaction
     * executes before it will submit other transactions.
     * </pre>
     */
    public void parseTransaction(spacemesh.v1.TxTypes.ParseTransactionRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.TxTypes.ParseTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParseTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns current tx state for one or more txs which indicates if a tx is
     * on the mesh, on its way to the mesh or was rejected and will never get
     * to the mesh
     * </pre>
     */
    public void transactionsState(spacemesh.v1.TxTypes.TransactionsStateRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.TxTypes.TransactionsStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransactionsStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns tx state for one or more txs every time the tx state changes for
     * one of these txs
     * </pre>
     */
    public void transactionsStateStream(spacemesh.v1.TxTypes.TransactionsStateStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.TxTypes.TransactionsStateStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getTransactionsStateStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StreamResults streams historical data and watch live events with transaction results. 
     * </pre>
     */
    public void streamResults(spacemesh.v1.TxTypes.TransactionResultsRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.TxTypes.TransactionResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamResultsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TransactionService.
   * <pre>
   * Provides clients a way to submit a tx to the network for processing, and to
   * check or follow the "journey" of a tx from mempool to block inclusion to
   * mesh to STF processing. This service is separate from the Mesh and
   * GlobalState services because txs move across both.
   * </pre>
   */
  public static final class TransactionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TransactionServiceBlockingStub> {
    private TransactionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Submit a new tx to the node for processing. The response
     * TransactionState message contains both the txid of the new tx, as well
     * as whether or not it was admitted into the mempool.
     * </pre>
     */
    public spacemesh.v1.TxTypes.SubmitTransactionResponse submitTransaction(spacemesh.v1.TxTypes.SubmitTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ParseTransaction without submitting it to the mempool.
     * It has a limitation that it will work only for an already spawned accounts,
     * and for initial spawn transactions. Client is expected to wait until spawn transaction
     * executes before it will submit other transactions.
     * </pre>
     */
    public spacemesh.v1.TxTypes.ParseTransactionResponse parseTransaction(spacemesh.v1.TxTypes.ParseTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParseTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns current tx state for one or more txs which indicates if a tx is
     * on the mesh, on its way to the mesh or was rejected and will never get
     * to the mesh
     * </pre>
     */
    public spacemesh.v1.TxTypes.TransactionsStateResponse transactionsState(spacemesh.v1.TxTypes.TransactionsStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransactionsStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns tx state for one or more txs every time the tx state changes for
     * one of these txs
     * </pre>
     */
    public java.util.Iterator<spacemesh.v1.TxTypes.TransactionsStateStreamResponse> transactionsStateStream(
        spacemesh.v1.TxTypes.TransactionsStateStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getTransactionsStateStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StreamResults streams historical data and watch live events with transaction results. 
     * </pre>
     */
    public java.util.Iterator<spacemesh.v1.TxTypes.TransactionResult> streamResults(
        spacemesh.v1.TxTypes.TransactionResultsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamResultsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TransactionService.
   * <pre>
   * Provides clients a way to submit a tx to the network for processing, and to
   * check or follow the "journey" of a tx from mempool to block inclusion to
   * mesh to STF processing. This service is separate from the Mesh and
   * GlobalState services because txs move across both.
   * </pre>
   */
  public static final class TransactionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TransactionServiceFutureStub> {
    private TransactionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Submit a new tx to the node for processing. The response
     * TransactionState message contains both the txid of the new tx, as well
     * as whether or not it was admitted into the mempool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.TxTypes.SubmitTransactionResponse> submitTransaction(
        spacemesh.v1.TxTypes.SubmitTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ParseTransaction without submitting it to the mempool.
     * It has a limitation that it will work only for an already spawned accounts,
     * and for initial spawn transactions. Client is expected to wait until spawn transaction
     * executes before it will submit other transactions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.TxTypes.ParseTransactionResponse> parseTransaction(
        spacemesh.v1.TxTypes.ParseTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParseTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns current tx state for one or more txs which indicates if a tx is
     * on the mesh, on its way to the mesh or was rejected and will never get
     * to the mesh
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.TxTypes.TransactionsStateResponse> transactionsState(
        spacemesh.v1.TxTypes.TransactionsStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransactionsStateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBMIT_TRANSACTION = 0;
  private static final int METHODID_PARSE_TRANSACTION = 1;
  private static final int METHODID_TRANSACTIONS_STATE = 2;
  private static final int METHODID_TRANSACTIONS_STATE_STREAM = 3;
  private static final int METHODID_STREAM_RESULTS = 4;

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
        case METHODID_SUBMIT_TRANSACTION:
          serviceImpl.submitTransaction((spacemesh.v1.TxTypes.SubmitTransactionRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.TxTypes.SubmitTransactionResponse>) responseObserver);
          break;
        case METHODID_PARSE_TRANSACTION:
          serviceImpl.parseTransaction((spacemesh.v1.TxTypes.ParseTransactionRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.TxTypes.ParseTransactionResponse>) responseObserver);
          break;
        case METHODID_TRANSACTIONS_STATE:
          serviceImpl.transactionsState((spacemesh.v1.TxTypes.TransactionsStateRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.TxTypes.TransactionsStateResponse>) responseObserver);
          break;
        case METHODID_TRANSACTIONS_STATE_STREAM:
          serviceImpl.transactionsStateStream((spacemesh.v1.TxTypes.TransactionsStateStreamRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.TxTypes.TransactionsStateStreamResponse>) responseObserver);
          break;
        case METHODID_STREAM_RESULTS:
          serviceImpl.streamResults((spacemesh.v1.TxTypes.TransactionResultsRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.TxTypes.TransactionResult>) responseObserver);
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
          getSubmitTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.TxTypes.SubmitTransactionRequest,
              spacemesh.v1.TxTypes.SubmitTransactionResponse>(
                service, METHODID_SUBMIT_TRANSACTION)))
        .addMethod(
          getParseTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.TxTypes.ParseTransactionRequest,
              spacemesh.v1.TxTypes.ParseTransactionResponse>(
                service, METHODID_PARSE_TRANSACTION)))
        .addMethod(
          getTransactionsStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.TxTypes.TransactionsStateRequest,
              spacemesh.v1.TxTypes.TransactionsStateResponse>(
                service, METHODID_TRANSACTIONS_STATE)))
        .addMethod(
          getTransactionsStateStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              spacemesh.v1.TxTypes.TransactionsStateStreamRequest,
              spacemesh.v1.TxTypes.TransactionsStateStreamResponse>(
                service, METHODID_TRANSACTIONS_STATE_STREAM)))
        .addMethod(
          getStreamResultsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              spacemesh.v1.TxTypes.TransactionResultsRequest,
              spacemesh.v1.TxTypes.TransactionResult>(
                service, METHODID_STREAM_RESULTS)))
        .build();
  }

  private static abstract class TransactionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TransactionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return spacemesh.v1.Tx.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TransactionService");
    }
  }

  private static final class TransactionServiceFileDescriptorSupplier
      extends TransactionServiceBaseDescriptorSupplier {
    TransactionServiceFileDescriptorSupplier() {}
  }

  private static final class TransactionServiceMethodDescriptorSupplier
      extends TransactionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TransactionServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TransactionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TransactionServiceFileDescriptorSupplier())
              .addMethod(getSubmitTransactionMethod())
              .addMethod(getParseTransactionMethod())
              .addMethod(getTransactionsStateMethod())
              .addMethod(getTransactionsStateStreamMethod())
              .addMethod(getStreamResultsMethod())
              .build();
        }
      }
    }
    return result;
  }
}

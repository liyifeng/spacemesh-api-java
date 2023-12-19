package spacemesh.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: spacemesh/v1/smesher.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SmesherServiceGrpc {

  private SmesherServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "spacemesh.v1.SmesherService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.SmesherTypes.IsSmeshingResponse> getIsSmeshingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsSmeshing",
      requestType = com.google.protobuf.Empty.class,
      responseType = spacemesh.v1.SmesherTypes.IsSmeshingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.SmesherTypes.IsSmeshingResponse> getIsSmeshingMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, spacemesh.v1.SmesherTypes.IsSmeshingResponse> getIsSmeshingMethod;
    if ((getIsSmeshingMethod = SmesherServiceGrpc.getIsSmeshingMethod) == null) {
      synchronized (SmesherServiceGrpc.class) {
        if ((getIsSmeshingMethod = SmesherServiceGrpc.getIsSmeshingMethod) == null) {
          SmesherServiceGrpc.getIsSmeshingMethod = getIsSmeshingMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, spacemesh.v1.SmesherTypes.IsSmeshingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsSmeshing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.SmesherTypes.IsSmeshingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmesherServiceMethodDescriptorSupplier("IsSmeshing"))
              .build();
        }
      }
    }
    return getIsSmeshingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.SmesherTypes.StartSmeshingRequest,
      spacemesh.v1.SmesherTypes.StartSmeshingResponse> getStartSmeshingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartSmeshing",
      requestType = spacemesh.v1.SmesherTypes.StartSmeshingRequest.class,
      responseType = spacemesh.v1.SmesherTypes.StartSmeshingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.SmesherTypes.StartSmeshingRequest,
      spacemesh.v1.SmesherTypes.StartSmeshingResponse> getStartSmeshingMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.SmesherTypes.StartSmeshingRequest, spacemesh.v1.SmesherTypes.StartSmeshingResponse> getStartSmeshingMethod;
    if ((getStartSmeshingMethod = SmesherServiceGrpc.getStartSmeshingMethod) == null) {
      synchronized (SmesherServiceGrpc.class) {
        if ((getStartSmeshingMethod = SmesherServiceGrpc.getStartSmeshingMethod) == null) {
          SmesherServiceGrpc.getStartSmeshingMethod = getStartSmeshingMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.SmesherTypes.StartSmeshingRequest, spacemesh.v1.SmesherTypes.StartSmeshingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartSmeshing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.SmesherTypes.StartSmeshingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.SmesherTypes.StartSmeshingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmesherServiceMethodDescriptorSupplier("StartSmeshing"))
              .build();
        }
      }
    }
    return getStartSmeshingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.SmesherTypes.StopSmeshingRequest,
      spacemesh.v1.SmesherTypes.StopSmeshingResponse> getStopSmeshingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopSmeshing",
      requestType = spacemesh.v1.SmesherTypes.StopSmeshingRequest.class,
      responseType = spacemesh.v1.SmesherTypes.StopSmeshingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.SmesherTypes.StopSmeshingRequest,
      spacemesh.v1.SmesherTypes.StopSmeshingResponse> getStopSmeshingMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.SmesherTypes.StopSmeshingRequest, spacemesh.v1.SmesherTypes.StopSmeshingResponse> getStopSmeshingMethod;
    if ((getStopSmeshingMethod = SmesherServiceGrpc.getStopSmeshingMethod) == null) {
      synchronized (SmesherServiceGrpc.class) {
        if ((getStopSmeshingMethod = SmesherServiceGrpc.getStopSmeshingMethod) == null) {
          SmesherServiceGrpc.getStopSmeshingMethod = getStopSmeshingMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.SmesherTypes.StopSmeshingRequest, spacemesh.v1.SmesherTypes.StopSmeshingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopSmeshing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.SmesherTypes.StopSmeshingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.SmesherTypes.StopSmeshingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmesherServiceMethodDescriptorSupplier("StopSmeshing"))
              .build();
        }
      }
    }
    return getStopSmeshingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.SmesherTypes.SmesherIDResponse> getSmesherIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SmesherID",
      requestType = com.google.protobuf.Empty.class,
      responseType = spacemesh.v1.SmesherTypes.SmesherIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.SmesherTypes.SmesherIDResponse> getSmesherIDMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, spacemesh.v1.SmesherTypes.SmesherIDResponse> getSmesherIDMethod;
    if ((getSmesherIDMethod = SmesherServiceGrpc.getSmesherIDMethod) == null) {
      synchronized (SmesherServiceGrpc.class) {
        if ((getSmesherIDMethod = SmesherServiceGrpc.getSmesherIDMethod) == null) {
          SmesherServiceGrpc.getSmesherIDMethod = getSmesherIDMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, spacemesh.v1.SmesherTypes.SmesherIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SmesherID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.SmesherTypes.SmesherIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmesherServiceMethodDescriptorSupplier("SmesherID"))
              .build();
        }
      }
    }
    return getSmesherIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.SmesherTypes.CoinbaseResponse> getCoinbaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Coinbase",
      requestType = com.google.protobuf.Empty.class,
      responseType = spacemesh.v1.SmesherTypes.CoinbaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.SmesherTypes.CoinbaseResponse> getCoinbaseMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, spacemesh.v1.SmesherTypes.CoinbaseResponse> getCoinbaseMethod;
    if ((getCoinbaseMethod = SmesherServiceGrpc.getCoinbaseMethod) == null) {
      synchronized (SmesherServiceGrpc.class) {
        if ((getCoinbaseMethod = SmesherServiceGrpc.getCoinbaseMethod) == null) {
          SmesherServiceGrpc.getCoinbaseMethod = getCoinbaseMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, spacemesh.v1.SmesherTypes.CoinbaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Coinbase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.SmesherTypes.CoinbaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmesherServiceMethodDescriptorSupplier("Coinbase"))
              .build();
        }
      }
    }
    return getCoinbaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.SmesherTypes.SetCoinbaseRequest,
      spacemesh.v1.SmesherTypes.SetCoinbaseResponse> getSetCoinbaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetCoinbase",
      requestType = spacemesh.v1.SmesherTypes.SetCoinbaseRequest.class,
      responseType = spacemesh.v1.SmesherTypes.SetCoinbaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.SmesherTypes.SetCoinbaseRequest,
      spacemesh.v1.SmesherTypes.SetCoinbaseResponse> getSetCoinbaseMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.SmesherTypes.SetCoinbaseRequest, spacemesh.v1.SmesherTypes.SetCoinbaseResponse> getSetCoinbaseMethod;
    if ((getSetCoinbaseMethod = SmesherServiceGrpc.getSetCoinbaseMethod) == null) {
      synchronized (SmesherServiceGrpc.class) {
        if ((getSetCoinbaseMethod = SmesherServiceGrpc.getSetCoinbaseMethod) == null) {
          SmesherServiceGrpc.getSetCoinbaseMethod = getSetCoinbaseMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.SmesherTypes.SetCoinbaseRequest, spacemesh.v1.SmesherTypes.SetCoinbaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetCoinbase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.SmesherTypes.SetCoinbaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.SmesherTypes.SetCoinbaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmesherServiceMethodDescriptorSupplier("SetCoinbase"))
              .build();
        }
      }
    }
    return getSetCoinbaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.SmesherTypes.MinGasResponse> getMinGasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MinGas",
      requestType = com.google.protobuf.Empty.class,
      responseType = spacemesh.v1.SmesherTypes.MinGasResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.SmesherTypes.MinGasResponse> getMinGasMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, spacemesh.v1.SmesherTypes.MinGasResponse> getMinGasMethod;
    if ((getMinGasMethod = SmesherServiceGrpc.getMinGasMethod) == null) {
      synchronized (SmesherServiceGrpc.class) {
        if ((getMinGasMethod = SmesherServiceGrpc.getMinGasMethod) == null) {
          SmesherServiceGrpc.getMinGasMethod = getMinGasMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, spacemesh.v1.SmesherTypes.MinGasResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MinGas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.SmesherTypes.MinGasResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmesherServiceMethodDescriptorSupplier("MinGas"))
              .build();
        }
      }
    }
    return getMinGasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.SmesherTypes.SetMinGasRequest,
      spacemesh.v1.SmesherTypes.SetMinGasResponse> getSetMinGasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetMinGas",
      requestType = spacemesh.v1.SmesherTypes.SetMinGasRequest.class,
      responseType = spacemesh.v1.SmesherTypes.SetMinGasResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.SmesherTypes.SetMinGasRequest,
      spacemesh.v1.SmesherTypes.SetMinGasResponse> getSetMinGasMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.SmesherTypes.SetMinGasRequest, spacemesh.v1.SmesherTypes.SetMinGasResponse> getSetMinGasMethod;
    if ((getSetMinGasMethod = SmesherServiceGrpc.getSetMinGasMethod) == null) {
      synchronized (SmesherServiceGrpc.class) {
        if ((getSetMinGasMethod = SmesherServiceGrpc.getSetMinGasMethod) == null) {
          SmesherServiceGrpc.getSetMinGasMethod = getSetMinGasMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.SmesherTypes.SetMinGasRequest, spacemesh.v1.SmesherTypes.SetMinGasResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetMinGas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.SmesherTypes.SetMinGasRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.SmesherTypes.SetMinGasResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmesherServiceMethodDescriptorSupplier("SetMinGas"))
              .build();
        }
      }
    }
    return getSetMinGasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.SmesherTypes.EstimatedRewardsRequest,
      spacemesh.v1.SmesherTypes.EstimatedRewardsResponse> getEstimatedRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimatedRewards",
      requestType = spacemesh.v1.SmesherTypes.EstimatedRewardsRequest.class,
      responseType = spacemesh.v1.SmesherTypes.EstimatedRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.SmesherTypes.EstimatedRewardsRequest,
      spacemesh.v1.SmesherTypes.EstimatedRewardsResponse> getEstimatedRewardsMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.SmesherTypes.EstimatedRewardsRequest, spacemesh.v1.SmesherTypes.EstimatedRewardsResponse> getEstimatedRewardsMethod;
    if ((getEstimatedRewardsMethod = SmesherServiceGrpc.getEstimatedRewardsMethod) == null) {
      synchronized (SmesherServiceGrpc.class) {
        if ((getEstimatedRewardsMethod = SmesherServiceGrpc.getEstimatedRewardsMethod) == null) {
          SmesherServiceGrpc.getEstimatedRewardsMethod = getEstimatedRewardsMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.SmesherTypes.EstimatedRewardsRequest, spacemesh.v1.SmesherTypes.EstimatedRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimatedRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.SmesherTypes.EstimatedRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.SmesherTypes.EstimatedRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmesherServiceMethodDescriptorSupplier("EstimatedRewards"))
              .build();
        }
      }
    }
    return getEstimatedRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.SmesherTypes.PostSetupStatusResponse> getPostSetupStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostSetupStatus",
      requestType = com.google.protobuf.Empty.class,
      responseType = spacemesh.v1.SmesherTypes.PostSetupStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.SmesherTypes.PostSetupStatusResponse> getPostSetupStatusMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, spacemesh.v1.SmesherTypes.PostSetupStatusResponse> getPostSetupStatusMethod;
    if ((getPostSetupStatusMethod = SmesherServiceGrpc.getPostSetupStatusMethod) == null) {
      synchronized (SmesherServiceGrpc.class) {
        if ((getPostSetupStatusMethod = SmesherServiceGrpc.getPostSetupStatusMethod) == null) {
          SmesherServiceGrpc.getPostSetupStatusMethod = getPostSetupStatusMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, spacemesh.v1.SmesherTypes.PostSetupStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostSetupStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.SmesherTypes.PostSetupStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmesherServiceMethodDescriptorSupplier("PostSetupStatus"))
              .build();
        }
      }
    }
    return getPostSetupStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.SmesherTypes.PostSetupStatusStreamResponse> getPostSetupStatusStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostSetupStatusStream",
      requestType = com.google.protobuf.Empty.class,
      responseType = spacemesh.v1.SmesherTypes.PostSetupStatusStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.SmesherTypes.PostSetupStatusStreamResponse> getPostSetupStatusStreamMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, spacemesh.v1.SmesherTypes.PostSetupStatusStreamResponse> getPostSetupStatusStreamMethod;
    if ((getPostSetupStatusStreamMethod = SmesherServiceGrpc.getPostSetupStatusStreamMethod) == null) {
      synchronized (SmesherServiceGrpc.class) {
        if ((getPostSetupStatusStreamMethod = SmesherServiceGrpc.getPostSetupStatusStreamMethod) == null) {
          SmesherServiceGrpc.getPostSetupStatusStreamMethod = getPostSetupStatusStreamMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, spacemesh.v1.SmesherTypes.PostSetupStatusStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostSetupStatusStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.SmesherTypes.PostSetupStatusStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmesherServiceMethodDescriptorSupplier("PostSetupStatusStream"))
              .build();
        }
      }
    }
    return getPostSetupStatusStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.SmesherTypes.PostSetupProvidersRequest,
      spacemesh.v1.SmesherTypes.PostSetupProvidersResponse> getPostSetupProvidersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostSetupProviders",
      requestType = spacemesh.v1.SmesherTypes.PostSetupProvidersRequest.class,
      responseType = spacemesh.v1.SmesherTypes.PostSetupProvidersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.SmesherTypes.PostSetupProvidersRequest,
      spacemesh.v1.SmesherTypes.PostSetupProvidersResponse> getPostSetupProvidersMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.SmesherTypes.PostSetupProvidersRequest, spacemesh.v1.SmesherTypes.PostSetupProvidersResponse> getPostSetupProvidersMethod;
    if ((getPostSetupProvidersMethod = SmesherServiceGrpc.getPostSetupProvidersMethod) == null) {
      synchronized (SmesherServiceGrpc.class) {
        if ((getPostSetupProvidersMethod = SmesherServiceGrpc.getPostSetupProvidersMethod) == null) {
          SmesherServiceGrpc.getPostSetupProvidersMethod = getPostSetupProvidersMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.SmesherTypes.PostSetupProvidersRequest, spacemesh.v1.SmesherTypes.PostSetupProvidersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostSetupProviders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.SmesherTypes.PostSetupProvidersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.SmesherTypes.PostSetupProvidersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmesherServiceMethodDescriptorSupplier("PostSetupProviders"))
              .build();
        }
      }
    }
    return getPostSetupProvidersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.SmesherTypes.PostConfigResponse> getPostConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostConfig",
      requestType = com.google.protobuf.Empty.class,
      responseType = spacemesh.v1.SmesherTypes.PostConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      spacemesh.v1.SmesherTypes.PostConfigResponse> getPostConfigMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, spacemesh.v1.SmesherTypes.PostConfigResponse> getPostConfigMethod;
    if ((getPostConfigMethod = SmesherServiceGrpc.getPostConfigMethod) == null) {
      synchronized (SmesherServiceGrpc.class) {
        if ((getPostConfigMethod = SmesherServiceGrpc.getPostConfigMethod) == null) {
          SmesherServiceGrpc.getPostConfigMethod = getPostConfigMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, spacemesh.v1.SmesherTypes.PostConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.SmesherTypes.PostConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmesherServiceMethodDescriptorSupplier("PostConfig"))
              .build();
        }
      }
    }
    return getPostConfigMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmesherServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmesherServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmesherServiceStub>() {
        @java.lang.Override
        public SmesherServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmesherServiceStub(channel, callOptions);
        }
      };
    return SmesherServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmesherServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmesherServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmesherServiceBlockingStub>() {
        @java.lang.Override
        public SmesherServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmesherServiceBlockingStub(channel, callOptions);
        }
      };
    return SmesherServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmesherServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmesherServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmesherServiceFutureStub>() {
        @java.lang.Override
        public SmesherServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmesherServiceFutureStub(channel, callOptions);
        }
      };
    return SmesherServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns true iff node is currently smeshing
     * </pre>
     */
    default void isSmeshing(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.IsSmeshingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsSmeshingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Starts smeshing, after completing the post setup.
     * Changing of the post setup options (e.g., number of units), after initial setup, is supported.
     * Returns success if request is accepted by node , failure if it fails
     * </pre>
     */
    default void startSmeshing(spacemesh.v1.SmesherTypes.StartSmeshingRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.StartSmeshingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartSmeshingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stops smeshing, or the preceding post setup session, and optionally attempt to
     * delete the post setup data files(s).
     * Returns success if request is accepted by node, failure if it fails
     * </pre>
     */
    default void stopSmeshing(spacemesh.v1.SmesherTypes.StopSmeshingRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.StopSmeshingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopSmeshingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the current smesher id generated by the node
     * </pre>
     */
    default void smesherID(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.SmesherIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSmesherIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the current coinbase
     * </pre>
     */
    default void coinbase(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.CoinbaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCoinbaseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set the coinbase
     * Returns success if request succeeds, failure if it fails
     * </pre>
     */
    default void setCoinbase(spacemesh.v1.SmesherTypes.SetCoinbaseRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.SetCoinbaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetCoinbaseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the current min gas for including txs in blocks by this smesher
     * </pre>
     */
    default void minGas(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.MinGasResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMinGasMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set a min gas units for including txs in blocks by this smesher
     * Returns success if request succeeds, failure if it fails
     * </pre>
     */
    default void setMinGas(spacemesh.v1.SmesherTypes.SetMinGasRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.SetMinGasResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetMinGasMethod(), responseObserver);
    }

    /**
     * <pre>
     * Estimate smeshing rewards over the next upcoming epoch
     * </pre>
     */
    default void estimatedRewards(spacemesh.v1.SmesherTypes.EstimatedRewardsRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.EstimatedRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimatedRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the Post setup status
     * </pre>
     */
    default void postSetupStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.PostSetupStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostSetupStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a stream of updates for the Post setup status
     * </pre>
     */
    default void postSetupStatusStream(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.PostSetupStatusStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostSetupStatusStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of available Post setup providers
     * </pre>
     */
    default void postSetupProviders(spacemesh.v1.SmesherTypes.PostSetupProvidersRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.PostSetupProvidersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostSetupProvidersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the Post protocol config
     * </pre>
     */
    default void postConfig(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.PostConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostConfigMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SmesherService.
   */
  public static abstract class SmesherServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SmesherServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SmesherService.
   */
  public static final class SmesherServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SmesherServiceStub> {
    private SmesherServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmesherServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmesherServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns true iff node is currently smeshing
     * </pre>
     */
    public void isSmeshing(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.IsSmeshingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsSmeshingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts smeshing, after completing the post setup.
     * Changing of the post setup options (e.g., number of units), after initial setup, is supported.
     * Returns success if request is accepted by node , failure if it fails
     * </pre>
     */
    public void startSmeshing(spacemesh.v1.SmesherTypes.StartSmeshingRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.StartSmeshingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartSmeshingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stops smeshing, or the preceding post setup session, and optionally attempt to
     * delete the post setup data files(s).
     * Returns success if request is accepted by node, failure if it fails
     * </pre>
     */
    public void stopSmeshing(spacemesh.v1.SmesherTypes.StopSmeshingRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.StopSmeshingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopSmeshingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the current smesher id generated by the node
     * </pre>
     */
    public void smesherID(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.SmesherIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSmesherIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the current coinbase
     * </pre>
     */
    public void coinbase(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.CoinbaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCoinbaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set the coinbase
     * Returns success if request succeeds, failure if it fails
     * </pre>
     */
    public void setCoinbase(spacemesh.v1.SmesherTypes.SetCoinbaseRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.SetCoinbaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetCoinbaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the current min gas for including txs in blocks by this smesher
     * </pre>
     */
    public void minGas(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.MinGasResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMinGasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set a min gas units for including txs in blocks by this smesher
     * Returns success if request succeeds, failure if it fails
     * </pre>
     */
    public void setMinGas(spacemesh.v1.SmesherTypes.SetMinGasRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.SetMinGasResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetMinGasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Estimate smeshing rewards over the next upcoming epoch
     * </pre>
     */
    public void estimatedRewards(spacemesh.v1.SmesherTypes.EstimatedRewardsRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.EstimatedRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimatedRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the Post setup status
     * </pre>
     */
    public void postSetupStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.PostSetupStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostSetupStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a stream of updates for the Post setup status
     * </pre>
     */
    public void postSetupStatusStream(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.PostSetupStatusStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getPostSetupStatusStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of available Post setup providers
     * </pre>
     */
    public void postSetupProviders(spacemesh.v1.SmesherTypes.PostSetupProvidersRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.PostSetupProvidersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostSetupProvidersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the Post protocol config
     * </pre>
     */
    public void postConfig(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.PostConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostConfigMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SmesherService.
   */
  public static final class SmesherServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SmesherServiceBlockingStub> {
    private SmesherServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmesherServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmesherServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns true iff node is currently smeshing
     * </pre>
     */
    public spacemesh.v1.SmesherTypes.IsSmeshingResponse isSmeshing(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsSmeshingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts smeshing, after completing the post setup.
     * Changing of the post setup options (e.g., number of units), after initial setup, is supported.
     * Returns success if request is accepted by node , failure if it fails
     * </pre>
     */
    public spacemesh.v1.SmesherTypes.StartSmeshingResponse startSmeshing(spacemesh.v1.SmesherTypes.StartSmeshingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartSmeshingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stops smeshing, or the preceding post setup session, and optionally attempt to
     * delete the post setup data files(s).
     * Returns success if request is accepted by node, failure if it fails
     * </pre>
     */
    public spacemesh.v1.SmesherTypes.StopSmeshingResponse stopSmeshing(spacemesh.v1.SmesherTypes.StopSmeshingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopSmeshingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the current smesher id generated by the node
     * </pre>
     */
    public spacemesh.v1.SmesherTypes.SmesherIDResponse smesherID(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSmesherIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the current coinbase
     * </pre>
     */
    public spacemesh.v1.SmesherTypes.CoinbaseResponse coinbase(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCoinbaseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the coinbase
     * Returns success if request succeeds, failure if it fails
     * </pre>
     */
    public spacemesh.v1.SmesherTypes.SetCoinbaseResponse setCoinbase(spacemesh.v1.SmesherTypes.SetCoinbaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetCoinbaseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the current min gas for including txs in blocks by this smesher
     * </pre>
     */
    public spacemesh.v1.SmesherTypes.MinGasResponse minGas(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMinGasMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set a min gas units for including txs in blocks by this smesher
     * Returns success if request succeeds, failure if it fails
     * </pre>
     */
    public spacemesh.v1.SmesherTypes.SetMinGasResponse setMinGas(spacemesh.v1.SmesherTypes.SetMinGasRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetMinGasMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Estimate smeshing rewards over the next upcoming epoch
     * </pre>
     */
    public spacemesh.v1.SmesherTypes.EstimatedRewardsResponse estimatedRewards(spacemesh.v1.SmesherTypes.EstimatedRewardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimatedRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the Post setup status
     * </pre>
     */
    public spacemesh.v1.SmesherTypes.PostSetupStatusResponse postSetupStatus(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostSetupStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a stream of updates for the Post setup status
     * </pre>
     */
    public java.util.Iterator<spacemesh.v1.SmesherTypes.PostSetupStatusStreamResponse> postSetupStatusStream(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getPostSetupStatusStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of available Post setup providers
     * </pre>
     */
    public spacemesh.v1.SmesherTypes.PostSetupProvidersResponse postSetupProviders(spacemesh.v1.SmesherTypes.PostSetupProvidersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostSetupProvidersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the Post protocol config
     * </pre>
     */
    public spacemesh.v1.SmesherTypes.PostConfigResponse postConfig(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SmesherService.
   */
  public static final class SmesherServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SmesherServiceFutureStub> {
    private SmesherServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmesherServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmesherServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns true iff node is currently smeshing
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.SmesherTypes.IsSmeshingResponse> isSmeshing(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsSmeshingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts smeshing, after completing the post setup.
     * Changing of the post setup options (e.g., number of units), after initial setup, is supported.
     * Returns success if request is accepted by node , failure if it fails
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.SmesherTypes.StartSmeshingResponse> startSmeshing(
        spacemesh.v1.SmesherTypes.StartSmeshingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartSmeshingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stops smeshing, or the preceding post setup session, and optionally attempt to
     * delete the post setup data files(s).
     * Returns success if request is accepted by node, failure if it fails
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.SmesherTypes.StopSmeshingResponse> stopSmeshing(
        spacemesh.v1.SmesherTypes.StopSmeshingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopSmeshingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the current smesher id generated by the node
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.SmesherTypes.SmesherIDResponse> smesherID(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSmesherIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the current coinbase
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.SmesherTypes.CoinbaseResponse> coinbase(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCoinbaseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set the coinbase
     * Returns success if request succeeds, failure if it fails
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.SmesherTypes.SetCoinbaseResponse> setCoinbase(
        spacemesh.v1.SmesherTypes.SetCoinbaseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetCoinbaseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the current min gas for including txs in blocks by this smesher
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.SmesherTypes.MinGasResponse> minGas(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMinGasMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set a min gas units for including txs in blocks by this smesher
     * Returns success if request succeeds, failure if it fails
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.SmesherTypes.SetMinGasResponse> setMinGas(
        spacemesh.v1.SmesherTypes.SetMinGasRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetMinGasMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Estimate smeshing rewards over the next upcoming epoch
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.SmesherTypes.EstimatedRewardsResponse> estimatedRewards(
        spacemesh.v1.SmesherTypes.EstimatedRewardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimatedRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the Post setup status
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.SmesherTypes.PostSetupStatusResponse> postSetupStatus(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostSetupStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of available Post setup providers
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.SmesherTypes.PostSetupProvidersResponse> postSetupProviders(
        spacemesh.v1.SmesherTypes.PostSetupProvidersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostSetupProvidersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the Post protocol config
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.SmesherTypes.PostConfigResponse> postConfig(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostConfigMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_IS_SMESHING = 0;
  private static final int METHODID_START_SMESHING = 1;
  private static final int METHODID_STOP_SMESHING = 2;
  private static final int METHODID_SMESHER_ID = 3;
  private static final int METHODID_COINBASE = 4;
  private static final int METHODID_SET_COINBASE = 5;
  private static final int METHODID_MIN_GAS = 6;
  private static final int METHODID_SET_MIN_GAS = 7;
  private static final int METHODID_ESTIMATED_REWARDS = 8;
  private static final int METHODID_POST_SETUP_STATUS = 9;
  private static final int METHODID_POST_SETUP_STATUS_STREAM = 10;
  private static final int METHODID_POST_SETUP_PROVIDERS = 11;
  private static final int METHODID_POST_CONFIG = 12;

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
        case METHODID_IS_SMESHING:
          serviceImpl.isSmeshing((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.IsSmeshingResponse>) responseObserver);
          break;
        case METHODID_START_SMESHING:
          serviceImpl.startSmeshing((spacemesh.v1.SmesherTypes.StartSmeshingRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.StartSmeshingResponse>) responseObserver);
          break;
        case METHODID_STOP_SMESHING:
          serviceImpl.stopSmeshing((spacemesh.v1.SmesherTypes.StopSmeshingRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.StopSmeshingResponse>) responseObserver);
          break;
        case METHODID_SMESHER_ID:
          serviceImpl.smesherID((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.SmesherIDResponse>) responseObserver);
          break;
        case METHODID_COINBASE:
          serviceImpl.coinbase((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.CoinbaseResponse>) responseObserver);
          break;
        case METHODID_SET_COINBASE:
          serviceImpl.setCoinbase((spacemesh.v1.SmesherTypes.SetCoinbaseRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.SetCoinbaseResponse>) responseObserver);
          break;
        case METHODID_MIN_GAS:
          serviceImpl.minGas((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.MinGasResponse>) responseObserver);
          break;
        case METHODID_SET_MIN_GAS:
          serviceImpl.setMinGas((spacemesh.v1.SmesherTypes.SetMinGasRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.SetMinGasResponse>) responseObserver);
          break;
        case METHODID_ESTIMATED_REWARDS:
          serviceImpl.estimatedRewards((spacemesh.v1.SmesherTypes.EstimatedRewardsRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.EstimatedRewardsResponse>) responseObserver);
          break;
        case METHODID_POST_SETUP_STATUS:
          serviceImpl.postSetupStatus((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.PostSetupStatusResponse>) responseObserver);
          break;
        case METHODID_POST_SETUP_STATUS_STREAM:
          serviceImpl.postSetupStatusStream((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.PostSetupStatusStreamResponse>) responseObserver);
          break;
        case METHODID_POST_SETUP_PROVIDERS:
          serviceImpl.postSetupProviders((spacemesh.v1.SmesherTypes.PostSetupProvidersRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.PostSetupProvidersResponse>) responseObserver);
          break;
        case METHODID_POST_CONFIG:
          serviceImpl.postConfig((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.SmesherTypes.PostConfigResponse>) responseObserver);
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
          getIsSmeshingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              spacemesh.v1.SmesherTypes.IsSmeshingResponse>(
                service, METHODID_IS_SMESHING)))
        .addMethod(
          getStartSmeshingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.SmesherTypes.StartSmeshingRequest,
              spacemesh.v1.SmesherTypes.StartSmeshingResponse>(
                service, METHODID_START_SMESHING)))
        .addMethod(
          getStopSmeshingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.SmesherTypes.StopSmeshingRequest,
              spacemesh.v1.SmesherTypes.StopSmeshingResponse>(
                service, METHODID_STOP_SMESHING)))
        .addMethod(
          getSmesherIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              spacemesh.v1.SmesherTypes.SmesherIDResponse>(
                service, METHODID_SMESHER_ID)))
        .addMethod(
          getCoinbaseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              spacemesh.v1.SmesherTypes.CoinbaseResponse>(
                service, METHODID_COINBASE)))
        .addMethod(
          getSetCoinbaseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.SmesherTypes.SetCoinbaseRequest,
              spacemesh.v1.SmesherTypes.SetCoinbaseResponse>(
                service, METHODID_SET_COINBASE)))
        .addMethod(
          getMinGasMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              spacemesh.v1.SmesherTypes.MinGasResponse>(
                service, METHODID_MIN_GAS)))
        .addMethod(
          getSetMinGasMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.SmesherTypes.SetMinGasRequest,
              spacemesh.v1.SmesherTypes.SetMinGasResponse>(
                service, METHODID_SET_MIN_GAS)))
        .addMethod(
          getEstimatedRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.SmesherTypes.EstimatedRewardsRequest,
              spacemesh.v1.SmesherTypes.EstimatedRewardsResponse>(
                service, METHODID_ESTIMATED_REWARDS)))
        .addMethod(
          getPostSetupStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              spacemesh.v1.SmesherTypes.PostSetupStatusResponse>(
                service, METHODID_POST_SETUP_STATUS)))
        .addMethod(
          getPostSetupStatusStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              spacemesh.v1.SmesherTypes.PostSetupStatusStreamResponse>(
                service, METHODID_POST_SETUP_STATUS_STREAM)))
        .addMethod(
          getPostSetupProvidersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.SmesherTypes.PostSetupProvidersRequest,
              spacemesh.v1.SmesherTypes.PostSetupProvidersResponse>(
                service, METHODID_POST_SETUP_PROVIDERS)))
        .addMethod(
          getPostConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              spacemesh.v1.SmesherTypes.PostConfigResponse>(
                service, METHODID_POST_CONFIG)))
        .build();
  }

  private static abstract class SmesherServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmesherServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return spacemesh.v1.Smesher.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmesherService");
    }
  }

  private static final class SmesherServiceFileDescriptorSupplier
      extends SmesherServiceBaseDescriptorSupplier {
    SmesherServiceFileDescriptorSupplier() {}
  }

  private static final class SmesherServiceMethodDescriptorSupplier
      extends SmesherServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SmesherServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SmesherServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmesherServiceFileDescriptorSupplier())
              .addMethod(getIsSmeshingMethod())
              .addMethod(getStartSmeshingMethod())
              .addMethod(getStopSmeshingMethod())
              .addMethod(getSmesherIDMethod())
              .addMethod(getCoinbaseMethod())
              .addMethod(getSetCoinbaseMethod())
              .addMethod(getMinGasMethod())
              .addMethod(getSetMinGasMethod())
              .addMethod(getEstimatedRewardsMethod())
              .addMethod(getPostSetupStatusMethod())
              .addMethod(getPostSetupStatusStreamMethod())
              .addMethod(getPostSetupProvidersMethod())
              .addMethod(getPostConfigMethod())
              .build();
        }
      }
    }
    return result;
  }
}

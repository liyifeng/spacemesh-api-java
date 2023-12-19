package spacemesh.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Readonly API for basic mesh info
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: spacemesh/v1/mesh.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MeshServiceGrpc {

  private MeshServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "spacemesh.v1.MeshService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.GenesisTimeRequest,
      spacemesh.v1.MeshTypes.GenesisTimeResponse> getGenesisTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenesisTime",
      requestType = spacemesh.v1.MeshTypes.GenesisTimeRequest.class,
      responseType = spacemesh.v1.MeshTypes.GenesisTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.GenesisTimeRequest,
      spacemesh.v1.MeshTypes.GenesisTimeResponse> getGenesisTimeMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.GenesisTimeRequest, spacemesh.v1.MeshTypes.GenesisTimeResponse> getGenesisTimeMethod;
    if ((getGenesisTimeMethod = MeshServiceGrpc.getGenesisTimeMethod) == null) {
      synchronized (MeshServiceGrpc.class) {
        if ((getGenesisTimeMethod = MeshServiceGrpc.getGenesisTimeMethod) == null) {
          MeshServiceGrpc.getGenesisTimeMethod = getGenesisTimeMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.MeshTypes.GenesisTimeRequest, spacemesh.v1.MeshTypes.GenesisTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenesisTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.GenesisTimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.GenesisTimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeshServiceMethodDescriptorSupplier("GenesisTime"))
              .build();
        }
      }
    }
    return getGenesisTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.CurrentLayerRequest,
      spacemesh.v1.MeshTypes.CurrentLayerResponse> getCurrentLayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CurrentLayer",
      requestType = spacemesh.v1.MeshTypes.CurrentLayerRequest.class,
      responseType = spacemesh.v1.MeshTypes.CurrentLayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.CurrentLayerRequest,
      spacemesh.v1.MeshTypes.CurrentLayerResponse> getCurrentLayerMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.CurrentLayerRequest, spacemesh.v1.MeshTypes.CurrentLayerResponse> getCurrentLayerMethod;
    if ((getCurrentLayerMethod = MeshServiceGrpc.getCurrentLayerMethod) == null) {
      synchronized (MeshServiceGrpc.class) {
        if ((getCurrentLayerMethod = MeshServiceGrpc.getCurrentLayerMethod) == null) {
          MeshServiceGrpc.getCurrentLayerMethod = getCurrentLayerMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.MeshTypes.CurrentLayerRequest, spacemesh.v1.MeshTypes.CurrentLayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CurrentLayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.CurrentLayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.CurrentLayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeshServiceMethodDescriptorSupplier("CurrentLayer"))
              .build();
        }
      }
    }
    return getCurrentLayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.CurrentEpochRequest,
      spacemesh.v1.MeshTypes.CurrentEpochResponse> getCurrentEpochMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CurrentEpoch",
      requestType = spacemesh.v1.MeshTypes.CurrentEpochRequest.class,
      responseType = spacemesh.v1.MeshTypes.CurrentEpochResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.CurrentEpochRequest,
      spacemesh.v1.MeshTypes.CurrentEpochResponse> getCurrentEpochMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.CurrentEpochRequest, spacemesh.v1.MeshTypes.CurrentEpochResponse> getCurrentEpochMethod;
    if ((getCurrentEpochMethod = MeshServiceGrpc.getCurrentEpochMethod) == null) {
      synchronized (MeshServiceGrpc.class) {
        if ((getCurrentEpochMethod = MeshServiceGrpc.getCurrentEpochMethod) == null) {
          MeshServiceGrpc.getCurrentEpochMethod = getCurrentEpochMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.MeshTypes.CurrentEpochRequest, spacemesh.v1.MeshTypes.CurrentEpochResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CurrentEpoch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.CurrentEpochRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.CurrentEpochResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeshServiceMethodDescriptorSupplier("CurrentEpoch"))
              .build();
        }
      }
    }
    return getCurrentEpochMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.GenesisIDRequest,
      spacemesh.v1.MeshTypes.GenesisIDResponse> getGenesisIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenesisID",
      requestType = spacemesh.v1.MeshTypes.GenesisIDRequest.class,
      responseType = spacemesh.v1.MeshTypes.GenesisIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.GenesisIDRequest,
      spacemesh.v1.MeshTypes.GenesisIDResponse> getGenesisIDMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.GenesisIDRequest, spacemesh.v1.MeshTypes.GenesisIDResponse> getGenesisIDMethod;
    if ((getGenesisIDMethod = MeshServiceGrpc.getGenesisIDMethod) == null) {
      synchronized (MeshServiceGrpc.class) {
        if ((getGenesisIDMethod = MeshServiceGrpc.getGenesisIDMethod) == null) {
          MeshServiceGrpc.getGenesisIDMethod = getGenesisIDMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.MeshTypes.GenesisIDRequest, spacemesh.v1.MeshTypes.GenesisIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenesisID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.GenesisIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.GenesisIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeshServiceMethodDescriptorSupplier("GenesisID"))
              .build();
        }
      }
    }
    return getGenesisIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.EpochNumLayersRequest,
      spacemesh.v1.MeshTypes.EpochNumLayersResponse> getEpochNumLayersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EpochNumLayers",
      requestType = spacemesh.v1.MeshTypes.EpochNumLayersRequest.class,
      responseType = spacemesh.v1.MeshTypes.EpochNumLayersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.EpochNumLayersRequest,
      spacemesh.v1.MeshTypes.EpochNumLayersResponse> getEpochNumLayersMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.EpochNumLayersRequest, spacemesh.v1.MeshTypes.EpochNumLayersResponse> getEpochNumLayersMethod;
    if ((getEpochNumLayersMethod = MeshServiceGrpc.getEpochNumLayersMethod) == null) {
      synchronized (MeshServiceGrpc.class) {
        if ((getEpochNumLayersMethod = MeshServiceGrpc.getEpochNumLayersMethod) == null) {
          MeshServiceGrpc.getEpochNumLayersMethod = getEpochNumLayersMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.MeshTypes.EpochNumLayersRequest, spacemesh.v1.MeshTypes.EpochNumLayersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EpochNumLayers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.EpochNumLayersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.EpochNumLayersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeshServiceMethodDescriptorSupplier("EpochNumLayers"))
              .build();
        }
      }
    }
    return getEpochNumLayersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.LayerDurationRequest,
      spacemesh.v1.MeshTypes.LayerDurationResponse> getLayerDurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LayerDuration",
      requestType = spacemesh.v1.MeshTypes.LayerDurationRequest.class,
      responseType = spacemesh.v1.MeshTypes.LayerDurationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.LayerDurationRequest,
      spacemesh.v1.MeshTypes.LayerDurationResponse> getLayerDurationMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.LayerDurationRequest, spacemesh.v1.MeshTypes.LayerDurationResponse> getLayerDurationMethod;
    if ((getLayerDurationMethod = MeshServiceGrpc.getLayerDurationMethod) == null) {
      synchronized (MeshServiceGrpc.class) {
        if ((getLayerDurationMethod = MeshServiceGrpc.getLayerDurationMethod) == null) {
          MeshServiceGrpc.getLayerDurationMethod = getLayerDurationMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.MeshTypes.LayerDurationRequest, spacemesh.v1.MeshTypes.LayerDurationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LayerDuration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.LayerDurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.LayerDurationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeshServiceMethodDescriptorSupplier("LayerDuration"))
              .build();
        }
      }
    }
    return getLayerDurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.MaxTransactionsPerSecondRequest,
      spacemesh.v1.MeshTypes.MaxTransactionsPerSecondResponse> getMaxTransactionsPerSecondMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MaxTransactionsPerSecond",
      requestType = spacemesh.v1.MeshTypes.MaxTransactionsPerSecondRequest.class,
      responseType = spacemesh.v1.MeshTypes.MaxTransactionsPerSecondResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.MaxTransactionsPerSecondRequest,
      spacemesh.v1.MeshTypes.MaxTransactionsPerSecondResponse> getMaxTransactionsPerSecondMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.MaxTransactionsPerSecondRequest, spacemesh.v1.MeshTypes.MaxTransactionsPerSecondResponse> getMaxTransactionsPerSecondMethod;
    if ((getMaxTransactionsPerSecondMethod = MeshServiceGrpc.getMaxTransactionsPerSecondMethod) == null) {
      synchronized (MeshServiceGrpc.class) {
        if ((getMaxTransactionsPerSecondMethod = MeshServiceGrpc.getMaxTransactionsPerSecondMethod) == null) {
          MeshServiceGrpc.getMaxTransactionsPerSecondMethod = getMaxTransactionsPerSecondMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.MeshTypes.MaxTransactionsPerSecondRequest, spacemesh.v1.MeshTypes.MaxTransactionsPerSecondResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MaxTransactionsPerSecond"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.MaxTransactionsPerSecondRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.MaxTransactionsPerSecondResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeshServiceMethodDescriptorSupplier("MaxTransactionsPerSecond"))
              .build();
        }
      }
    }
    return getMaxTransactionsPerSecondMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.AccountMeshDataQueryRequest,
      spacemesh.v1.MeshTypes.AccountMeshDataQueryResponse> getAccountMeshDataQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountMeshDataQuery",
      requestType = spacemesh.v1.MeshTypes.AccountMeshDataQueryRequest.class,
      responseType = spacemesh.v1.MeshTypes.AccountMeshDataQueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.AccountMeshDataQueryRequest,
      spacemesh.v1.MeshTypes.AccountMeshDataQueryResponse> getAccountMeshDataQueryMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.AccountMeshDataQueryRequest, spacemesh.v1.MeshTypes.AccountMeshDataQueryResponse> getAccountMeshDataQueryMethod;
    if ((getAccountMeshDataQueryMethod = MeshServiceGrpc.getAccountMeshDataQueryMethod) == null) {
      synchronized (MeshServiceGrpc.class) {
        if ((getAccountMeshDataQueryMethod = MeshServiceGrpc.getAccountMeshDataQueryMethod) == null) {
          MeshServiceGrpc.getAccountMeshDataQueryMethod = getAccountMeshDataQueryMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.MeshTypes.AccountMeshDataQueryRequest, spacemesh.v1.MeshTypes.AccountMeshDataQueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountMeshDataQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.AccountMeshDataQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.AccountMeshDataQueryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeshServiceMethodDescriptorSupplier("AccountMeshDataQuery"))
              .build();
        }
      }
    }
    return getAccountMeshDataQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.LayersQueryRequest,
      spacemesh.v1.MeshTypes.LayersQueryResponse> getLayersQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LayersQuery",
      requestType = spacemesh.v1.MeshTypes.LayersQueryRequest.class,
      responseType = spacemesh.v1.MeshTypes.LayersQueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.LayersQueryRequest,
      spacemesh.v1.MeshTypes.LayersQueryResponse> getLayersQueryMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.LayersQueryRequest, spacemesh.v1.MeshTypes.LayersQueryResponse> getLayersQueryMethod;
    if ((getLayersQueryMethod = MeshServiceGrpc.getLayersQueryMethod) == null) {
      synchronized (MeshServiceGrpc.class) {
        if ((getLayersQueryMethod = MeshServiceGrpc.getLayersQueryMethod) == null) {
          MeshServiceGrpc.getLayersQueryMethod = getLayersQueryMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.MeshTypes.LayersQueryRequest, spacemesh.v1.MeshTypes.LayersQueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LayersQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.LayersQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.LayersQueryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeshServiceMethodDescriptorSupplier("LayersQuery"))
              .build();
        }
      }
    }
    return getLayersQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.AccountMeshDataStreamRequest,
      spacemesh.v1.MeshTypes.AccountMeshDataStreamResponse> getAccountMeshDataStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountMeshDataStream",
      requestType = spacemesh.v1.MeshTypes.AccountMeshDataStreamRequest.class,
      responseType = spacemesh.v1.MeshTypes.AccountMeshDataStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.AccountMeshDataStreamRequest,
      spacemesh.v1.MeshTypes.AccountMeshDataStreamResponse> getAccountMeshDataStreamMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.AccountMeshDataStreamRequest, spacemesh.v1.MeshTypes.AccountMeshDataStreamResponse> getAccountMeshDataStreamMethod;
    if ((getAccountMeshDataStreamMethod = MeshServiceGrpc.getAccountMeshDataStreamMethod) == null) {
      synchronized (MeshServiceGrpc.class) {
        if ((getAccountMeshDataStreamMethod = MeshServiceGrpc.getAccountMeshDataStreamMethod) == null) {
          MeshServiceGrpc.getAccountMeshDataStreamMethod = getAccountMeshDataStreamMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.MeshTypes.AccountMeshDataStreamRequest, spacemesh.v1.MeshTypes.AccountMeshDataStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountMeshDataStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.AccountMeshDataStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.AccountMeshDataStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeshServiceMethodDescriptorSupplier("AccountMeshDataStream"))
              .build();
        }
      }
    }
    return getAccountMeshDataStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.LayerStreamRequest,
      spacemesh.v1.MeshTypes.LayerStreamResponse> getLayerStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LayerStream",
      requestType = spacemesh.v1.MeshTypes.LayerStreamRequest.class,
      responseType = spacemesh.v1.MeshTypes.LayerStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.LayerStreamRequest,
      spacemesh.v1.MeshTypes.LayerStreamResponse> getLayerStreamMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.LayerStreamRequest, spacemesh.v1.MeshTypes.LayerStreamResponse> getLayerStreamMethod;
    if ((getLayerStreamMethod = MeshServiceGrpc.getLayerStreamMethod) == null) {
      synchronized (MeshServiceGrpc.class) {
        if ((getLayerStreamMethod = MeshServiceGrpc.getLayerStreamMethod) == null) {
          MeshServiceGrpc.getLayerStreamMethod = getLayerStreamMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.MeshTypes.LayerStreamRequest, spacemesh.v1.MeshTypes.LayerStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LayerStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.LayerStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.LayerStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeshServiceMethodDescriptorSupplier("LayerStream"))
              .build();
        }
      }
    }
    return getLayerStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.EpochStreamRequest,
      spacemesh.v1.MeshTypes.EpochStreamResponse> getEpochStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EpochStream",
      requestType = spacemesh.v1.MeshTypes.EpochStreamRequest.class,
      responseType = spacemesh.v1.MeshTypes.EpochStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.EpochStreamRequest,
      spacemesh.v1.MeshTypes.EpochStreamResponse> getEpochStreamMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.EpochStreamRequest, spacemesh.v1.MeshTypes.EpochStreamResponse> getEpochStreamMethod;
    if ((getEpochStreamMethod = MeshServiceGrpc.getEpochStreamMethod) == null) {
      synchronized (MeshServiceGrpc.class) {
        if ((getEpochStreamMethod = MeshServiceGrpc.getEpochStreamMethod) == null) {
          MeshServiceGrpc.getEpochStreamMethod = getEpochStreamMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.MeshTypes.EpochStreamRequest, spacemesh.v1.MeshTypes.EpochStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EpochStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.EpochStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.EpochStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeshServiceMethodDescriptorSupplier("EpochStream"))
              .build();
        }
      }
    }
    return getEpochStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.MalfeasanceRequest,
      spacemesh.v1.MeshTypes.MalfeasanceResponse> getMalfeasanceQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MalfeasanceQuery",
      requestType = spacemesh.v1.MeshTypes.MalfeasanceRequest.class,
      responseType = spacemesh.v1.MeshTypes.MalfeasanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.MalfeasanceRequest,
      spacemesh.v1.MeshTypes.MalfeasanceResponse> getMalfeasanceQueryMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.MalfeasanceRequest, spacemesh.v1.MeshTypes.MalfeasanceResponse> getMalfeasanceQueryMethod;
    if ((getMalfeasanceQueryMethod = MeshServiceGrpc.getMalfeasanceQueryMethod) == null) {
      synchronized (MeshServiceGrpc.class) {
        if ((getMalfeasanceQueryMethod = MeshServiceGrpc.getMalfeasanceQueryMethod) == null) {
          MeshServiceGrpc.getMalfeasanceQueryMethod = getMalfeasanceQueryMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.MeshTypes.MalfeasanceRequest, spacemesh.v1.MeshTypes.MalfeasanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MalfeasanceQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.MalfeasanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.MalfeasanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeshServiceMethodDescriptorSupplier("MalfeasanceQuery"))
              .build();
        }
      }
    }
    return getMalfeasanceQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.MalfeasanceStreamRequest,
      spacemesh.v1.MeshTypes.MalfeasanceStreamResponse> getMalfeasanceStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MalfeasanceStream",
      requestType = spacemesh.v1.MeshTypes.MalfeasanceStreamRequest.class,
      responseType = spacemesh.v1.MeshTypes.MalfeasanceStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.MalfeasanceStreamRequest,
      spacemesh.v1.MeshTypes.MalfeasanceStreamResponse> getMalfeasanceStreamMethod() {
    io.grpc.MethodDescriptor<spacemesh.v1.MeshTypes.MalfeasanceStreamRequest, spacemesh.v1.MeshTypes.MalfeasanceStreamResponse> getMalfeasanceStreamMethod;
    if ((getMalfeasanceStreamMethod = MeshServiceGrpc.getMalfeasanceStreamMethod) == null) {
      synchronized (MeshServiceGrpc.class) {
        if ((getMalfeasanceStreamMethod = MeshServiceGrpc.getMalfeasanceStreamMethod) == null) {
          MeshServiceGrpc.getMalfeasanceStreamMethod = getMalfeasanceStreamMethod =
              io.grpc.MethodDescriptor.<spacemesh.v1.MeshTypes.MalfeasanceStreamRequest, spacemesh.v1.MeshTypes.MalfeasanceStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MalfeasanceStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.MalfeasanceStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spacemesh.v1.MeshTypes.MalfeasanceStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeshServiceMethodDescriptorSupplier("MalfeasanceStream"))
              .build();
        }
      }
    }
    return getMalfeasanceStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MeshServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MeshServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MeshServiceStub>() {
        @java.lang.Override
        public MeshServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MeshServiceStub(channel, callOptions);
        }
      };
    return MeshServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MeshServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MeshServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MeshServiceBlockingStub>() {
        @java.lang.Override
        public MeshServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MeshServiceBlockingStub(channel, callOptions);
        }
      };
    return MeshServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MeshServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MeshServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MeshServiceFutureStub>() {
        @java.lang.Override
        public MeshServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MeshServiceFutureStub(channel, callOptions);
        }
      };
    return MeshServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Readonly API for basic mesh info
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Network genesis time as unix epoch time
     * </pre>
     */
    default void genesisTime(spacemesh.v1.MeshTypes.GenesisTimeRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.GenesisTimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenesisTimeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Current layer number
     * </pre>
     */
    default void currentLayer(spacemesh.v1.MeshTypes.CurrentLayerRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.CurrentLayerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCurrentLayerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Current epoch number
     * </pre>
     */
    default void currentEpoch(spacemesh.v1.MeshTypes.CurrentEpochRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.CurrentEpochResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCurrentEpochMethod(), responseObserver);
    }

    /**
     * <pre>
     * Genesis ID
     * </pre>
     */
    default void genesisID(spacemesh.v1.MeshTypes.GenesisIDRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.GenesisIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenesisIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Number of layers per epoch (a network parameter)
     * </pre>
     */
    default void epochNumLayers(spacemesh.v1.MeshTypes.EpochNumLayersRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.EpochNumLayersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEpochNumLayersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Layer duration (a network parameter)
     * </pre>
     */
    default void layerDuration(spacemesh.v1.MeshTypes.LayerDurationRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.LayerDurationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLayerDurationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Number of transactions per second (a network parameter)
     * </pre>
     */
    default void maxTransactionsPerSecond(spacemesh.v1.MeshTypes.MaxTransactionsPerSecondRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.MaxTransactionsPerSecondResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMaxTransactionsPerSecondMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get account data query
     * </pre>
     */
    default void accountMeshDataQuery(spacemesh.v1.MeshTypes.AccountMeshDataQueryRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.AccountMeshDataQueryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountMeshDataQueryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Layers data query
     * </pre>
     */
    default void layersQuery(spacemesh.v1.MeshTypes.LayersQueryRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.LayersQueryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLayersQueryMethod(), responseObserver);
    }

    /**
     * <pre>
     * A stream of transactions and activations from an account.
     * Includes simple coin transactions with the account as the destination.
     * </pre>
     */
    default void accountMeshDataStream(spacemesh.v1.MeshTypes.AccountMeshDataStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.AccountMeshDataStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountMeshDataStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Layer with blocks, transactions and activations
     * Sent each time layer data changes. Designed for heavy-duty clients.
     * </pre>
     */
    default void layerStream(spacemesh.v1.MeshTypes.LayerStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.LayerStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLayerStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Epoch activation transactions.
     * </pre>
     */
    default void epochStream(spacemesh.v1.MeshTypes.EpochStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.EpochStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEpochStreamMethod(), responseObserver);
    }

    /**
     */
    default void malfeasanceQuery(spacemesh.v1.MeshTypes.MalfeasanceRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.MalfeasanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMalfeasanceQueryMethod(), responseObserver);
    }

    /**
     */
    default void malfeasanceStream(spacemesh.v1.MeshTypes.MalfeasanceStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.MalfeasanceStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMalfeasanceStreamMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MeshService.
   * <pre>
   * Readonly API for basic mesh info
   * </pre>
   */
  public static abstract class MeshServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MeshServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MeshService.
   * <pre>
   * Readonly API for basic mesh info
   * </pre>
   */
  public static final class MeshServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MeshServiceStub> {
    private MeshServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeshServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MeshServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Network genesis time as unix epoch time
     * </pre>
     */
    public void genesisTime(spacemesh.v1.MeshTypes.GenesisTimeRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.GenesisTimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenesisTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Current layer number
     * </pre>
     */
    public void currentLayer(spacemesh.v1.MeshTypes.CurrentLayerRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.CurrentLayerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCurrentLayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Current epoch number
     * </pre>
     */
    public void currentEpoch(spacemesh.v1.MeshTypes.CurrentEpochRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.CurrentEpochResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCurrentEpochMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Genesis ID
     * </pre>
     */
    public void genesisID(spacemesh.v1.MeshTypes.GenesisIDRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.GenesisIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenesisIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Number of layers per epoch (a network parameter)
     * </pre>
     */
    public void epochNumLayers(spacemesh.v1.MeshTypes.EpochNumLayersRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.EpochNumLayersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEpochNumLayersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Layer duration (a network parameter)
     * </pre>
     */
    public void layerDuration(spacemesh.v1.MeshTypes.LayerDurationRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.LayerDurationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLayerDurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Number of transactions per second (a network parameter)
     * </pre>
     */
    public void maxTransactionsPerSecond(spacemesh.v1.MeshTypes.MaxTransactionsPerSecondRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.MaxTransactionsPerSecondResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMaxTransactionsPerSecondMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get account data query
     * </pre>
     */
    public void accountMeshDataQuery(spacemesh.v1.MeshTypes.AccountMeshDataQueryRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.AccountMeshDataQueryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountMeshDataQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Layers data query
     * </pre>
     */
    public void layersQuery(spacemesh.v1.MeshTypes.LayersQueryRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.LayersQueryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLayersQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A stream of transactions and activations from an account.
     * Includes simple coin transactions with the account as the destination.
     * </pre>
     */
    public void accountMeshDataStream(spacemesh.v1.MeshTypes.AccountMeshDataStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.AccountMeshDataStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getAccountMeshDataStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Layer with blocks, transactions and activations
     * Sent each time layer data changes. Designed for heavy-duty clients.
     * </pre>
     */
    public void layerStream(spacemesh.v1.MeshTypes.LayerStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.LayerStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getLayerStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Epoch activation transactions.
     * </pre>
     */
    public void epochStream(spacemesh.v1.MeshTypes.EpochStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.EpochStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEpochStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void malfeasanceQuery(spacemesh.v1.MeshTypes.MalfeasanceRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.MalfeasanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMalfeasanceQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void malfeasanceStream(spacemesh.v1.MeshTypes.MalfeasanceStreamRequest request,
        io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.MalfeasanceStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getMalfeasanceStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MeshService.
   * <pre>
   * Readonly API for basic mesh info
   * </pre>
   */
  public static final class MeshServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MeshServiceBlockingStub> {
    private MeshServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeshServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MeshServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Network genesis time as unix epoch time
     * </pre>
     */
    public spacemesh.v1.MeshTypes.GenesisTimeResponse genesisTime(spacemesh.v1.MeshTypes.GenesisTimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenesisTimeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Current layer number
     * </pre>
     */
    public spacemesh.v1.MeshTypes.CurrentLayerResponse currentLayer(spacemesh.v1.MeshTypes.CurrentLayerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCurrentLayerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Current epoch number
     * </pre>
     */
    public spacemesh.v1.MeshTypes.CurrentEpochResponse currentEpoch(spacemesh.v1.MeshTypes.CurrentEpochRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCurrentEpochMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Genesis ID
     * </pre>
     */
    public spacemesh.v1.MeshTypes.GenesisIDResponse genesisID(spacemesh.v1.MeshTypes.GenesisIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenesisIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Number of layers per epoch (a network parameter)
     * </pre>
     */
    public spacemesh.v1.MeshTypes.EpochNumLayersResponse epochNumLayers(spacemesh.v1.MeshTypes.EpochNumLayersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEpochNumLayersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Layer duration (a network parameter)
     * </pre>
     */
    public spacemesh.v1.MeshTypes.LayerDurationResponse layerDuration(spacemesh.v1.MeshTypes.LayerDurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLayerDurationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Number of transactions per second (a network parameter)
     * </pre>
     */
    public spacemesh.v1.MeshTypes.MaxTransactionsPerSecondResponse maxTransactionsPerSecond(spacemesh.v1.MeshTypes.MaxTransactionsPerSecondRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMaxTransactionsPerSecondMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get account data query
     * </pre>
     */
    public spacemesh.v1.MeshTypes.AccountMeshDataQueryResponse accountMeshDataQuery(spacemesh.v1.MeshTypes.AccountMeshDataQueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountMeshDataQueryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Layers data query
     * </pre>
     */
    public spacemesh.v1.MeshTypes.LayersQueryResponse layersQuery(spacemesh.v1.MeshTypes.LayersQueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLayersQueryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A stream of transactions and activations from an account.
     * Includes simple coin transactions with the account as the destination.
     * </pre>
     */
    public java.util.Iterator<spacemesh.v1.MeshTypes.AccountMeshDataStreamResponse> accountMeshDataStream(
        spacemesh.v1.MeshTypes.AccountMeshDataStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getAccountMeshDataStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Layer with blocks, transactions and activations
     * Sent each time layer data changes. Designed for heavy-duty clients.
     * </pre>
     */
    public java.util.Iterator<spacemesh.v1.MeshTypes.LayerStreamResponse> layerStream(
        spacemesh.v1.MeshTypes.LayerStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getLayerStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Epoch activation transactions.
     * </pre>
     */
    public java.util.Iterator<spacemesh.v1.MeshTypes.EpochStreamResponse> epochStream(
        spacemesh.v1.MeshTypes.EpochStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEpochStreamMethod(), getCallOptions(), request);
    }

    /**
     */
    public spacemesh.v1.MeshTypes.MalfeasanceResponse malfeasanceQuery(spacemesh.v1.MeshTypes.MalfeasanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMalfeasanceQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<spacemesh.v1.MeshTypes.MalfeasanceStreamResponse> malfeasanceStream(
        spacemesh.v1.MeshTypes.MalfeasanceStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getMalfeasanceStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MeshService.
   * <pre>
   * Readonly API for basic mesh info
   * </pre>
   */
  public static final class MeshServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MeshServiceFutureStub> {
    private MeshServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeshServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MeshServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Network genesis time as unix epoch time
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.MeshTypes.GenesisTimeResponse> genesisTime(
        spacemesh.v1.MeshTypes.GenesisTimeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenesisTimeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Current layer number
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.MeshTypes.CurrentLayerResponse> currentLayer(
        spacemesh.v1.MeshTypes.CurrentLayerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCurrentLayerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Current epoch number
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.MeshTypes.CurrentEpochResponse> currentEpoch(
        spacemesh.v1.MeshTypes.CurrentEpochRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCurrentEpochMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Genesis ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.MeshTypes.GenesisIDResponse> genesisID(
        spacemesh.v1.MeshTypes.GenesisIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenesisIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Number of layers per epoch (a network parameter)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.MeshTypes.EpochNumLayersResponse> epochNumLayers(
        spacemesh.v1.MeshTypes.EpochNumLayersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEpochNumLayersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Layer duration (a network parameter)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.MeshTypes.LayerDurationResponse> layerDuration(
        spacemesh.v1.MeshTypes.LayerDurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLayerDurationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Number of transactions per second (a network parameter)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.MeshTypes.MaxTransactionsPerSecondResponse> maxTransactionsPerSecond(
        spacemesh.v1.MeshTypes.MaxTransactionsPerSecondRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMaxTransactionsPerSecondMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get account data query
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.MeshTypes.AccountMeshDataQueryResponse> accountMeshDataQuery(
        spacemesh.v1.MeshTypes.AccountMeshDataQueryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountMeshDataQueryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Layers data query
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.MeshTypes.LayersQueryResponse> layersQuery(
        spacemesh.v1.MeshTypes.LayersQueryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLayersQueryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<spacemesh.v1.MeshTypes.MalfeasanceResponse> malfeasanceQuery(
        spacemesh.v1.MeshTypes.MalfeasanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMalfeasanceQueryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENESIS_TIME = 0;
  private static final int METHODID_CURRENT_LAYER = 1;
  private static final int METHODID_CURRENT_EPOCH = 2;
  private static final int METHODID_GENESIS_ID = 3;
  private static final int METHODID_EPOCH_NUM_LAYERS = 4;
  private static final int METHODID_LAYER_DURATION = 5;
  private static final int METHODID_MAX_TRANSACTIONS_PER_SECOND = 6;
  private static final int METHODID_ACCOUNT_MESH_DATA_QUERY = 7;
  private static final int METHODID_LAYERS_QUERY = 8;
  private static final int METHODID_ACCOUNT_MESH_DATA_STREAM = 9;
  private static final int METHODID_LAYER_STREAM = 10;
  private static final int METHODID_EPOCH_STREAM = 11;
  private static final int METHODID_MALFEASANCE_QUERY = 12;
  private static final int METHODID_MALFEASANCE_STREAM = 13;

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
        case METHODID_GENESIS_TIME:
          serviceImpl.genesisTime((spacemesh.v1.MeshTypes.GenesisTimeRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.GenesisTimeResponse>) responseObserver);
          break;
        case METHODID_CURRENT_LAYER:
          serviceImpl.currentLayer((spacemesh.v1.MeshTypes.CurrentLayerRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.CurrentLayerResponse>) responseObserver);
          break;
        case METHODID_CURRENT_EPOCH:
          serviceImpl.currentEpoch((spacemesh.v1.MeshTypes.CurrentEpochRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.CurrentEpochResponse>) responseObserver);
          break;
        case METHODID_GENESIS_ID:
          serviceImpl.genesisID((spacemesh.v1.MeshTypes.GenesisIDRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.GenesisIDResponse>) responseObserver);
          break;
        case METHODID_EPOCH_NUM_LAYERS:
          serviceImpl.epochNumLayers((spacemesh.v1.MeshTypes.EpochNumLayersRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.EpochNumLayersResponse>) responseObserver);
          break;
        case METHODID_LAYER_DURATION:
          serviceImpl.layerDuration((spacemesh.v1.MeshTypes.LayerDurationRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.LayerDurationResponse>) responseObserver);
          break;
        case METHODID_MAX_TRANSACTIONS_PER_SECOND:
          serviceImpl.maxTransactionsPerSecond((spacemesh.v1.MeshTypes.MaxTransactionsPerSecondRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.MaxTransactionsPerSecondResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_MESH_DATA_QUERY:
          serviceImpl.accountMeshDataQuery((spacemesh.v1.MeshTypes.AccountMeshDataQueryRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.AccountMeshDataQueryResponse>) responseObserver);
          break;
        case METHODID_LAYERS_QUERY:
          serviceImpl.layersQuery((spacemesh.v1.MeshTypes.LayersQueryRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.LayersQueryResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_MESH_DATA_STREAM:
          serviceImpl.accountMeshDataStream((spacemesh.v1.MeshTypes.AccountMeshDataStreamRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.AccountMeshDataStreamResponse>) responseObserver);
          break;
        case METHODID_LAYER_STREAM:
          serviceImpl.layerStream((spacemesh.v1.MeshTypes.LayerStreamRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.LayerStreamResponse>) responseObserver);
          break;
        case METHODID_EPOCH_STREAM:
          serviceImpl.epochStream((spacemesh.v1.MeshTypes.EpochStreamRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.EpochStreamResponse>) responseObserver);
          break;
        case METHODID_MALFEASANCE_QUERY:
          serviceImpl.malfeasanceQuery((spacemesh.v1.MeshTypes.MalfeasanceRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.MalfeasanceResponse>) responseObserver);
          break;
        case METHODID_MALFEASANCE_STREAM:
          serviceImpl.malfeasanceStream((spacemesh.v1.MeshTypes.MalfeasanceStreamRequest) request,
              (io.grpc.stub.StreamObserver<spacemesh.v1.MeshTypes.MalfeasanceStreamResponse>) responseObserver);
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
          getGenesisTimeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.MeshTypes.GenesisTimeRequest,
              spacemesh.v1.MeshTypes.GenesisTimeResponse>(
                service, METHODID_GENESIS_TIME)))
        .addMethod(
          getCurrentLayerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.MeshTypes.CurrentLayerRequest,
              spacemesh.v1.MeshTypes.CurrentLayerResponse>(
                service, METHODID_CURRENT_LAYER)))
        .addMethod(
          getCurrentEpochMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.MeshTypes.CurrentEpochRequest,
              spacemesh.v1.MeshTypes.CurrentEpochResponse>(
                service, METHODID_CURRENT_EPOCH)))
        .addMethod(
          getGenesisIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.MeshTypes.GenesisIDRequest,
              spacemesh.v1.MeshTypes.GenesisIDResponse>(
                service, METHODID_GENESIS_ID)))
        .addMethod(
          getEpochNumLayersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.MeshTypes.EpochNumLayersRequest,
              spacemesh.v1.MeshTypes.EpochNumLayersResponse>(
                service, METHODID_EPOCH_NUM_LAYERS)))
        .addMethod(
          getLayerDurationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.MeshTypes.LayerDurationRequest,
              spacemesh.v1.MeshTypes.LayerDurationResponse>(
                service, METHODID_LAYER_DURATION)))
        .addMethod(
          getMaxTransactionsPerSecondMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.MeshTypes.MaxTransactionsPerSecondRequest,
              spacemesh.v1.MeshTypes.MaxTransactionsPerSecondResponse>(
                service, METHODID_MAX_TRANSACTIONS_PER_SECOND)))
        .addMethod(
          getAccountMeshDataQueryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.MeshTypes.AccountMeshDataQueryRequest,
              spacemesh.v1.MeshTypes.AccountMeshDataQueryResponse>(
                service, METHODID_ACCOUNT_MESH_DATA_QUERY)))
        .addMethod(
          getLayersQueryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.MeshTypes.LayersQueryRequest,
              spacemesh.v1.MeshTypes.LayersQueryResponse>(
                service, METHODID_LAYERS_QUERY)))
        .addMethod(
          getAccountMeshDataStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              spacemesh.v1.MeshTypes.AccountMeshDataStreamRequest,
              spacemesh.v1.MeshTypes.AccountMeshDataStreamResponse>(
                service, METHODID_ACCOUNT_MESH_DATA_STREAM)))
        .addMethod(
          getLayerStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              spacemesh.v1.MeshTypes.LayerStreamRequest,
              spacemesh.v1.MeshTypes.LayerStreamResponse>(
                service, METHODID_LAYER_STREAM)))
        .addMethod(
          getEpochStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              spacemesh.v1.MeshTypes.EpochStreamRequest,
              spacemesh.v1.MeshTypes.EpochStreamResponse>(
                service, METHODID_EPOCH_STREAM)))
        .addMethod(
          getMalfeasanceQueryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spacemesh.v1.MeshTypes.MalfeasanceRequest,
              spacemesh.v1.MeshTypes.MalfeasanceResponse>(
                service, METHODID_MALFEASANCE_QUERY)))
        .addMethod(
          getMalfeasanceStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              spacemesh.v1.MeshTypes.MalfeasanceStreamRequest,
              spacemesh.v1.MeshTypes.MalfeasanceStreamResponse>(
                service, METHODID_MALFEASANCE_STREAM)))
        .build();
  }

  private static abstract class MeshServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MeshServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return spacemesh.v1.Mesh.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MeshService");
    }
  }

  private static final class MeshServiceFileDescriptorSupplier
      extends MeshServiceBaseDescriptorSupplier {
    MeshServiceFileDescriptorSupplier() {}
  }

  private static final class MeshServiceMethodDescriptorSupplier
      extends MeshServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MeshServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MeshServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MeshServiceFileDescriptorSupplier())
              .addMethod(getGenesisTimeMethod())
              .addMethod(getCurrentLayerMethod())
              .addMethod(getCurrentEpochMethod())
              .addMethod(getGenesisIDMethod())
              .addMethod(getEpochNumLayersMethod())
              .addMethod(getLayerDurationMethod())
              .addMethod(getMaxTransactionsPerSecondMethod())
              .addMethod(getAccountMeshDataQueryMethod())
              .addMethod(getLayersQueryMethod())
              .addMethod(getAccountMeshDataStreamMethod())
              .addMethod(getLayerStreamMethod())
              .addMethod(getEpochStreamMethod())
              .addMethod(getMalfeasanceQueryMethod())
              .addMethod(getMalfeasanceStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}

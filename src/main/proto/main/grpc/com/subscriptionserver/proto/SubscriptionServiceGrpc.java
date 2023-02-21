package com.subscriptionserver.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SubscriptionServiceGrpc {

  private SubscriptionServiceGrpc() {}

  public static final String SERVICE_NAME = "com.subscriptionmanager.SubscriptionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.subscriptionserver.proto.CreateSubscriptionRequest,
      com.subscriptionserver.proto.Subscription> getCreateSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createSubscription",
      requestType = com.subscriptionserver.proto.CreateSubscriptionRequest.class,
      responseType = com.subscriptionserver.proto.Subscription.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.subscriptionserver.proto.CreateSubscriptionRequest,
      com.subscriptionserver.proto.Subscription> getCreateSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.subscriptionserver.proto.CreateSubscriptionRequest, com.subscriptionserver.proto.Subscription> getCreateSubscriptionMethod;
    if ((getCreateSubscriptionMethod = SubscriptionServiceGrpc.getCreateSubscriptionMethod) == null) {
      synchronized (SubscriptionServiceGrpc.class) {
        if ((getCreateSubscriptionMethod = SubscriptionServiceGrpc.getCreateSubscriptionMethod) == null) {
          SubscriptionServiceGrpc.getCreateSubscriptionMethod = getCreateSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.subscriptionserver.proto.CreateSubscriptionRequest, com.subscriptionserver.proto.Subscription>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionserver.proto.CreateSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionserver.proto.Subscription.getDefaultInstance()))
              .setSchemaDescriptor(new SubscriptionServiceMethodDescriptorSupplier("createSubscription"))
              .build();
        }
      }
    }
    return getCreateSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.subscriptionserver.proto.ListSubscriptionRequest,
      com.subscriptionserver.proto.ListSubscriptionResponse> getListSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listSubscription",
      requestType = com.subscriptionserver.proto.ListSubscriptionRequest.class,
      responseType = com.subscriptionserver.proto.ListSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.subscriptionserver.proto.ListSubscriptionRequest,
      com.subscriptionserver.proto.ListSubscriptionResponse> getListSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.subscriptionserver.proto.ListSubscriptionRequest, com.subscriptionserver.proto.ListSubscriptionResponse> getListSubscriptionMethod;
    if ((getListSubscriptionMethod = SubscriptionServiceGrpc.getListSubscriptionMethod) == null) {
      synchronized (SubscriptionServiceGrpc.class) {
        if ((getListSubscriptionMethod = SubscriptionServiceGrpc.getListSubscriptionMethod) == null) {
          SubscriptionServiceGrpc.getListSubscriptionMethod = getListSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.subscriptionserver.proto.ListSubscriptionRequest, com.subscriptionserver.proto.ListSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionserver.proto.ListSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionserver.proto.ListSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SubscriptionServiceMethodDescriptorSupplier("listSubscription"))
              .build();
        }
      }
    }
    return getListSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.subscriptionserver.proto.DeleteSubscriptionRequest,
      com.subscriptionserver.proto.DeleteSubscriptionResponse> getDeleteSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteSubscription",
      requestType = com.subscriptionserver.proto.DeleteSubscriptionRequest.class,
      responseType = com.subscriptionserver.proto.DeleteSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.subscriptionserver.proto.DeleteSubscriptionRequest,
      com.subscriptionserver.proto.DeleteSubscriptionResponse> getDeleteSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.subscriptionserver.proto.DeleteSubscriptionRequest, com.subscriptionserver.proto.DeleteSubscriptionResponse> getDeleteSubscriptionMethod;
    if ((getDeleteSubscriptionMethod = SubscriptionServiceGrpc.getDeleteSubscriptionMethod) == null) {
      synchronized (SubscriptionServiceGrpc.class) {
        if ((getDeleteSubscriptionMethod = SubscriptionServiceGrpc.getDeleteSubscriptionMethod) == null) {
          SubscriptionServiceGrpc.getDeleteSubscriptionMethod = getDeleteSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.subscriptionserver.proto.DeleteSubscriptionRequest, com.subscriptionserver.proto.DeleteSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionserver.proto.DeleteSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionserver.proto.DeleteSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SubscriptionServiceMethodDescriptorSupplier("deleteSubscription"))
              .build();
        }
      }
    }
    return getDeleteSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.subscriptionserver.proto.RenewSubscriptionRequest,
      com.subscriptionserver.proto.RenewSubscriptionResponse> getRenewSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "renewSubscription",
      requestType = com.subscriptionserver.proto.RenewSubscriptionRequest.class,
      responseType = com.subscriptionserver.proto.RenewSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.subscriptionserver.proto.RenewSubscriptionRequest,
      com.subscriptionserver.proto.RenewSubscriptionResponse> getRenewSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.subscriptionserver.proto.RenewSubscriptionRequest, com.subscriptionserver.proto.RenewSubscriptionResponse> getRenewSubscriptionMethod;
    if ((getRenewSubscriptionMethod = SubscriptionServiceGrpc.getRenewSubscriptionMethod) == null) {
      synchronized (SubscriptionServiceGrpc.class) {
        if ((getRenewSubscriptionMethod = SubscriptionServiceGrpc.getRenewSubscriptionMethod) == null) {
          SubscriptionServiceGrpc.getRenewSubscriptionMethod = getRenewSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.subscriptionserver.proto.RenewSubscriptionRequest, com.subscriptionserver.proto.RenewSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "renewSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionserver.proto.RenewSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionserver.proto.RenewSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SubscriptionServiceMethodDescriptorSupplier("renewSubscription"))
              .build();
        }
      }
    }
    return getRenewSubscriptionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SubscriptionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubscriptionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubscriptionServiceStub>() {
        @java.lang.Override
        public SubscriptionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubscriptionServiceStub(channel, callOptions);
        }
      };
    return SubscriptionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SubscriptionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubscriptionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubscriptionServiceBlockingStub>() {
        @java.lang.Override
        public SubscriptionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubscriptionServiceBlockingStub(channel, callOptions);
        }
      };
    return SubscriptionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SubscriptionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubscriptionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubscriptionServiceFutureStub>() {
        @java.lang.Override
        public SubscriptionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubscriptionServiceFutureStub(channel, callOptions);
        }
      };
    return SubscriptionServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SubscriptionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createSubscription(com.subscriptionserver.proto.CreateSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionserver.proto.Subscription> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSubscriptionMethod(), responseObserver);
    }

    /**
     */
    public void listSubscription(com.subscriptionserver.proto.ListSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionserver.proto.ListSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSubscriptionMethod(), responseObserver);
    }

    /**
     */
    public void deleteSubscription(com.subscriptionserver.proto.DeleteSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionserver.proto.DeleteSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSubscriptionMethod(), responseObserver);
    }

    /**
     */
    public void renewSubscription(com.subscriptionserver.proto.RenewSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionserver.proto.RenewSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenewSubscriptionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateSubscriptionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.subscriptionserver.proto.CreateSubscriptionRequest,
                com.subscriptionserver.proto.Subscription>(
                  this, METHODID_CREATE_SUBSCRIPTION)))
          .addMethod(
            getListSubscriptionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.subscriptionserver.proto.ListSubscriptionRequest,
                com.subscriptionserver.proto.ListSubscriptionResponse>(
                  this, METHODID_LIST_SUBSCRIPTION)))
          .addMethod(
            getDeleteSubscriptionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.subscriptionserver.proto.DeleteSubscriptionRequest,
                com.subscriptionserver.proto.DeleteSubscriptionResponse>(
                  this, METHODID_DELETE_SUBSCRIPTION)))
          .addMethod(
            getRenewSubscriptionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.subscriptionserver.proto.RenewSubscriptionRequest,
                com.subscriptionserver.proto.RenewSubscriptionResponse>(
                  this, METHODID_RENEW_SUBSCRIPTION)))
          .build();
    }
  }

  /**
   */
  public static final class SubscriptionServiceStub extends io.grpc.stub.AbstractAsyncStub<SubscriptionServiceStub> {
    private SubscriptionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubscriptionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubscriptionServiceStub(channel, callOptions);
    }

    /**
     */
    public void createSubscription(com.subscriptionserver.proto.CreateSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionserver.proto.Subscription> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listSubscription(com.subscriptionserver.proto.ListSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionserver.proto.ListSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSubscription(com.subscriptionserver.proto.DeleteSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionserver.proto.DeleteSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void renewSubscription(com.subscriptionserver.proto.RenewSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionserver.proto.RenewSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRenewSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SubscriptionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SubscriptionServiceBlockingStub> {
    private SubscriptionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubscriptionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubscriptionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.subscriptionserver.proto.Subscription createSubscription(com.subscriptionserver.proto.CreateSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.subscriptionserver.proto.ListSubscriptionResponse listSubscription(com.subscriptionserver.proto.ListSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.subscriptionserver.proto.DeleteSubscriptionResponse deleteSubscription(com.subscriptionserver.proto.DeleteSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.subscriptionserver.proto.RenewSubscriptionResponse renewSubscription(com.subscriptionserver.proto.RenewSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRenewSubscriptionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SubscriptionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SubscriptionServiceFutureStub> {
    private SubscriptionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubscriptionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubscriptionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.subscriptionserver.proto.Subscription> createSubscription(
        com.subscriptionserver.proto.CreateSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.subscriptionserver.proto.ListSubscriptionResponse> listSubscription(
        com.subscriptionserver.proto.ListSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.subscriptionserver.proto.DeleteSubscriptionResponse> deleteSubscription(
        com.subscriptionserver.proto.DeleteSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.subscriptionserver.proto.RenewSubscriptionResponse> renewSubscription(
        com.subscriptionserver.proto.RenewSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRenewSubscriptionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SUBSCRIPTION = 0;
  private static final int METHODID_LIST_SUBSCRIPTION = 1;
  private static final int METHODID_DELETE_SUBSCRIPTION = 2;
  private static final int METHODID_RENEW_SUBSCRIPTION = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SubscriptionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SubscriptionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SUBSCRIPTION:
          serviceImpl.createSubscription((com.subscriptionserver.proto.CreateSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.subscriptionserver.proto.Subscription>) responseObserver);
          break;
        case METHODID_LIST_SUBSCRIPTION:
          serviceImpl.listSubscription((com.subscriptionserver.proto.ListSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.subscriptionserver.proto.ListSubscriptionResponse>) responseObserver);
          break;
        case METHODID_DELETE_SUBSCRIPTION:
          serviceImpl.deleteSubscription((com.subscriptionserver.proto.DeleteSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.subscriptionserver.proto.DeleteSubscriptionResponse>) responseObserver);
          break;
        case METHODID_RENEW_SUBSCRIPTION:
          serviceImpl.renewSubscription((com.subscriptionserver.proto.RenewSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.subscriptionserver.proto.RenewSubscriptionResponse>) responseObserver);
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

  private static abstract class SubscriptionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SubscriptionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.subscriptionserver.proto.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SubscriptionService");
    }
  }

  private static final class SubscriptionServiceFileDescriptorSupplier
      extends SubscriptionServiceBaseDescriptorSupplier {
    SubscriptionServiceFileDescriptorSupplier() {}
  }

  private static final class SubscriptionServiceMethodDescriptorSupplier
      extends SubscriptionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SubscriptionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SubscriptionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SubscriptionServiceFileDescriptorSupplier())
              .addMethod(getCreateSubscriptionMethod())
              .addMethod(getListSubscriptionMethod())
              .addMethod(getDeleteSubscriptionMethod())
              .addMethod(getRenewSubscriptionMethod())
              .build();
        }
      }
    }
    return result;
  }
}

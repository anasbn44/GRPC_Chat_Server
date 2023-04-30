package ma.enset.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: chat.proto")
public final class ChatServicesGrpc {

  private ChatServicesGrpc() {}

  public static final String SERVICE_NAME = "ChatServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Client,
      ma.enset.stubs.Chat.Response> getConnexionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "connexion",
      requestType = ma.enset.stubs.Chat.Client.class,
      responseType = ma.enset.stubs.Chat.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Client,
      ma.enset.stubs.Chat.Response> getConnexionMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Client, ma.enset.stubs.Chat.Response> getConnexionMethod;
    if ((getConnexionMethod = ChatServicesGrpc.getConnexionMethod) == null) {
      synchronized (ChatServicesGrpc.class) {
        if ((getConnexionMethod = ChatServicesGrpc.getConnexionMethod) == null) {
          ChatServicesGrpc.getConnexionMethod = getConnexionMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stubs.Chat.Client, ma.enset.stubs.Chat.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ChatServices", "connexion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.Client.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatServicesMethodDescriptorSupplier("connexion"))
                  .build();
          }
        }
     }
     return getConnexionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Client,
      ma.enset.stubs.Chat.Response> getDisconnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "disconnect",
      requestType = ma.enset.stubs.Chat.Client.class,
      responseType = ma.enset.stubs.Chat.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Client,
      ma.enset.stubs.Chat.Response> getDisconnectMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Client, ma.enset.stubs.Chat.Response> getDisconnectMethod;
    if ((getDisconnectMethod = ChatServicesGrpc.getDisconnectMethod) == null) {
      synchronized (ChatServicesGrpc.class) {
        if ((getDisconnectMethod = ChatServicesGrpc.getDisconnectMethod) == null) {
          ChatServicesGrpc.getDisconnectMethod = getDisconnectMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stubs.Chat.Client, ma.enset.stubs.Chat.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ChatServices", "disconnect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.Client.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatServicesMethodDescriptorSupplier("disconnect"))
                  .build();
          }
        }
     }
     return getDisconnectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Channel,
      ma.enset.stubs.Chat.Response> getJoinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "join",
      requestType = ma.enset.stubs.Chat.Channel.class,
      responseType = ma.enset.stubs.Chat.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Channel,
      ma.enset.stubs.Chat.Response> getJoinMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Channel, ma.enset.stubs.Chat.Response> getJoinMethod;
    if ((getJoinMethod = ChatServicesGrpc.getJoinMethod) == null) {
      synchronized (ChatServicesGrpc.class) {
        if ((getJoinMethod = ChatServicesGrpc.getJoinMethod) == null) {
          ChatServicesGrpc.getJoinMethod = getJoinMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stubs.Chat.Channel, ma.enset.stubs.Chat.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ChatServices", "join"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.Channel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatServicesMethodDescriptorSupplier("join"))
                  .build();
          }
        }
     }
     return getJoinMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.Chat.ClientList,
      ma.enset.stubs.Chat.ResponseClientList> getListClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listClient",
      requestType = ma.enset.stubs.Chat.ClientList.class,
      responseType = ma.enset.stubs.Chat.ResponseClientList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.Chat.ClientList,
      ma.enset.stubs.Chat.ResponseClientList> getListClientMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.Chat.ClientList, ma.enset.stubs.Chat.ResponseClientList> getListClientMethod;
    if ((getListClientMethod = ChatServicesGrpc.getListClientMethod) == null) {
      synchronized (ChatServicesGrpc.class) {
        if ((getListClientMethod = ChatServicesGrpc.getListClientMethod) == null) {
          ChatServicesGrpc.getListClientMethod = getListClientMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stubs.Chat.ClientList, ma.enset.stubs.Chat.ResponseClientList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ChatServices", "listClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.ClientList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.ResponseClientList.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatServicesMethodDescriptorSupplier("listClient"))
                  .build();
          }
        }
     }
     return getListClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Channel,
      ma.enset.stubs.Chat.Response> getLeaveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "leave",
      requestType = ma.enset.stubs.Chat.Channel.class,
      responseType = ma.enset.stubs.Chat.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Channel,
      ma.enset.stubs.Chat.Response> getLeaveMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Channel, ma.enset.stubs.Chat.Response> getLeaveMethod;
    if ((getLeaveMethod = ChatServicesGrpc.getLeaveMethod) == null) {
      synchronized (ChatServicesGrpc.class) {
        if ((getLeaveMethod = ChatServicesGrpc.getLeaveMethod) == null) {
          ChatServicesGrpc.getLeaveMethod = getLeaveMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stubs.Chat.Channel, ma.enset.stubs.Chat.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ChatServices", "leave"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.Channel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatServicesMethodDescriptorSupplier("leave"))
                  .build();
          }
        }
     }
     return getLeaveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Message,
      ma.enset.stubs.Chat.Response> getReceiveMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "receiveMessage",
      requestType = ma.enset.stubs.Chat.Message.class,
      responseType = ma.enset.stubs.Chat.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Message,
      ma.enset.stubs.Chat.Response> getReceiveMessageMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Message, ma.enset.stubs.Chat.Response> getReceiveMessageMethod;
    if ((getReceiveMessageMethod = ChatServicesGrpc.getReceiveMessageMethod) == null) {
      synchronized (ChatServicesGrpc.class) {
        if ((getReceiveMessageMethod = ChatServicesGrpc.getReceiveMessageMethod) == null) {
          ChatServicesGrpc.getReceiveMessageMethod = getReceiveMessageMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stubs.Chat.Message, ma.enset.stubs.Chat.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ChatServices", "receiveMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatServicesMethodDescriptorSupplier("receiveMessage"))
                  .build();
          }
        }
     }
     return getReceiveMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Message,
      ma.enset.stubs.Chat.Response> getSendMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendMessage",
      requestType = ma.enset.stubs.Chat.Message.class,
      responseType = ma.enset.stubs.Chat.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Message,
      ma.enset.stubs.Chat.Response> getSendMessageMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Message, ma.enset.stubs.Chat.Response> getSendMessageMethod;
    if ((getSendMessageMethod = ChatServicesGrpc.getSendMessageMethod) == null) {
      synchronized (ChatServicesGrpc.class) {
        if ((getSendMessageMethod = ChatServicesGrpc.getSendMessageMethod) == null) {
          ChatServicesGrpc.getSendMessageMethod = getSendMessageMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stubs.Chat.Message, ma.enset.stubs.Chat.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ChatServices", "sendMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatServicesMethodDescriptorSupplier("sendMessage"))
                  .build();
          }
        }
     }
     return getSendMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChatServicesStub newStub(io.grpc.Channel channel) {
    return new ChatServicesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChatServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChatServicesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChatServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChatServicesFutureStub(channel);
  }

  /**
   */
  public static abstract class ChatServicesImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Client> connexion(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(getConnexionMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Client> disconnect(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(getDisconnectMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Channel> join(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(getJoinMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.ClientList> listClient(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.ResponseClientList> responseObserver) {
      return asyncUnimplementedStreamingCall(getListClientMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Channel> leave(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(getLeaveMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Message> receiveMessage(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(getReceiveMessageMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Message> sendMessage(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConnexionMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ma.enset.stubs.Chat.Client,
                ma.enset.stubs.Chat.Response>(
                  this, METHODID_CONNEXION)))
          .addMethod(
            getDisconnectMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ma.enset.stubs.Chat.Client,
                ma.enset.stubs.Chat.Response>(
                  this, METHODID_DISCONNECT)))
          .addMethod(
            getJoinMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ma.enset.stubs.Chat.Channel,
                ma.enset.stubs.Chat.Response>(
                  this, METHODID_JOIN)))
          .addMethod(
            getListClientMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ma.enset.stubs.Chat.ClientList,
                ma.enset.stubs.Chat.ResponseClientList>(
                  this, METHODID_LIST_CLIENT)))
          .addMethod(
            getLeaveMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ma.enset.stubs.Chat.Channel,
                ma.enset.stubs.Chat.Response>(
                  this, METHODID_LEAVE)))
          .addMethod(
            getReceiveMessageMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ma.enset.stubs.Chat.Message,
                ma.enset.stubs.Chat.Response>(
                  this, METHODID_RECEIVE_MESSAGE)))
          .addMethod(
            getSendMessageMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ma.enset.stubs.Chat.Message,
                ma.enset.stubs.Chat.Response>(
                  this, METHODID_SEND_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class ChatServicesStub extends io.grpc.stub.AbstractStub<ChatServicesStub> {
    private ChatServicesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatServicesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServicesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatServicesStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Client> connexion(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Response> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getConnexionMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Client> disconnect(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Response> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getDisconnectMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Channel> join(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Response> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getJoinMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.ClientList> listClient(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.ResponseClientList> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getListClientMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Channel> leave(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Response> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getLeaveMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Message> receiveMessage(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Response> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getReceiveMessageMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Message> sendMessage(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Response> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ChatServicesBlockingStub extends io.grpc.stub.AbstractStub<ChatServicesBlockingStub> {
    private ChatServicesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatServicesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServicesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatServicesBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class ChatServicesFutureStub extends io.grpc.stub.AbstractStub<ChatServicesFutureStub> {
    private ChatServicesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatServicesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServicesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatServicesFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CONNEXION = 0;
  private static final int METHODID_DISCONNECT = 1;
  private static final int METHODID_JOIN = 2;
  private static final int METHODID_LIST_CLIENT = 3;
  private static final int METHODID_LEAVE = 4;
  private static final int METHODID_RECEIVE_MESSAGE = 5;
  private static final int METHODID_SEND_MESSAGE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChatServicesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChatServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONNEXION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.connexion(
              (io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Response>) responseObserver);
        case METHODID_DISCONNECT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.disconnect(
              (io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Response>) responseObserver);
        case METHODID_JOIN:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.join(
              (io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Response>) responseObserver);
        case METHODID_LIST_CLIENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.listClient(
              (io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.ResponseClientList>) responseObserver);
        case METHODID_LEAVE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.leave(
              (io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Response>) responseObserver);
        case METHODID_RECEIVE_MESSAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.receiveMessage(
              (io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Response>) responseObserver);
        case METHODID_SEND_MESSAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendMessage(
              (io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Response>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ChatServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChatServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.enset.stubs.Chat.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChatServices");
    }
  }

  private static final class ChatServicesFileDescriptorSupplier
      extends ChatServicesBaseDescriptorSupplier {
    ChatServicesFileDescriptorSupplier() {}
  }

  private static final class ChatServicesMethodDescriptorSupplier
      extends ChatServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChatServicesMethodDescriptorSupplier(String methodName) {
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
      synchronized (ChatServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChatServicesFileDescriptorSupplier())
              .addMethod(getConnexionMethod())
              .addMethod(getDisconnectMethod())
              .addMethod(getJoinMethod())
              .addMethod(getListClientMethod())
              .addMethod(getLeaveMethod())
              .addMethod(getReceiveMessageMethod())
              .addMethod(getSendMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}

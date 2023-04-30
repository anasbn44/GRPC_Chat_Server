package ma.enset.service;

import com.google.protobuf.Timestamp;
import io.grpc.stub.StreamObserver;
import ma.enset.stubs.Chat;
import ma.enset.stubs.ChatServicesGrpc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Servises extends ChatServicesGrpc.ChatServicesImplBase {

    Map<Chat.Client, StreamObserver<Chat.Response>> clientStreamObserver = new HashMap<>();
    List<Chat.ChannelMenbers> channelMenbers = new ArrayList<>();

    @Override
    public StreamObserver<Chat.Client> connexion(StreamObserver<Chat.Response> responseObserver) {
        return new StreamObserver<Chat.Client>() {
            @Override
            public void onNext(Chat.Client client) {
                Chat.Response response = Chat.Response.newBuilder()
                        .setTimestamp(Timestamp.newBuilder().setSeconds(System.currentTimeMillis()).build())
                        .setType(Chat.ResponseType.ISCONNECTED)
                        .build();
                if (clientStreamObserver.containsKey(client)){
                    response.toBuilder().setType(Chat.ResponseType.ALREADY_EXIST);
                    responseObserver.onNext(response);
                    return;
                }
                clientStreamObserver.put(client, responseObserver);
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        };
    }

    @Override
    public StreamObserver<Chat.Client> disconnect(StreamObserver<Chat.Response> responseObserver) {
        return new StreamObserver<Chat.Client>() {
            @Override
            public void onNext(Chat.Client client) {
                Chat.Response response = Chat.Response.newBuilder()
                        .setTimestamp(Timestamp.newBuilder().setSeconds(System.currentTimeMillis()).build())
                        .setType(Chat.ResponseType.DISCONNECTED)
                        .build();
                clientStreamObserver.remove(client);
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        };
    }

    @Override
    public StreamObserver<Chat.Channel> join(StreamObserver<Chat.Response> responseObserver) {
        return new StreamObserver<Chat.Channel>() {
            @Override
            public void onNext(Chat.Channel channel) {
                Chat.Response response = Chat.Response.newBuilder()
                        .setType(Chat.ResponseType.JOINED)
                        .setTimestamp(Timestamp.newBuilder().setSeconds(System.currentTimeMillis()).build())
                        .build();
                Chat.ChannelMenbers menbers = channelMenbers.stream().filter(c -> c.getChannelName().equals(channel.getChanelName())).findFirst().get();
                if (menbers != null){

                    if(menbers.getMembersList().contains(channel.getClient())){
                        response.toBuilder().setType(Chat.ResponseType.ALREADY_EXIST);
                    }else {
                        menbers.toBuilder().addMembers(channel.getClient());
                    }
                    responseObserver.onNext(response);
                    return;
                }
                channelMenbers.add(Chat.ChannelMenbers.newBuilder().setChannelName(channel.getChanelName())
                        .addMembers(channel.getClient()).build());
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        };
    }

    @Override
    public StreamObserver<Chat.ClientList> listClient(StreamObserver<Chat.ResponseClientList> responseObserver) {
        return new StreamObserver<Chat.ClientList>() {
            @Override
            public void onNext(Chat.ClientList clientList) {
                Chat.ResponseClientList.Builder responseClientList = Chat.ResponseClientList.newBuilder()
                        .setTimestamp(Timestamp.newBuilder().setSeconds(System.currentTimeMillis()).build());

                responseObserver.onNext(responseClientList.build());
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        };
    }

    @Override
    public StreamObserver<Chat.Channel> leave(StreamObserver<Chat.Response> responseObserver) {
        return new StreamObserver<Chat.Channel>() {
            @Override
            public void onNext(Chat.Channel channel) {
                Chat.Response response = Chat.Response.newBuilder()
                        .setType(Chat.ResponseType.LEFT)
                        .setTimestamp(Timestamp.newBuilder().setSeconds(System.currentTimeMillis()).build())
                        .build();
                Chat.ChannelMenbers menbers = channelMenbers.stream().filter(c -> c.getChannelName().equals(channel.getChanelName())).findFirst().get();
                menbers.getMembersList().remove(channel.getClient());
                if(menbers.getMembersList().isEmpty()){
                    channelMenbers.remove(menbers);
                }
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        };
    }

    @Override
    public StreamObserver<Chat.Message> sendMessage(StreamObserver<Chat.Response> responseObserver) {
        return new StreamObserver<Chat.Message>() {
            @Override
            public void onNext(Chat.Message message) {
                Chat.Channel channel = message.getChannel();
                Chat.ChannelMenbers channelMenber = channelMenbers.stream().filter(c -> c.getChannelName().equals(channel.getChanelName())).findFirst().get();

                for (Chat.Client c : channelMenber.getMembersList()) {
                    if (!c.equals(channel.getClient())){
                        StreamObserver<Chat.Response> responseStreamObserver = clientStreamObserver.get(c);
                        Chat.Response response = Chat.Response.newBuilder()
                                .setType(Chat.ResponseType.RECIEVED)
                                .setTimestamp(Timestamp.newBuilder().setSeconds(System.currentTimeMillis()).build())
                                .setMessage(message.getText())
                                .build();
                        responseStreamObserver.onNext(response);
                    }
                }

                Chat.Response response = Chat.Response.newBuilder()
                        .setType(Chat.ResponseType.SENT)
                        .setTimestamp(Timestamp.newBuilder().setSeconds(System.currentTimeMillis()).build())
                        .build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        };
    }
}

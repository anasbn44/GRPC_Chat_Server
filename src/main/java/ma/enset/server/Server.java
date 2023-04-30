package ma.enset.server;

import io.grpc.ServerBuilder;
import ma.enset.service.Servises;

import java.io.IOException;

public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        io.grpc.Server server = ServerBuilder.forPort(1997)
                .addService(new Servises())
                .build();
        server.start();
        server.awaitTermination();
    }
}

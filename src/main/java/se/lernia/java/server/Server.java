package se.lernia.java.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private final int port;

    public Server() {
        this.port = 8080;
    }

    public Server(int port) {
        this.port = port;
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    public void start() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (true) {
                Socket socket = serverSocket.accept();
                //Todo: handle client connection in socket object
                System.out.println("Client connected");
                socket.close();
            }
        } catch (IOException e) {

        }


    }


}

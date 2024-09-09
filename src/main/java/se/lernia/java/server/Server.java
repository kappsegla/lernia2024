package se.lernia.java.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

public class Server {

    public final Logger log = Logger.getLogger(Server.class.getName());

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
            log.info("Server listening on port " + port);
            while (true) {
                Socket socket = serverSocket.accept();
                handleClient(socket);
            }
        } catch (IOException e) {

        }
    }

    public void handleClient(Socket socket) {
        log.info("Client connected from " + socket.getRemoteSocketAddress());
        try (Socket clientSocket = socket) {
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream());
            //Todo: handle client send and receive
            //Read http request
            //Send response
            String response = """
                    HTTP/1.1 200 OK
                    Content-Type: text/plain
                    Content-Length: 11
                    
                    Hello World
                    """;
            out.print(response);
            out.flush();
        } catch (IOException e) {
        }
    }
}

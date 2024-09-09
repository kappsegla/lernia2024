package se.lernia.java.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
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
                Thread.ofVirtual().start(() -> handleClient(socket) );
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
            String request = in.readLine();
            String httpMethod = request.split(" ")[0];
            String uri = request.split(" ")[1];

            Servlet servlet = new Servlet();
            var req = new Request(httpMethod, uri);
            in.lines()
                    .forEach(s -> req.headers()
                    .put(s.toLowerCase().split(": ")[0], s.toLowerCase().split(": ")[1]));

            var resp = new Response();
            servlet.service(req, resp);

            String response = "HTTP/1.1 " + resp.statusCode() + "\r\n" +
                              "Content-Type: " + resp.contentType() + "\r\n" +
                              "Content-Length: " + resp.message().getBytes(StandardCharsets.UTF_8).length + "\r\n" +
                              "\r\n" +
                              resp.message();

            out.print(response);
            out.flush();
        } catch (IOException e) {
        }
    }
}

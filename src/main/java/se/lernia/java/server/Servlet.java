package se.lernia.java.server;

public class Servlet {

    void service(Request req, Response res) {
        res.statusCode("200 OK");
        res.contentType("text/plain");
        res.message("Hello World");
    }
}

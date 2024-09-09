package se.lernia.java.server;

import java.util.HashMap;

public class Request {
    private String httpMethod;
    private String uri;
    private HashMap<String, String> headers = new HashMap<>();

    public Request(String httpMethod, String uri) {
        this.httpMethod = httpMethod;
        this.uri = uri;
    }

    public String httpMethod() {
        return httpMethod;
    }

    public String uri() {
        return uri;
    }

    public HashMap<String, String> headers() {
        return headers;
    }
}

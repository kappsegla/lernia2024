package se.lernia.java.tdd;

public class DummyAuthorizer implements Authorizer {

    @Override
    public boolean authorize(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

package se.lernia.java.tdd;

public class StubAuthorizer implements Authorizer {
    @Override
    public boolean authorize(String username, String password) {
        return true;
    }
}

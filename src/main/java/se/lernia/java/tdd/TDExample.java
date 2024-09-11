package se.lernia.java.tdd;

public class TDExample {
    private final Authorizer authorizer;
    private boolean hasDoneStuff = false;

    public TDExample(Authorizer authorizer) {
        if( authorizer == null )
            throw new IllegalArgumentException("Authorizer cannot be null");
        this.authorizer = authorizer;
    }

    public void doStuff(String username, String password) {
        if( authorizer.authorize(username, password) )
            hasDoneStuff = true;
        else
            hasDoneStuff = false;
    }

    public boolean hasDoneStuff() {
        return hasDoneStuff;
    }
}

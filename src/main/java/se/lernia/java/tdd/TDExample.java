package se.lernia.java.tdd;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

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

    public TimeAndPrice getPrice(){
        return new TimeAndPrice(LocalTime.of(12,0), 100);
    }
}

record TimeAndPrice(LocalTime time, int price) {}

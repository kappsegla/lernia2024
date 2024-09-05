package se.lernia.java.method;

public class Recursion {

    public static void main(String[] args) {
        loop(10);
    }

    public static void loop(int n) {
        if (n == 0)
            return;
        System.out.println("We are in a recursive call: " + n);
        loop(n - 1);
    }
}

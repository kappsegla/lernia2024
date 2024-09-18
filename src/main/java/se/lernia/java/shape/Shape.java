package se.lernia.java.shape;

public class Shape {
    Cylinder cylinder;

    public static void main(String[] args) {
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();

        cylinder.height = 10;

        Object o = new Circle();
        Object o2 = new Cylinder();
    }
}

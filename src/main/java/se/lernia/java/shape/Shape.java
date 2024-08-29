package se.lernia.java.shape;

public class Shape {
    Cylinder cylinder;

    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle2 = new Cylinder();
        Cylinder cylinder = new Cylinder();

        circle.radius = 1;
        circle2.radius = 1;
        cylinder.radius = 1;
        cylinder.height = 10;

        Object o = new Circle();
        Object o2 = new Cylinder();


    }
}

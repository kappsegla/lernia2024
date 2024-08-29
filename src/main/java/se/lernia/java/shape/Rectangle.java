package se.lernia.java.shape;

import java.awt.*;

public class Rectangle {
    private int width;
    private int height;
    private Color color;

    public Rectangle(int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public Color getColor() {
        return color;
    }
    public int calculateArea() {
        return width * height;
    }

    public static void main(String[] args) {
        int i = 0;
    }
}

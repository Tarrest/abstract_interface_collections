package com.chisw.interface_example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        Shape shape = new Circle(24, "Red");
        shapes.add(shape);
        shapes.add(new Rectangle(12, 45, "Blue"));

        printShapes(shapes);

    }

    public static void printShapes(ArrayList<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println("Name: " + shape.getName());
            System.out.println("Color: " + shape.getColor());
            System.out.println("Square: "  + shape.getSquare());
            System.out.println("" );
        }
    }
}

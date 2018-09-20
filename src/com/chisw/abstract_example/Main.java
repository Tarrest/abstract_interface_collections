package com.chisw.abstract_example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        Shape shape = new Circle("wqwqw", "ewqeqw", 25);
        shapes.add(shape);
        shapes.add(new Rectangle( "Red","test1",12, 45));
        shapes.add(new Rectangle("fafaf", "test2", 22, 47));

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

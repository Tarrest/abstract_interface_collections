package com.chisw.abstract_example;

public class  Circle extends Shape {

    private double radius;

    public Circle( String color, String name, double radius) {
        super(color, name);
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return 3.14 * radius * radius;
    }

}

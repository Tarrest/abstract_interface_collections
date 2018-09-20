package com.chisw.interface_example;

public class Circle implements Shape {

    private double radius;
    private  String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getSquare() {
        return 3.14 * radius * radius;
    }

    @Override
    public String getColor() {
        return color;
    }
}

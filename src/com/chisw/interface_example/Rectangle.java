package com.chisw.interface_example;

public class Rectangle implements Shape {

    private double a;
    private double b;
    private String color;

    public Rectangle(double a, double b, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }

    @Override
    public String getName() {
        return "rectangle";
    }

    @Override
    public double getSquare() {
        return a * b;
    }

    @Override
    public String getColor() {
        return color;
    }
}

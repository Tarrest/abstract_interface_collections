package com.chisw.abstract_example;

public class Rectangle extends Shape {

    private double a;
    private double b;

    public Rectangle(String color,String name,double a, double b) {
        super(color, name);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getSquare() {
        return a * b;
    }

}

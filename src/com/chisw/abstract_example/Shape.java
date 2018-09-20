package com.chisw.abstract_example;

public abstract class Shape {

    public String color;
    public String name;

    public Shape(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getName(){
        return name;
    };

    public abstract double getSquare();

    public String getColor(){
        return color;
    };

}

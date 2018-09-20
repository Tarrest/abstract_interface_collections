package com.chisw.interface_example;

public interface Shape {

    String color = "green";

    String getName();
    double getSquare();

    //String getColor();


    default String getColor() {
      return color;
    }
}

package com.chisw.generics_example;

public class TryGenericMethod {

    public static void main(String[] args) {
        char y = 'Ͱ';
        printAnyVariable(12345);
        printAnyVariable("qwerty");
        printAnyVariable(5.6666);
        printAnyVariable(y);
    }

    private static <T> void printAnyVariable(T var) {
        System.out.println(var);
    }


}

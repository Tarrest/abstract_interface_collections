package com.chisw.collections.hash_set_example;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetExample {

    public static void main(String[] args) {
        Set<String> rockBands = new HashSet<>();
        //Creating a HashSet and adding new elements to it.
        rockBands.add("one");
        rockBands.add("one");
        rockBands.add("one");
        rockBands.add("two");
        rockBands.add("two");
        rockBands.add("");
        rockBands.add(" ");
        rockBands.add(" ");
        rockBands.add("second");
        rockBands.add("onetwo");
        rockBands.add("onetwotwo");
        rockBands.add("onetwotwo");
        System.out.println(rockBands);
    }

}
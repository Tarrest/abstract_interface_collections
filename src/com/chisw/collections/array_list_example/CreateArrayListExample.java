package com.chisw.collections.array_list_example;

import java.util.ArrayList;

public class CreateArrayListExample {

    public static void main(String[] args) {

        // create an ArrayList
        ArrayList<String> aList = new ArrayList<>();
        System.out.println(aList.size());

        // add elements to an ArrayList
        aList.add("222");
        aList.add("222");
        aList.add("222");
        aList.add("222");
        aList.add("222");
        aList.add("https://uk.wikipedia.org/wiki/");
        aList.add(5, "333");
        System.out.println(aList.size());
        System.out.println(aList.toString());


        // remove elements from ArrayList
        aList.remove("222");
        System.out.println(aList.toString());

        aList.remove("333");
        System.out.println(aList.toString());

        aList.remove(4);
        System.out.println(aList.toString());

        // Iterating ArrayList
        for (String i: aList) {
            System.out.println(i);
        }



    }

}

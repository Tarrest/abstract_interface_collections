package com.chisw.abstract_example2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<TestAbstract> goods = new ArrayList<>();
        SubTest el = new SubTest("rrrr", "oooo", "mmmm");
        SubTestTwo el2 = new SubTestTwo("1111", "22", "3333", "22");
        goods.add(el);
        goods.add(el2);
        printThat(goods);
    }

    public static void printThat(List<TestAbstract> goods) {
        for (TestAbstract thing : goods) {
            System.out.println("method one: " + thing.setTest1());
            System.out.println("method two: " + thing.setTest2());
            System.out.println("method three: " + thing.concatMore());
            System.out.println("method four: " + thing.concatThis());
            System.out.println(" ");
        }
    }
}

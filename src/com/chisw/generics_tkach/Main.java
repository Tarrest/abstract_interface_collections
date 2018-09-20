package com.chisw.generics_tkach;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List rawList = new ArrayList();
        List<String> list = new ArrayList<>();

        rawList = list;
        rawList.add(8);
        System.out.println(rawList.toString());

        String s = list.get(0);
    }
}

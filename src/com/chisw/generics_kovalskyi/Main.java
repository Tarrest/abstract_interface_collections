package com.chisw.generics_kovalskyi;

public class Main {

    public static void main(String[] args) {
        final Tuple<String> stringTuple = new Tuple<>("left", "right");
        final Tuple<Integer> integerTuple = new Tuple<>(1111, 2222);
        System.out.println(stringTuple.getLeft());
        System.out.println(integerTuple.getLeft() + 1111  );
        System.out.println(stringTuple.getRight() );
        System.out.println(integerTuple.getRight() );
        //Tuple<String> stringTuple = new Tuple<>("", "");
        Tuple<SuperClass> sTuple = new Tuple<>(new SuperClass(), new SuperClass());
        System.out.println(sTuple.getRight());
        System.out.println(sTuple.getLeft());

    }

    private static class SuperClass {
        @Override
        public String toString() {
            return "super";
        }
    }

}

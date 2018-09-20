package com.chisw.collections.hash_set_example;

import java.util.*;

public class CreateHashSetFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> numberDiv5 = new ArrayList<>();
        numberDiv5.add(520);
        numberDiv5.add(15);
        numberDiv5.add(45);
        numberDiv5.add(525);
        numberDiv5.add(530);
        numberDiv5.add(5);

        List<Integer> numberDiv3 = new ArrayList<>();
        numberDiv3.add(4);
        numberDiv3.add(15);
        numberDiv3.add(45);
        numberDiv3.add(15);
        numberDiv3.add(30);
        numberDiv3.add(33);

        Set<Integer> numbers = new HashSet<>();
        numbers.addAll(numberDiv3);
        numbers.addAll(numberDiv5);

        ArrayList<Integer> listNums = new ArrayList<>();
        listNums.addAll(numberDiv3);
        listNums.addAll(numberDiv5);
        Collections.sort(listNums);

        Set<Integer> numbers2 = new HashSet<>();
        numbers2.addAll(numberDiv5);

        System.out.println(numbers);
        System.out.println("");

        numbers.forEach(number -> {
            System.out.println(number);
        });
        System.out.println("");


        getIntegerIterator(numbers);
        System.out.println("");
        getIntegerIteratorForList(listNums);


    }

    private static Iterator<Integer> getIntegerIterator(Set<Integer> testHash) {
        Iterator<Integer> numsIterator = testHash.iterator();
        while (numsIterator.hasNext()) {
            for (int i = 0; i < testHash.size(); i++) {
                System.out.println(i + "ый эелемент в хешлисте = " + numsIterator.next());
            }
        }
        return numsIterator;
    }


    private static Iterator<Integer> getIntegerIteratorForList(ArrayList<Integer> testList) {
        Iterator<Integer> nums2Iterator = testList.iterator();
        while (nums2Iterator.hasNext()) {
            for (int i = 0; i < testList.size(); i++) {
                System.out.println(i + "ый эелемент в хешлисте = " + nums2Iterator.next());
            }
        }
        return nums2Iterator;
    }


}

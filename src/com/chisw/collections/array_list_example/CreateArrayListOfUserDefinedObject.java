package com.chisw.collections.array_list_example;

import java.util.ArrayList;
import java.util.Iterator;

public class CreateArrayListOfUserDefinedObject {

    public static void main(String[] args) {

        Trees oak = new Trees(300, "Oak");

        ArrayList<Trees> treesArrayList = new ArrayList<>();
        treesArrayList.add(oak);
        treesArrayList.add(new Trees(150, "Ftreerrr8"));
        treesArrayList.add(new Trees(170, "Dtree2"));
        treesArrayList.add(new Trees(160, "Etree4rrrrrrrrrr5"));
        treesArrayList.add(new Trees(150, "Kree6eeeee"));
        treesArrayList.add(new Trees(140, "Bree5rrrrrrrrr"));
        treesArrayList.add(new Trees(130, "Cree0rrrrrrrr"));
        System.out.println(treesArrayList.toString());

        // Updating index
        treesArrayList.set(4, new Trees(001, "Update Tree"));
        // Gives the index of the object
        System.out.println("Gives the index of the object: " + treesArrayList.indexOf(oak));
        // returns the object of list which is present at the specified index
        System.out.println("returns the object of list which is present at the specified index: " + treesArrayList.get(0));
        // gives the size of the ArrayList
        System.out.println("gives the size of the ArrayList: " + treesArrayList.size());
        // checks whether the given object o is present in the array list
        System.out.println("checks whether the given object o is present in the array list: " + treesArrayList.contains(oak));

        //Collections.sort(treesArrayList, Comparator.comparing(Trees::getNameOfTree).reversed());
        StringLengthComparator stringLengthComparator = new StringLengthComparator();
        treesArrayList.sort(stringLengthComparator.reversed());

        Iterator<Trees> treesIterator = treesArrayList.iterator();
        while (treesIterator.hasNext()) {
            System.out.println(treesIterator.next().toString());
            //System.out.println(treesIterator.next().getNameOfTree());
            //System.out.println("Дерево: " + treesIterator.next().getNameOfTree()+ " " + "Время жизни: " + treesIterator.next().getYearsOfLiving());
        }

        for (int i = 0; i < treesArrayList.size(); i++) {
            System.out.println("Дерево: " + treesArrayList.get(i).getNameOfTree()
                    + " " + "Время жизни: " + treesArrayList.get(i).getYearsOfLiving());
        }

        // delete all elements
        treesArrayList.clear();
        System.out.println(treesArrayList.toString());




    }

}

package com.chisw.collections.array_list_example;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<Trees> {
    @Override
    public int compare(Trees o1, Trees o2) {
        int len1 = o1.getNameOfTree().length();
        int len2 = o2.getNameOfTree().length();

        if (len1 > len2) {
            return 1;
        } else if (len1 < len2) {
            return -1;
        }
        return 0;
    }
}

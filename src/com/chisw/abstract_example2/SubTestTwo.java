package com.chisw.abstract_example2;

public class SubTestTwo extends TestAbstract{

    private String moreOne;
    private String moreTwo;
    private String test3;

    public SubTestTwo(String test1, String test2, String moreOne, String moreTwo) {
        super(test1, test2);
        this.moreOne = moreOne;
        this.moreTwo = moreTwo;
    }

    @Override
    public String setTest2() {
        return test3 = test2 + moreTwo;
    }

    @Override
    public String concatMore() {
        return test1 + " " + test3 + " " + moreOne + " " + moreTwo;
    }
}

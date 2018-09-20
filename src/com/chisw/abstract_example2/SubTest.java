package com.chisw.abstract_example2;

public class SubTest extends TestAbstract {

    private String moreOne;
    private String test3;

    public SubTest(String test1, String test2, String moreOne) {
        super(test1, test2);
        this.moreOne = moreOne;
    }

    @Override
    public String setTest2() {
        return test3 = test2 + moreOne;
    }

    @Override
    public String concatMore() {
        return test1 + " " + test3 + " " + moreOne;
    }
}

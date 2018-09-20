package com.chisw.abstract_example2;

public abstract class TestAbstract {

    public String test1;
    public String test2;

    public TestAbstract(String test1, String test2) {
        this.test1 = test1;
        this.test2 = test2;
    }

    public String setTest1() {
        return test1 + test1;
    };

    public abstract String setTest2();

    public String concatThis() {
        return test1 + " " + test2;
    }

    public abstract String concatMore();
}

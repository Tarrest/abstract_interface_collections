package com.chisw.collections.array_list_example;

import java.util.Objects;

public class Trees{

    private int yearsOfLiving;
    private String nameOfTree;

    public Trees(int yearsOfLiving, String nameOfTree) {
        this.nameOfTree = nameOfTree;
        this.yearsOfLiving = yearsOfLiving;
    }

    public int getYearsOfLiving() {
        return yearsOfLiving;
    }

    public void setYearsOfLiving(int yearsOfLiving) {
        this.yearsOfLiving = yearsOfLiving;
    }

    public String getNameOfTree() {
        return nameOfTree;
    }

    public void setNameOfTree(String nameOfTree) {
        this.nameOfTree = nameOfTree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trees trees = (Trees) o;
        return yearsOfLiving == trees.yearsOfLiving &&
                Objects.equals(nameOfTree, trees.nameOfTree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearsOfLiving, nameOfTree);
    }


    @Override
    public String toString() {
        return "Trees{" +
                "yearsOfLiving=" + yearsOfLiving +
                ", nameOfTree='" + nameOfTree + '\'' +
                '}';
    }

}
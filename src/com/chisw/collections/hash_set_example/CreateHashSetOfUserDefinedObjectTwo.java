package com.chisw.collections.hash_set_example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class CreateHashSetOfUserDefinedObjectTwo {

    static class Car {

        private int airbags;
        private String brands;
        private boolean abs;

        public Car(int airbags, String brands, boolean abs) {
            this.airbags = airbags;
            this.brands = brands;
            this.abs = abs;
        }

        public int getAirbags() {
            return airbags;
        }

        public String getBrands() {
            return brands;
        }

        public boolean isAbs() {
            return abs;
        }

        public void setAirbags(int airbags) {
            this.airbags = airbags;
        }

        public void setBrands(String brands) {
            this.brands = brands;
        }

        public void setAbs(boolean abs) {
            this.abs = abs;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Car car = (Car) o;
            return airbags == car.airbags &&
                    abs == car.abs &&
                    Objects.equals(brands, car.brands);
        }

        @Override
        public int hashCode() {
            return Objects.hash(airbags, brands, abs);
        }

        @Override
        public String toString() {
            return "Car{" +
                    "airbags=" + airbags +
                    ", brands='" + brands + '\'' +
                    ", abs=" + abs +
                    '}';
        }
    }

    public static void main(String[] args) {

        int sum = 0;
        int sumSet = 0;

        Set<Car> cars = new HashSet<>();
        cars.add(new Car(6, "BMV4", true));
        cars.add(new Car(2, "BMV3", true));
        cars.add(new Car(1, "BMV2", false));
        cars.add(new Car(0, "BMV2", true));
        cars.add(new Car(4, "BMV1", false));
        cars.add(new Car(2, "BMV1", false));
        cars.add(new Car(4, "BMV1", true));

        Iterator<Car> carIterator = cars.iterator();

        while (carIterator.hasNext()) {
            for (int i = 0; i < cars.size(); i++) {
                if (carIterator.next().getBrands().contains("BMV1")) {
                    sumSet++;
                }
            }
            System.out.println("машин BMV: " + sumSet + " штук");
        }



        String[] carsArray = new String[5];
        carsArray[0] = "BMV";
        carsArray[1] = "BMV";
        carsArray[2] = "BMV3";
        carsArray[3] = "BMV4";
        carsArray[4] = "BMV";

        for (int i = 0; i < carsArray.length; i++) {
            if (carsArray[i].equals("BMV")) {
                sum ++;
            }
        }
        System.out.println("машин BMV: " + sum + " штук");

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
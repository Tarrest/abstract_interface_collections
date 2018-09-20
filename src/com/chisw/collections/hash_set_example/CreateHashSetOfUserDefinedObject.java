package com.chisw.collections.hash_set_example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class CreateHashSetOfUserDefinedObject {

    static class Human {
        private int age;
        private String name;

        public Human(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int i) {
            this.age = i;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Human human = (Human) o;
            return age == human.age &&
                    Objects.equals(name, human.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }

        @Override
        public String toString() {
            return "Human{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        Set<Human> humans = new HashSet<>();
        humans.add(new Human(12, "eeeee"));
        humans.add(new Human(12, "eeeee"));
        humans.add(new Human(12, "eeeee"));
        humans.add(new Human(13, "eeeee"));
        humans.add(new Human(14, "eeeee"));

        Human human1 = new Human(11, "ffff");
        humans.add(human1);

/*      Iterator<Human> iterator = humans.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        human1.setAge(17);
        Human human2 = new Human(17, "ffff");
        Human human3 = new Human(17, "ffff");
        humans.add(human2);
        humans.add(human3);

        if(human1.equals(human3)) {
            System.out.println("true");

        }

        Iterator<Human> iterator = humans.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

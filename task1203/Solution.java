package com.javarush.task.task12.task1203;

/* 
Кесарю — кесарево
*/

public class Solution {
    public static void main(String[] args) {
        Pet pet1 = new Cat();
        Cat cat = (Cat)pet1.getChild();

        Pet pet2 = new Dog();
        Dog dog = (Dog)pet2.getChild();
    }

    public static class Pet {
        public Pet getChild() {
            return new Pet();
        }
    }

    public static class Cat extends Pet {
        @Override
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {
        @Override
        public Pet getChild() {
            return new Dog();
        }
    }
}

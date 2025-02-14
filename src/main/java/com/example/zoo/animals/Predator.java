package com.example.zoo.animals;


public class Predator extends Animal {
    public Predator(String name, int food, int number) {
        super(name, food, number);
    }

    @Override
    public void eat() {
        System.out.println(name + " ест мясо: " + food + " кг в день.");
    }
}
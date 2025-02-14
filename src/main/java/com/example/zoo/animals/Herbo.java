package com.example.zoo.animals;

public class Herbo extends Animal {
    public Herbo(String name, int food, int number) {
        super(name, food, number);
    }

    @Override
    public void eat() {
        System.out.println(name + " ест траву: " + food + " кг в день.");
    }
}
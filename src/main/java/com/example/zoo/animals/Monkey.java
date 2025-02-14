package com.example.zoo.animals;

public class Monkey extends Animal {
    public Monkey(String name, int food, int number) {
        super(name, food, number);
    }

    @Override
    public void eat() {
        System.out.println(name + " ест бананы: " + food + " кг в день.");
    }
}
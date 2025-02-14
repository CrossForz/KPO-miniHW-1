package com.example.zoo.animals;

public class Wolf extends Animal {
    public Wolf(String name, int food, int number) {
        super(name, food, number);
    }

    @Override
    public void eat() {
        System.out.println(name + " ест мясо: " + food + " кг в день.");
    }
}
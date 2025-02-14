package com.example.zoo.animals;

public class Tiger extends Animal {
    public Tiger(String name, int food, int number) {
        super(name, food, number);
    }

    @Override
    public void eat() {
        System.out.println(name + " ест мясо: " + food + " кг в день.");
    }
}
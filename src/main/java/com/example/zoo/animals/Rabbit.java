package com.example.zoo.animals;

public class Rabbit extends Animal {
    public Rabbit(String name, int food, int number) {
        super(name, food, number);
    }

    @Override
    public void eat() {
        System.out.println(name + " ест морковь: " + food + " кг в день.");
    }
}
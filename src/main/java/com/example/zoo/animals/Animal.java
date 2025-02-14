package com.example.zoo.animals;

import com.example.zoo.interfaces.IAlive;
import com.example.zoo.interfaces.IInventory;

public abstract class Animal implements IAlive, IInventory {
    public String name;
    protected int food;
    protected int number;

    public Animal(String name, int food, int number) {
        this.name = name;
        this.food = food;
        this.number = number;
    }

    @Override
    public int getFood() {
        return food;
    }

    @Override
    public int getNumber() {
        return number;
    }

    public abstract void eat();
}
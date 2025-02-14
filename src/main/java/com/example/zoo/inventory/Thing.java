package com.example.zoo.inventory;


import com.example.zoo.interfaces.IInventory;

public abstract class Thing implements IInventory {
    public String name;
    protected int number;

    public Thing(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public int getNumber() {
        return number;
    }
}

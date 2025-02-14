package com.example.zoo.management;

import com.example.zoo.animals.Animal;
import com.example.zoo.animals.Herbo;
import com.example.zoo.animals.Monkey;
import com.example.zoo.animals.Rabbit;
import com.example.zoo.inventory.Thing;

import java.util.ArrayList;
import java.util.List;

public class ZooManager {
    private final List<Animal> animals = new ArrayList<>();
    private final List<Thing> inventory = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void addInventoryItem(Thing item) {
        inventory.add(item);
    }

    public void feedAnimals() {
        animals.forEach(Animal::eat);
    }

    public void performInventory() {
        System.out.println("Инвентаризация животных:");
        animals.forEach(animal -> System.out.println(animal.name + " - Номер: " + animal.getNumber()));
        System.out.println("Инвентаризация вещей:");
        inventory.forEach(item -> System.out.println(item.name + " - Номер: " + item.getNumber()));
    }

    public void printFoodConsumption() {
        int totalFood = animals.stream().mapToInt(Animal::getFood).sum();
        System.out.println("Общее потребление еды: " + totalFood + " кг в день.");
    }

    public void printContactZooAnimals() {
        System.out.println("Животные для контактного зоопарка:");
        animals.stream()
                .filter(animal -> animal instanceof Herbo || animal instanceof Monkey || animal instanceof Rabbit)
                .forEach(animal -> System.out.println(animal.name));
    }
}
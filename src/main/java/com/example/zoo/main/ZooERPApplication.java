package com.example.zoo.main;

import com.example.zoo.animals.*;
import com.example.zoo.config.AppConfig;
import com.example.zoo.inventory.Computer;
import com.example.zoo.inventory.Table;
import com.example.zoo.inventory.Thing;
import com.example.zoo.management.ZooManager;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ZooERPApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ZooManager zooManager = context.getBean(ZooManager.class);

        Animal lion = new Predator("Лев", 7, 1);
        Animal deer = new Herbo("Олень", 3, 2);
        Animal monkey = new Monkey("Обезьяна", 2, 3);
        Animal rabbit = new Rabbit("Кролик", 1, 4);
        Animal tiger = new Tiger("Тигр", 8, 5);
        Animal wolf = new Wolf("Волк", 6, 6);

        Thing table = new Table("Стол", 101);
        Thing computer = new Computer("Компьютер", 102);

        zooManager.addAnimal(lion);
        zooManager.addAnimal(deer);
        zooManager.addAnimal(monkey);
        zooManager.addAnimal(rabbit);
        zooManager.addAnimal(tiger);
        zooManager.addAnimal(wolf);

        zooManager.addInventoryItem(table);
        zooManager.addInventoryItem(computer);

        zooManager.feedAnimals();
        zooManager.performInventory();
        zooManager.printFoodConsumption();
        zooManager.printContactZooAnimals();

        context.close();
    }
}
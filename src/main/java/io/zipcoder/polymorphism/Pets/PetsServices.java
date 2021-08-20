package io.zipcoder.polymorphism.Pets;

import java.util.ArrayList;
import java.util.List;

public class PetsServices<T extends Pets> {

    List<Pets> petList = new ArrayList<>();



    public boolean addToList(Pets pet){
     petList.add(pet);
     return petList.contains(pet);
    }

    public Pets createDog(String type, String name, String color){
        Dog dog = new Dog(type, name, color);
        addToList(dog);
        return dog;
    }

    public Pets createCat(String type, String name, String color){
        Cat cat = new Cat(type, name, color);
        addToList(cat);
        return cat;
    }

    public Pets createUnicorn(String type, String name, String color){
        Unicorn unicorn = new Unicorn(type, name, color);
        addToList(unicorn);
        return unicorn;
    }

}

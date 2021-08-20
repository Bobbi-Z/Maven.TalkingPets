package io.zipcoder.polymorphism.Pets;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class PetsServices{

    static List<Pets> petList = new ArrayList<>();

    public static boolean addToList(Pets pet){
     petList.add(pet);
     return petList.contains(pet);
    }

    public static List<Pets> getPetList() {
        return petList;
    }

    public static boolean delete(String type, String name){
        for (int index = 0; index < petList.size(); index++){
            Pets current = petList.get(index);
            String currentType = current.getType();
            String currentName = current.getName();
            if (Objects.equals(currentType, type) && Objects.equals(currentName, name)){
                petList.remove(current);
                return petList.contains(current);
            }
        }
        return false;
    }

    public static void splitStringBy(Pets pet){


    }

    public static boolean clearWholeList(){
        petList.clear();
        return petList.isEmpty();
    }

    public static Pets whatPetToCreate(String type, String name, String color){
        switch (type){
            case "dog":
                return createDog(type, name, color);
            case "cat":
                return createCat(type, name, color);
            case "unicorn":
                return createUnicorn(type, name, color);
        }
        return null;
    }

    public static Dog createDog(String type, String name, String color){
        Dog dog = new Dog(type, name, color);
        addToList(dog);
        return dog;
    }

    public static Cat createCat(String type, String name, String color){
        Cat cat = new Cat(type, name, color);
        addToList(cat);
        return cat;
    }

    public static Unicorn createUnicorn(String type, String name, String color){
        Unicorn unicorn = new Unicorn(type, name, color);
        addToList(unicorn);
        return unicorn;
    }

}

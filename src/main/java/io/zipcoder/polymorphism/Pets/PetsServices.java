package io.zipcoder.polymorphism.Pets;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class PetsServices{

    static List<Pets> petList = new ArrayList<>();

    public static boolean addToList(Pets pet) throws IOException {
     petList.add(pet);
        writeJSON();
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
                return petList.remove(current);
            }
        }
        return false;
    }


    public static boolean clearWholeList(){
        petList.clear();
        return petList.isEmpty();
    }

    public static Pets whatPetToCreate(String type, String name, String color) throws IOException {
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

    public static Dog createDog(String type, String name, String color) throws IOException {
        Dog dog = new Dog(type, name, color);
        addToList(dog);
        return dog;
    }

    public static Cat createCat(String type, String name, String color) throws IOException {
        Cat cat = new Cat(type, name, color);
        addToList(cat);
        return cat;
    }

    public static Unicorn createUnicorn(String type, String name, String color) throws IOException {
        Unicorn unicorn = new Unicorn(type, name, color);
        addToList(unicorn);
        return unicorn;
    }

    public static void writeJSON() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer= mapper.writer(new DefaultPrettyPrinter());
        writer.writeValue(new File("pets.json"), petList);
    }

    public static void readJSON(){
        ObjectMapper mapper = new ObjectMapper();
        try {
            petList = mapper.readValue(new File("pets.json"), new TypeReference<List<Pets>>() {
            });
        } catch (IOException ignored) {

        }
    }

}

package io.zipcoder.polymorphism.Pets;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.module.SimpleModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PetsServices{

    static List<Pets> petList;
    static Integer id = 1;
    
    public PetsServices (List<Pets> petListRead){
        petList = petListRead;
    }
    
    public PetsServices (){
        petList = new ArrayList<>();
    }
    
    public List<Pets> getList(){
        return petList;
    }
    
public void setList (List<Pets> petList){
    PetsServices.petList = petList;
}
    public static boolean addToList(Pets pet)   {
     petList.add(pet);
        writeJSON();
     return petList.contains(pet);
    }

    public static List<Pets> getPetList() {
        return petList;
    }

    public static void delete(String species, String name){
        for (int index = 0; index < petList.size(); index++){
            Pets current = petList.get(index);
            String currentSpecies = current.getSpecies();
            String currentName = current.getName();
            if (Objects.equals(currentSpecies, species) && Objects.equals(currentName, name)){
                petList.remove(current);
            }
        }
    }


    public static void clearWholeList(){
        petList.clear();
    }

    public static Pets whatPetToCreate(String species, String name, String color)   {
        switch (species){
            case "dog":
                return createDog(species, name, color);
            case "cat":
                return createCat(species, name, color);
            case "unicorn":
                return createUnicorn(species, name, color);
        }
        return null;
    }

    public static Dog createDog(String species, String name, String color)   {
        Dog dog = new Dog(id++, species, name, color);
        addToList(dog);
        return dog;
    }

    public static Cat createCat(String species, String name, String color)   {
        Cat cat = new Cat(id++, species, name, color);
        addToList(cat);
        return cat;
    }

    public static Unicorn createUnicorn(String species, String name, String color)   {
        Unicorn unicorn = new Unicorn(id++, species, name, color);
        addToList(unicorn);
        return unicorn;
    }

    public static void writeJSON()  {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer= mapper.writer(new DefaultPrettyPrinter());
        try {
            writer.writeValue(new File("pets.json"), petList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readJSON(){
        ObjectMapper mapper = new ObjectMapper();
        try {
            Pets pets = mapper.readValue(new File("pets.json"), Pets.class);
            addToList(pets);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
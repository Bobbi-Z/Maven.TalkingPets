package io.zipcoder.polymorphism.Pets;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Cat implements Pets {

    private static Integer id;
    private static String species;
    private static String name;
    private static String color;


    public Cat() {

    }

//    public Cat(Integer id, String species, String name, String color) {
//        setId(id);
//        setSpecies(species);
//        setName(name);
//        setColor(color);
//    }

    @Override
    public Integer getId(){
        return id;
    }

    @Override
    public void setId(Integer id){
        Cat.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        Cat.species = species;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        Cat.name = name;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        Cat.color = color;
    }


    public static String speak() {
        return "Meow!";
    }

    public String toString() {
        return "Pet\n" +
                "Species: " + getSpecies() + "\n" +
                "Name: " + getName() + "\n" +
                "Color: " + getColor() + "\n" +
                "They say: " + speak();
    }

    @JsonCreator
    public Cat(@JsonProperty("id") Integer id, @JsonProperty ("species")String species, @JsonProperty("name")String name, @JsonProperty ("color")String color){

        Cat.id = id;
        Cat.species = species;
        Cat.name = name;
        Cat.color = color;
    }
}
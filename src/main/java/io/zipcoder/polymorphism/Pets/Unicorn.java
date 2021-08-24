package io.zipcoder.polymorphism.Pets;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Unicorn implements Pets {

    private static String species;
    private static String name;
    private static String color;
    private static Integer id;
    


    public Unicorn() {

    }

//    public Unicorn(Integer id, String species, String name, String color) {
//        setId(id);
//        setSpecies(species);
//        setName(name);
//        setColor(color);
//    }



    public Integer getId(){
        return id;
    }
    
    public void setId(Integer id){
            Unicorn.id = id;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public void setSpecies(String species) {
    Unicorn.species = species;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        Unicorn.name = name;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        Unicorn.color = color;
    }

    public static String speak() {
        return "*Ethereal music starts playing*";
    }

    @Override
    public String toString() {
        return "Pet\n" +
                "Species: " + getSpecies() + "\n" +
                "Name: " + getName() + "\n" +
                "Color: " + getColor() + "\n" +
                "They say: " + speak();
    }

    public Unicorn(@JsonProperty("id") Integer id, @JsonProperty ("species")String species, @JsonProperty("name")String name, @JsonProperty ("color")String color){

        Unicorn.id = id;
        Unicorn.species = species;
        Unicorn.name = name;
        Unicorn.color = color;
    }
    
}
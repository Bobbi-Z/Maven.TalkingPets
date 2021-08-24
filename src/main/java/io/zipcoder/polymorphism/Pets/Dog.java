package io.zipcoder.polymorphism.Pets;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Dog implements Pets{
    
    private static Integer id;
    private static String species;
    private static String name;
    private static String color;


    public Dog() {

    }

//    public Dog(String dog, String spot, String brown){
//        setSpecies(species);
//        setName(name);
//        setColor(color);
//
//    }
//
//        public Dog(Integer id, String species, String name, String color) { 
//        setId(id);
//       setSpecies(species);
//       setName(name);
//       setColor(color);
//    }


    @Override
    public Integer getId(){
        return id;
    }

    @Override
    public void setId(Integer id){
    Dog.id = id;
    }

    public  String getSpecies() {
        return species;
    }

    public  void setSpecies(String species) {
        Dog.species = species;
    }

    public  String getName() {
        return name;
    }

    public  void setName(String name) {
        Dog.name = name;
    }

    public  String getColor() {
        return color;
    }

    public  void setColor(String color) {
        Dog.color = color;
    }

    public static String speak() {
        return "Woof!";
    }


    public String toString() {
        return "Pet\n" +
                "Species: " + getSpecies() + "\n" +
                "Name: " + getName() + "\n" +
                "Color: " + getColor() + "\n" +
                "They say: " + speak();
    }
    
    @JsonCreator
    public Dog(@JsonProperty("id") Integer id, @JsonProperty ("species")String species, @JsonProperty("name")String name,  @JsonProperty ("color")String color){
        
        Dog.id = id;
        Dog.species = species;
        Dog.name = name;
        Dog.color = color;
    }
}
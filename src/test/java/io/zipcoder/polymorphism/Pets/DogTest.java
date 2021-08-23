package io.zipcoder.polymorphism.Pets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DogTest {

    @Test
    void constructorTest() {
        Integer expectedId = 1;
        String expectedName = "spot";
        String expectedSpecies = "dog";
        String expectedColor = "brown";

        Dog dog = new Dog(expectedId, expectedSpecies, expectedName, expectedColor);

        Integer actualId = dog.getId();
        String actualName = dog.getName();
        String actualSpecies = dog.getSpecies();
        String actualColor = dog.getColor();

        Assertions.assertEquals(expectedId, actualId);
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedSpecies, actualSpecies);
        Assertions.assertEquals(expectedColor, actualColor);
    }

    @Test
    void setNameTest(){
        String expectedName = "spot";
        Dog dog = new Dog();
        dog.setName(expectedName);
        String actualName = dog.getName();
        Assertions.assertEquals(expectedName, actualName);
    }

    @Test
    void setSpeciesTest(){
        String expectedSpecies = "dog";
        Dog dog = new Dog();
        dog.setSpecies(expectedSpecies);
        String actualSpecies = dog.getSpecies();
        Assertions.assertEquals(expectedSpecies, actualSpecies);
    }

    @Test
    void setColorTest(){
        String expectedColor = "brown";
        Dog dog = new Dog();
        dog.setColor(expectedColor);
        String actualColor = dog.getColor();
        Assertions.assertEquals(expectedColor, actualColor);
    }

    @Test
    void makeNoiseTest(){
        String expectedNoise = "Woof!";
        String actualNoise = Dog.speak();
        Assertions.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    void toStringTest(){
        String expected = "Pet\n" +
                          "Species: dog\n" +
                          "Name: Spot\n" +
                          "Color: Brown\n" +
                          "They say: Woof!";
        Dog dog = new Dog(1, "dog", "Spot", "Brown");
        String actual = dog.toString();
        Assertions.assertEquals(expected, actual);
    }
}
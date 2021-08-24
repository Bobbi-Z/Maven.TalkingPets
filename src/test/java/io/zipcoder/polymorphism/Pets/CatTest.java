package io.zipcoder.polymorphism.Pets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class CatTest {
    

    @Test
    void constructorTest() {
        Integer expectedId = 1;
        String expectedName = "patches";
        String expectedSpecies = "cat";
        String expectedColor = "calico";

        Cat cat = new Cat(expectedId, expectedSpecies, expectedName, expectedColor);

        Integer actualId =cat.getId();
        String actualName = cat.getName();
        String actualSpecies = cat.getSpecies();
        String actualColor = cat.getColor();

        Assertions.assertEquals(expectedId, actualId);
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedSpecies, actualSpecies);
        Assertions.assertEquals(expectedColor, actualColor);
    }

    @Test
    void setNameTest(){
        String expectedName = "patches";
        Cat cat = new Cat();
        cat.setName(expectedName);
        String actualName = cat.getName();
        Assertions.assertEquals(expectedName, actualName);
    }

    @Test
    void setSpeciesTest(){
        String expectedSpecies = "cat";
        Cat cat = new Cat();
        cat.setSpecies(expectedSpecies);
        String actualSpecies = cat.getSpecies();
        Assertions.assertEquals(expectedSpecies, actualSpecies);
    }

    @Test
    void setColorTest(){
        String expectedColor = "calico";
        Cat cat = new Cat();
        cat.setColor(expectedColor);
        String actualColor = cat.getColor();
        Assertions.assertEquals(expectedColor, actualColor);
    }

    @Test
    void makeNoiseTest(){
        String expectedNoise = "Meow!";
        String actualNoise = Cat.speak();
        Assertions.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    void toStringTest(){
        String expected = "Pet\n" +
                "Species: cat\n" +
                "Name: Patches\n" +
                "Color: Calico\n" +
                "They say: Meow!";
        Cat cat = new Cat(1, "cat", "Patches", "Calico");
        String actual = cat.toString();
        Assertions.assertEquals(expected, actual);
    }


}
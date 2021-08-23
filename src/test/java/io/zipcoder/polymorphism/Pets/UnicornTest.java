package io.zipcoder.polymorphism.Pets;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UnicornTest {

    @Test
    void constructorTest() {
        Integer expectedId = 1;
        String expectedName = "sparkles";
        String expectedSpecies = "unicorn";
        String expectedColor = "white";

        Unicorn unicorn = new Unicorn(expectedId, expectedSpecies, expectedName, expectedColor);
        
        Integer actualId = unicorn.getId();
        String actualName = unicorn.getName();
        String actualSpecies = unicorn.getSpecies();
        String actualColor = unicorn.getColor();

        Assertions.assertEquals(expectedId, actualId);
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedSpecies, actualSpecies);
        Assertions.assertEquals(expectedColor, actualColor);
    }

    @Test
    void setNameTest(){
        String expectedName = "sparkles";
        Unicorn unicorn = new Unicorn();
        unicorn.setName(expectedName);
        String actualName = unicorn.getName();
        Assertions.assertEquals(expectedName, actualName);
    }

    @Test
    void setSpeciesTest(){
        String expectedSpecies = "unicorn";
        Unicorn unicorn = new Unicorn();
        unicorn.setSpecies(expectedSpecies);
        String actualSpecies = unicorn.getSpecies();
        Assertions.assertEquals(expectedSpecies, actualSpecies);
    }

    @Test
    void setColorTest(){
        String expectedColor = "white";
        Unicorn unicorn = new Unicorn();
        unicorn.setColor(expectedColor);
        String actualColor = unicorn.getColor();
        Assertions.assertEquals(expectedColor, actualColor);
    }

    @Test
    void makeNoiseTest(){
        String expectedNoise = "*Ethereal music starts playing*";
        String actualNoise = Unicorn.speak();
        Assertions.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    void toStringTest(){
        String expected = "Pet\n" +
                "Species: unicorn\n" +
                "Name: Sparkles\n" +
                "Color: White\n" +
                "They say: *Ethereal music starts playing*";
        Unicorn unicorn = new Unicorn(1, "unicorn", "Sparkles", "White");
        String actual = unicorn.toString();
        Assertions.assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);
    }
    

}
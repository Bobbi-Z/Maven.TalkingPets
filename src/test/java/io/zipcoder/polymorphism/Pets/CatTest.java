package io.zipcoder.polymorphism.Pets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void constructorTest() {
        String expectedName = "patches";
        String expectedType = "cat";
        String expectedColor = "calico";

        Cat cat = new Cat(expectedType, expectedName, expectedColor);

        String actualName = cat.getName();
        String actualType = cat.getType();
        String actualColor = cat.getColor();

        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedType, actualType);
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
    void setTypeTest(){
        String expectedType = "cat";
        Cat cat = new Cat();
        cat.setType(expectedType);
        String actualType = cat.getType();
        Assertions.assertEquals(expectedType, actualType);
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
        Cat cat = new Cat();
        String actualNoise = cat.makeNoise();
        Assertions.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    void toStringTest(){
        String expected = "Pet\n" +
                "Type: cat\n" +
                "Name: Patches\n" +
                "Color: Calico\n" +
                "They say: Meow!";
        Cat cat = new Cat("cat", "Patches", "Calico");
        String actual = cat.toString();
        Assertions.assertEquals(expected, actual);
    }


}
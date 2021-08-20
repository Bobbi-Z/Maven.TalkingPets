package io.zipcoder.polymorphism.Pets;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testng.asserts.Assertion;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void constructorTest() {
        String expectedName = "spot";
        String expectedType = "dog";
        String expectedColor = "brown";

        Dog dog = new Dog(expectedType, expectedName, expectedColor);

        String actualName = dog.getName();
        String actualType = dog.getType();
        String actualColor = dog.getColor();

        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedType, actualType);
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
    void setTypeTest(){
        String expectedType = "dog";
        Dog dog = new Dog();
        dog.setType(expectedType);
        String actualType = dog.getType();
        Assertions.assertEquals(expectedType, actualType);
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
        Dog dog = new Dog();
        String actualNoise = dog.makeNoise();
        Assertions.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    void toStringTest(){
        String expected = "Pet type: dog \n" +
                          "Name: Spot \n" +
                          "Color: Brown \n" +
                          "They say: Woof!";
        Dog dog = new Dog("dog", "Spot", "Brown");
        String actual = dog.toString();
        Assertions.assertEquals(expected, actual);
    }
}

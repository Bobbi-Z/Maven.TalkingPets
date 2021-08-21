package io.zipcoder.polymorphism.Pets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UnicornTest {

    @Test
    void constructorTest() {
        String expectedName = "sparkles";
        String expectedType = "unicorn";
        String expectedColor = "white";

        Unicorn unicorn = new Unicorn(expectedType, expectedName, expectedColor);

        String actualName = unicorn.getName();
        String actualType = unicorn.getType();
        String actualColor = unicorn.getColor();

        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedType, actualType);
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
    void setTypeTest(){
        String expectedType = "unicorn";
        Unicorn unicorn = new Unicorn();
        unicorn.setType(expectedType);
        String actualType = unicorn.getType();
        Assertions.assertEquals(expectedType, actualType);
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
                "Type: unicorn\n" +
                "Name: Sparkles\n" +
                "Color: White\n" +
                "They say: *Ethereal music starts playing*";
        Unicorn unicorn = new Unicorn("unicorn", "Sparkles", "White");
        String actual = unicorn.toString();
        Assertions.assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);
    }


}
package io.zipcoder.polymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.zipcoder.polymorphism.MainApplication.*;


public class MainApplicationTest {

    @Test
    void notAValidChoiceTest() {
        String expected = "That is not a valid choice! Please choose again.";
        String actual = notAValidChoice();
        Assertions.assertEquals(expected, actual);
    }

}

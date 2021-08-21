package io.zipcoder.polymorphism.Pets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class PetsServicesTest {

    @Test
    void addDogTest()   {
        String name = "spot";
        String type = "dog";
        String color = "brown";

        Dog testDog = new Dog(type, name, color);

        Boolean actual = PetsServices.addToList(testDog);

        Assertions.assertEquals(true, actual);

        PetsServices.clearWholeList();
    }

    @Test
    void addCatTest()   {
        String name = "patches";
        String type = "cat";
        String color = "calico";

        Cat testCat = new Cat(type, name, color);

        Boolean actual = PetsServices.addToList(testCat);

        Assertions.assertEquals(true, actual);

        PetsServices.clearWholeList();
    }

    @Test
    void addUnicornTest()   {
        String name = "sparkles";
        String type = "unicorn";
        String color = "white";

        Unicorn testUnicorn = new Unicorn(type, name, color);

        Boolean actual = PetsServices.addToList(testUnicorn);

        Assertions.assertEquals(true, actual);

        PetsServices.clearWholeList();
    }

    @Test
    void createDogTest()   {
        String name = "spot";
        String type = "dog";
        String color = "brown";

        Dog testDog = new Dog("dog", "spot", "brown");
        Dog actualDog = PetsServices.createDog(type, name, color);

        Assertions.assertEquals(testDog.toString(), actualDog.toString());
        PetsServices.clearWholeList();
    }

    @Test
    void createCatTest()   {
        String name = "spot";
        String type = "cat";
        String color = "brown";

        Cat testCat = new Cat("cat", "spot", "brown");
        Cat actualCat = PetsServices.createCat(type, name, color);

        Assertions.assertEquals(testCat.toString(), actualCat.toString());
        PetsServices.clearWholeList();
    }

    @Test
    void createUnicornTest()   {
        String name = "spot";
        String type = "unicorn";
        String color = "brown";

        Unicorn testUnicorn = new Unicorn("unicorn", "spot", "brown");
        Unicorn actualUnicorn = PetsServices.createUnicorn(type, name, color);

        Assertions.assertEquals(testUnicorn.toString(), actualUnicorn.toString());
        PetsServices.clearWholeList();
    }

    @Test
    void getPetList()   { //given when then
        Dog dog = new Dog ("dog", "Spot", "brown");
        Cat cat = new Cat("cat", "Patches", "Calico");
        Unicorn unicorn = new Unicorn("unicorn", "Sparkles", "White");

        List<Pets> testList = new ArrayList<>();
        testList.add(dog);
        testList.add(cat);
        testList.add(unicorn);
        PetsServices.addToList(dog);
        PetsServices.addToList(cat);
        PetsServices.addToList(unicorn);

        System.out.println(testList);
        String expected = testList.toString();

        String actual = String.valueOf(PetsServices.getPetList());
        System.out.println(actual);

        Assertions.assertEquals(expected, actual);
        testList.clear();
        PetsServices.clearWholeList();
    }

    @Test
    void deleteTest()   {
        Dog dog = new Dog ("dog", "Spot", "brown");
        Cat cat = new Cat("cat", "Patches", "Calico");
        Unicorn unicorn = new Unicorn("unicorn", "Sparkles", "White");

        List<Pets> testList = PetsServices.getPetList();
        PetsServices.addToList(dog);
        PetsServices.addToList(cat);
        PetsServices.addToList(unicorn);

        PetsServices.delete("cat", "Patches");

        Assertions.assertFalse(testList.contains(cat));
        testList.clear();
        PetsServices.clearWholeList();
    }

    @Test
    void clearWholeList()   {
        Dog dog = new Dog ("dog", "Spot", "brown");
        Cat cat = new Cat("cat", "Patches", "Calico");
        Unicorn unicorn = new Unicorn("unicorn", "Sparkles", "White");

        List<Pets> testList = PetsServices.getPetList();
        PetsServices.addToList(dog);
        PetsServices.addToList(cat);
        PetsServices.addToList(unicorn);

        PetsServices.clearWholeList();

        Assertions.assertTrue(testList.isEmpty());
        PetsServices.clearWholeList();

    }
}
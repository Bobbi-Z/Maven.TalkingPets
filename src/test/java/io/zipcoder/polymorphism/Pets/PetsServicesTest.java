package io.zipcoder.polymorphism.Pets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;


class PetsServicesTest {

    @Test
    void addDogTest(){
        String name = "spot";
        String type = "dog";
        String color = "brown";

        PetsServices ps = new PetsServices();
        Dog testDog = new Dog(type, name, color);
        List<Pets> testList = new ArrayList<>();

        Boolean expected = testList.add(testDog);
        Boolean actual = ps.addToList(testDog);

        Assertions.assertEquals(expected, actual);
        testList.clear();
    }

    @Test
    void addCatTest(){
        String name = "patches";
        String type = "cat";
        String color = "calico";

        PetsServices ps = new PetsServices();
        Cat testCat = new Cat(type, name, color);
        List<Pets> testList = new ArrayList<>();

        Boolean expected = testList.add(testCat);
        Boolean actual = ps.addToList(testCat);

        Assertions.assertEquals(expected, actual);
        testList.clear();
    }

    @Test
    void addUnicornTest(){
        String name = "sparkles";
        String type = "unicorn";
        String color = "white";

        PetsServices ps = new PetsServices();
        Unicorn testUnicorn = new Unicorn(type, name, color);
        List<Pets> testList = new ArrayList<>();

        Boolean expected = testList.add(testUnicorn);
        Boolean actual = ps.addToList(testUnicorn);

        Assertions.assertEquals(expected, actual);
        testList.clear();
    }

    @Test
    void createDogTest(){
        String name = "spot";
        String type = "dog";
        String color = "brown";

        PetsServices ps = new PetsServices();

        Dog testDog = new Dog("dog", "spot", "brown");
        Dog actualDog = ps.createDog(type, name, color);

        Assertions.assertEquals(testDog.toString(), actualDog.toString());
    }

    @Test
    void createCatTest(){
        String name = "spot";
        String type = "cat";
        String color = "brown";

        PetsServices ps = new PetsServices();

        Cat testCat = new Cat("cat", "spot", "brown");
        Cat actualCat = ps.createCat(type, name, color);

        Assertions.assertEquals(testCat.toString(), actualCat.toString());
    }

    @Test
    void createUnicornTest(){
        String name = "spot";
        String type = "unicorn";
        String color = "brown";

        PetsServices ps = new PetsServices();

        Unicorn testUnicorn = new Unicorn("unicorn", "spot", "brown");
        Unicorn actualUnicorn = ps.createUnicorn(type, name, color);

        Assertions.assertEquals(testUnicorn.toString(), actualUnicorn.toString());
    }

    @Test
    void getPetList() { //given when then
        Dog dog = new Dog ("dog", "Spot", "brown");
        Cat cat = new Cat("cat", "Patches", "Calico");
        Unicorn unicorn = new Unicorn("unicorn", "Sparkles", "White");

        PetsServices ps = new PetsServices();
        List<Pets> testlist = new ArrayList<>();
        testlist.add(dog);
        testlist.add(cat);
        testlist.add(unicorn);
        ps.addToList(dog);
        ps.addToList(cat);
        ps.addToList(unicorn);

        System.out.println(testlist);
        String expected = testlist.toString();

        String actual = String.valueOf(ps.getPetList());
        System.out.println(actual);

        Assertions.assertEquals(expected, actual);
        testlist.clear();
    }

    @Test
    void deleteTest() {
        Dog dog = new Dog ("dog", "Spot", "brown");
        Cat cat = new Cat("cat", "Patches", "Calico");
        Unicorn unicorn = new Unicorn("unicorn", "Sparkles", "White");

        PetsServices ps = new PetsServices();
        List<Pets> testList = ps.getPetList();
        ps.addToList(dog);
        ps.addToList(cat);
        ps.addToList(unicorn);

        ps.delete("cat", "Patches");

        Assertions.assertTrue(testList.contains(cat));
    }

    @Test
    void clearWholeList() {
    }
}
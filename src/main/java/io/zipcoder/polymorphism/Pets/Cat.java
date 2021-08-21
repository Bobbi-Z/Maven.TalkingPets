package io.zipcoder.polymorphism.Pets;

public class Cat implements Pets {

    private static String type;
    private static String name;
    private static String color;


    public Cat() {

    }

    public Cat(String type, String name, String color) {
        setType(type);
        setName(name);
        setColor(color);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        Cat.type = type;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        Cat.name = name;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        Cat.color = color;
    }


    public static String speak() {
        return "Meow!";
    }

    public String toString() {
        return "Pet\n" +
                "Type: " + getType() + "\n" +
                "Name: " + getName() + "\n" +
                "Color: " + getColor() + "\n" +
                "They say: " + speak();
    }
}

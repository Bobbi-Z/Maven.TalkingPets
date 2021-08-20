package io.zipcoder.polymorphism.Pets;

public class Unicorn implements Pets {

    private static String type;
    private static String name;
    private static String color;


    public Unicorn() {

    }

    public Unicorn(String type, String name, String color) {
        setType(type);
        setName(name);
        setColor(color);
    }
    

    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
    this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public static String speak() {
        return "*Ethereal music starts playing*";
    }

    @Override
    public String toString() {
        return "Pet\n" +
                "Type: " + getType() + "\n" +
                "Name: " + getName() + "\n" +
                "Color: " + getColor() + "\n" +
                "They say: " + speak();
    }
}

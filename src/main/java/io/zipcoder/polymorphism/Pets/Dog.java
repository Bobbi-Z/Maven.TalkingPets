package io.zipcoder.polymorphism.Pets;


public class Dog implements Pets{
    private static String type;
    private static String name;
    private static String color;


    public Dog() {

    }

    public Dog(String type, String name, String color) {
       setType(type);
       setName(name);
       setColor(color);
    }


    public  String getType() {
        return type;
    }

    public  void setType(String type) {
        this.type = type;
    }

    public  String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public  String getColor() {
        return color;
    }

    public  void setColor(String color) {
        this.color = color;
    }

    public static String speak() {
        return "Woof!";
    }


    public String toString() {
        return "Pet\n" +
                "Type: " + getType() + "\n" +
                "Name: " + getName() + "\n" +
                "Color: " + getColor() + "\n" +
                "They say: " + speak();
    }
}

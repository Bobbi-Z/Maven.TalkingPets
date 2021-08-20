package io.zipcoder.polymorphism.Pets;

public interface Pets {

    public  String getType();

    public void setType(String type);

    public String getName();

    public void setName(String name);

    public String getColor();

    public void setColor(String color);

    public static String speak() {
        return null;
    }


    @Override
    public String toString();

}

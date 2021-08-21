package io.zipcoder.polymorphism.Pets;

  public interface Pets {

       String getType();

      void setType(String type);

      String getName();

      void setName(String name);

      String getColor();

      void setColor(String color);

      static String speak() {
        return null;
    }

    @Override
      String toString();

}

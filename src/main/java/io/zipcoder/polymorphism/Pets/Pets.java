package io.zipcoder.polymorphism.Pets;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import sun.tools.java.Type;

import static sun.tools.java.Constants.CLASS;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")

@JsonSubTypes({
     @JsonSubTypes.Type (value = Dog.class,  name = "dog"),
     @JsonSubTypes.Type (value = Cat.class, name = "cat"),
     @JsonSubTypes.Type(value = Unicorn.class, name = "unicorn")
})


  public interface Pets { 
     
     Integer getId();
     
     void setId(Integer id);

       String getSpecies();

      void setSpecies(String species);

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
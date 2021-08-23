package io.zipcoder.polymorphism.Pets;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;

public class PetsDeserializer extends JsonDeserializer<Pets> {
    @Override
    public Pets deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        ObjectCodec oc = jsonParser.getCodec();
        JsonNode node = oc.readTree(jsonParser);
        final String type = node.get("type").asText();
        final String name = node.get("name").asText();
        final String color = node.get("color").asText();

        return returnInstance(type, name, color);
    }


    public Pets returnInstance(String type, String name, String color){
        switch (type){
            case "dog":
                return new Dog(type, name, color);
            case "cat":
                return new Cat(type, name, color);
            case "unicorn":
                return new Unicorn(type, name, color);
            default:
                return null;
        }
    }



}

package org.example;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class DTOPractice {
    public static void main(String[] args) {
        //1. Get the JSON (file or API)
        //2. Make the object mapper
        //3. Read the json into an object

        File jsonFile = new File("cereal.json");
        ObjectMapper mapper = new ObjectMapper();
        try {

            CerealDTO breakfastTime = mapper.readValue(jsonFile, CerealDTO.class);

            System.out.println(breakfastTime.getName());
            System.out.println(breakfastTime.getCalories());

            CerealDTO_Generated generated = mapper.readValue(jsonFile, CerealDTO_Generated.class);
            System.out.println(generated.getMarshmallows());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

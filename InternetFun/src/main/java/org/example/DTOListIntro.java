package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class DTOListIntro {
    public static void main(String[] args) {
        //GOAL: Make a list of cerealDTO objects

        //1. Get the JSON
        //2. We make an object mapper
        //NEW STEP: Make TypeReference
        //3. Read the JSON into a DTO
        //4. Do something with it

        File jsonFile = new File("ListOfCereals.json");
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<CerealDTO>> dataType = new TypeReference<>(){};
        try {
            List<CerealDTO> cerealDTOs = mapper.readValue(jsonFile, dataType);
            for (CerealDTO dto : cerealDTOs){
                System.out.println(dto.getName());
            }
        } catch (Exception e){
            System.out.println("Something went wrong :(");
        }
    }
}

package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

public class StarWars {
    public static void main(String[] args) {
        String URL = "https://swapi.py4e.com/api/films/1/";
        String title = grabTitle(URL);
        System.out.println(title);
        List<String> movies = grabFilmURLs(1);
        System.out.println(movies);
        for (String link : movies){
            System.out.println(grabTitle(link));
        }
        System.out.println(makeNameMap("https://swapi.py4e.com/api/people/"));
    }

    public static HashMap<String, Integer> makeNameMap(String baseURL){
        int id = 1;
        HashMap<String, Integer> map = new HashMap<>();
        boolean keepGoing = true;
        while (keepGoing){
            String url = baseURL + id + "/";
            String json = APIConnector.makeGETRequest(url);
            try {
                ObjectMapper mapper = new ObjectMapper();
                CharacterDTO character = mapper.readValue(json, CharacterDTO.class);
                //System.out.println(character.getName());
                map.put(character.getName(), id);
            } catch (Exception e){
                keepGoing = false;
            }
            id++;
        }
        return map;
    }
    //GOAL: Given an id number, return a list of film URLs
    public static List<String> grabFilmURLs(int idNumber){
        String URL = "https://swapi.py4e.com/api/people/" + idNumber + "/";
        String response = APIConnector.makeGETRequest(URL);
        try {
            ObjectMapper mapper = new ObjectMapper();
            CharacterDTO character = mapper.readValue(response, CharacterDTO.class);
            return character.getFilms();
        } catch (Exception e){
            return null;
        }
    }

    public static String grabTitle(String URL){
//        httprequest to the api
        String jsonResponse = APIConnector.makeGETRequest(URL);
//        receive the json response
//        we want the data to go in an object
//        DTOs come in
        ObjectMapper mapper = new ObjectMapper();
        try {
            FilmDTO film = mapper.readValue(jsonResponse, FilmDTO.class);
            return film.getTitle();
        } catch (Exception e){
            return "Title not found";
        }
//        from the object, retreive the title
    }
}

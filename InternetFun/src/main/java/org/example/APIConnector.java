package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.EmptyStackException;
import java.util.Objects;
import java.util.Scanner;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIConnector {

    public static String makePUTRequest(String url, String requestBody){
        HttpClient client = HttpClient.newHttpClient();
        URI uri = URI.create(url);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .PUT(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();
        try {
            HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
            int statusCode = httpResponse.statusCode();
            if (statusCode == 201 || statusCode == 202 || statusCode == 200) {
                return httpResponse.body();
            } else {
                return String.format("GET request failed: %d status code received", statusCode);
            }
        } catch (IOException | InterruptedException e) {
            return e.getMessage();
        }
    }

    public static String makeGETRequest(String url){
        HttpClient client = HttpClient.newHttpClient(); //how we connect to the internet
        URI uri = URI.create(url); //a URI is an umbrella term for URLs
        HttpRequest request = HttpRequest.newBuilder() //building the query
                .uri(uri)
                .header("Accept", "application/json")
                .GET()
                .build();
        try {

            HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());

            int statusCode = httpResponse.statusCode();
            if (statusCode == 200) {
                return httpResponse.body();
            } else {
                // String.format is fun! Worth a Google if you're interested
                return String.format("GET request failed: %d status code received", statusCode);
            }
        } catch (IOException | InterruptedException e) {
            return e.getMessage();
        }
    }

    public static String makeDangerousGETRequest(String url) throws IOException, InterruptedException{
        HttpClient client = HttpClient.newHttpClient(); //how we connect to the internet
        URI uri = URI.create(url); //a URI is an umbrella term for URLs
        HttpRequest request = HttpRequest.newBuilder() //building the query
                .uri(uri)
                .header("Accept", "application/json")
                .GET()
                .build();


        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());

        int statusCode = httpResponse.statusCode();
        if (statusCode == 200) {
            return httpResponse.body();
        } else {
            // String.format is fun! Worth a Google if you're interested
            return String.format("GET request failed: %d status code received", statusCode);
        }
    }

    public static void main(String[] args) {
        //GOAL: Read in a tvshow with scanner, build a tvmaze api url
/*
        final String ROOT_URL = "api.tvmaze.com";
        final String PROTOCOL = "https://";
        String path = "/singlesearch/shows";
        //now we need to make the query string

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a TV Show");
        String tvshow = scan.nextLine();

        tvshow = tvshow.trim();
        tvshow = tvshow.toLowerCase();
        tvshow = tvshow.replaceAll(" ", "%20");

        String queryString = "?q=" + tvshow;

        String URL = PROTOCOL + ROOT_URL + path + queryString;
        System.out.println(URL);

        String response = makeGETRequest(URL);
        System.out.println(response);

        System.out.println("That show airs at " + whatTime(response));
*/
        //QUESTION: What time does cutthroat kitchen air?
/*
        BabyTVDTO tvshowDTO = convert(response);
        System.out.println("Name: " + tvshowDTO.getName());
        System.out.println("Type: " + tvshowDTO.getType());
        System.out.println("Summary: " + tvshowDTO.getSummary());
 */
        /*try {
            String responseDanger = makeDangerousGETRequest(URL);
        } catch (Exception e){
            System.out.println(e);
        }*/
        String jsonForPut = "{" + "\"" + "name" + "\"" + ":\"test\"" +
                ",\"salary\"" + ":\"123\"" +"}";
        System.out.println(jsonForPut);
        String response =  makePUTRequest("https://dummy.restapiexample.com/api/v1/update/21", jsonForPut);
        System.out.println(response);

    }

    public static String whatTime(String jsonString){
        //1. Turn it into an object
            //a. Make an object mapper
        ObjectMapper mapper = new ObjectMapper();
            //b. Read the json
        try {
            TVDTO dto = mapper.readValue(jsonString, TVDTO.class);
            //2. Use getter methods to retrieve data
            String time = dto.getSchedule().getTime();
            return time;
        } catch (Exception e){
            e.printStackTrace();
            return "Time not found";
        }
    }

    public static BabyTVDTO convert(String jsonString){
        //we have json (parameter)
        //we need to:
            //make the object mapper
        ObjectMapper mapper = new ObjectMapper();
            //read the value (requires a try/catch)
        BabyTVDTO baby = null;
        try {
            baby = mapper.readValue(jsonString, BabyTVDTO.class);
        } catch (Exception e){
            System.out.println(e);
        }
            //return the DTO
        return baby;
    }

}

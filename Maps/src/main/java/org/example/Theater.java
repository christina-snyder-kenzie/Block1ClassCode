package org.example;

import java.util.ArrayList;

public class Theater {
    public static void main(String[] args) {
        ArrayList<String> dansCharacters = new ArrayList<String>();
        dansCharacters.add("Dan");
        dansCharacters.add("Mitch");
        dansCharacters.add("Ruthie");
        Movie dansMovie = new Movie("Dan in Real Live", "Romantic Comedy", 2007, dansCharacters);
        System.out.println(dansMovie);

        boolean reflexTest = dansMovie.equals(dansMovie);

        System.out.println("Expected true; Is actually: " + reflexTest);

        boolean nullTest = dansMovie.equals(null);
        System.out.println("Expected false; is Actually: " + nullTest);

        Movie realMovie = new Movie("Dan in Real Life", "Romantic Comedy", 2007, dansCharacters);
        boolean logicalTest = dansMovie.equals(realMovie);
        System.out.println("Expected false; is actually: " + logicalTest);

        //Arrange
            //Set up all your variables
        //Act
            //Call the method/ Do the thing you're trying to test
        //Assert
            //Checking the expected answer with the actual answer
        realMovie.hire("Dan", "Steve Carrell");
        realMovie.hire("Ruthie", "Emily Blunt");
        boolean result = realMovie.hire("Ruthie", "Meryl Streep");
        System.out.println(realMovie);
        System.out.println(result);

    }
}

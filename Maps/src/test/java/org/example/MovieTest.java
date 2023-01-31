package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    @Test
    void getTitle() {
        //arrange
        Movie pixarMovie = new Movie("Finding Nemo", "Animated", 2005, new ArrayList<>());
        String expectedTitle = "Finding Nemo";
        //act
        String actualTitle = pixarMovie.getTitle();
        //assert
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    void testSetTitle(){
        //arrange-make a movie
        //act- call the set method
        //assert- verify that getTitle() is the new title
        Movie toTest = new Movie("First Title", "Genre", 1992, new ArrayList<>());
        String newTitle = "Second title";

        toTest.setTitle(newTitle);

        String actualTitle = toTest.getTitle();
        assertEquals(newTitle, actualTitle);
    }

    @Test
    void movieIsOlderThanChristina(){
        Movie old = new Movie("Smokey and the Bandit", "Comedy", 1977, new ArrayList<>());

        int movieYear = old.getYear();

        assertTrue(movieYear < 1992);
    }

    @Test
    void testSetGenre(){
        //arrange
        Movie m = new Movie("Smokey and the Bandit", "Comedy", 1977, new ArrayList<>());
        String newGenre = "Action";
        //act
        m.setGenre(newGenre);
        //assert
        assertEquals(newGenre, m.getGenre());
    }

    @Test
    void testFire(){
        ArrayList<String> characters = new ArrayList<String>();
        characters.add("Dan");
        characters.add("Mitch");
        characters.add("Ruthie");

        Movie m = new Movie("Dan in Real Life", "Comedy", 2007, characters);
        m.hire("Dan", "Steve Carell");
        String notInMovie = m.fire("Nemo");
        assertEquals("ERROR", notInMovie);

        String notHired = m.fire("Ruthie");
        assertNull(notHired);

        String fired = m.fire("Dan");
        assertEquals("Steve Carell", fired);

    }


}
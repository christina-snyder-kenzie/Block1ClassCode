package org.example;

import javax.xml.namespace.QName;
import java.util.*;

public class Movie {
    //properties
    private String title, genre;
    private int year;
    //key: character name, value: actor name
    private HashMap<String, String> cast;

    //constructors
    //arraylist of characters, to be put into the cast
    public Movie(String title, String genre, int year, ArrayList<String> characters){
        this.title = title;
        this.genre = genre;
        this.year = year;
        cast = new HashMap<>();
        //map.put(key, value); key -> character, value -> "?"
        for (String character : characters){
            cast.put(character, "?");
        }
    }

    //getters and setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //toString
    /*
    title
        genre
        year
    character1< played by actor1>
    character2< played by actor2>
     */
    public String toString(){
        StringBuilder sb = new StringBuilder(title);
        sb.append("\n\t");
        sb.append(genre);
        sb.append("\n\t");
        sb.append(year);
        sb.append("\n");

        for (String character : cast.keySet()){
            sb.append(character);
            String actor = cast.get(character);
            if (!actor.equals("?")){
                sb.append(" played by ");
                sb.append(actor);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    //equals
    //the job of the equals method is to return a boolean (true or false)
        //that tells us if two objects are the same
    //a.equals(b);
    //a.equals(a); -> are the same because of reflexivity
    //a.equals(null); -> never the same, always false
    //a.equals(new Book()); -> should be false, because they have different data types

    //they have to have the same title, genre, year
    //casts? characters, or characters and actors?
        //for the sake of the argument- same characters needed, but not same actors...?

    /*
   1. test for reflexivity (this == other) -> immediate yes
   2. test for non-nullity (other == null) -> immediate no
   3. test the class !(other instanceof myclass) -> immediate no

   4. convert the object to the right class (utilizes type casting - (ClassName) obj )
    //Movie otherMovie = (Movie) other;

   5. test for logical equality
   this.title.equals(otherMovie.title) && other tests
     */
    public boolean equals(Object other){
        if (this == other){
            return true;
        }
        if (other == null){
            return false;
        }
        if ( ! (other instanceof Movie)){
            return false;
        }
        Movie otherMovie = (Movie) other;
        /*if (conditions){
            return true;
        } else {
            return false;
        }*/
        return this.title.equals(otherMovie.title) &&
                this.genre.equals(otherMovie.getGenre()) &&
                this.getYear() == otherMovie.year &&
                this.cast.keySet().equals(otherMovie.cast.keySet()); //checks if characters match
    }
    //hire
    //what role it is, who the actor is
    //if the role has not been filled, hire the actor return true?
    //however, if the role has been filled, return false?
    public boolean hire(String role, String actor){
        String value = cast.get(role);
        if (value.equals("?")){
            //the role has not been filled
            cast.replace(role, actor);
            return true;
        } else {
            //we've already hired this role
            return false;
        }
    }

    //fire
    //Take in a role/character
    //3. If the role is filled, set the role back to "?" and return the fired actor's name
    //2. If the role is not filled, return null.
    //1. If the role is not in the movie, return the String "ERROR";
    public String fire(String role){
        if (!cast.containsKey(role)){ //OR (cast.get(role) == null)
            return "ERROR";
        } else if (cast.get(role).equals("?")){
            return null;
        } else {
            String actor = cast.get(role); //grab actors name;
            cast.replace(role, "?"); //set value back to ?
            return actor;
        }
    }
}

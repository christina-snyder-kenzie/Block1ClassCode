package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] data = new String[5];
        data[0] = "CellPhone";
        data[1] = "Laptop";
        data[2] = "iPad";
        for (String thing : data){
            try {
                //System.out.println(thing.length());
                //System.out.println(doubleIt(thing));
                System.out.println(calcLength(thing));
                //System.out.println(data[15]); //this ALWAYS errors...
                //System.out.println(15 / 0); //technically unreachable...
            } catch (IndexOutOfBoundsException e){
                System.out.println("You're indexing out of bounds!");
            } catch (NullPointerException exc){
                System.out.println("HEY! Null strings don't have a length!");
            } catch (Exception e){
                System.out.println("Generic Response for generic error");
                System.out.println(e.getMessage()); //this is more or less fine
                //e.printStackTrace(); //more for debugging than anything
            } finally {
                System.out.println("Goodbye! At the end!");
            }
        }
    }

    public static int calcLength(String str) throws NullPointerException{
        if (str.isEmpty()){
            throw new IllegalArgumentException();
        }
        return str.length();
    }

    //GOAL: take in a string, return twice the length
    //However, if the new length is more than 10, that's TOO BIG
    //We will throw a TOOBIG excpetion
    public static int doubleIt(String str){
        int doubleLength = str.length() * 2;
        if (doubleLength > 10){
            throw new TooBigException(str);
        }
        return doubleLength;
    }
}
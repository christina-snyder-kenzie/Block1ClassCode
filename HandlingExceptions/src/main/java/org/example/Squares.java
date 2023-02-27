package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Squares {
    public static void main(String[] args) {
        //GOAL: Given an array of numbers,
            //write them to a file, with their squares
            //if the square would be greater than 100, it's too big

        //{7, 5, 11, 3, 12}
        //FILE:
        /*
        7 squared is 49
        5 squared is 25
        11 squared is TOO BIG
        3 squared is 9
        12 squared is TOO BIG
         */

        //how do we write to files?
        //1. Make the file
        //2. We print to it
        //3. Close it

        int[] numbers = {7, 5, 11, 3, 12};
        //make the file
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new File("squares.txt"));
        } catch (FileNotFoundException e){
            System.out.println("Something went wrong with the file");
            System.out.println(e.getMessage());
        }
        writer.println("Hello :)");

        //loop over numbers //{7, 5, 11, 3, 12}
       // try {
            for (int i = 0; i < numbers.length; i++) {
                //calc the square
                try {
                    int square = numbers[i] * numbers[i];
                    if (square > 100) {
                        throw new TooBigException(square);
                    }
                    //write to the file
                    writer.println(numbers[i] + " squared is " + square);
                } catch (TooBigException e){
                    //handle it IN THE LOOP
                    writer.println(numbers[i] + " squared is TOO BIG");
                }
            }
      //  } catch (TooBigException e){
            //handle it here
     //   }
        //will then continue out here

        writer.close();
    }
}

package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class GradeBook {
    //GOAL: Print out the contents of the gradebook file
    public static void main(String[] args) {
        try {
            Scanner fileScanner = new Scanner(new File("GradebookBlock1.csv"));
            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
            fileScanner.close();
        } catch (IOException e){
            System.out.println("Something went wrong");
        }
    }
}

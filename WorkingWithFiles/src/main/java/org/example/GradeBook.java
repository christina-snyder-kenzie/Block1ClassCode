package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeBook {
    //GOAL: Print out the contents of the gradebook file
    public static void main(String[] args) {
        try {
            /*
            Scanner fileScanner = new Scanner(new File("src/main/java/org/example/GradebookBlock1.csv"));
            String fileContents = "";
            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                fileContents += line ( + "\n");
                System.out.println(line);
            }
            fileScanner.close();
            */
            Path filePath = Path.of("GradebookBlock1.csv");
            String fileContents = Files.readString(filePath);
            System.out.println(fileContents);

            //Turn that string into a grid of grades
            String[] lines = fileContents.split("\r\n");
                //making an array (of a certain size)
            int numRows = lines.length;
            int numCols = lines[0].split(",").length;
            double[][] grades = new double[numRows][numCols];
            ArrayList<String> names = new ArrayList<>();
                //fill up that array
            for (int i = 1; i < lines.length; i++) {
                //with good data
                String[] currLineData = lines[i].split(",");
                //save the names?
                names.add(currLineData[0]);
                for (int j = 1; j < currLineData.length; j++){
                    // where i'm going = what I have
                    String whatIHave = currLineData[j];
                    grades[i-1][j-1] = Double.parseDouble(whatIHave);
                }
            }
            printOut(grades);
            //Calculate student averages
                //important pieces
                    //how we define loops
                    //how we index things
                    //where we create/initialize variables
            for (int i = 0; i < grades.length - 1; i++){ //goes down
                double sum = 0; //each student gets their own, new, sum
                for (int j = 0; j < grades[0].length -1 ; j++){ //goes across
                    sum += grades[i][j];
                }
                //do something with sum
                double average = sum / (grades[0].length - 1);
                grades[i][grades[0].length - 1] = average;
            }
            printOut(grades);
            //calculate assign averages
            //calculate the overall avg
            for (int j = 0; j < grades[0].length; j++){ //goes across
                double sum = 0;
                for (int i = 0 ; i < grades.length - 1; i++){ //goes down
                    sum += grades[i][j];
                }
                double average = sum / (grades.length - 1);
                grades[grades.length - 1][j] = average;
            }
            printOut(grades);
            //write this data to a new file
            String newFileName = "UpdatedGradebook.csv";
            FileWriter fileWriter = new FileWriter(newFileName);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.write(lines[0]);
            writer.write(",Average\n");

            names.add("Average");
            for (int i = 0; i < names.size(); i++){
                writer.write(names.get(i));
                //get the grades in there
                for (int j = 0; j < grades[0].length; j++){
                    writer.write("," + grades[i][j]);
                }
                writer.write("\n");
            }
            writer.close();

        } catch (IOException e){
            System.out.println("Something went wrong");
        }
    }

    //GOAL: Print out a double 2D array
    public static void printOut(double[][] arr){
        for (double[] row : arr){
            for (double dude : row){
                System.out.print(dude + ", ");
            }
            System.out.println();
        }
    }
}

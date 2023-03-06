package org.example;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;

public class FileIntro {
    public static void main(String[] args) {
        //theEasyWay();
        try {
            theHardWay();
        } catch (IOException e){
            System.out.println("Something went wrong");
        }
    }

    public static void theHardWay() throws IOException {
        //because we read the file line by line (we don't get it all at once)
        //0. Still need the file name
        //1. FileInputStream
        //2. InputStreamReader
        //3. BufferedReader
        //4. While loop over the lines
            //5. Process each line individually
        //6. Close the fileInputStream

        //buffering?

        String fileName = "words.txt";
        FileInputStream inputStream = new FileInputStream(fileName);
        InputStreamReader inputReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputReader);

        String line = reader.readLine();
        int numLines = 0;
        int numWords = 0;
        ArrayList<String> allTheLines = new ArrayList<>();
        while (line != null){
            //1
            numLines++;
            //2
            numWords += line.split(" ").length;
            allTheLines.add(line);

            System.out.println(line);
            //3
            line = reader.readLine();
            //4- WRONG PLACE
        }
        System.out.println(numLines + " lines");
        System.out.println(numWords + " words");
        inputStream.close();

        //process allTheLines into a 2D array of Strings
        //DT[][] arr2D = new DT[rows][cols];
        //rows -> numLines
        //columns? -> numWords / numLines
        String[][] words = new String[numLines][numWords/numLines];
        printOut(words);

        int rowIndex = 0;
        int colIndex = 0;
        int maxCols = 0;
        for (String currentLine : allTheLines){
            /*
            String[] data = currentLine.split(" ");
            for (String word : data){
                words[rowIndex][colIndex++] = word;
            }
            //I'm here now (row is 0, col is 3)
            rowIndex++;
            colIndex = 0;
            */

            words[rowIndex++] = currentLine.split(" ");
            if (words[rowIndex - 1].length > maxCols){
                maxCols = words[rowIndex - 1].length;
            }
        }
        printOut(words);
        System.out.println("Max Cols: " + maxCols);

        //to write to a file:
        //1. You need some data to write (for us, that's words)
        //2. You need a FileWriter
        //3. BufferedWriter
        //4. Write to the file
        //5. WE CLOSE the file
        String fileToWrite = "translatedWords.txt";
        FileWriter fileWriter = new FileWriter(fileToWrite);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        //column major traversal
        for (int j = 0; j < maxCols; j++){
            for (int i = 0; i < words.length; i++){
                try {
                    writer.write(words[i][j] + " ");
                } catch (IndexOutOfBoundsException e){
                    writer.write("blank ");
                }
            }
            writer.write("\n");
        }
        writer.close();

    }

    public static void printOut(String[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t\t");
            }
            System.out.println();
        }
    }


    public static void theEasyWay() /* throws IOException */{
        //The Easy Way:
        //0. Make your filename
        //1. Make a Path
        //2. Read the file
        //3. Print it out/process it/whatever you wanna do with it
        String filename = "words.txt";
        Path filePath = Path.of(filename);
        String fileContents = "";
        try {
            fileContents = Files.readString(filePath); //DANGER
        } catch (IOException e){
            System.out.println("Something went wrong...");
        }

        System.out.println(fileContents);
        String[] lines = fileContents.split("\n");
        int numLines = lines.length;
        System.out.println(numLines + " lines");


        //how many words?
        //loop over the lines
            //split the line
            //count the words...
        int numWords = 0;
        for (String currLine : lines){
            String[] words = currLine.split(" ");
            numWords += words.length;
        }
        System.out.println(numWords + " words");
    }
}

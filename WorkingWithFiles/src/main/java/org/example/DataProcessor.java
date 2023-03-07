package org.example;
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DataProcessor {
    public static void main(String[] args) {
        //the hard way means line by line
        //the hard way means we don't know how much data we have
        //clever with data structures

        //file name
        //file input stream
        //input stream reader
        //buffered reader
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("CommanderData.tsv")));
            String header = reader.readLine();
            ArrayList<String> lines = new ArrayList<>();
            String line = "";
            while ( (line = reader.readLine()) != null){
                lines.add(line);
            }
            System.out.println(lines.size());
            System.out.println(header);
            reader.close();

            //GOAL #0: Given the name of a deck, how do I know what column its in?
            //O(n) solution-> loop through and look for it (count as we go)

                //for (int i = 0; i < header.split(\t).length; i++){
                    //if (header[i].equals(lookingfor){
                        //index = i
                    //}
                //}

            // O(n) -> optimized -> O(1)  (we do that with hashmaps...)
                //we first build a hashMap<deckName, index>
                    //that is O(n) bc I do have to put everything in there...
                //index = hashMap.get(lookingfor); O(1)
            //when you do A LOT of LOOKUPS, spending the time to build the hashmap
                //is ideal
            HashMap<String, Integer> deckIndexMap = new HashMap<>();
            String[] headerData = header.split("\t");
            for (int i = 1; i < headerData.length; i++){
                String deckName = headerData[i];
                deckIndexMap.put(deckName, i - 1);
            }

            System.out.println("Position of Omnath Bloodbath: " + deckIndexMap.get("Omnath Bloodbath"));

            //GOAL #0.5: Put the data in an array!
            //we have deckIndexMax, and the lines arrayList
            int numRows = lines.size();
            int numCols = deckIndexMap.size();

            String[][] data = new String[numRows][numCols];
            String[] cardNames = new String[numRows];

            for (int i = 0; i < lines.size(); i++){
                String currLine = lines.get(i);
                String[] currLineData = currLine.split("\t");
                //save the cardName
                String cardName = currLineData[0];
                cardNames[i] = cardName;
                //save the Data
                for (int j = 1; j < currLineData.length; j++){
                    if (currLineData[j].length() > 0)
                        data[i][j-1] = currLineData[j];
                }

            }

            //GOAL #1: Given the name of a deck, find out how many cards it has
            String deckName = "Brother of Mishra";
            //find the column
            //count how many non  null elements are in that column
            int colIndex = deckIndexMap.get(deckName);
            int count = 0;
            for (int rowIndex = 0; rowIndex < data.length; rowIndex++){
                System.out.println(Arrays.toString(data[0]));
                System.out.println(rowIndex + ", " + colIndex);
                if (data[rowIndex][colIndex] != null  /*.length() > 0*/){
                    count++;
                }
            }
            System.out.println(deckName + " has " + count + " cards");

            //#2 GOAL: What Cards are in a specified deck?
                //can you make a deck list?
                //given: cards[], deckIndexMap, data[][]

        } catch (FileNotFoundException e){
            System.out.println("FILE NOT FOUND");
        } catch (IOException e){
            System.out.println("PROBLEMS READING FILE");
        }

    }

    public static ArrayList<String> findDeckList(String deckName, String[] cardNames, HashMap<String, Integer> deckIndexMap, String[][] data){
        //locate the deck
        //initialize the list
        //find cards?
            //find the non-null rows
                //look for the card at that row

        return null;
    }

}

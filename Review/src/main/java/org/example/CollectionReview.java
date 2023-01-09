package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionReview {

    // Methods COULD GO HERE

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String name = "Christina";
        System.out.println("Hello " + name);

        //String[] plants = { "tree", "flower", "herb", "vine" };

        String[] plants = new String[10];
        plants[7] = "tree";
        plants[5] = "flower";
        plants[3] = "herb";
        plants[1] = "vine";
        plants[9] = "chrysanthemum";
        System.out.println(plants);
        System.out.println(Arrays.toString(plants));
        System.out.println(countTotalLetters(plants));
        System.out.println(countEs(plants));

        String[] noNulls = removeNulls(plants);
        System.out.println(Arrays.toString(noNulls));
        System.out.println(findLongestPlant(noNulls));

        ArrayList<String> plantList = makeArrayList(plants);
        System.out.println(plantList);

        FlowerPower(plantList);
        System.out.println(plantList);
       /* FlowerPower(plantList);
        System.out.println(plantList);
        FlowerPower(plantList);
        System.out.println(plantList); */


    }

    //GOAL: any plant that is not the longest plant should be amended:
        // oldPlant-longPlant

    //tree
    //flower
    //herb
    //vine

    //AFTER

    //tree-flower
    //flower
    //herb-flower
    //vine-flower

    public static void FlowerPower(ArrayList<String> plants){
        //1. Code it here
        //2. Make new AL method
        //3. Transform data into String[]
        String[] transformed = plants.toArray(new String[]{});
        //System.out.println("IN FlowerPower: " + Arrays.toString(transformed));
        String longest = CollectionReview.findLongestPlant(transformed);
        for (int i = 0; i < plants.size(); ++i){
            String currPlant = plants.get(i);
            if (!currPlant.equals(longest)){
                //I know currPlant needs to be updated
                //.set(index, newValue); //updates the position
                plants.set(i, currPlant + "-" + longest);
            }
        }


    }


    //GOAL: Collect non-null values, into an ARRAYLIST
    // 1. Make the arrayList
    // 2. Fill it up
            //loop
                //to see if cur is not null
                    //add it to the list
    public static ArrayList<String> makeArrayList(String[] arr){
        ArrayList<String> toReturn = new ArrayList<>();
        for (String curr : arr){
            System.out.println(curr);
            if (curr != (null)){
                toReturn.add(curr);
            }
        }
        return toReturn;
    }



    //GOAL: Find the plant with the Longest length
    /*
        init max (both or plant only)
        loop
            if (curr is bigger)
                printed here?
                update max
        return the plant
     */
    public static String findLongestPlant(String[] arr){
        int maxLength = 0;
        String maxPlant = "";
        for (int i = 0; i < arr.length; ++i){
            String currPlant = arr[i];
            if (currPlant.length() > maxLength){
                maxLength = currPlant.length();
                maxPlant = currPlant;
            }
        }
        return maxPlant;
    }

    //GOAL: Remove nulls (keeping non-null values)
    // collect and fill situation
    // 1. Count how many things we have
    // 2. Make a new array with the right size
    // 3. Fill that new array (this will require 2 indexes...)
        //for (int old = 0; old < oldArray.length; old++)
            //if (oldArray[oldIndex] is good)
                //newArray[newIndex] = oldArray[oldIndex];
                //newIndex++;
    public static String[] removeNulls(String[] arr){
        int counter = 0;
        for (String word : arr){
            if (word != null){
                counter++;
            }
        }
        // at this point, counter contains the number of non-null values
        String[] newArray = new String[counter];
        int newIndex = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != null){
                newArray[newIndex++] = arr[i];
            }
        }
        return newArray;
    }


    //GOAL: Count how many 'e's there are in an array of strings
    /*
        init count (count = 0)
        loop (for each loop) (words)
            for every word -> loop each letter
                if statement (letter is an e)
                    count++;
     */
    public static int countEs(String[] arr){
        int count = 0;
        for (String word : arr){
            if (word != null) {
                //word -> "tree"
                char[] letters = word.toLowerCase().toCharArray();
                //letters -> {'t', 'r', 'e', 'e'};
                for (char let : letters) {
                    if (let == 'e' /* || let == 'E'*/ ) {
                        count++;
                    } //ends little if
                } //ends little loop
            } //ends big if
        } //ends big loop
        return count;
    }

    //I like mine down here. It doesn't matter.
    //GOAL: Is to count how many letters are in the string array
    public static int countTotalLetters(String[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            String currElement = arr[i];
            if (currElement != null) {
                count += currElement.length();
            }

            //A null pointer exception happens when we call a method
            //upon an object which is null

            //DON't TYPE THIS (WRONG ANSWER)
            /*for (int k = 0; k < currElement.length(); k++){
                count++;
            }*/
        } // ends loop
        return count;
    } // ends method

} //ends the class

package org.example;

import java.util.*;

public class TechPrep {
    public static void main(String[] args) {
        System.out.println(anagram("mississippi", "mississippi"));
        int[] a = {4, 2, 6, 8};
        int[] b = {1, 5, 3, 7};
        System.out.println("15? " + sums2K(a, b, 15)); // {3, 3}
        System.out.println("25? " + sums2K(a, b, 25)); // null
        System.out.println("9? " + sums2K(a, b, 9)); //{0, 1} or {3, 0} or {2, 2}

    }

    //Given an array, return true if that array contains ANY duplicate value
    //Upgraded problem: rather than return true/false, return the indexes of the duplicates
    //upgraded problem: Find the most frequent number

    //{1, 2, 3, 4, 5, 6, 2} -> true because 2 2's
    //{12, 14, 15, 2, 3, 18} -> false, because all unique values

    //the naive approach: nested loops
    //the optimized approach: uses HashMap/Set
        //Hashmaps are great when you need to remember or lookup things youve seen before

    //make a map/set
    //loop over the array
        //ask: Have I seen you before?
        //if yes -> return true
        //if no -> add to the map/set
    public static boolean containsDuplicates(int[] nums){
        
    }

    public static int[] sums2KAgain(int[] a, int[] b, int k){
        //but now, I want to return the positions of the values that sum to k
        //HashMap<Element, Index>
        //4 => 0
        //2 => 1
        //6 => 2
        //8 => 3
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++){
            map.put(a[i], i);
        }

        //ask the question does k - b[j] exist in the map?
        //If the answer is yes-> Can we retrieve the index?
        for (int i = 0; i < b.length; i++){
            int answer = k - b[i];
            if (map.containsKey(answer)) {
                int index = map.get(answer);
                return new int[]{index, i};
            }
        }

        return null;
    }






    //GOAL: Return true if two strings are anagrams
    //O(N) Algorithm:
    //1. Make a frequency map for a
    //2. Loop over b, and verify matches
        //2a. As we loop, we'll adjust the frequency map
    //3. Veryify the frequency map has all zeros
    public static boolean anagram(String a, String b){
        if (a.length() != b.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char letter : a.toCharArray()){
            if (map.containsKey(letter)){
                //update
                map.replace(letter, map.get(letter) + 1);
            } else {
                //insert
                map.put(letter, 1);
            }
        }
        for (char letter : b.toCharArray()){
            if (map.get(letter) == null){
                return false;
            } else {
                map.replace(letter, map.get(letter) - 1);
            }
        }
        for (int value : map.values()){
            if (value != 0){
                return false;
            }
        }
        return true;
    }

    public static boolean sums2K(int[] a, int[] b, int k){
        //are there two numbers, a[i] + b[j], that sum to k
        // O(n^2)
        /*for (int i = 0; i < a.length; i++){
            for (int j = 0; j < b.length; j++){
                if (a[i] + b[j] == k){
                    return true;
                }
            }
        }*/

        //a[i] + b[j] == k
        //==
        //a[i] == k - b[j]

        //a[i] = 4;
        //b[j] = 2;
        //k =  6

        //loop over a
            //toss everything into a hashSet?
        //loop over b
            //perform the calculation
            //ask is the answer in the hashmap?
        //O(n)
        HashSet<Integer> set = new HashSet<Integer>();
        for (int number : a){
            set.add(number);
        }
        for (int number : b){
            int answer = k - number;
            if (set.contains(answer)){
                return true;
            }
        }
        return false;
    }

}

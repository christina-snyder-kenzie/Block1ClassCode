package org.example;

import java.util.*;

public class TechPrep {
    public static void main(String[] args) {
        System.out.println(anagram("mississippi", "mississippi"));
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
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < b.length; j++){
                if (a[i] + b[j] == k){
                    return true;
                }
            }
        }
        return false;
    }

}

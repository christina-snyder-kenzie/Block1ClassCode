package org.example;

import java.util.ArrayList;

public class SpeedTest {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        //perform some actions
        long endTime = System.currentTimeMillis();

        long howLong = endTime - startTime;
        System.out.println(howLong);

        int size = 500000;

        long startArray = System.currentTimeMillis();
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = i;
        }
        long endArray = System.currentTimeMillis();
        System.out.println("Array Time: " + (endArray - startArray));

        long startList = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++){
            list.add(i);
        }
        long endList = System.currentTimeMillis();
        System.out.println("List time: " + (endList - startList));

        long startList2 = System.currentTimeMillis();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < size; i++){
            list2.add(0, i);
        }
        long endList2 = System.currentTimeMillis();
        System.out.println("List time: " + (endList2 - startList2));

        long startString = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < size; i++){
            str += "a";
        }
        long endString = System.currentTimeMillis();
        System.out.println("String time: " + (endString - startString));

        long startBuilder = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++){
            builder.append("a");
        }
        long endBuilder = System.currentTimeMillis();
        System.out.println("Builder time: " + (endBuilder - startBuilder));
    }
}

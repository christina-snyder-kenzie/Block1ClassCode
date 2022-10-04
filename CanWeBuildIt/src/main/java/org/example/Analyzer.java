package org.example;

import java.util.*;

public class Analyzer {
    public static void main(String[] args) {
        //Welcome message
        //Grab data, until the user says "quit"
            //data structure -> Arrays and ArrayLists
        //analyze the data
        System.out.println("Welcome to your data analyzer");
        System.out.println("Enter your data, one number per line.\nType 'quit' to stop");
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        /*
        String response = "";
        while (!response.equals("quit")){
            response = scan.nextLine();
            if (!response.equals("quit")){
                list.add(Integer.parseInt(response));
            }
        }
        */
        String response = scan.nextLine();
        while (!response.equals("quit")){
            list.add(Integer.parseInt(response));
            response = scan.nextLine();
        }
        System.out.println(list);
        //Can we write methods to analyze the data?
        //MaxValue
            //Average
            //IndexOfMin
        System.out.println("The max value is: " + maxValue(list));
        System.out.println("The average is: " + average(list));
        System.out.println("The minimum lives at: " + minIndex(list));
    }

    public static int maxValue(ArrayList<Integer> list){
        int max = list.get(0);
        for (int curr : list){
            if (curr > max){
                max = curr;
            }
        }
        return max;
    }

    public static double average(ArrayList<Integer> list){
        double sum = 0;
        for (int curr : list){
            sum += curr;
        }
        return sum / list.size();
    }

    public static int minIndex(ArrayList<Integer> list){
        int min = list.get(0);
        int minIndex = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) < min){
                min = list.get(i);
                minIndex = i;
            }
        }
        return minIndex;
    }

}

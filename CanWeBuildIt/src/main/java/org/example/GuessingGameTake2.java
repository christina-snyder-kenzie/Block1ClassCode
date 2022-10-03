package org.example;

import java.util.Scanner;

public class GuessingGameTake2 {
    public static void main(String[] args) {
        System.out.println("Welcome to your guessing game!");
        //generate the secret number, based on USER min/max
        int minRange = grabNumber("Enter your minimum guess number");
        int maxRange = grabNumber("Enter your maximum guess number");
        System.out.println("You will be guessing from " + minRange + " to " + maxRange);
        int secretNumber = (int) (Math.random() * (maxRange - minRange + 1) + minRange);
        //grab user input
        //test it (higher, lower, correct)
        //print out relevant response
        //repeat the user part if not correct

        //Great Ideas:
            //Make Give Up
            //Handle user guessing outside of the range
            //What if they don't type a number?? -> try/catch
            //track the number of guesses?
        boolean hasTheRightNumber = false;
        while (!hasTheRightNumber){
            int guess = grabNumber("Enter a guess");
            String result = testIt(secretNumber, guess);
            switch (result) {
                case "higher":
                    System.out.println("Too high! Guess Lower");
                    break;
                case "lower":
                    System.out.println("Too low! Guess higher!");
                    break;
                case "correct":
                    System.out.println("Hooray! You got it right!");
                    hasTheRightNumber = true;
                    break;
            }
        }



    }

    //TESTIT: should take in the right answer, and a guess
        //return "higher" if the guess is higher than answer
        //return "lower" if the guess it lower
        //return "correct" if the answer is the guess
    public static String testIt(int rightAnswer, int guess){
        if (guess > rightAnswer){
            return "higher";
        } else if (guess < rightAnswer){
            return "lower";
        } else {
            return "correct";
        }
    }

    //GOAL: write a method that prints a given prompt and returns user input
    public static int grabNumber(String prompt){
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        int response = scan.nextInt();
        return response;
    }
}

package org.example;

import java.util.Scanner;

public class GuessingGameTake2 {

    public static void main(String[] args) {
        //doGuessingGame();
        //int response = grabNumber("Would you like to play again? (0=no, 1=yes)");
        int response = 1;
        while (response == 1){
            doGuessingGame();
            response = grabNumber("Would you like to play again? (0=no, 1=yes)");
        }
        System.out.println("Goodbye! Thanks for playing!");
    }

    public static void doGuessingGame() {
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
            //What if they don't type a number?? -> try/catch
        //DONE IDEA
            //track the number of guesses?
            //play again -> keep score? (round)
            //Make Give Up -> offer a hint (+/- 10% of the range) after 3 guesses
            //Handle user guessing outside of the range
        boolean hasTheRightNumber = false;
        int counter = 0;
        boolean flag = false;
        while (!hasTheRightNumber){
            //1
            if (counter >= 3 && flag == false){
                int hint = grabNumber("Would you like a hint? (0=no, 1=yes)");
                if (hint == 1){
                    flag = true;
                    //plus/minus 10% of the total range
                    int range = maxRange - minRange + 1;
                    int lowerBound = secretNumber - (range / 10);
                    int upperBound = secretNumber + (range / 10);
                    System.out.println("Try between " + lowerBound + " and " + upperBound);
                }
            }
            counter++;
            //2
            int guess = grabNumber("Enter a guess", minRange, maxRange);
            //3 -> X
            String result = testIt(secretNumber, guess);
            switch (result) {
                case "higher":
                    System.out.println("Too high! Guess Lower");
                    //4? -> X
                    break;
                case "lower":
                    System.out.println("Too low! Guess higher!");
                    //4? -> X
                    break;
                case "correct":
                    System.out.println("Hooray! You got it right!");
                    if (counter == 1){
                        System.out.println("WOW! FIRST TRY!");
                    } else {
                        System.out.println("It took you " + counter + " guesses");
                    }
                    hasTheRightNumber = true;
                    break;
            }
            //5
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

    public static int grabNumber(String prompt, int min, int max){
        //GOAL: make sure the number is between min and max
        int attempt = grabNumber(prompt);
        while (attempt < min || attempt > max){
            System.out.println("That guess is out of range!");
            attempt = grabNumber("Guess again");
        }
        return attempt; //GUARANTEE: I'm between min and max
    }

    //GOAL: write a method that prints a given prompt and returns user input
    public static int grabNumber(String prompt){
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        int response = scan.nextInt();
        return response;
    }
}

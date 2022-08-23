import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //generate a secret number
        //ask the user for their guess
        //output you got it right, you need to go higher
            //or you need to go lower
        //for three guesses
        int secretNumber = (int) (Math.random() * 10);
        //the biggest decimal is .9999 x 10 -> 9.99999
        //the smallest deciaml is 0.0 x 10 -> 0.0
        //that secret number will go from 0 - 9
        System.out.print("Enter a number between 0 and 9: ");
        int guess = Integer.parseInt(scan.nextLine());
        boolean gotItRight = false;
        if (guess < 0 || guess > 9) {
            System.out.println("You can't follow directions :P");
        } else if (guess == secretNumber){
            System.out.println("You got it right! First Try!");
            gotItRight = true;
        } else if (guess < secretNumber){
            System.out.println("You need to guess higher.");
        } else {
            System.out.println("Too high! Guess lower.");
        }

        if (!gotItRight){
            //the do not have the right answer yet.
            System.out.print("Guess again! Enter a number 0-9: ");
            guess = Integer.parseInt(scan.nextLine());
            if (guess < 0 || guess > 9) {
                System.out.println("You can't follow directions :P");
            } else if (guess == secretNumber){
                System.out.println("You got it right! on the second Try!");
                gotItRight = true;
            } else if (guess < secretNumber){
                System.out.println("You need to guess higher.");
            } else {
                System.out.println("Too high! Guess lower.");
            }//ends my else
        }//ends my if

        if (!gotItRight){
            //the do not have the right answer yet.
            System.out.print("Guess again! Enter a number 0-9: ");
            guess = Integer.parseInt(scan.nextLine());
            if (guess < 0 || guess > 9) {
                System.out.println("You can't follow directions :P");
            } else if (guess == secretNumber){
                System.out.println("You got it right! on the last and final Try!");
                gotItRight = true;
            } else {
                System.out.println("Bummer. The secret number was: " + secretNumber);
            }//ends my else
        }//ends my if


    }//ends my main method
}//ends the file

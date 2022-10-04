package org.example;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        //rock paper scissors
        //2 player game
            //rock beats scissors
            //scissors beats paper
            //paper beats rock
        //User VS Computer
            //User -> Scanner
            //Computer -> randomly choose

        //Method Ideas:
            //generateComputerAnswer()
            //determineWinner(userAns, CompAns)
            //grabUserAnswer()

        String userAns = grabUserAnswer();
        String compAns = generateComputerAnswer();
        String winner = determineWinner(userAns, compAns);
        System.out.println("The computer chose: " + compAns);
        if (winner.equals("user")){
            System.out.println("You won!");
        } else if (winner.equals("tie")){
            System.out.println("It's a tie!");
        } else {
            System.out.println("You lost!");
        }

    }

    public static String coinFlip(){
        if (Math.random() < .5){
            return "heads";
        } else {
            return "tails";
        }
    }

    public static String grabUserAnswer(){
        Scanner scan = new Scanner(System.in);
        System.out.println("CHOOSE YOUR WEAPON:");
        System.out.println("ROCK...PAPER...SCISSORS");
        String response = scan.nextLine();
        //TODO: verify that response is rock, or paper, or scissors
        return response.toLowerCase();
    }

    public static String generateComputerAnswer(){
        //GOAL: randomly choose rock/paper/scissors
        //QUESTION: should we evenly distribute probabilities?
            //like should it be 33.33% for each?
            //OR should like 50% we go rock
        double value = Math.random(); //0 -> 1
        if (value < .33333){
            return "rock";
        } else if (value < .66666){
            return "paper";
        } else {
            return "scissors";
        }

    }

    public static String determineWinner(String user, String comp){
        //rock beats scissors
        //scissors beats paper
        //paper beats rock
        if (user.equals(comp)){
            return "tie";
        } else if (user.equals("rock") && comp.equals("scissors")){
            return "user";
        } else if (user.equals("scissors") && comp.equals("paper")){
            return "user";
        } else if (user.equals("paper") && comp.equals("rock")){
            return "user";
        } else {
            return "computer";
        }
    }


}

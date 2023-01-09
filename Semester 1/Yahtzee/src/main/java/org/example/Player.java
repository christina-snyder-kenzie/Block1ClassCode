package org.example;

import java.util.Scanner;

public class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName(){
        return name;
    }

    public void takeATurn(DiceShaker shaker){
        int turnCounter = 0;
        boolean keepGoing = true;

        while (turnCounter < 3 && keepGoing){
            shaker.rollAll();
            shaker.display();
            if (turnCounter < 2){
                keepGoing = decideWhichToKeep(shaker);
            }
            turnCounter++;
        }

        score += shaker.calcScore();
    }

    public boolean decideWhichToKeep(DiceShaker dice){
        Scanner scan = new Scanner(System.in);
        System.out.println("Which dice numbers do you want to keep?");
        System.out.println("List separated by commas, NO SPACES (1,2,5)");
        String answer = scan.nextLine();
        if (answer.length() == 0){
            return true; //just roll again, no keepsies
        }
        String[] data = answer.split(",");
        if (data.length == 5){
            return false; //we no longer want to keep going
        } else {
            for (String x : data){
                dice.keep(Integer.parseInt(x));
            }
            return true; // we want to roll again
        }
    }


}

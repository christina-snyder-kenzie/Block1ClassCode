package org.example;

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
            keepGoing = decideWhichToKeep(shaker);
            turnCounter++;
        }

        score += shaker.calcScore();
    }




}

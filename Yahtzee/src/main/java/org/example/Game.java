package org.example;

import java.util.*;

public class Game {
    private ArrayList<Player> players;
    private int maxScore;
    private DiceShaker shaker;

    public Game(int maxScore){
        players = new ArrayList<Player>();
        this.maxScore = maxScore;
        shaker = new DiceShaker();
        addPlayers();
    }

    public void addPlayers(){

    }

    public void play(){
        while (!foundAWinner()){
            for (Player p : players){
                p.takeATurn(shaker);
                if (foundAWinner()){
                    System.out.println(p.getName() + "wins!");
                }
            }
        }
    }

    public boolean foundAWinner(){
        for (Player p : players){
            if (p.getScore() >= maxScore){
                return true;
            }
        }
        return false;
    }
}

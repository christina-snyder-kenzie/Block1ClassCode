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
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Yahtzie!");
        System.out.println("Enter your player names, and then type done");
        String playerName = scan.nextLine();
        while (!playerName.equals("done")){
            players.add(new Player(playerName));
            playerName = scan.nextLine();
        }
        System.out.println("We're playing a " + players.size() + " player game");
    }

    public void play(){
        while (!foundAWinner()){
            for (Player p : players){
                System.out.println("**********");
                System.out.println("It's " + p.getName() + "'s turn!");
                p.takeATurn(shaker);
                shaker.reset();
                System.out.println("Your score is now: " + p.getScore());
                if (foundAWinner()){
                    System.out.println(p.getName() + " wins!");
                    break;
                }
            }
        }
        System.out.println("Thanks for playing!");
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

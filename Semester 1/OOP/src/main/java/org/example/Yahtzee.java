package org.example;

public class Yahtzee {
    private FancyDie[] dice;

    public Yahtzee(int numDice){
        dice = new FancyDie[numDice];
        for (int i = 0; i < numDice; i++){
            dice[i] = new FancyDie(6);
        }
    }

    public boolean hasThreeOfAKind(){
        int[] numbers = new int[7];
        for (FancyDie d : dice){
            numbers[d.getValue()]++;
        }
        for (int x : numbers){
            if (x == 3){
                return true;
            }
        }
        return false;
    }

    public boolean hasXOfAKind(int numRepeats){
        int[] numbers = new int[7];
        for (FancyDie d : dice){
            numbers[d.getValue()]++;
        }
        for (int x : numbers){
            if (x == numRepeats){
                return true;
            }
        }
        return false;
    }

    public void rollAllDice(){
        for (FancyDie d : dice){
            d.roll();
        }
    }

    public void seeAllDice(){
        for(FancyDie d : dice){
            d.see();
        }
    }

    public static void main(String[] args) {
        Yahtzee game = new Yahtzee(5);
        int counter = 0;
        while (!game.hasThreeOfAKind()){
            game.rollAllDice();
            counter++;
        }
        game.seeAllDice();
        System.out.println("It took " + counter + " rolls to get here");

        counter = 0;
        while (!game.hasXOfAKind(5)){
            game.rollAllDice();
            counter++;
        }
        game.seeAllDice();
        System.out.println("It took " + counter + " rolls to get all the same!");
    }
}

package org.example;

public class DiceShaker {
    private Die[] dice;

    public DiceShaker(){
        dice = new Die[5];
        for (int i = 0; i < 5; i++){
            dice[i] = new Die();
        }
    }

    public void rollAll(){
        for (Die d : dice){
            if (!d.isKept())
                d.roll();
        }
    }

    public int calcScore(){
        if (hasYahtzee()){
            return 50;
        } else if (hasLargeStraight()){
            return 40;
        } else if (hasSmallStraight()){
            return 30;
        } else if (hasFullHouse()){
            return 25;
        } else if (hasThree() || hasFour()){
            return total();
        } else {
            return totalOfMostPopular();
        }
    }

    public int total(){
        int sum = 0;
        for (Die d : dice){
            sum += d.getValue();
        }
        return sum;
    }
}

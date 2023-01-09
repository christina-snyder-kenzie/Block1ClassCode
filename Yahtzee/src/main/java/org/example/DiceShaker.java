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
        sort();
        int[] population = new int[7];
        for (Die d : dice){
            population[d.getValue()]++;
        }
        if (hasYahtzee(population)){
            return 50;
        } else if (hasLargeStraight(population)){
            return 40;
        } else if (hasSmallStraight(population)){
            return 30;
        } else if (hasFullHouse(population)){
            return 25;
        } else if (hasThree(population) || hasFour(population)){
            return total();
        } else {
            return total();
        }
    }


    public boolean hasFour(int[] pop){
        for (int x : pop){
            if (x == 4){
                return true;
            }
        }
        return false;
    }

    public boolean hasThree(int[] pop){
        for (int x : pop){
            if (x == 3){
                return true;
            }
        }
        return false;
    }

    public boolean hasFullHouse(int[] pop){
        boolean has2 = false;
        boolean has3 = false;
        for (int dicePop : pop){
            if (dicePop == 2){
                has2 = true;
            } else if (dicePop == 3){
                has3 = true;
            }
        }
        return has2 && has3;
    }

    public boolean hasSmallStraight(int[] pop){
        for (int i = 0; i < 3; i++){
            boolean hasStraight = true;
            for (int j = i + 1; j <= i + 4; j++){
                if (pop[j] == 0){
                    hasStraight = false;
                }
            }
            if (hasStraight == true){
                return true;
            }
        }
        return false;
    }

    public boolean hasLargeStraight(int[] pop){
        boolean has1Through5 = true;
        for (int i = 1; i <= 5; i++){
            if (pop[i] == 0){
                 has1Through5 = false;
            }
        }
        boolean has2Through6 = true;
        for (int i = 2; i <= 6; i++){
            if (pop[i] == 0){
                has2Through6 = false;
            }
        }
        return has1Through5 || has2Through6;
    }

    public boolean hasYahtzee(int[] pop){
        for (int dicePop : pop){
            if (dicePop == 5){
                return true;
            }
        }
        return false;
    }

    //bubble sort
    //make a lot of tiny swaps, to anything that is out of order
    public void sort(){
        for (int i =0; i < dice.length; i++){
            for (int j = 0; j < dice.length-1; j++){
                if (dice[j + 1].getValue() < dice[j].getValue()){
                    Die temp = dice[j];
                    dice[j] = dice[j + 1];
                    dice[j + 1] = temp;
                }
            }
        }
    }

    public int total(){
        int sum = 0;
        for (Die d : dice){
            sum += d.getValue();
        }
        return sum;
    }

    public void display(){
        System.out.println("---------------------");
        for (int i = 0; i < 5; i++){
            System.out.print(dice[i].getValue() + " | ");
        }
        System.out.println("\n----------");
        for (int i = 0; i < 5; i++){
            System.out.print(i + 1 + " | ");
        }
        System.out.println("\n---------------------");
    }

    public void keep(int dieNumber){
        dice[dieNumber - 1].keep();
    }

    public void reset(){
        for (Die d : dice){
            d.unKeep();
            d.roll();
        }
    }
}

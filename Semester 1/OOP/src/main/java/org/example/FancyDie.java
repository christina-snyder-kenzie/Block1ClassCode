package org.example;

public class FancyDie {
    private int number;
    private int numSides;

    public FancyDie(int numSides){
        this.numSides = numSides;
        number = (int) (Math.random() * numSides) + 1;
    }

    public void roll(){
        number = (int) (Math.random() * numSides) + 1;
    }

    public int getValue(){
        return number;
    }

    public void see(){
        System.out.println("-------");
        System.out.println("|     |");
        System.out.println("|  " + number + "  |");
        System.out.println("|     |");
        System.out.println("-------");
    }

    public static void main(String[] args) {
        FancyDie roller = new FancyDie(6);
        roller.see();
        roller.roll();
        roller.see();
    }
}

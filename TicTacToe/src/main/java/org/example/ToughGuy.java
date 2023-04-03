package org.example;

import java.util.ArrayList;

public class ToughGuy extends ComputerPlayer {
    public ToughGuy(String symbol){
        super(symbol);
    }

    public Spot findTheRightSpot(ArrayList<Spot> spots, TicTacBoard board){
        //GOAL: Find a spot next to my symbol
            //HARDCORE: FIND THE SPOT TOUCHING THE MOST SYMBOLS
        //what is next to?
        Spot bestSpot = spots.get(0);
        int bestCount = 0;
        for (Spot spot : spots){
            int myRow = spot.row;
            int myCol = spot.col;
            int countForSpot = 0;
            for (int i = myRow - 1; i <= myRow + 1; i++){
                for (int j = myCol - 1; j <= myCol + 1; j++){
                    //my neighbor is at spot i, j
                    //I wanna know: is that neighbor the same symbol as me?
                    if (!(i == myRow && j == myCol) && board.hasSymbol(i, j, getSymbol())){
                        countForSpot++;
                        System.out.println("row: " + myRow + ", col: " + myCol + ", counter: " + countForSpot);
                    }
                }
            }
            if (countForSpot > bestCount){
                bestCount = countForSpot;
                bestSpot = spot;
            }
        }
        return bestSpot;
    }
}

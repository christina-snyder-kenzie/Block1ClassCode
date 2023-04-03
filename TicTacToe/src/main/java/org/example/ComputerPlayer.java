package org.example;

import com.sun.source.tree.CompilationUnitTree;

import java.util.ArrayList;

public class ComputerPlayer extends Player {
    public ComputerPlayer(String symbol){
        super(symbol);
    }

    public void makeMove(TicTacBoard board){
        //Collect empty spots
        ArrayList<Spot> empties = new ArrayList<>();
        int size = board.getSize();
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                //i and j are my spots
                if (board.isValid(i, j)){
                    //I have found an empty spot!!
                    //Let's collect it
                    empties.add(new Spot(i, j));
                }
            }
        }
        //Randomly choose one
            //if I have a list of size N
            //indexes go from [0, N-1]

        Spot spot = findTheRightSpot(empties, board);
        //Make the move there
        board.makeMove(spot.row, spot.col, getSymbol());
    }

    public Spot findTheRightSpot(ArrayList<Spot> spots, TicTacBoard board){
        int randomIndex = (int) (Math.random() * spots.size());
        Spot randomSpot = spots.get(randomIndex);
        return randomSpot;
    }

    class Spot{
        int row, col;

        public Spot(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
}

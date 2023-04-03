package org.example;

import java.util.Scanner;

public class Player {
    private String symbol;

    public Player(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol(){
        return symbol;
    }

    public void makeMove(TicTacBoard board){
        //Use a scanner to retrieve row and column

        //1. Display the board with labels
            //This is a job for the board
        //2. Ask for the row (and get the row)
            //Use print statements and scanner
        //3. Ask for the column (and get the col)
            //Use print statements and scanner
        //4. Validate input
            //numbers are valid indexes (within the grid size)
            //there is NOT already an x or o there (it is null)

            //Option 1: Do logic in the player class
            //Option 2: Do logic in the board class + call the method
        //5. Make the move on the board

        int row = 0, col = 0;
        Scanner scan = new Scanner(System.in);
        do {
            board.displayWithLabels();
            System.out.println("Enter your row: " );
            row = Integer.parseInt(scan.nextLine());
            System.out.println("Enter your col: ");
            col = Integer.parseInt(scan.nextLine());

        } while (board.isValid(row, col) == false);

        board.makeMove(row, col, symbol);
    }
}

package org.example;

import javax.swing.table.TableRowSorter;

public class TicTacBoard {
    //Properties
    private String[][] grid;
    private int size;
    //Constructors
    public TicTacBoard(int size){
        grid = new String[size][size];
        this.size = size;
    }

    public TicTacBoard(String existingBoard){
        /*if (existingBoard  != "_"){
            grid[i][j] = existingBoard[i][j]
        }*/
    }

    //Methods (could be getter/setter)
    //FirstMethod: makeMove
        //inputs??? Which symbol, coordiantes
    //Pre-Condition: Coordinate is valid
    public void makeMove(int row, int col, String symbol) {
        //where i'm going = what I have
        grid[row][col] = symbol;
    }

    //should we write a method to see if a spot is empty?
    public boolean isEmpty(int row, int col){
        return grid[row][col] == null;
    }

    //What do we want our board to look like?
    //it's  N x N ( could be 3 x 3, or 5 x 5)
    //let's pretend it's 3 x 3
        /*
        |_|_|O|
        |X|_|_|
        |_|_|_|
         */
    //Question: Return Type: void or String?
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++){
            sb.append("|");
            for (int j = 0; j < size; j++){
               /* if (grid[i][j] != null) {
                    sb.append(grid[i][j]);
                } else {
                    sb.append("_");
                } */
                //ternary operator -> ?
                sb.append( grid[i][j] == null ? "_" : grid[i][j]);
                sb.append("|");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    //GOAL: code a find winner method:
        //We probably need to know what symbol is p1 vs p2
            //jk. p1 == X, p2 == O
    //to win, you need a full row, or a full column, or a full diagonal (major or minor)
        //if ANY Spot is empty (or the other guy), we DON'T have a win

    //diagonals:
        //major: [i][i]
        //minor: [i][length - i - 1]
    public Result determineWinner(){
       /* boolean P1IsTheWinner = true;
       boolean p2Isthewinner = true;
        if (I find an empty or the other guy){
            IAMTheWinner = false;
        }
        if (P1IsTheWinner){
            return Result.P1_WINS;
        }
        if (P2IsTheWinner){
            return Result.P2_WINS;
        }

        boolean IfoundABadSpot = false;
        if (I find an empty or the other guy){
            IfoundABadSpot = true;
        }
        if (!IfoundABadSpot){
            return Result.P1_WINS;
        }
        */

        //FIRST TASK: CHeck the rows for winners
        for (int rowIndex = 0; rowIndex < size; rowIndex++){
            //init the flags
            boolean p1IsWinner = true;
            boolean p2IsWinner = true;
            //loop across looking for bad guys
            for (int colIndex = 0; colIndex < size; colIndex++){
                String spot = grid[rowIndex][colIndex];
                //spot could be X, O, or null
                if (spot == null){
                    p1IsWinner = false;
                    p2IsWinner = false;
                } else if (spot.equals("X")){
                    p2IsWinner = false;
                } else if (spot.equals("O")){
                    p1IsWinner = false;
                }
            }
            //test the flag after we look
            if (p1IsWinner){
                return Result.P1_WINS;
            } else if (p2IsWinner){
                return Result.P2_WINS;
            } //we don't need an else- we're going to keep looking
        }

        for (int colIndex = 0; colIndex < size; colIndex++){
            boolean p1IsWinner = true;
            boolean p2IsWinner = true;
            for (int rowIndex = 0; rowIndex < size; rowIndex++){
                String spot = grid[rowIndex][colIndex];
                //spot could be X, O, or null
                if (spot == null){
                    p1IsWinner = false;
                    p2IsWinner = false;
                } else if (spot.equals("X")){
                    p2IsWinner = false;
                } else if (spot.equals("O")){
                    p1IsWinner = false;
                }
            }
            if (p1IsWinner){
                return Result.P1_WINS;
            } else if (p2IsWinner){
                return Result.P2_WINS;
            }
        }

        //Major Diagonal:
        //init flags
        boolean p1IsWinner = true;
        boolean p2IsWinner = true;
        //loop across the diagonal looking for bad guys
        for (int i = 0; i < size; i++){
            String spot = grid[i][i];
            if (spot == null){
                p1IsWinner = false;
                p2IsWinner = false;
            } else if (spot.equals("X")){
                p2IsWinner = false;
            } else if (spot.equals("O")){
                p1IsWinner = false;
            }
        }
        //test the flags
        if (p1IsWinner){
            return Result.P1_WINS;
        } else if (p2IsWinner){
            return Result.P2_WINS;
        }

        p1IsWinner = true;
        p2IsWinner = true;
        //minor diagonal:
        for (int i = 0; i < size; i++){
            String spot = grid[i][size - i - 1]; //as row goes up, column goes down
            if (spot == null){
                p1IsWinner = false;
                p2IsWinner = false;
            } else if (spot.equals("X")){
                p2IsWinner = false;
            } else if (spot.equals("O")){
                p1IsWinner = false;
            }
        }
        //test the flags
        if (p1IsWinner){
            return Result.P1_WINS;
        } else if (p2IsWinner){
            return Result.P2_WINS;
        }

        //we're here: no one has won
        //if all the spots are full-> we draw
        //if ANY spot is empty -> we keep going
        for (String[] row : grid){
            for (String spot : row){
                if (spot == null){
                    return Result.KEEP_GOING;
                }
            }
        }

        return Result.DRAW;
    }

    public static void main(String[] args) {
        TicTacBoard board = new TicTacBoard(3);
        board.makeMove(1, 2, "O");
        board.makeMove(2, 2, "O");
        board.makeMove(0, 2, "O");
        board.makeMove(0, 1, "X");
        board.makeMove(1, 1, "O");
        board.makeMove(2, 1, "O");
        System.out.println(board);
        System.out.println(board.determineWinner());
    }
}

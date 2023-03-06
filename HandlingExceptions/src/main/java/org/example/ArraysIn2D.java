package org.example;

import java.util.Arrays;

public class ArraysIn2D {
    public static void main(String[] args) {
        int[][] arr2D = {{7, 5, 1, 8},
                         {2, 4, 3, 7}};
        System.out.println(Arrays.toString(arr2D));
        printOut(arr2D);
        System.out.println(sumUp(arr2D));
        System.out.println(avg(arr2D));
        System.out.println(findMax(arr2D));
        System.out.println(sumRow(arr2D, 0));
        System.out.println(sumRow(arr2D, 1));

        //print out all column sums:
        for (int j = 0; j < arr2D[0].length; j++) {
            System.out.print(sumCol(arr2D, j) + ", ");
        }

        System.out.println();
        System.out.println(sumAround(arr2D, 0, 0));

        int[][] board = new int[5][5];

        board[3][2] = -1;
        board[0][4] = -1;
        board[2][4] = -1;
        board[1][1] = -1;

        printOut(board);
    }

    public static void fillBoard(int[][] board){
        //loop
            //if I'M NOT a bomb
                //count how many bombs are AROUND me (you could write a method to do this...)
                //put that number in my spot
    }

    public static int countBombsAround(int[][] board, int row, int col){
        //v similar to sumAround
        return 0;
    }

    //GOAL: Given a position, calculate
    //the sum of the neighboring positions
    //naive approach:
    //just code all 8 spots
    //try{
        //basket += arr[r-1][c-1]
    //} catch (IndexOutOfBoundsException e){

    //}
        //basket += arr[r-1][c]
        //basket += arr[r-1][c+1]
        //...

    //for (int rowIndex = r - 1; rowIndex <= r +1 ; rowIndex++){
        //for (int colIndex = c - 1; colIndex <= c + 1; colIndex++){
            //if (rowIndex != r && colIndex != c)
                //try {
                    //basket += arr[rowIndex][colIndex];
                //catch (index out of bounds) {
     public static int sumAround(int[][] arr2D, int r, int c){
        int basket = 0;
        for (int rowIndex = r - 1; rowIndex <= r +1 ; rowIndex++) {
            for (int colIndex = c - 1; colIndex <= c + 1; colIndex++) {
                //if (rowIndex == r && colIndex == c) de morgan's law

                // ! (rowIndex == r && colIndex == c)

                if (rowIndex != r || colIndex != c) {
                    try {
                        System.out.println(arr2D[rowIndex][colIndex]);
                        basket += arr2D[rowIndex][colIndex];
                    } catch (IndexOutOfBoundsException e) {
                        //ignore it
                        System.out.println("OOB: " + rowIndex + ", " + colIndex);
                    }
                }
            }
        }
        return basket;
     }


    //GOAL: sum a particular column
    public static int sumCol(int[][] arr2D, int colIndex){
        int basket = 0;
        for (int rowIndex = 0; rowIndex < arr2D.length; rowIndex++){
            basket += arr2D[rowIndex][colIndex];
        }
        return basket;
    }

    //GOAL: is to sum a particular row
    public static int sumRow(int[][] arr2D, int rowIndex){
        int basket = 0;
        for (int colIndex = 0; colIndex < arr2D[0].length; colIndex++){
            int dude = arr2D[rowIndex][colIndex];
            basket += dude;
        }
        return basket;
    }


    //sum
    public static int sumUp(int[][] arr2D){
        //basket
        int basket = 0;
        //loop
        for (int i = 0; i < arr2D.length; i++){
            for (int j = 0; j < arr2D[0].length; j++){
                int dude = arr2D[i][j];
                basket += dude;
            }
        }
            //add to the basket
        return basket;
    }

    //avg
    //sum, divide by total num elements
    public static double avg(int[][] arr2D){
        int sum = sumUp(arr2D);
        int numRows = arr2D.length;
        int numCols = arr2D[0].length;
        int totalNumber = numRows * numCols;
        return sum/ (double) totalNumber;

        //return (double) sumUp(arr2D) / ( arr2D.length * arr2D[0].length);
    }

    //find max
    public static int findMax(int[][] arr2D){
        //init max
        int max = arr2D[0][0];
        //loop
        for (int[] row : arr2D){
            for (int dude : row){
                //if we're bigger
                if (dude > max) {
                    //we're the max now
                    max = dude;
                }
            }
        }
        return max;
    }

    //GOAL: Print out an array in tabular form
    // (make it look like a grid)
    public static void printOut(int[][] arr2D){
        for (int rowIndex = 0; rowIndex < arr2D.length; rowIndex++){
            for (int colIndex = 0; colIndex < arr2D[0].length; colIndex++){
                int dude = arr2D[rowIndex][colIndex];
                System.out.print(dude + ", "); //not println
            }//ends my column loop
            System.out.println(); //go to the next line
        }//ends the row loop
    }
}

package org.example;

public class PlayTicTacToe {
    private int turnCounter;
    private Player p1, p2;
    private TicTacBoard board;

    public PlayTicTacToe(int size){
        board = new TicTacBoard(size);
        p1 = new Player("X");
        p2 = new Player("O");
        turnCounter = 1;
    }

    //computer player(s)
    //overloaded constructor-> takes in size AND a boolean
        //if that boolean is TRUE: TWO computer players
        //if that boolean is FALSE: One real player and one comp player
    public PlayTicTacToe(int size, boolean doubletrouble){
        if (doubletrouble){
            p1 = new ComputerPlayer("X");
            p2 = new ComputerPlayer("O");
        } else {
            p1 = new Player("X");
            p2 = new ToughGuy("O");
        }
        board = new TicTacBoard(size);
        turnCounter = 1;
    }

    public void play(){
        while (board.determineWinner() == Result.KEEP_GOING){
            if (turnCounter == 6){
                System.out.println("TURN 6");
            }
            //determine the current player
                //p1 == odd
                //p2 == even
            Player currentPlayer = (turnCounter % 2 == 1) ? p1 : p2;
            //take a turn
            currentPlayer.makeMove(board);
            System.out.println(board);
            //advance the turn counter?
            turnCounter++;
            try{
                Thread.sleep(3000);
            } catch (Exception e){
                System.out.println("TROUBLE SLEEPING");
            }

        }
        System.out.println(board.determineWinner());
    }

    public static void main(String[] args) {
        PlayTicTacToe runner = new PlayTicTacToe(3, false);
        runner.play();
    }
}

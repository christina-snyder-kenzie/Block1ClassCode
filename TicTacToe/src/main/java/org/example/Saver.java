package org.example;

import javax.swing.table.TableRowSorter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Saver {

    public static void save(TicTacBoard board, String fileName){
        Path filePath = Path.of(fileName);
        try {
            Files.writeString(filePath, board.toString());
        } catch (IOException e){
            System.out.println("ERROR: COULD NOT SAVE FILE");
        }
    }

    public static TicTacBoard load(String fileName){
        //How big should that board be?
        Path filePath = Path.of(fileName);
        String fileContents = "";
        try {
            fileContents = Files.readString(filePath);
        } catch (IOException e){
            System.out.println("ERROR: COULD NOT LOAD FILE");
        }
        String[] rows = fileContents.split("\n");
        System.out.println("ROWS.length: " + rows.length);
        TicTacBoard board = new TicTacBoard(rows.length);
        //if the spot is NOT an _, put it in the board

        //makeMove(row, col, symbol)
        for (int i = 0; i < rows.length; i++){
            String[] data = rows[i].substring(1).split("\\|");
            for (int j = 0; j < data.length; j++){
                String symbol = data[j];
                if (!symbol.equals("_")){
                    board.makeMove(i, j, symbol);
                }
            }
        }
        return board;
    }
}

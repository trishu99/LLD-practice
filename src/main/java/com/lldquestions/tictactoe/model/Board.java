package main.java.com.lldquestions.tictactoe.model;

import main.java.com.lldquestions.tictactoe.model.Pieces.PlayingPiece;

public class Board {
    int size;
    PlayingPiece[][] board;

    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public int getSize() {
        return size;
    }

    public Boolean addPiece(int row, int col, PlayingPiece piece){
        if(board[row][col] != null)
            return false;
        board[row][col] = piece;
        return true;
    }

    public void printBoard(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if (board[i][j] != null) {
                    System.out.print(board[i][j].getType().name() + "   ");
                } else {
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public Boolean getFreeCells() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null)
                    return true;
            }
        }
        return false;
    }

}

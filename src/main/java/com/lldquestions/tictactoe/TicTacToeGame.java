package main.java.com.lldquestions.tictactoe;

import main.java.com.lldquestions.tictactoe.model.*;
import main.java.com.lldquestions.tictactoe.model.Pieces.PlayingPieceFactory;
import main.java.com.lldquestions.tictactoe.model.Pieces.piecetypes.PieceType;
import main.java.com.lldquestions.tictactoe.model.Pieces.PlayingPiece;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;
    Boolean winner;

    int[] rows;
    int[] cols;
    int dig = 0;
    int revDig = 0;

    public TicTacToeGame(int playerCnt, int boardSize){
        initializeGame(playerCnt, boardSize);
    }

    void initializeGame(int playerCnt, int boardSize){
        players = new LinkedList<>();
        PlayingPieceFactory factory = new PlayingPieceFactory();
        for(int i = 0; i < playerCnt; i++){
            PlayingPiece piece = factory.getPlayingPiece(i);
            Player player = new Player("player" + i, piece);
            players.add(player);
        }

        gameBoard = new Board(3);
        rows = new int[boardSize];
        cols = new int[boardSize];
    }

    public String startGame(){
        winner = false;
        while(!winner){
            Player playerTurn = players.removeFirst();

            gameBoard.printBoard();
            Boolean freeCells = gameBoard.getFreeCells();
            if(!freeCells){
                winner = true;
                break;
            }

            // read the input
            System.out.print(playerTurn.getName() + " Enter row, col: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.parseInt(values[0]);
            int inputCol = Integer.parseInt(values[1]);

            Boolean isValidMove = gameBoard.addPiece(inputRow, inputCol, playerTurn.getPiece());
            if(!isValidMove){
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            winner = checkWinner(inputRow, inputCol, playerTurn.getPiece().getType());
            if(winner)
                return playerTurn.getName();
        }

        return "DRAW";
    }

    public Boolean checkWinner(int row, int col, PieceType pieceType){
        int size = gameBoard.getSize();
        int delta = (pieceType == PieceType.X) ? 1 : -1;

        rows[row] += delta;
        cols[col] += delta;
        if(row == col)
            dig += delta;
        if(row + col == size - 1)
            revDig += delta;

        if(Math.abs(rows[row]) == size || Math.abs(cols[col]) == size
                || Math.abs(revDig) == size || Math.abs(dig) == size)
            return true;
        return false;
    }
}

package main.java.com.lldquestions.tictactoe.model.Pieces;

import main.java.com.lldquestions.tictactoe.model.Pieces.piecetypes.PieceO;
import main.java.com.lldquestions.tictactoe.model.Pieces.piecetypes.PieceX;

public class PlayingPieceFactory {
    public PlayingPiece getPlayingPiece(int input){
        if(input == 0)
            return new PieceO();
        else if(input == 1)
            return new PieceX();
        return new PieceO();
    }
}

package main.java.com.lldquestions.tictactoe.model.Pieces;

import main.java.com.lldquestions.tictactoe.model.Pieces.piecetypes.PieceType;

public class PlayingPiece {
    PieceType type;

    public PlayingPiece(PieceType type){
        this.type = type;
    }

    public PieceType getType() {
        return type;
    }

    public void setType(PieceType type) {
        this.type = type;
    }
}

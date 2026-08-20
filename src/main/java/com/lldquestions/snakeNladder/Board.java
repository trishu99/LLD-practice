package main.java.com.lldquestions.snakeNladder;

import main.java.com.lldquestions.snakeNladder.components.Ladder;
import main.java.com.lldquestions.snakeNladder.components.Snake;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    int size;
    Cell[][] board;

    public Board(int size, int snakeCount, int ladderCount){
        this.size = size;
        initializeBoard(size);
        addSnakeNLadders(snakeCount, ladderCount);
    }

    private void initializeBoard(int size){
        board = new Cell[size][size];

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                board[i][j] = new Cell();
            }
        }
    }

    private void addSnakeNLadders(int snakeCnt, int ladderCnt){
        while(snakeCnt > 0){
            int start = ThreadLocalRandom.current().nextInt(0, size * size);
            int end = ThreadLocalRandom.current().nextInt(0, size * size);
            if(end >= start)
                continue;

            Snake snake = new Snake(start, end);
            Cell cell = getCell(start);
            cell.setJump(snake);

            snakeCnt--;
        }

        while(ladderCnt > 0){
            int start = ThreadLocalRandom.current().nextInt(0, size * size);
            int end = ThreadLocalRandom.current().nextInt(0, size * size);
            if(start >= end)
                continue;

            Ladder ladder = new Ladder(start, end);
            Cell cell = getCell(start);
            cell.setJump(ladder);

            ladderCnt--;
        }
    }

    public Cell getCell(int position){
        int row = position / size;
        int col = position % size;

        return board[row][col];
    }


}

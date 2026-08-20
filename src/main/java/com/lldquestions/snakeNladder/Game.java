package main.java.com.lldquestions.snakeNladder;

import main.java.com.lldquestions.snakeNladder.players.HumanPlayer;
import main.java.com.lldquestions.snakeNladder.players.Player;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board gameBoard;
    Dice dice;
    Deque<Player> players;
    Player winner;

    public Game(int boardSize, int cntPlayers, int diceCnt, int snakeCnt, int ladderCnt){
        initializeGame(boardSize, cntPlayers, diceCnt, snakeCnt, ladderCnt);
    }

    public Player getWinner() {
        return winner;
    }

    private void initializeGame(int boardSize, int cntPlayers, int diceCnt, int snakeCnt, int ladderCnt){
        gameBoard = new Board(boardSize, snakeCnt, ladderCnt);
        dice = new Dice(diceCnt);
        players = createPlayers(cntPlayers);
        winner = null;
    }

    private LinkedList<Player> createPlayers(int cntPlayers){
        Player player1 = new HumanPlayer(0, "Mahima");
        Player player2 = new HumanPlayer(1, "Neha");

        LinkedList<Player> players = new LinkedList<Player>();
        players.add(player1);
        players.add(player2);

        return players;
    }

    public void startGame(){
        while(winner == null){
            Player player = findPlayerTurn();
            System.out.println("Player: " + player.name + " your turn, pls roll the dice");

            int diceNumber = player.rollDice();

            int playerNewPosition = player.getPosition() + diceNumber;
            playerNewPosition = jumpCheck(playerNewPosition);
            player.setPosition(playerNewPosition);

            System.out.println("Player: " + player.name + " your new position is " + playerNewPosition);

            if(playerNewPosition >= gameBoard.size * gameBoard.size - 1)
                winner = player;
        }

        System.out.println("Winner is: " + winner.name);
    }

    private Player findPlayerTurn(){
        Player player = players.removeFirst();
        players.addLast(player);
        return player;
    }

    private int jumpCheck(int position){
        if(position >= gameBoard.size * gameBoard.size - 1)
            return position;
        Cell cell = gameBoard.getCell(position);

        if(cell.jump != null && cell.jump.start == position){
            if(cell.jump.start > cell.jump.end)
                System.out.println("Ooops, snake bite ..go down");
            else
                System.out.println("Yeayy, ladder .. go up");
            return cell.jump.end;
        }

        return position;
    }

}

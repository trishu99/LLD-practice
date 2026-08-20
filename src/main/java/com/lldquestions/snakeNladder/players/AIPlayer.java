package main.java.com.lldquestions.snakeNladder.players;

import main.java.com.lldquestions.snakeNladder.Dice;

public class AIPlayer extends Player {
    public AIPlayer(int id, String name){
        this.id = id;
        this.name = name;
        this.currPos = 0;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getPosition(){
        return currPos;
    }

    public void setPosition(int position){
        currPos = position;
    }

    public int rollDice(){
        // for AI player - it happens automatically
        int number = Dice.roll();
        return number;
    }

    public boolean isHuman(){
        return false;
    }

}

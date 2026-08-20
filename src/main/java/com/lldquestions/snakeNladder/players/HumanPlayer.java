package main.java.com.lldquestions.snakeNladder.players;

import main.java.com.lldquestions.snakeNladder.Dice;

public class HumanPlayer extends Player {
    public HumanPlayer(int id, String name){
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
        this.currPos = position;
    }

    public int rollDice(){
        // wait for user to click on roll dice button & then only roll the dice for human player
        return Dice.roll();
    }

    public boolean isHuman(){
        return true;
    }

}

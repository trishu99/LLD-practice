package main.java.com.lldquestions.snakeNladder.players;

public abstract class Player {
    public int id;
    public String name;
    public int currPos;

    abstract int getId();

    abstract String getName();

    public abstract int getPosition();

    public abstract void setPosition(int position);

    public abstract int rollDice();

    abstract boolean isHuman();

}

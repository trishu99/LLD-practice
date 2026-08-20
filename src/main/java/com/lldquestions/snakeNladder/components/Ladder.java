package main.java.com.lldquestions.snakeNladder.components;

public class Ladder extends Jump{
    public Ladder(int start, int end){
        super(start, end);
    }
    public int getDestination(){
        return end;
    }
}

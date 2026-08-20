package main.java.com.lldquestions.snakeNladder.components;

public class Teleport extends Jump{
    public Teleport(int start, int end){
        super(start, end);
    }

    @Override
    public int getDestination() {
        return end;
    }
}

package main.java.com.lldquestions.snakeNladder.components;

public abstract class Jump {
    public int start;
    public int end;
    public Jump(int start, int end){
        this.start = start;
        this.end = end;
    }
    public abstract int getDestination();
}

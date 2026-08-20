package main.java.com.lldquestions.snakeNladder.components;

public class Snake extends Jump{
    public Snake(int start, int end){
        super(start, end);
    }

    public int getDestination(){
        return end;
    }

}

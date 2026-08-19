package main.java.com.lldquestions.ElevatorSystem.ElevatorRequests;

public abstract class Request {
    int floor;

    public Request(int floor){
        this.floor = floor;
    }

    public int getFloor(){
        return floor;
    }
}

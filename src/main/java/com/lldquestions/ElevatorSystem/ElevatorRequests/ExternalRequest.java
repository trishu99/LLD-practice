package main.java.com.lldquestions.ElevatorSystem.ElevatorRequests;

import main.java.com.lldquestions.ElevatorSystem.Enums.DIRECTION;

public class ExternalRequest extends Request{
    DIRECTION direction;

    public ExternalRequest(int floor, DIRECTION direction){
        super(floor);
        this.direction = direction;
    }

    public DIRECTION getDirection() {
        return direction;
    }

    @Override
    public String toString(){
        return "ExternalRequest floor: " + getFloor() + " Direction: " + getDirection();
    }



}

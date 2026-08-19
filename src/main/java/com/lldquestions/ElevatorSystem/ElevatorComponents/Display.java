package main.java.com.lldquestions.ElevatorSystem.ElevatorComponents;

import main.java.com.lldquestions.ElevatorSystem.Enums.DIRECTION;

public class Display {
    int floor;
    DIRECTION direction;

    public Display(int floor, DIRECTION direction){
        this.floor = floor;
        this.direction = direction;
    }

    public int getFloor() {
        return floor;
    }

    public DIRECTION getDirection() {
        return direction;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setDirection(DIRECTION direction) {
        this.direction = direction;
    }

    @Override
    public String toString(){
        return "On floor: " + floor + " & moving in direction: " + direction;
    }
}

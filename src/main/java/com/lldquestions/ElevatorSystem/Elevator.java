package main.java.com.lldquestions.ElevatorSystem;

import main.java.com.lldquestions.ElevatorSystem.ElevatorComponents.Display;
import main.java.com.lldquestions.ElevatorSystem.ElevatorComponents.Door;
import main.java.com.lldquestions.ElevatorSystem.ElevatorComponents.ElevatorController;
import main.java.com.lldquestions.ElevatorSystem.ElevatorComponents.InternalPanel;
import main.java.com.lldquestions.ElevatorSystem.Enums.DIRECTION;
import main.java.com.lldquestions.ElevatorSystem.Enums.STATUS;


public class Elevator {
    int id;
    int currentFloor;
    DIRECTION direction;
    STATUS status;
    Door door;
    Display display;
    InternalPanel panel;
    ElevatorController controller;

    public Elevator(int id, int initialFloor){
        this.id = id;
        currentFloor = initialFloor;
        direction = DIRECTION.UP;
        status = STATUS.STOPPED;
        door = new Door();
        display = new Display(currentFloor, direction);
        panel = new InternalPanel();
        controller = new ElevatorController();
    }

    public int getId() {
        return id;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public DIRECTION getDirection() {
        return direction;
    }

    public STATUS getStatus() {
        return status;
    }

    public Door getDoor() {
        return door;
    }

    public Display getDisplay() {
        return display;
    }

    public InternalPanel getPanel() {
        return panel;
    }

    public ElevatorController getController() {
        return controller;
    }

    public void move(int destinationFloor, DIRECTION direction){

    }
}

package main.java.com.lldquestions.ElevatorSystem.ElevatorComponents;

import main.java.com.lldquestions.ElevatorSystem.Enums.DoorState;

public class Door {
    private DoorState doorState;

    public Door(){
        doorState = DoorState.DOOR_CLOSE;
    }

    public void openDoor(int id){
        doorState = DoorState.DOOR_OPEN;
        System.out.println("Opening the elevator door of elevator: " + id);
    }

    public void closeDoor(int id){
        doorState = DoorState.DOOR_CLOSE;
        System.out.println("Closing the elevator door of elevator: " + id);
    }
}

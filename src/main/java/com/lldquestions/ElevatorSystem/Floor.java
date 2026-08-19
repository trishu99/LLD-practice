package main.java.com.lldquestions.ElevatorSystem;

import main.java.com.lldquestions.ElevatorSystem.ElevatorRequests.ExternalRequest;
import main.java.com.lldquestions.ElevatorSystem.Enums.DIRECTION;

public class Floor {
    int floorNum;
    ExternalPanel externalPanel;

    public Floor(int floorNumber){
        floorNum = floorNumber;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public ExternalRequest requestElevatorOnFloor(DIRECTION direction){
        return externalPanel.requestElevator(floorNum, direction);
    }
}

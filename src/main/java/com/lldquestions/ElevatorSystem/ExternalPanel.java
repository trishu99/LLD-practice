package main.java.com.lldquestions.ElevatorSystem;

import main.java.com.lldquestions.ElevatorSystem.ElevatorRequests.ExternalRequest;
import main.java.com.lldquestions.ElevatorSystem.Enums.DIRECTION;

public class ExternalPanel {
    public ExternalRequest requestElevator(int floorNo, DIRECTION direction){
        return new ExternalRequest(floorNo, direction);
    }
}

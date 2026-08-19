package main.java.com.lldquestions.ElevatorSystem.ElevatorComponents;

import main.java.com.lldquestions.ElevatorSystem.ElevatorRequests.InternalRequest;

public class InternalPanel {

    public InternalRequest requestFloor(int floorNo){
        return new InternalRequest(floorNo);
    }
}

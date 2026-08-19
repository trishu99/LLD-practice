package main.java.com.lldquestions.ElevatorSystem.scheduling;

import main.java.com.lldquestions.ElevatorSystem.Elevator;
import main.java.com.lldquestions.ElevatorSystem.ElevatorRequests.ExternalRequest;

import java.util.List;

public interface ElevatorSchedulingStrategy {
    Elevator selectElevator(List<Elevator> elevatorList, ExternalRequest request);
}

package main.java.com.lldquestions.ElevatorSystem;

import main.java.com.lldquestions.ElevatorSystem.scheduling.ElevatorSchedulingStrategy;

public class ElevatorScheduler {
    private ElevatorSchedulingStrategy schedulingStrategy;

    public ElevatorScheduler(ElevatorSchedulingStrategy schedulingStrategy){
        this.schedulingStrategy = schedulingStrategy;
    }
}

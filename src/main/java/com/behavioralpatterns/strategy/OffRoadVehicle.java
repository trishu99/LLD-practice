package main.java.com.behavioralpatterns.strategy;

import main.java.com.behavioralpatterns.strategy.strategyConcreteClass.SportyDrive;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle(){
        super(new SportyDrive());
    }
}

package main.java.com.behavioralpatterns.strategy;

import main.java.com.behavioralpatterns.strategy.strategyConcreteClass.NormalDrive;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle(){
        super(new NormalDrive());
    }
}

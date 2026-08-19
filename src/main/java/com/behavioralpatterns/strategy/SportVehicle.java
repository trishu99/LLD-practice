package main.java.com.behavioralpatterns.strategy;

import main.java.com.behavioralpatterns.strategy.strategyConcreteClass.SportyDrive;

public class SportVehicle extends Vehicle {
    public SportVehicle(){
        super(new SportyDrive());
    }
}

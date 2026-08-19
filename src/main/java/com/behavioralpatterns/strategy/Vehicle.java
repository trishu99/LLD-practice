package main.java.com.behavioralpatterns.strategy;

import main.java.com.behavioralpatterns.strategy.strategyInterface.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}

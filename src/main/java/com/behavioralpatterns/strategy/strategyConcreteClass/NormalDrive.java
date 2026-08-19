package main.java.com.behavioralpatterns.strategy.strategyConcreteClass;

import main.java.com.behavioralpatterns.strategy.strategyInterface.DriveStrategy;

public class NormalDrive implements DriveStrategy {
    public void drive(){
        System.out.println("Normal Driving..");
    }
}

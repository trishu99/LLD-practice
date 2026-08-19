package main.java.com.structuralpatterns.abstractfactory.vehicle;

import main.java.com.structuralpatterns.abstractfactory.vehicle.concreteclasses.LuxaryV1;
import main.java.com.structuralpatterns.abstractfactory.vehicle.concreteclasses.LuxaryV2;
import main.java.com.structuralpatterns.abstractfactory.vehicle.concreteclasses.OrdinaryV1;
import main.java.com.structuralpatterns.abstractfactory.vehicle.concreteclasses.OrdinaryV2;
import main.java.com.structuralpatterns.abstractfactory.vehicle.interfaces.Vehicle;

public class LuxaryVehicleFactory implements VehicleFactory{
    public Vehicle getVehicle(String input){
        if(input.equals("LuxaryV1"))
            return new LuxaryV1();
        else if(input.equals("LuxaryV2"))
            return new LuxaryV2();
        return new LuxaryV1();
    }
}

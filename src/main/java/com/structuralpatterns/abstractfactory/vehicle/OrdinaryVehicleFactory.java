package main.java.com.structuralpatterns.abstractfactory.vehicle;

import main.java.com.structuralpatterns.abstractfactory.vehicle.concreteclasses.OrdinaryV1;
import main.java.com.structuralpatterns.abstractfactory.vehicle.concreteclasses.OrdinaryV2;
import main.java.com.structuralpatterns.abstractfactory.vehicle.interfaces.Vehicle;

public class OrdinaryVehicleFactory implements VehicleFactory{
    public Vehicle getVehicle(String input){
        if(input.equals("OrdinaryV1"))
            return new OrdinaryV1();
        else if(input.equals("OrdinaryV2"))
            return new OrdinaryV2();
        return new OrdinaryV1();
    }
}

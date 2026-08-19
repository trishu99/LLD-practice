package main.java.com.structuralpatterns.abstractfactory.vehicle;

import main.java.com.structuralpatterns.abstractfactory.vehicle.interfaces.Vehicle;

public interface VehicleFactory {
    public Vehicle getVehicle(String input);
}

package main.java.com.SOLID.LSP.models;

import java.util.ArrayList;
import java.util.List;

public class VehicleService {
    public static void run() {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new MotorCycle());
        vehicles.add(new Car());
        vehicles.add(new Bicycle());

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getNumberOfWheels().toString());
        }


        List<EngineVehicle> engineVehicles = new ArrayList<>();
        engineVehicles.add(new MotorCycle());
        engineVehicles.add(new Car());

        for (EngineVehicle vehicle : engineVehicles) {
            System.out.println(vehicle.hasEngine().toString());
        }

    }
}

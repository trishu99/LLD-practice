package main.java.com.behavioralpatterns.strategy;


import java.util.ArrayList;
import java.util.List;

public class VehicleStrategyService {
    public void run(){
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new PassengerVehicle());
        vehicles.add(new SportVehicle());
        vehicles.add(new OffRoadVehicle());

        for(Vehicle vehicle : vehicles){
            vehicle.drive();
        }


    }
}

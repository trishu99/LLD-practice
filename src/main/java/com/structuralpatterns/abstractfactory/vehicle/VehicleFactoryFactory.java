package main.java.com.structuralpatterns.abstractfactory.vehicle;

public class VehicleFactoryFactory {
    public VehicleFactory getVechicleFactory(String input){
        if(input.equals("OrdinayVehicles"))
            return new OrdinaryVehicleFactory();
        else if(input.equals("LuxaryVehicles"))
            return new LuxaryVehicleFactory();
        return new OrdinaryVehicleFactory();
    }
}

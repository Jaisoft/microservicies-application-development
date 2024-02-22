package com.jaisoft.factory;


public class VehicleFactory {

    public Vehicle getVehicle(String vehicleType){
        if(vehicleType == null){
            return null;
        }
        if(vehicleType.equalsIgnoreCase("Ferrari")){
            return new Ferrari();
        } else if(vehicleType.equalsIgnoreCase("Lamborghini")){
            return new Lamborghini();
        } else if(vehicleType.equalsIgnoreCase("Aston Martin")){
            return new AstonMartin();
        }
        return null;
    }
}

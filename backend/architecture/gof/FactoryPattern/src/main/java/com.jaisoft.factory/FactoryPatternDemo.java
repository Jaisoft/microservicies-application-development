package com.jaisoft.factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle ferrari = vehicleFactory.getVehicle("Ferrari");

        ferrari.printCarBrand();

        Vehicle lamborghini = vehicleFactory.getVehicle("Lamborghini");

        lamborghini.printCarBrand();

        Vehicle astonMartin = vehicleFactory.getVehicle("Aston Martin");

        astonMartin.printCarBrand();
    }
}

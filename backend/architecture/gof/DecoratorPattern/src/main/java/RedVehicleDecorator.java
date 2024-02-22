public class RedVehicleDecorator implements Vehicle {

    protected Vehicle decoratedVehicle;

    public RedVehicleDecorator(Vehicle decoratedVehicle){
        this.decoratedVehicle = decoratedVehicle;
    }


    public String printCarBrand() {
       return   decoratedVehicle.printCarBrand() + " with Red color";

    }


}

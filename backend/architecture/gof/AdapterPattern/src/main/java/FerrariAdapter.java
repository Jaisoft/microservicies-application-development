public class FerrariAdapter implements Vehicle {

    private Vehicle vehicle;

    public FerrariAdapter(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    // returns speed in KM/H
    public double getSpeed() {
        return convertMPHtoKMPH(vehicle.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
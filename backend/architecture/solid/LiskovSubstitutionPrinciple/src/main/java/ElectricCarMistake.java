public class ElectricCarMistake implements Car {

    private int battery;


    public void accelerate() {
        System.out.println("accelerating the car");
    }


    public void stop() {
        System.out.println("accelerating the car");
    }

    public boolean hasBattery() {
        System.out.println("checking battery");
        if (battery < 95) {
            System.out.println("the battery is very low :(");
            return false;
        } else {
            System.out.println("battery OK :)");
            return true;
        }
    }
}
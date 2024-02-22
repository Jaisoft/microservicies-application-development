public class CarDriveMistake {
    public static void main(String[] args) {

        String cardType = args[0];
        if ("car" == cardType) {
            CombustionCar car = new CombustionCar();
            car.accelerate();
        } else if ("electric" == cardType) {
            ElectricCarMistake electricCar = new ElectricCarMistake();
            if ((electricCar.hasBattery())) {
                electricCar.accelerate();
            }
        } else {
            throw new RuntimeException("Invalid car");
        }
    }
}
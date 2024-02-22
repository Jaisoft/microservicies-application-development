public class CarDrive {
    public static void main(String[] args) {
        Car car;
        String cardType = args[0];
        if ("car" == cardType) {
            car = new CombustionCar();
        } else if ("electric" == cardType) {
            car = new ElectricCar();
        } else {
            throw new RuntimeException("Invalid car");
        }
        car.accelerate();
    }
}
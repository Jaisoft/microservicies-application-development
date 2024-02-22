public class StrategyPatternDemo {

    public static void main(String[] args) {
        new VehicleContext(new Ferrari()).executeStrategy();


        new VehicleContext(new AstonMartin()).executeStrategy();


        new VehicleContext(new Lamborghini()).executeStrategy();

    }
}

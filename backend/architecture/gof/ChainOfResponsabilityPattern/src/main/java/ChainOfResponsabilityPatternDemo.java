public class ChainOfResponsabilityPatternDemo {

    private static Vehicle getChainOfLoggers(){
        Vehicle astonMartin = new AstonMartin();
        Vehicle ferrari = new Ferrari();
        Vehicle lamborghini = new Lamborghini();
        astonMartin.setNextVehicle(ferrari);
        ferrari.setNextVehicle(lamborghini);
        return astonMartin;
    }


    public static void main(String[] args) {
        Vehicle vehicleChain = getChainOfLoggers();
        vehicleChain.print("Red Color");
        vehicleChain.print("Blue Color");
        vehicleChain.print("Black Color");
    }
}

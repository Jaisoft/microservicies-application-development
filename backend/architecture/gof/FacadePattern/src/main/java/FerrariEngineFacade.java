public class FerrariEngineFacade {

    private FuelMechanism fuelMechanism;
    private AirMechanism airMechanism;
    private CoolingMechanism coolingMechanism;


    public FerrariEngineFacade(){

        fuelMechanism = new FuelMechanism();
        airMechanism = new AirMechanism();
        coolingMechanism = new CoolingMechanism();

    }


    protected void startEngine(){
        System.out.println("Start Engine:");
        fuelMechanism.injectFuel();
        airMechanism.injectAir();
        coolingMechanism.turnOnCooling();
    }

    protected void stopEngine(){
        System.out.println("Stop Engine:");
        fuelMechanism.stopInjectFuel();
        airMechanism.stopInjectingAir();
        coolingMechanism.turnOffCooling();


    }

}

public class VehicleContext {

    private VehicleStrategy vehicleStrategy;

    public VehicleContext(VehicleStrategy vehicleStrategy){
        this.vehicleStrategy = vehicleStrategy;
    }

    public void executeStrategy(){
         vehicleStrategy.prinCarBrand();
    }
}

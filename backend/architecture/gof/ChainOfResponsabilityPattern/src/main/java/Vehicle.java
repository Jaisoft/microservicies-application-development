public abstract class Vehicle {


    protected Vehicle nextVehicle;
    //from  w  w  w.j  a v  a 2  s. c o m
    public void setNextVehicle(Vehicle nextVehicle){
        this.nextVehicle = nextVehicle;
    }

    public void print(String color){
        printCarBrand(color);
        if(nextVehicle !=null){
            nextVehicle.print(color);
        }
    }
    abstract protected void printCarBrand(String color);
}

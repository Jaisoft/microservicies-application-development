public class FerrariProxy implements Vehicle {

    private static Ferrari ferrari;

    public void prinCarBrand() {
        if (ferrari == null) {
            ferrari = new Ferrari();
        }
        ferrari.prinCarBrand();
    }
}

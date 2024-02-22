public class AdapterPatternDemo {

    public static void main(String[] args){

        Vehicle ferrari = new Ferrari();
        FerrariAdapter ferrariAdapter = new FerrariAdapter(ferrari);
        System.out.print(ferrariAdapter.getSpeed() + "  kmh");
    }
}

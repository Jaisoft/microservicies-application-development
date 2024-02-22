public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Vehicle ferrari = new Ferrari();
        Vehicle redVehicleDecoratorFerrari = new RedVehicleDecorator(new Ferrari());

        System.out.println(ferrari.printCarBrand());

        System.out.println(redVehicleDecoratorFerrari.printCarBrand());



    }
}
public class CompositePatternDemo {

    public static void main(String[] args) {


        Car ferrari = new Car("Ferrari");
        System.out.println(ferrari.brand);

        ferrari.agregar(new Model("Testarosa"));

        ferrari.mostrar(1);

        Car ford = new Car("Ford");

        System.out.println(ford.brand);

        ford.agregar(new Model("Scort"));

        ford.mostrar(1);

    }
}

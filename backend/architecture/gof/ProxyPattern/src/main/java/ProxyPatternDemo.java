public class ProxyPatternDemo {
    public static void main(String[] args) {
        Vehicle ferrariProxy = new FerrariProxy();

        ferrariProxy.prinCarBrand();

        ferrariProxy.prinCarBrand();
    }
}

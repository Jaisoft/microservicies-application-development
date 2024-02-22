public class FerrariSingleton {
    
    private static FerrariSingleton instance = new FerrariSingleton();
    
    private FerrariSingleton(){}
    
    public synchronized static  FerrariSingleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}

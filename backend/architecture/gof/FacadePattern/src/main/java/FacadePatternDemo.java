public class FacadePatternDemo {

    public static void main (String[] args){

        FerrariEngineFacade ferrariEngineFacade = new FerrariEngineFacade();

        ferrariEngineFacade.startEngine();

        ferrariEngineFacade.stopEngine();
    }

}

public class ObserverPatternDemo {

    public static void main(String[] args) {

        // Observable class
        FerrariObservable ferrariObservable = new FerrariObservable();

        // Observer class
        FerrariObserver ferrariObserver = new FerrariObserver();

        // Add Observer into Observable
        ferrariObservable.addObserver(ferrariObserver);


        // Change Observable state
        ferrariObservable.addVelocitiy();



    }
}

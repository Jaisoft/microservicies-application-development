import java.util.Observable;

public class FerrariObservable extends Observable {



    public void addVelocitiy() {
        for (int velocity = 0; velocity < 300; velocity++) {
            setChanged();
            notifyObservers(String.valueOf(velocity));
        }


    }




}
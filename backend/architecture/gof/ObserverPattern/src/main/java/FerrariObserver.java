import java.util.Observable;
import java.util.Observer;

public class FerrariObserver implements Observer {



    public FerrariObserver() {
    }

    public void update(Observable o, Object value) {

        System.out.println((String) value);
    }




}
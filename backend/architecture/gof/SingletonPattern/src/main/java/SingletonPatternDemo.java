public class SingletonPatternDemo  {

    public static void main(String[] args) {
        //Get the only object available
        FerrariSingleton object = FerrariSingleton.getInstance();

        //show the message
        object.showMessage();
    }

}




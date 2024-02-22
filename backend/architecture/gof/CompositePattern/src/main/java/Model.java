public class Model {

    String modelName;

    public Model(String modelName) {

        this.modelName = modelName;

    }

    public void mostrar(int depth) {
        System.out.println('-' + "" + modelName);
    }
}
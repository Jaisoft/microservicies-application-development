import java.util.ArrayList;

public class Car extends Brand
{
    private ArrayList<Model> models = new ArrayList<Model>();
    public Car(String brand)
    {
        super(brand);
    }

    public void agregar(Model model)
    {
        models.add(model);
    }

    public void eliminar(Model model)
    {
        models.remove(model);
    }

    public void mostrar(int profundidad)
    {
        System.out.println(models + " nivel: " + profundidad);
        for (int i = 0; i < models.size(); i++)
            models.get(i).mostrar(profundidad + 1);
    }
}

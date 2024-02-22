public abstract class Brand


{
    protected String brand;

    public Brand(String brand){
        this.brand = brand;
    }


    abstract public void agregar(Model model);
    abstract public void eliminar(Model model);
    abstract public void mostrar(int profundidad);
}

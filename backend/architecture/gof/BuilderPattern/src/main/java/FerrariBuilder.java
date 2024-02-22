public class FerrariBuilder {

    private String color;
    private String seating;
    private String tires;

    public FerrariBuilder withColor(String color){
        this.color = color;
        return this;
    }

    public FerrariBuilder withSeating(String seating){
        this.seating = seating;
        return this;
    }

    public FerrariBuilder withTires(String tires){
        this.tires = tires;
        return this;
    }

    public Ferrari build(){

        Ferrari ferrari = new Ferrari();
        ferrari.setColor(this.color);
        ferrari.setSeating(this.seating);
        ferrari.setTires(this.tires);

        return ferrari;

    }

}

public class BuilderPatternDemo {

    public static void main(String[] args) {

        FerrariBuilder builder = new FerrariBuilder();

        Ferrari ferrari = builder.withColor("Red").withSeating("White").withTires("Black")
                .build();

        System.out.println(ferrari);
    }
}

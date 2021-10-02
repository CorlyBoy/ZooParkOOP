public class Mammal extends Animal {
    int yearsToLive;

    public Mammal(int age, String name, String color) {
        super(age, name, color);
    }

    @Override
    public void eating() {
        System.out.println(".......");
    }
}

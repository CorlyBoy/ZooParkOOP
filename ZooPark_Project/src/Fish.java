public class Fish extends Animal {
    int yearsToLive;

    public Fish(int age, String name, String color, int yearsToLive) {
        super(age, name, color);
        this.yearsToLive = yearsToLive;
    }

    @Override
    public void eating() {
        System.out.println("....");
    }
}

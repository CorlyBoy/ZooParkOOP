public class Insect extends Animal {
    int yearsToLive;

    public Insect(int age, String name, String color, int yearsToLive) {
        super(age, name, color);
        this.yearsToLive = yearsToLive;
    }

    @Override
    public void eating() {
        System.out.println("....");
    }
}

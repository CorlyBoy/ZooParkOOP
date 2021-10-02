public class Reptile extends Animal {

    int yearsToLive;

    public Reptile(int age, String name, String color, int yearsToLive) {
        super(age, name, color);
        this.yearsToLive = yearsToLive;
    }

    public void isCrowling() {
        System.out.println("The reptile is crowling");
    }

    public void changingTheSkin() {
        System.out.println("The reptile is changing his skin");
    }

    @Override
    public void eating() {
        System.out.println(".........");
    }

    @Override
    public String toString() {
        return "Reptile{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", yearsToLive=" + yearsToLive +
                '}';
    }
}

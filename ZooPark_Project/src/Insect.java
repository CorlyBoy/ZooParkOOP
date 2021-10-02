public class Insect extends Animal {

    int yearsToLive;

    public Insect(int age, String name, String color, int yearsToLive) {
        super(age, name, color);
        this.yearsToLive = yearsToLive;
    }

    public void isInvertebrates() {
        System.out.println("The insect is invertebrates");
    }

    public void livesAniwhere() {
        System.out.println("The insect lives aniwhere");
    }

    @Override
    public void eating() {
        System.out.println("....");
    }

    @Override
    public String toString() {
        return "Insect{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", yearsToLive=" + yearsToLive +
                '}';
    }
}

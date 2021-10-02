public class Mammal extends Animal {

    int yearsToLive;

    public Mammal(int age, String name, String color) {
        super(age, name, color);
    }

    public void isVertebrate() {
        System.out.println("The mammal is vertebrate");
    }

    public void isFeedingWithMilk() {
        System.out.println("The mammal is feeding with milk the children");
    }

    @Override
    public void eating() {
        System.out.println(".......");
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", yearsToLive=" + yearsToLive +
                '}';
    }
}

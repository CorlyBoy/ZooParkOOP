public class Mammal extends Animal {

    public void isVertebrate(){
        System.out.println("The mammal is vertebrate");
    }

    public void isFeedingWithMilk(){
        System.out.println("The mammal is feeding with milk the children");
    }

    @Override
    public String toString() {
        return "Mammal{}";
    }
}

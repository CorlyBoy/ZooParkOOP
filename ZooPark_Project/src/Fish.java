public class Fish extends Animal {

    public void isSwimming(){
        System.out.println("The fish is swimming");
    }

    public void isEatingWorms(){
        System.out.println("The fish is eating worms");
    }

    @Override
    public String toString() {
        return "Fish{}";
    }
}

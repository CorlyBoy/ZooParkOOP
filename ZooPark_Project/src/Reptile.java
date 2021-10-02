public class Reptile extends Animal {

    public void isCrowling(){
        System.out.println("The reptile is crowling");
    }

    public void changingTheSkin(){
        System.out.println("The reptile is changing his skin");
    }

    @Override
    public String toString() {
        return "Reptile{}";
    }
}

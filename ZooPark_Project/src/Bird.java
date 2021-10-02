public class Bird extends Animal {

    public void isNibbling(){
        System.out.println("The bird is nibbling");
    }

    public void isFlying(){
        System.out.println("The bird is flying");
    }

    @Override
    public String toString() {
        return "Bird{}";
    }
}

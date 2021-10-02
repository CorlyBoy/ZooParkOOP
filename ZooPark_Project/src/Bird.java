public class Bird extends Animal {
  
    int yearsToLive;
  
  public Bird(int age, String name, String color, int yearsToLive) {
        super(age, name, color);
        this.yearsToLive = yearsToLive;
    }

    public void isNibbling(){
        System.out.println("The bird is nibbling");
    }

    public void isFlying(){
        System.out.println("The bird is flying");
    }

    @Override
    public void eating() {
        System.out.println("...");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", yearsToLive=" + yearsToLive +
                '}';
    }
}

public class Fish extends Animal {
  
    int yearsToLive;

  public Fish(int age, String name, String color, int yearsToLive) {
        super(age, name, color);
        this.yearsToLive = yearsToLive;
    }
  
    public void isSwimming(){
        System.out.println("The fish is swimming");
    }

    public void isEatingWorms(){
        System.out.println("The fish is eating worms");
    }
  
    @Override
    public void eating() {
        System.out.println("....");
      
    @Override
    public String toString() {
        return "Fish{}";
    }
}

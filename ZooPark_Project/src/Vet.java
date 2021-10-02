public class Vet extends Employee {
  
    int salary;

  public Vet(String name, int age, String phoneNumber, int salary) {
        super(name, age, phoneNumber);
        this.salary = salary;
    }
  
    public void isTakingCareOfAnimals(){
        System.out.println("The vet is taking care of animals");

    @java.lang.Override
    public void doSomething() {
        System.out.println("The vet takes care of the animals");
    }
}

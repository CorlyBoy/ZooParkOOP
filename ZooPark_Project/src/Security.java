public class Security extends Employee {
  
    int salary;

  public Security(String name, int age, String phoneNumber, int salary) {
        super(name, age, phoneNumber);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void isGuardingTheAnimals(){
        System.out.println("The security is guarding the animals");
    }

    @Override
    public void doSomething() {
        System.out.println(" That employee takes care of the animals");
    }
}

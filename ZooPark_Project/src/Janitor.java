public class Janitor extends Employee{

    int salary;

    public Janitor(String name, int age, String phoneNumber, int salary) {
        super(name, age, phoneNumber);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void isStandingAtTheEntrace(){
        System.out.println("The janitor is standing at the entrance");
    }

    @Override
    public void doSomething() {
        System.out.println("That employee takes care of the animals");
    }


}

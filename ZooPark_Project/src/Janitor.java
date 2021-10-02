public class Janitor extends Employee{
    int salary;

    public Janitor(String name, int age, String phoneNumber, int salary) {
        super(name, age, phoneNumber);
        this.salary = salary;
    }

    @Override
    public void doSomething() {
        System.out.println("That employee takes care of the animals");
    }

    public void isStandingAtTheEntrace(){
        System.out.println("The janitor is standing at the entrance");
    }
}

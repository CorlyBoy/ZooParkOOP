public class Security extends Employee {
    int salary;

    public Security(String name, int age, String phoneNumber, int salary) {
        super(name, age, phoneNumber);
        this.salary = salary;
    }

    @Override
    public void doSomething() {
        System.out.println(" That employee takes care of the animals");
    }
}

public class Cashier extends Employee {

    int salary;

    public Cashier(String name, int age, String phoneNumber, int salary) {
        super(name, age, phoneNumber);
        this.salary = salary;
    }

    @java.lang.Override
    public void doSomething() {
        System.out.println("That employee counts the money");
    }
}

public class Cashier extends Employee {

    int salary;

    public Cashier(String name, int age, String phoneNumber, int salary) {
        super(name, age, phoneNumber);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void isCollectingTheMoney() {
        System.out.println("The cashier is collecting the money");
    }

    @Override
    public void doSomething() {
        System.out.println("That employee counts the money");
    }
}

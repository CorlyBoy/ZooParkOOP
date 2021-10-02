public abstract class Employee {
    String name;
    int age;
    String phoneNumber;

    public Employee(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public abstract void doSomething();
    public void comeToWorkAtZooPark(){
        System.out.println("The employee comes to work every day");
    }
}

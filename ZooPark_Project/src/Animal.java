public abstract class Animal {
    int age;
    String name;
    String color;

    public Animal(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public abstract void eating();

    public void sleeping(){
        System.out.println("Every animal sleeps");
    }

}

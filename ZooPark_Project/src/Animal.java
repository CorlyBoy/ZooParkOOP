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

    public void isBreathing(){
        System.out.println("The animal is breathing");
    }

    public void isSleeping(){
        System.out.println("The animal is sleeping");
    }

    @Override
    public String toString() {
        return "Animal{}";
    }
}

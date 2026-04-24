package lesson09;

public class Bird extends Animal {

    public Bird(int age, int weight, String name) {
        super(age, weight, name);
    }

    public void fly() {
        System.out.println("Лечу на юг");
    }

    @Override
    public void move() {
        System.out.println("Летаю высоко в небе");
    }

    @Override
    public void eat() {
        System.out.println("Кладу червяка в клюв и проглатываю его");
    }
}

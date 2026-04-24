package lesson12;

public class Giraffe extends Animal {
    public Giraffe(String name, int age, String food, String color) {
        super(name, age, food, color);
    }

    @Override
    public void move() {
        System.out.println(super.getName() + " ходит.");
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " любит есть " + super.getFood() + ".");
    }

    @Override
    public void sleep() {
        System.out.println(super.getName() + " спит лёжа.");
    }
}

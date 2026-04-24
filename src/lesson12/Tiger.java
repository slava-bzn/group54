package lesson12;

import lesson12.interfaces.Huntable;

public class Tiger extends Animal implements Huntable {
    public Tiger(String name, int age, String food, String color) {
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

    @Override
    public void hunt() {
        System.out.println(super.getName() + " охотится за добычей.");
    }
}

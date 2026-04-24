package lesson12;

import lesson12.interfaces.Flyable;

public class Swan extends Animal implements Flyable {
    public Swan(String name, int age, String food, String color) {
        super(name, age, food, color);
    }

    @Override
    public void move() {
        System.out.println(super.getName() + " плавает.");
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " любит есть " + super.getFood() + ".");
    }

    @Override
    public void sleep() {
        System.out.println(super.getName() + " спит на воде.");
    }

    @Override
    public void fly() {
        System.out.println(super.getName() + " летит.");
    }
}

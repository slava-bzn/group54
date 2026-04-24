package lesson12;

import lesson12.interfaces.Flyable;
import lesson12.interfaces.Huntable;

public class Eagle extends Animal implements Flyable, Huntable {
    public Eagle(String name, int age, String food, String color) {
        super(name, age, food, color);
    }

    @Override
    public void move() {
        System.out.println(super.getName() + " летает.");
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " любит есть " + super.getFood() + ".");
    }

    @Override
    public void sleep() {
        System.out.println(super.getName() + " спит в гнезде.");
    }

    @Override
    public void fly() {
        System.out.println(super.getName() + " летит.");
    }

    @Override
    public void hunt() {
        System.out.println(super.getName() + " падаю с неба за добычей.");
    }
}

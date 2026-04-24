package lesson12.homework;

import lesson12.homework.interfaces.Swimable;

public class RubberDuck extends Duck implements Swimable {
    public RubberDuck(String kindOfDuck) {
        super(kindOfDuck);
    }

    @Override
    public void swim() {
        System.out.println("Я " + getKindOfDuck() + " утка. Я умею только плавать.");
    }
}

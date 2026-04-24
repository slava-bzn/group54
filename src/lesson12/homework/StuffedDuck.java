package lesson12.homework;

import lesson12.homework.interfaces.Quackable;
import lesson12.homework.interfaces.Swimable;

public class StuffedDuck extends Duck implements Swimable, Quackable {

    public StuffedDuck(String kindOfDuck) {
        super(kindOfDuck);
    }

    @Override
    public void quacking() {
        System.out.println("Я умею крякать.");
    }

    @Override
    public void swim() {
        System.out.println("Я " + getKindOfDuck() + " утка. Я умею плавать.");
    }
}


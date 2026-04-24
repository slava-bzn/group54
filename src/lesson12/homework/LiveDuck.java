package lesson12.homework;

import lesson12.homework.interfaces.Flyable;
import lesson12.homework.interfaces.Quackable;
import lesson12.homework.interfaces.Reproducible;
import lesson12.homework.interfaces.Swimable;

public class LiveDuck extends Duck implements Reproducible, Swimable, Flyable, Quackable {
    public LiveDuck(String kindOfDuck) {
        super(kindOfDuck);
    }

    @Override
    public void reproduce() {
        System.out.println("Я " + getKindOfDuck() + " утка. Я могу размножаться.");
    }

    @Override
    public void fly() {
        System.out.println("Я умею летать.");
    }

    @Override
    public void quacking() {
        System.out.println("Я умею крякать.");
    }

    @Override
    public void swim() {
        System.out.println("Я умею плавать.");
    }


}
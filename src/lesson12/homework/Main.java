package lesson12.homework;

import lesson12.homework.interfaces.Flyable;
import lesson12.homework.interfaces.Quackable;
import lesson12.homework.interfaces.Reproducible;
import lesson12.homework.interfaces.Swimable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Duck liveDuck = new LiveDuck("живая");
        Duck stuffedDuck = new StuffedDuck("плюшевая");
        Duck rubberDuck = new RubberDuck("резиновая");

        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(liveDuck);
        ducks.add(stuffedDuck);
        ducks.add(rubberDuck);
        System.out.println("");
        for (Duck duck : ducks) {
            if (duck instanceof Reproducible) {
                Reproducible reproducibleDucks = (Reproducible) duck;
                reproducibleDucks.reproduce();
            }

            if (duck instanceof Flyable) {
                Flyable flyableDucks = (Flyable) duck;
                flyableDucks.fly();
            }
            if (duck instanceof Swimable) {
                Swimable swimableDucks = (Swimable) duck;
                swimableDucks.swim();
            }
            if (duck instanceof Quackable) {
                Quackable quackableDucks = (Quackable) duck;
                quackableDucks.quacking();
            }
            System.out.println("");
        }
    }
}

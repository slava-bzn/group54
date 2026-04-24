package lesson12.homework;

import java.util.Objects;

public abstract class Duck {
    private String kindOfDuck;

    public Duck(String kindOfDuck) {
        this.kindOfDuck = kindOfDuck;
    }

    public String getKindOfDuck() {
        return kindOfDuck;
    }

    public void setKindOfDuck(String kindOfDuck) {
        this.kindOfDuck = kindOfDuck;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Duck duck = (Duck) o;
        return Objects.equals(kindOfDuck, duck.kindOfDuck);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(kindOfDuck);
    }

    @Override
    public String toString() {
        return "Duck{" + "kindOfDuck='" + kindOfDuck + '\'' + '}';
    }
}
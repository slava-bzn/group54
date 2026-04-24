package lesson09;

public class Dog extends Animal {

    public Dog(int age, int weight, String name) {
        super(age, weight, name);
    }

    public void runTheBall() {
        System.out.println("Бегу за мячом в припрыжку");
    }

    public void beAGoodBoy() {
        System.out.println("Я хороший пес");
    }

    @Override
    public void move() {
        System.out.println("Бегаю и радостно виляю хвостом");
    }

    @Override
    public void eat() {
        System.out.println("Громко грызу кость");
    }
}

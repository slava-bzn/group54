package lesson09;

public class Cat extends Animal {

    public Cat(int age, int weight, String name) {
        super(age, weight, name);
    }

    public void lookAtOwnerWithContempt() {
        System.out.println("Смотрю на хозяина с презрением");
    }

    @Override
    public void move() {
        System.out.println("Бегаю тихо как ниндзя");
    }

    @Override
    public void eat() {
        System.out.println("Ем сухой корм и хрумкаю");
    }
}

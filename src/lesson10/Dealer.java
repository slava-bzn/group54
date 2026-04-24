package lesson10; // Указываем пакет, в котором находится класс дилера

// Класс Dealer описывает дилера, который является особым видом игрока
public class Dealer extends Player {

    // Конструктор дилера
    public Dealer() {
        super("Дилер"); // Вызываем конструктор родительского класса Player и сразу задаем имя "Дилер"
    }

    // Переопределяем поведение: дилер сам решает, брать ли еще карту
    @Override
    public boolean doYouNeedMoreCards() {
        return super.countNominalInHand() < 17; // Дилер берет еще карту, пока у него меньше 17 очков
    }
}
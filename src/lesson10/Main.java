package lesson10; // Указываем пакет, в котором лежит стартовый класс

// Класс Main нужен для запуска программы
public class Main {
    public static void main(String[] args) { // Метод main - это точка входа, с него Java начинает выполнение программы
        new Blackjack().start(2); // Создаем новую игру Blackjack и запускаем ее на 2 игроков
    }
}
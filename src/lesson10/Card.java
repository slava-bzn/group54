package lesson10; // Указываем, что этот класс находится в пакете lesson10

import java.util.Objects; // Подключаем класс Objects, чтобы удобно сравнивать поля объектов и считать hashCode

// Класс Card описывает одну игровую карту
public class Card {
    private final int nominal; // Числовое значение карты в очках, например 2, 10 или 11
    private final String suit; // Текстовое название карты, например "Двойка крести" или "Туз черви"

    // Конструктор вызывается в момент создания новой карты
    public Card(int nominal, String suit) {
        this.nominal = nominal; // Сохраняем переданное количество очков в поле объекта
        this.suit = suit; // Сохраняем переданное название карты в поле объекта
    }

    // Геттер для получения названия карты или масти
    public String getSuit() {
        return suit; // Возвращаем строку с названием карты
    }

    // Геттер для получения очков карты
    public int getNominal() {
        return nominal; // Возвращаем числовое значение карты
    }

    // Переопределяем equals, чтобы Java понимала, когда две карты считаются одинаковыми
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Если сравниваем объект сам с собой, то они точно равны
        if (o == null || getClass() != o.getClass()) return false; // Если второй объект null или это не Card, то равенства нет
        Card card = (Card) o; // Приводим Object к типу Card, чтобы получить доступ к полям карты
        return nominal == card.nominal && Objects.equals(suit, card.suit); // Карты равны, если совпадают очки и название
    }

    // Переопределяем hashCode, чтобы он соответствовал логике equals
    @Override
    public int hashCode() {
        return Objects.hash(nominal, suit); // Создаем хеш на основе двух главных полей карты
    }

    // Переопределяем toString, чтобы карта красиво печаталась в консоль
    @Override
    public String toString() {
        return "Карта - " + suit + ", весит " + nominal + " очков"; // Формируем понятную строку о карте
    }
}
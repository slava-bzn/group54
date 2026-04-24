package lesson01;

public class HomeWork1 {

    public static void main(String[] args) {
        System.out.println("Задача 3. У нас есть 1000 рублей. Мы идем в магазин. Нам нужно купить по максимуму");
        System.out.println("сникерсов, и на сдачу купить конфет. Сникерс стоит - 35 руб. Конфета - 3,5 руб.");
        System.out.println("Вывести на консоль сколько максимально сникерсов и конфет получится купить.");

        //Дано:
        int money = 1000;
        int priceSnickers = 35;
        double priceCandies = 3.5;

        //Решение:
        int quantityOfSnickers = money / priceSnickers;
        double remainingMoney1 = money - (quantityOfSnickers * priceSnickers);
        int quantityOfCandies = (int) (remainingMoney1 / priceCandies);
        double remainingMoney2 = (double) (quantityOfSnickers * priceSnickers);
        double remainingMoney3 = (double) (quantityOfCandies * priceCandies);
        double moneyAtTheEnd = money - remainingMoney2 - remainingMoney3;

        //Вывод:
        System.out.println("Сникерсы: " + quantityOfSnickers + " штук.");
        System.out.println("Конфеты: " + quantityOfCandies + " штук.");
        System.out.println("Сдача: " + moneyAtTheEnd + " рублей.");
    }
}
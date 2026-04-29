package lesson17;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5, 1999, "Золото", 2.5);
        Coin coin2 = new Coin(5, 1999, "Золото", 2.5);
        Coin coin3 = new Coin(10, 1990, "Золото", 2.5);
        Coin coin4 = new Coin(50, 1899, "Олово", 5);
        Coin coin5 = new Coin(5, 1869, "Серебро", 10);
        Coin coin6 = new Coin(5, 1869, "Палладий", 10);

        //Вариант 1 - используем сортировку по умолчанию (метод compareTo для Comparable объектов)
        //Set<Coin> coins = new TreeSet<>();

        //Вариант 2 - используем внешний компаратор - сравниватель, который реализован в виде
        //отдельного класса (метод compare для Comparator)
        //Set<Coin> coins = new TreeSet<>(new SortByYearComparator());

        //Вариант 3 - используем внешний компаратор - сравниватель, реализованный
        //в виде анонимного класса.
//        Set<Coin> coins = new TreeSet<>(new Comparator<Coin>() {
//            @Override
//            public int compare(Coin o1, Coin o2) {
//                //Потом сортируем по металлу по возрастанию
//                if (!o1.getMetalName().equals(o2.getMetalName())) {
//                    return o1.getMetalName().compareTo(o2.getMetalName());
//                }
//                //Сначала сортируем по году по возрастанию
//                if (o1.getYear() != o2.getYear()) {
//                    return o1.getYear() - o2.getYear();
//                }
//                //Потом сортируем по номиналу по возрастанию
//                if (o1.getNominal() != o2.getNominal()) {
//                    return o1.getNominal() - o2.getNominal();
//                }
//                //Потом сортируем по диаметру по возрастанию
//                return Double.compare(o1.getDiameter(), o2.getDiameter());
//            }
//        });

        //Вариант 4 - используем внешний сравниватель, реализованный в виде анонимного
        //класса через лямбда
        //в виде анонимного класса.
        Set<Coin> coins = new TreeSet<>((o1, o2) -> {
            //Потом сортируем по металлу по возрастанию
            if (!o1.getMetalName().equals(o2.getMetalName())) {
                return o1.getMetalName().compareTo(o2.getMetalName());
            }
            //Сначала сортируем по году по возрастанию
            if (o1.getYear() != o2.getYear()) {
                return o1.getYear() - o2.getYear();
            }
            //Потом сортируем по номиналу по возрастанию
            if (o1.getNominal() != o2.getNominal()) {
                return o1.getNominal() - o2.getNominal();
            }
            //Потом сортируем по диаметру по возрастанию
            return Double.compare(o1.getDiameter(), o2.getDiameter());
        });

        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);

        System.out.println(coins.size());
        for (Coin coin : coins) {
            System.out.println(coin);
        }
    }
}

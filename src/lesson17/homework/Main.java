package lesson17.homework;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin(2.5, 1999, "Золото", 2);
        Coin coin2 = new Coin(2.5, 1869, "Золото", 2);
        Coin coin3 = new Coin(10.0, 1990, "Золото", 2);
        Coin coin4 = new Coin(50.0, 1899, "Олово", 5);
        Coin coin5 = new Coin(2.5, 1869, "Серебро", 10);
        Coin coin6 = new Coin(2.5, 1869, "Палладий", 10);
        Coin coin7 = new Coin(2.5, 2000, "Aluminium", 5);
        Coin coin8 = new Coin(5.0, 2000, "Aluminium", 5);
        Coin coin9 = new Coin(2.5, 1900, "Aluminium", 5);
        Coin coin10 = new Coin(7.5, 1900, "Silver", 10);
        Coin coin11 = new Coin(5.0, 1850, "Gold", 5);
        Coin coin12 = new Coin(7.5, 1850, "Gold", 20);

        System.out.println("\nЗадание 1.");
        System.out.println("Отсортировать монеты в виде отдельного класса компаратора:\n" +
                "по диаметру (от большего к меньшему),\n" +
                "по году (от меньшего к большему),\n" +
                "по металлу (по алфавиту от А до Я, от A до Z),\n" +
                "по номиналу(от меньшего к большему).\n");

        Set<Coin> coins1 = new TreeSet<>(new SortByDiameterComparator());

        coins1.add(coin1);
        coins1.add(coin2);
        coins1.add(coin3);
        coins1.add(coin4);
        coins1.add(coin5);
        coins1.add(coin6);

        for (Coin coin : coins1) {
            System.out.println(coin);
        }

        System.out.println("\nЗадание 2.\n" +
                "Отсортировать монеты в виде анонимного класса-сравнителя:\n" +
                "по металлу (по алфавиту от Я до А, от Z до A),\n" +
                "по номиналу (от большего к меньшему),\n" +
                "по диаметру (от меньшего к большему).\n");

        Set<Coin> coins2 = new TreeSet<>(new Comparator<>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                //Сортируем по металлу по алфавиту (от Я до А (Z - A)).
                if (!o1.getNameMetal().equals(o2.getNameMetal())) {
                    return o2.getNameMetal().compareTo(o1.getNameMetal());
                }
                //Сортируем по номиналу по убыванию.
                if (o2.getNominal() != o1.getNominal())
                    return o2.getNominal() - o1.getNominal();
                //Сортируем по диаметру по возрастанию.
                return Double.compare(o1.getDiameter(), o2.getDiameter());
            }
        });

        coins2.add(coin7);
        coins2.add(coin8);
        coins2.add(coin9);
        coins2.add(coin10);
        coins2.add(coin11);
        coins2.add(coin12);

        for (Coin coin : coins2) {
            System.out.println(coin);
        }
    }
}

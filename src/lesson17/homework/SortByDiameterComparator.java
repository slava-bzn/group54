package lesson17.homework;

import java.util.Comparator;

public class SortByDiameterComparator implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {
        //Сортируем по диаметру по убыванию.
        if (o1.getDiameter() != (o2.getDiameter())) {
            return (int) (o2.getDiameter() - o1.getDiameter());
        }
        //Сортируем по году по возрастанию.
        if (o1.getYear() != o2.getYear()) {
            return o1.getYear() - o2.getYear();
        }
        //Сортируем по металлу по алфавиту (от А до Я (A - Z)).
        if (!o1.getNameMetal().equals(o2.getNameMetal())) {
            return o1.getNameMetal().compareTo(o2.getNameMetal());
        }
        //Сортируем по номиналу по возрастанию.
        return o1.getNominal() - o2.getNominal();
    }
}

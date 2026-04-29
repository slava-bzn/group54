package lesson17;

import java.util.Comparator;

public class SortByYearComparator implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {
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
    }
}

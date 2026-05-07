package mypractice.task3;

import java.util.Comparator;

public class SortByWeightComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o2.getWeight(), o1.getWeight());
    }
}

package mypractice.task3;

import java.util.Comparator;

public class SortByCategoryComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getCategory().compareTo(o2.getCategory());
    }
}

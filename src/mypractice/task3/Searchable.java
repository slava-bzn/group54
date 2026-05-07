package mypractice.task3;

import java.util.List;

public interface Searchable {
    Product findByName(String name);

    List<Product> findByCategory(String category);
}

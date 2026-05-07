package mypractice.task3;

import java.util.List;

public interface Storable {
    public void addProduct(Product product);

    public void removeProduct(String name);

    public void printAllProducts();
}

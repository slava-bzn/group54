package mypractice.task3;

import java.util.Objects;

public abstract class Product implements Comparable<Product> {
    private String name;
    private double weight;
    private int price;
    private String category;
    private boolean expired;

    public Product(String name, double weight, int price, String category, boolean expired) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.category = category;
        this.expired = expired;
    }

    public abstract void getInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    @Override
    public String toString() {
        return ("Наименование: " + name + ". Вес: " + weight + ". Цена: " + price + ". Категория: " + category
                + ". Срок годности не истек? - " + expired + ".");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category);
    }

    @Override
    public int compareTo(Product o) {
        return this.getName().compareTo(o.getName());
    }
}

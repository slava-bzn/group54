package lesson18.homework;

import java.util.*;

public class Fridge {
    private Map<String, Double> products = new HashMap<>();

    //Вариант a):
    public void addProduct(String product, double weight) {
        if (products.containsKey(product)) {
            double currentWeight = products.get(product);
            products.put(product, currentWeight + weight);
        } else {
            products.put(product, weight);
        }
    }

    //Вариант b):
    public void removeProduct(String product) {
        if (products.containsKey(product)) {
            products.remove(product);
            System.out.printf("%s забрали из холодильника.%n", product);
        } else {
            System.out.println("Такого продукта нет в холодильнике.\n");
        }
    }

    public void getProduct(String product, double weight) {
        if (products.containsKey(product)) {
            double currentWeight = products.get(product);
            if (weight > currentWeight) {
                System.out.printf("Недостаточно продукта - %s.%n", product);
            } else {
                double remainingWeight = currentWeight - weight;
                if (remainingWeight <= 0) {
                    products.remove(product);
                } else {
                    products.put(product, remainingWeight);
                    System.out.printf("В холодильнике осталось %.2f грамм продукта - %s.%n", remainingWeight, product);
                }
            }
        } else {
            System.out.println("Такого продукта нет в холодильнике.\n");
        }
    }

    //Вариант c):
    public void getWeightOfAllProducts() {
        double totalWeight = 0;
        for (Double value : products.values()) {
            totalWeight = totalWeight + value;
        }
        System.out.printf("Сумма веса всех продуктов составляет - %.2f.%n", totalWeight);
    }

    //Вариант d):
    public void getWeightOfOneProduct(String product) {
        if (products.containsKey(product)) {
            System.out.printf("Продукт - %s имеет вес - " + products.get(product) + ".%n", product);
        } else {
            System.out.printf("Продукт - %s - нет в холодильнике.%n", product);
        }
    }

    //Вариант e):
    public void getProductWillEndFaster() {
        String minProductName = "null";
        double minProductWeight = 0.0;
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            String productName = entry.getKey();
            double productWeight = entry.getValue();
            if (minProductWeight == 0.0 || minProductWeight > productWeight) {
                minProductName = productName;
                minProductWeight = productWeight;
            }
        }
        System.out.printf("Первый продукт, который закончится - %s.%n", minProductName);
    }

    //Вариант f):
    public void getProductWillEndLonger() {
        String maxProductName = "null";
        double maxProductWeight = 0.0;
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            String productName = entry.getKey();
            double productWeight = entry.getValue();
            if (maxProductWeight == 0.0 || maxProductWeight < productWeight) {
                maxProductName = productName;
                maxProductWeight = productWeight;
            }
        }
        System.out.printf("Самое большое количество какого продукта есть в холодильнике? - %s.%n", maxProductName);
    }

    //Вариант g):
    public void printAllProductsFromZToA() {
        Set<String> productNames = new TreeSet<>(Comparator.reverseOrder());
        productNames.addAll(products.keySet());
        productNames.forEach(productName -> System.out.println(productName + " - " + products.get(productName)));
    }

    //Вариант h):
    public void printAllProductsFromWeight() {
        Set<String> productNames = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Double.compare(products.get(o2), products.get(o1));
            }
        });
        productNames.addAll(products.keySet());
        for (String productName : productNames) {
            System.out.printf("%s - %.2f грамм.%n", productName, products.get(productName));
        }
    }
}

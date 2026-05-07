package mypractice.task3;

import java.util.*;

public class Warehouse implements Storable, Searchable {
    private List<Product> products = new ArrayList<>();
    private Set<Product> uniqueProducts = new HashSet<>();
    private Map<String, Integer> productAmount = new HashMap<>();
    private Set<Product> setProductsWithComparable = new TreeSet<>();
    private Set<Product> setProductsWithComparator = new TreeSet<>((o1, o2) -> o2.getName().compareTo(o1.getName()));
    private Map<Integer, String> menu = new LinkedHashMap<>();

    public Map<Integer, String> getMenu() {
        return menu;
    }

    public void setMenu(Map<Integer, String> menu) {
        this.menu = menu;
    }

    public void showMenu() {
        System.out.println("\nВыберите номер действия:");
        for (Map.Entry<Integer, String> entry : menu.entrySet()) {
            int numberMenu = entry.getKey();
            String valueMenu = entry.getValue();
            System.out.println(numberMenu + " - " + valueMenu);
        }
    }

    public Product getProductByIndex(int index) {
        if (index < 0 || index >= products.size()) {
            System.out.println("Некорректный индекс.");
            return null;
        }
        return products.get(index);
    }

    public void replaceProductByIndex(int index, Product newProduct) {
        if (index < 0 || index >= products.size()) {
            System.out.println("Некорректный индекс.");
            return;
        }
        products.set(index, newProduct);
    }

    public void showWrapperExample() {
        Integer wrapperNumber = 10;
        Integer value1 = 20;
        Integer value2 = 34;
        Integer value3 = 117;
        int primitiveValue = value1;
        List<Integer> list = new ArrayList<>();
        list.add(value1);
        list.add(value2);
        list.add(value3);
        list.add(wrapperNumber);
        list.add(primitiveValue);
        System.out.println(list);
    }

    public void sortByPrice() {
        products.sort(new SortByPriceComparator());
        System.out.println("Сортировка по цене от меньшей к большей:");
        printAllProducts();
    }

    public void sortByWeight() {
        products.sort(new SortByWeightComparator());
        System.out.println("\nСортировка по весу от большего к меньшему:");
        printAllProducts();
    }

    public void sortByCategories() {
        products.sort(new SortByCategoryComparator());
        System.out.println("\nСортировка по категориям:");
        printAllProducts();
    }

    public void checkTreeSetWithComparable() {
        for (Product setProduct : setProductsWithComparable) {
            System.out.println(setProduct);
        }
    }

    public void checkTreeSetWithComparator() {
        for (Product setProduct : setProductsWithComparator) {
            System.out.println(setProduct);
        }
    }

    public void removeExpiredProducts() {
        Iterator<Product> iterator = products.iterator();
        boolean removed = false;
        while (iterator.hasNext()) {
            Product element = iterator.next();
            if (element.isExpired()) {
                iterator.remove();
                decreaseProduct(element.getName());
                System.out.printf("Найден просроченный продукт - %s. Продукт удалён со склада.%n", element.getName());
                removed = true;
            }
        }
        if (!removed) {
            System.out.println("Все продукты годны.");
        }
    }

    public void clearMap() {
        productAmount.clear();
    }

    public void checkMapIsEmpty() {
        if (productAmount.isEmpty()) {
            System.out.println("Map пуста.");
        } else {
            System.out.println("В Map есть продукты");
        }
    }

    public void minQuantityProduct() {
        String currentName = "";
        int value = Integer.MAX_VALUE;
        if (productAmount.isEmpty()) {
            System.out.println("Склад пуст.");
        } else {
            for (Map.Entry<String, Integer> entry : productAmount.entrySet()) {
                if (entry.getValue() < value) {
                    currentName = entry.getKey();
                    value = entry.getValue();
                }
            }
            System.out.printf("Продукт, которого меньше всего на складе - %s в количестве - %d штук.%n", currentName, value);
        }
    }

    public void getMaxQuantityProduct() {
        String name = "";
        int value = 0;
        if (productAmount.isEmpty()) {
            System.out.println("Склад пуст.");
        } else {
            for (Map.Entry<String, Integer> entry : productAmount.entrySet()) {
                if (entry.getValue() > value) {
                    value = entry.getValue();
                    name = entry.getKey();
                }
            }
            System.out.printf("Продукт, которого больше всего на складе - %s в количестве - %d штук.%n", name, value);
        }
    }

    public void decreaseProduct(String name) {
        if (productAmount.containsKey(name)) {
            int value = productAmount.get(name);
            if (value > 1) {
                productAmount.put(name, value - 1);
            } else if (value == 1) {
                productAmount.remove(name);
            }
        } else {
            System.out.println("Такого ключа нет на складе.");
        }
    }

    public void getQuantityOfOneProduct(String name) {
        int value = productAmount.getOrDefault(name, 0);
        System.out.println("Количество продукта - " + name + " - " + value);
    }

    public boolean isProductAvailable(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void printUniqueProducts() {
        if (uniqueProducts.isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        for (Product product : uniqueProducts) {
            System.out.println(product);
        }
    }

    public void printProductAmount() {
        for (Map.Entry<String, Integer> entry : productAmount.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " - " + value);
        }
    }

    @Override
    public Product findByName(String name) {
        for (Product product : products) {
            if (product.getName() != null) {
                if (product.getName().equals(name)) {
                    return product;
                }
            }
        }
        return null;
    }

    @Override
    public List<Product> findByCategory(String category) {
        List<Product> result = new ArrayList<>();
        for (Product foundProduct : products) {
            if (foundProduct.getCategory() != null) {
                if (foundProduct.getCategory().equals(category)) {
                    result.add(foundProduct);
                }
            }
        }
        if (result.isEmpty()) {
            System.out.println("Категория не найдена.");
        } else {
            for (Product product : result) {
                System.out.println("Продукт - " + product + " есть на складе.");
            }
        }
        return result;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
        uniqueProducts.add(product);
        String name = product.getName();
        int oldAmount = productAmount.getOrDefault(name, 0);
        productAmount.put(name, oldAmount + 1);
        setProductsWithComparable.add(product);
        setProductsWithComparator.add(product);
    }

    @Override
    public void removeProduct(String name) {
        Iterator<Product> iterator = products.iterator();
        boolean removed = false;
        while (iterator.hasNext()) {
            Product element = iterator.next();
            if (element.getName().equals(name)) {
                iterator.remove();
                decreaseProduct(name);
                removed = true;
                System.out.println("Продукт - " + element.getName() + " удалён со склада.");
                break;
            }
        }
        if (!removed) {
            System.out.println("Продукт не найден.");
        }
    }

    @Override
    public void printAllProducts() {
        if (products.isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
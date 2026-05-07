package mypractice.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Product milk = new FoodProduct("Молоко", 0.9, 80, "Еда", false, 54);
        Product bread = new FoodProduct("Хлеб", 0.4, 40, "Еда", true, 188);
        Product cheese = new FoodProduct("Сыр", 0.2, 200, "Еда", false, 500);
        Product wine = new DrinkProduct("Вино", 0.7, 1800, "Напитки", false, 0.5);
        Product wine2 = new DrinkProduct("Вино", 0.7, 2000, "Напитки", false, 0.7);
        Product juice = new DrinkProduct("Сок", 0.9, 99, "Напитки", true, 1.0);
        Product sparklingWater = new DrinkProduct("Вода газированная", 0.9, 55, "Напитки", false, 1.5);
        Product soap = new CleaningProduct("Мыло", 0.07, 50, "Бытовая химия", false, false);
        Product shampoo = new CleaningProduct("Шампунь", 0.5, 140, "Бытовая химия", false, false);
        Product floorCleaner = new CleaningProduct("Средство для мытья полов", 1.2, 313, "Бытовая химия", false, true);

        warehouse.addProduct(milk);
        warehouse.addProduct(bread);
        warehouse.addProduct(cheese);
        warehouse.addProduct(wine);
        warehouse.addProduct(wine2);
        warehouse.addProduct(juice);
        warehouse.addProduct(sparklingWater);
        warehouse.addProduct(soap);
        warehouse.addProduct(shampoo);
        warehouse.addProduct(floorCleaner);

        warehouse.getMenu().put(1, "Показать все продукты.");
        warehouse.getMenu().put(2, "Показать уникальные продукты.");
        warehouse.getMenu().put(3, "Показать количество продуктов.");
        warehouse.getMenu().put(4, "Найти продукт по имени.");
        warehouse.getMenu().put(5, "Найти продукты по категории.");
        warehouse.getMenu().put(6, "Удалить продукт по имени.");
        warehouse.getMenu().put(7, "Удалить просроченные продукты");
        warehouse.getMenu().put(8, "Сортировать по цене");
        warehouse.getMenu().put(9, "Сортировать по весу");
        warehouse.getMenu().put(10, "Сортировать по категории");
        warehouse.getMenu().put(0, "Выход");

        Scanner scanner = new Scanner(System.in);
        int userChoice = -1;
        while (userChoice != 0) {
            warehouse.showMenu();
            try {
                userChoice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException exception) {
                System.out.println("Ошибка. Введите число от 0 до 10.");
                scanner.nextLine();
                continue;
            }
            switch (userChoice) {
                case 0: {
                    System.out.println("Выход из программы.");
                    break;
                }
                case 1: {
                    warehouse.printAllProducts();
                    break;
                }
                case 2: {
                    warehouse.printUniqueProducts();
                    break;
                }
                case 3: {
                    warehouse.printProductAmount();
                    break;
                }
                case 4: {
                    System.out.println("Введите название продукта:");
                    String userChoiceByName = scanner.nextLine();
                    Product foundProduct = warehouse.findByName(userChoiceByName);
                    if (foundProduct != null) {
                        System.out.println("Найден продукт.");
                        System.out.println(foundProduct);
                    } else {
                        System.out.println("Продукт не найден.");
                    }
                    break;
                }
                case 5: {
                    System.out.println("Введите название категории:");
                    String userChoiceByCategory = scanner.nextLine();
                    warehouse.findByCategory(userChoiceByCategory);
                    break;
                }
                case 6: {
                    System.out.println("Введите название удаляемого объекта:");
                    String userChoiceRemoveByName = scanner.nextLine();
                    warehouse.removeProduct(userChoiceRemoveByName);
                    break;
                }
                case 7: {
                    warehouse.removeExpiredProducts();
                    break;
                }
                case 8: {
                    warehouse.sortByPrice();
                    break;
                }
                case 9: {
                    warehouse.sortByWeight();
                    break;
                }
                case 10: {
                    warehouse.sortByCategories();
                    break;
                }
                default: {
                    System.out.println("Действия под этим номером не существует.");
                }
            }
        }
        scanner.close();
    }
}

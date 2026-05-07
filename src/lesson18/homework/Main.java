package lesson18.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nВариант a)");
        Fridge fridge = new Fridge();
        System.out.println("Положить продукты в холодильник.");
        fridge.addProduct("Банан", 200.5);
        fridge.addProduct("Масло", 500.53);
        fridge.addProduct("Банан", 400.5);
        fridge.addProduct("Йогурт", 150.095);
        fridge.addProduct("Колбаса", 1000.38);

        System.out.println("\nВариант b)");
        System.out.println("Взять продукт из холодильника полностью.");
        fridge.removeProduct("Масло");
        System.out.println("Взять часть продукта из холодильника.");
        fridge.getProduct("Колбаса", 150.01);

        System.out.println("\nВариант c)");
        System.out.println("Вывести вес всех продуктов в холодильнике(сумма).");
        fridge.getWeightOfAllProducts();

        System.out.println("\nВариант d)");
        System.out.println("Вывести вес конкретного продукта в холодильнике.");
        fridge.getWeightOfOneProduct("Огурец");
        fridge.getWeightOfOneProduct("Йогурт");

        System.out.println("\nВариант e)");
        System.out.println("Вывести наименование продукта, который закончится первым.");
        fridge.getProductWillEndFaster();

        System.out.println("\nВариант f)");
        System.out.println("Вывести наименование продукта, которого больше всего.");
        fridge.getProductWillEndLonger();

        System.out.println("\nВариант g)");
        System.out.println("Вывести все продукты (название + вес по алфавиту от Я до А");
        fridge.printAllProductsFromZToA();

        System.out.println("\nВариант h)");
        System.out.println("Вывести все продукты (название + вес) по весу от большего к меньшему");
        fridge.printAllProductsFromWeight();
    }
}

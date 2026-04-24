package lesson07;

import java.util.Scanner;

/**
 * Класс контроллер
 */
public class CheapTripController {
    private CheapTripDB cheapTripDB = new CheapTripDB();

    /**
     * Запуск общения с пользователем
     */
    public void start() {
        System.out.println("Добрый день! Я ваш персональный гид.");
        menu();
    }

    public void menu() {
        System.out.println("Выберите фильтр, по которому вы хотите искать туры.");
        System.out.println("1 - поиск туров по стране.");
        System.out.println("2 - поиск туров по цене.");
        System.out.println("3 - просмотр всех туров.");
        System.out.println("4 - просмотр туров по городу.");
        System.out.println("5 - поиск по цене и по звездам одновременно.");
        System.out.println("0 - завершить программу.");

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        while (userChoice != 0) {
            switch (userChoice) {
                case 1 -> {
                    System.out.println("Введите страну, куда вы хотите поехать:");
                    scanner.nextLine();
                    String country = scanner.nextLine();
                    cheapTripDB.searchByCountry(country);
                }
                case 2 -> {
                    System.out.println("Введите ваш бюджет:");
                    int price = scanner.nextInt();
                    cheapTripDB.searchByPrice(price);
                }
                case 3 -> {
                    System.out.println("Просмотр всех туров:");
                    cheapTripDB.viewAllTours();
                }
                case 4 -> {
                    System.out.println("Введите город, какой хотели бы посетить:");
                    scanner.nextLine();
                    String city = scanner.nextLine();
                    cheapTripDB.viewToursByCity(city);
                }
                case 5 -> {
                    System.out.println("Поиск туров по цене и по звездам одновременно.");
                    scanner.nextLine();
                    System.out.println("Введите ваш бюджет:");
                    int price = scanner.nextInt();
                    System.out.println("Введите количество звезд:");
                    int stars = scanner.nextInt();
                    cheapTripDB.viewToursByPriceAndStars(price, stars);
                }
                default -> {
                    System.out.println("Такой функции еще нет, выберите функцию из списка");
                }
            }
            System.out.println("");
            menu();
            userChoice = scanner.nextInt();
            }
        }
    }

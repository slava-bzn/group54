package lesson09.homework2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Payment debitCard = new DebitCard("Дебетовая карта", "Российский рубль");
        Payment cryptoCurrency = new CryptoCurrency("Криптовалюта", "Bitcoin");
        Payment payPal = new PayPal("Сервис PayPal", "USD");

        /*System.out.println("Программа оплаты интернет-сервиса.");
        System.out.println("Метод оплаты зависит от выбранной Вами валюты.");
        printMenu();

        Scanner scanner = new Scanner(System.in);
        int userChoiceOfCurrency = scanner.nextInt();
        while (userChoiceOfCurrency != 0) {
            switch (userChoiceOfCurrency) {
                case 1 -> {
                    System.out.println("Валюта: " + debitCard.getTypeOfCurrency() + ". Метод: " + debitCard.getTypeOfPayment() + ".");
                    debitCard.pay();
                }
                case 2 -> {
                    System.out.println("Валюта: " + cryptoCurrency.getTypeOfCurrency() + ". Метод: " + cryptoCurrency.getTypeOfPayment() + ".");
                    cryptoCurrency.pay();
                }
                case 3 -> {
                    System.out.println("Валюта: " + payPal.getTypeOfCurrency() + ". Метод: " + payPal.getTypeOfPayment() + ".");
                    payPal.pay();
                }
                default -> {
                    System.out.println("Такого метода оплаты еще нет. Выберите вариант из списка.");
                }
            }
            System.out.println("");
            printMenu();
        }*/

        System.out.println("\nПакетная работа с экземплярами разных классов, которые являются родственниками.");
        Payment[] payments = {debitCard, cryptoCurrency, payPal};
        for (Payment payment : payments) {
            System.out.println();
            System.out.println("Следующий вариант оплаты это - " + payment.getTypeOfPayment() + ". Валюта: " + payment.getTypeOfCurrency());

            //Определяем к какому типу относится данное животное
            if (payment instanceof DebitCard) {
                DebitCard paymentFromArray = (DebitCard) payment;
                payment.pay();
            } else if (payment instanceof CryptoCurrency) {
                CryptoCurrency paymentFromArray = (CryptoCurrency) payment;
                payment.pay();
            } else if (payment instanceof PayPal) {
                PayPal paymentFromArray = (PayPal) payment;
                payment.pay();
            } else {
                System.out.println("Такого метода оплаты еще нет.");
            }
        }
    }
    private static void printMenu() {
        System.out.println("\nВыберите валюту, которой хотели бы оплатить:");
        System.out.println("1 - Российский рубль.");
        System.out.println("2 - Bitcoin.");
        System.out.println("3 - USD.");
        System.out.println("0 - Завершить программу.");
    }

}

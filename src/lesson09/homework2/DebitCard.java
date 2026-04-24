package lesson09.homework2;

import java.util.Scanner;

public class DebitCard extends Payment {

    public DebitCard(String typeOfPayment, String typeOfCurrency) {
        super(typeOfPayment, typeOfCurrency);
    }

    @Override
    public void pay() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите номер карты:");
        scanner.nextLine();
        System.out.println("Введите срок действия карты:");
        scanner.nextLine();
        System.out.println("Введите секретный код карты:");
        scanner.nextInt();
        System.out.println("Оплата по методу: " + getTypeOfPayment() + " - совершена.");
    }
}

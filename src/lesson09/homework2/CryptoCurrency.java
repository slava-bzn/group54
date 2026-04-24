package lesson09.homework2;

import java.util.Scanner;

public class CryptoCurrency extends Payment {

    public CryptoCurrency(String typeOfPayment, String typeOfCurrency) {
        super(typeOfPayment, typeOfCurrency);
    }

    @Override
    public void pay() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите номер кошелька:");
        scanner.nextLine();
        System.out.println("Оплата по методу: " + getTypeOfPayment() + " - совершена.");
    }
}

package lesson09.homework2;

import java.util.Scanner;

public class PayPal extends Payment {

    public PayPal(String typeOfPayment, String typeOfCurrency) {
        super(typeOfPayment, typeOfCurrency);
    }

    @Override
    public void pay() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Пожалуйста, авторизируйтесь. Введите свой email и пароль для входа:");
        scanner.nextLine();
        System.out.println("Оплата по методу: " + getTypeOfPayment() + " - совершена.");
    }
}

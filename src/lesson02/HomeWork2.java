package lesson02;

public class HomeWork2 {
    public static void main(String[] args) {

        System.out.println("Домашнее задание.");
        System.out.println("Вы хотите разместить вклад в банке на сумму 1 миллион 200 тысяч рублей.");
        System.out.println("Срок вклада 12 месяцев. Вам предложено 2 варианта:");
        System.out.println("Вариант 1 - с ежемесячной капитализацией по ставке 22%.");
        System.out.println("Вариант 2 - с начислением процентов в конце срока по ставке 22,5%.");
        System.out.println("1. Определить, какая сумма у Вас накопится к концу срока вклада по обоим вариантам.");
        System.out.println("2. Выбрать наиболее выгодный вариант.");
        System.out.println("3. Вывести результаты в консоль.");

        //Дано:
        double myCash1 = 1_200_000;
        double myCash2 = 1_200_000;
        double rate1 = 22;
        double rate2 = 22.5;
        double months1 = 12;
        double months2 = months1 / 12;

        //Вычисление вариант 1:
        for (int month = 0; month < months1; month++) {
            myCash1 = myCash1 + (myCash1 * (rate1 / 100) / months1);
        }
        myCash1 = Math.round(myCash1);
        System.out.println("Конечная сумма по варианту 1: " + myCash1 + ".");

        //Вычисление вариант 2:
        myCash2 = myCash2 + (myCash2 * (rate2 / 100) * months2);
        myCash2 = Math.round(myCash2);
        System.out.println("Конечная сумма по варианту 2: " + myCash2 + ".");


        //Поиск более выгодного варианта:
        if (myCash1 > myCash2) {
            System.out.println("Выгоднее вариант 1.");
        } else if (myCash1 < myCash2) {
            System.out.println("Выгоднее вариант 2.");
        } else {
            System.out.println("Оба варианта одинаково выгодные.");
        }

        /*Упрощенный вариант решения:
        if (myCash1 > myCash2) {
            System.out.println("Выгоднее вариант 1.");
        } else {
            System.out.println("Выгоднее вариант 2.");
        }
        */
    }
}
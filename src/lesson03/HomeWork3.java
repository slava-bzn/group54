package lesson03;

import org.w3c.dom.ls.LSOutput;

public class HomeWork3 {
    public static void main(String[] args) {

        System.out.println("\nДомашнее задание 1.");
        System.out.println("Дано:");
        System.out.println("Есть массив чисел от 1 до 30. Вывести в консоль все четные числа, ");
        System.out.println("кроме 6, 10, 14. Как только цикл дойдёт до 23, остановить вывод и написать ");
        System.out.println("в консоль \"Достигнуто целевое число!\".");
        System.out.println("Решение:");
        //Создание пустого массива.
        int[] anyNumbers = new int[30];
        //Создание цикла массива для присвоения значений.
        for (int index = 0; index < anyNumbers.length; index++) {
            //Прибавляем + 1 к каждому индексу, так как индекс начинается с 0 а значения с 1.
            //И что бы дойти до 30 а не до 29.
            anyNumbers[index] = index + 1;
            //Присваивание значения массива для переменной.
            int numberOnMassive = anyNumbers[index];
            if (numberOnMassive == 23) {
                System.out.println("Вывод: Достигнуто целевое число!");
                break;
            }
            if (numberOnMassive % 2 != 0) {
                continue;
            }
            if (numberOnMassive == 6 || numberOnMassive == 10 || numberOnMassive == 14) {
                continue;
            }
            System.out.println(numberOnMassive);
        }
        System.out.println("\nДомашнее задание 2. Честно выполнил совместно с ChatGPT:)");
        System.out.println("Дано:");
        System.out.println("Вывести предложение \"Я Java разработчик\" наоборот (задом наперед), ");
        System.out.println("в одну строку.");
        System.out.println("Решение:");
        char[] symbolsOfPhrase = {'Я',' ','J','a','v','a',' ','р','а','з','р','а','б','о','т','ч','и','к'};
        for (int i = symbolsOfPhrase.length - 1; i >= 0; i--) {
            System.out.print(symbolsOfPhrase[i]);
        }
        System.out.println("");
        System.out.println("\nЗадача от ChatGPT.");
        System.out.println("Дано:");
        System.out.println("Выведи \"Java!\" из массива Java без восклицательного знака.");
        System.out.println("Решение:");
        char[] word = {'J','a','v','a'};
        for (int i = 0; i < word.length; i++) {
            System.out.print(word[i]);
        }
        System.out.print("!");
    }
}
package lesson20.homework.consumer;

import lesson20.homework.predicate.Man;
import lesson20.homework.predicate.Slava;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        System.out.println("\nСоздать Consumer, который:");
        System.out.println("1. Проверяет что имя не null.");
        System.out.println("2. Изменяет вес у объекта.");
        System.out.println("3. Выводит результат нового веса у объекта.");

        Man slava = new Slava("Слава", 33, 85, "Русский");

        System.out.println("\nВариант через отдельный класс:");
        ChangeWeightAndPrintConsumer classConsumer = new ChangeWeightAndPrintConsumer();
        classConsumer.accept(slava);

        System.out.println("\nВариант через лямбду:");
        Scanner scanner = new Scanner(System.in);
        Consumer<Man> lambdaConsumer = man -> {
            if (man.getName() == null || man.getName().isEmpty()) {
                System.out.println("Имя объекта отсутствует.");
                return;
            }
            System.out.printf("Введите новое значение веса для объекта %s: ", man.getName());
            int newWeight = scanner.nextInt();
            man.setWeight(newWeight);
            System.out.printf("Новый вес объекта %s составляет - %d.%n", man.getName(), man.getWeight());
        };
        lambdaConsumer.accept(slava);
    }
}
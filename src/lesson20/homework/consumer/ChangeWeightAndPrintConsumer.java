package lesson20.homework.consumer;

import lesson20.homework.predicate.Man;

import java.util.Scanner;
import java.util.function.Consumer;

public class ChangeWeightAndPrintConsumer implements Consumer<Man> {
    @Override
    public void accept(Man man) {
        if (man.getName() == null || man.getName().isEmpty()) {
            System.out.println("Имя объекта отсутствует.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите новое значение веса для объекта %s: ", man.getName());
        man.setWeight(scanner.nextInt());
        System.out.printf("Новый вес объекта %s составляет - %d.%n", man.getName(), man.getWeight());
    }
}
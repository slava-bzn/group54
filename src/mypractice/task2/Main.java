package mypractice.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>(List.of("Ivan", "Anna", "Oleg", "Ivan", "Maria", "Alex", "Ivan"));

        Iterator<String> it = users.iterator();
        while (it.hasNext()) {
            String user = it.next();
            if (user.equals("Ivan")) {
                it.remove();
            }
        }
        System.out.println(users);

        Iterator<String> it2 = users.iterator();
        while (it2.hasNext()) {
            String user = it2.next();
            if (user.length() < 5) {
                it2.remove();
            }
        }
        System.out.println(users);

        Set<Integer> numbers = new HashSet<>();
        for (int index = 0; index <= 30; index++) {
            numbers.add(index);
        }
        Iterator<Integer> it3 = numbers.iterator();
        while (it3.hasNext()) {
            int num = it3.next();
            if (num % 2 == 0) {
                it3.remove();
            }
        }
        // Нельзя удалять элементы из коллекции через numbers.remove(num)
        // во время for-each обхода, потому что это может вызвать ConcurrentModificationException.
        // Для безопасного удаления во время обхода нужно использовать iterator.remove().
        System.out.println(numbers);


    }
}

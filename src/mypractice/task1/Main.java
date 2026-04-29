package mypractice.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>(List.of("Ivan", "Anna", "Oleg", "Ivan", "Maria", "Anna"));

        System.out.println(users + "\n");
        System.out.println(users.get(2) + "\n");
        users.set(3, "Alex");
        users.remove(1);
        System.out.println("Содержит ли список имя - Олег?");
        System.out.println(users.contains("Oleg") ? "Содержит." : "Не содержит.");
        System.out.println("");

        HashSet<String> hashUsers = new HashSet<>(users);
        System.out.println(hashUsers + "\n");
        hashUsers.add("Ivan");
        System.out.println(hashUsers + "\n");
        // Иван не добавляется в множество HashSet так как у множества должны быть только уникальные значения.

        LinkedHashSet<String> linkedHashUsers = new LinkedHashSet<>(users);
        System.out.println(linkedHashUsers + "\n");
        // Разница с HashSet в том что в LinkedHashSet имеется очередность добавления в список. При этом так же
        // соблюдена уникальность.

        TreeSet<String> treeSetUsers = new TreeSet<>(users);
        System.out.println(treeSetUsers + "\n");
        // Это такое же множество, как и HashSet, LinkedHashSet в котором соблюдена уникальность значений,
        // но соблюдена сортировка объектов по механизму красно-черного дерева.

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int index = 0; index <= 20; index++) {
            numbers.add(index);
        }
        System.out.println(numbers);

        HashSet<Integer> numbersOfHash = new HashSet<>();
        for (int index = 0; index < 30; index++) {
            numbersOfHash.add(index);
        }
        Iterator<Integer> it = numbersOfHash.iterator();
        while (it.hasNext()) {
            int number = it.next();
            if (number >= 11) {
                it.remove();
            }
        }
        System.out.println(numbersOfHash);
    }
}

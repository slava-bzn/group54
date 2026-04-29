package lesson16;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создаем новый список.");
        Set<Integer> set = new TreeSet<>();

        System.out.println("\nadd(E e): Добавляет элемент в множество, если он отсутствует.");
        set.add(1);
        set.add(8);
        set.add(2);
        set.add(4);
        set.add(99);
        set.add(2);

        System.out.println("\nsize(): Возвращает количество элементов в множестве.\n");
        System.out.println("Размер коллекции - " + set.size());

        System.out.println("\nisEmpty(): Проверяет, пусто ли множество.");
        System.out.println("Коллекция пуста? - " + set.isEmpty());

        System.out.println("\nremove(Object o): Удаляет элемент из множества, если элемент присутствует.");
        System.out.println(set.remove(15));
        System.out.println(set.remove(8));

        System.out.println("\ncontains(Object o): Проверяет, содержится ли элемент в множестве.");
        System.out.println(set.contains(15) ? "Присутствует." : "Отсутствует."); //Тернарный оператор
        System.out.println(set.contains(2) ? "Присутствует." : "Отсутствует."); //Тернарный оператор

        System.out.println("\nВывод всех элементов множества.");
        System.out.println(set);

//        Почему так нельзя было?
//        for (Integer index : set) {
//            if (index == 2) {
//                set.remove(index);
//                break;
//            }
//        }
//        System.out.println(set);

        //Iterator
        //hasNext - метод Итератора, который отвечает на вопрос "Есть ли следующий элемент? true или false.
        //next - метод Итератора, с помощью которого происходит получение следующего элемента.

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element == 2) {
                iterator.remove();
            }
        }
        System.out.println(set);

        set.removeIf(element -> element == 2);
        System.out.println(set);

        set.removeIf(element -> {
            if (element == 2) {
                return true;
            } else {
                return false;
            }
        });
            System.out.println(set);
        }
    }

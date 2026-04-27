package lesson15.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CollectionUtils collectionUtils = new CollectionUtilsImpl();

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(7);
        arrayList.add(-7);
        arrayList.add(6778);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(6778);
        linkedList.add(6778);
        linkedList.add(-7);
        linkedList.add(7238);
        linkedList.add(2);
        linkedList.add(8);

        System.out.println("\nОбъединение двух коллекций с дубликатами.");
        System.out.println(collectionUtils.union(arrayList, linkedList) + "\n");

        System.out.println("Пересечение двух коллекций с дубликатами.");
        System.out.println(collectionUtils.intersection(arrayList, linkedList) + "\n");

        //System.out.println("\nОбъединение двух коллекций без дубликатов.");
        //System.out.println(collectionUtils.unionWithoutDuplicate(arrayList, linkedList) + "\n");

        //System.out.println("Пересечение двух коллекций без дубликатов.");
        //System.out.println(collectionUtils.intersectionWithoutDuplicate(arrayList, linkedList) + "\n");

        System.out.println("Разность двух коллекций.");
        System.out.println(collectionUtils.difference(arrayList, linkedList) + "\n");
    }
}

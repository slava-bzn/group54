package lesson11.homework1;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        int x = 10;
        String str = "Hello";
        boolean isTrue = true;
        double d = 3.14;
        Integer i = new Integer(20);
        ArrayList<Integer> list = new ArrayList<>();
        char c = 'a';
        float f = 2.718f;
        String p = "Примитивный тип данных.";
        String s = "Ссылочный тип данных.";

        System.out.println("int x = 10 - " + p);
        System.out.println("String str = \"Hello\" - " + s);
        System.out.println("boolean isTrue = true - " + p);
        System.out.println("double d = 3.14 - " + p);
        System.out.println("Integer i = new Integer(20) - " + s);
        System.out.println("ArrayList<Integer> list = new ArrayList<>() - " + s);
        System.out.println("char c = 'a' - " + p);
        System.out.println("float f = 2.718f - " + p);
    }
}

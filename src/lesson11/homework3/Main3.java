package lesson11.homework3;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Работа с классами-обёртками.");
        System.out.println("Создайте программу, которая демонстрирует работу с классами-обёртками.");
        System.out.println();
        System.out.println("1. Создать объект класса Integer с помощью конструктора и методом valueOf():");
        Integer number1 = new Integer(20);
        System.out.println("Первое число - " + number1);
        Integer number2 = Integer.valueOf(10);
        System.out.println("Второе число - "+ number2);

        System.out.println("\n2. Использовать метод equals() для сравнения двух объектов Integer.");
        if (number1.equals(number2) == false) {
            System.out.println("Числа не равны.");
        } else {
            System.out.println("Числа равны.");
        }
        if (number1 < number2) {
            System.out.println("Первое число меньше второго.");
        } else {
            System.out.println("Первое число меньше второго.");
        }

        System.out.println("\n3. Применить метод parseInt() для преобразования строки в целое число.");
        System.out.println("Преобразование текста \"777\" в целое число:");
        String text1 = "777";
        int number3 = Integer.parseInt(text1);
        System.out.println(number3);

        //Метод parseDouble() для преобразования строки в дробное число.
        System.out.println(("Преобразование текста \"1.111\" в дробное число:"));
        String text2 = "1.111";
        double number4 = Double.parseDouble(text2);
        System.out.println(number4);
    }
}

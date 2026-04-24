package lesson03;

public class ClassWork3 {
    public static void main(String[] args) {
        System.out.println("Задача 1. Вывести на консоль все числа от 0 до 10, кроме 2 и 5");
        for (int number = 0; number < 10; number++) {
            if (number == 2) {
                continue;
            }

            if (number == 5) {
                continue;
            }

            System.out.println(number);
        }

        System.out.println("\nПример break и return");
        for (int index = 0; index < 10; index++) {
            if (index == 6) {
                break;
            }
            System.out.println("Вывод в первом цикле.");
            System.out.println(index);
        }

        for (int index = 0; index < 10; index++) {
            if (index == 6) {
                break;
            }
            System.out.println("Вывод во втором цикле.");
            System.out.println(index);
        }
        System.out.println("\nПример работы с массивами");
        long[] arrayWithNumbers = {1, 2, 6, 9, 87, 5, 75, 343, 3};
        double[] emptyArray = new double[8];
        emptyArray[0] = 1.53;
        emptyArray[4] = 1.93;
        emptyArray[7] = 2.57;
        emptyArray[7] = 3.89;
        System.out.println("\nВывод числа из ячейки 0 - " + emptyArray[0] + ".");
        double element4 = emptyArray[4];
        System.out.println(element4);
        System.out.println("\nВыведем все элементы массива emptyArray");
        for (int index = 0; index < emptyArray.length; index++) {
            System.out.println(emptyArray[index]);
        }
        System.out.println("\nЗадача 2. Надо вывести на консоль каждую ячейку");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int index = 0; index < 10; index++) {
            System.out.println(numbers[index]);
        }
        System.out.println("\nЗадача 3. Есть массив чисел, нужно вывести на консоль только четные ");
        System.out.println("числа в обратном порядке.");
        int[] intNumbers = {1,4,2,5,78,8,4,1,5,6,98};
        for (int index = intNumbers.length - 1; index >= 0; index--) {
            int number = intNumbers[index];
            if (number % 2 == 0) {
                System.out.println(intNumbers[index]);
            }
        }
    }
}

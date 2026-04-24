package lesson04;

public class Main {
    public static void main(String[] args) {
        //Сделаем пустой массив на 10 ячеек
        int[] emptyArray = new int[10];

        System.out.println("Читаем значения пустого массива");
        for (int index = 0; index < emptyArray.length; index++) {
            int number = emptyArray[index];
            System.out.println(number);
        }

        System.out.println("\nЗаполняем массив числами от 1 до 10");
        for (int index = 0; index < emptyArray.length; index++) {
            emptyArray[index] = index + 1;
        }

        System.out.println("\nЧитаем значения заполненного массива");
        for (int index = 0; index < emptyArray.length; index++) {
            int number = emptyArray[index];
            System.out.println(number);
        }

        System.out.println("\nЗадание 1. Есть массив цифр: {3,5,8,3,55,4,1,65,36,98}.");
        System.out.println("1) Вывести на консоль массив с обратной стороны");
        System.out.println("2) Вывести на консоль те числа, которые содержат символ 5");
        int[] numbersArray = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};

        System.out.println("\nВывод на консоль массива с обратной стороны");
        for (int index = numbersArray.length - 1; index >= 0; index--) {
            System.out.println(numbersArray[index]);
        }

        // String - тип данных строки. Это Java объект, который имеет много полезных встроенных методов
        //valueOf() - принимает на вход любой примитивный тип, отдает String (то есть превращает все в строку)
        System.out.println("\nВывод на консоль тех чисел, которые содержат символ 5");
        for (int index = 0; index < numbersArray.length; index++) {
            int number = numbersArray[index];
            String stringNumber = String.valueOf(number);
            if (stringNumber.contains("5")) {
                System.out.println(number);
            }
        }

        System.out.println("\nСоздать двумерный массив с числами и вывести на консоль");
        //Если хотим создать пустой двумерный массив на сколько-то ячеек
//        int[][] numbers = new int[10][10];
        int[][] numbers = {
                {1, 2, 3},
                {3, 5, 6},
                {5, 3, 2},
                {1, 4, 5}
        };

        //nested - вложенный
        //Первым циклом идем по ячейкам основного массива (по этажам, по строкам и т.д.)
        for (int verticalIndex = 0; verticalIndex < numbers.length; verticalIndex++) {
            //Получаем содержимое каждой ячейки и записываем в переменную
            int[] nestedArray = numbers[verticalIndex];
            //Теперь идем по всем ячейкам вложенного массива
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                //Достаем элемент и пишем в переменную
                int number = nestedArray[horizontalIndex];
                //Выводим значение на консоль
                System.out.print(number + " ");
            }
            System.out.println();
        }

        System.out.println("\nСоздать массив чисел и вывести его диагональ");
        int[][] array = {
                {1, 6, 3, 4, 5, 7},
                {12, 54, 3, 12, 4, 3},
                {1, 5, 2, 53, 5, 3},
                {7, 54, 23, 54, 23},
                {25, 4534, 4, 3, 23, 32},
                {234, 5, 3, 1, 6, 3,}
        };

        for (int verticalIndex = 0; verticalIndex < array.length; verticalIndex++) {
            int[] nestedArray = array[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                if (verticalIndex + horizontalIndex == 5) {
                    int number = nestedArray[horizontalIndex];
                    System.out.print(number + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

        //Запись значение в ячейку массива происходит по схеме
        //1) Получили ячейку массива
        //2) Записали туда данные

        //Запись в ячейку массива
        //названиеМассива[индекс ячейки] = значение -> numbers[4] = 15;

        //Чтение/Получение из ячейки массива
        //названиеМассива[индекс ячейки] -> numbers[4]

        //Запись в ячейку двумерного массива
        //НазваниеМассива[индекс ячейки по вертикали][индекс ячейки по горизонтали] = значение -> numbers[4][5] = 15;

        //Чтение/Получение из ячейки двумерного массива
        //НазваниеМассива[индекс ячейки по вертикали][индекс ячейки по горизонтали] -> numbers[4][5]

        System.out.println("\n Создать пустой массив и заполнить все его ячейки значением 15");
        int[][] simpleArray = new int[6][6];
        //Если хотим наполнить вручную
        simpleArray[0][0] = 1;
        simpleArray[0][1] = 2;
        simpleArray[3][2] = 4;

        //Если циклом
        for (int verticalIndex = 0; verticalIndex < array.length; verticalIndex++) {
            int[] nestedArray = array[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                simpleArray[verticalIndex][horizontalIndex] = 15;
            }
        }

        //Домашнее задание
        //1) Создать массив 6 на 6 сразу с числами (сразу с числами)
        //2) Перезаписать во все ячейки нули (0)
        //3) Вывести диагональ сверху вниз
        //4) Вывести в шахматном порядке
    }
}

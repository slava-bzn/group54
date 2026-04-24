package lesson04;

public class HomeWork4 {
    public static void main(String[] args) {
        //Домашнее задание
        //1) Создать массив 6 на 6 сразу с числами (сразу с числами)
        //2) Перезаписать во все ячейки нули (0)
        //3) Вывести диагональ сверху вниз
        //4) Вывести в шахматном порядке
        System.out.println("\nДомашнее задание 4.");
        System.out.println("Дано:");
        System.out.println("1. Создать массив 6 на 6 сразу с числами.");
        System.out.println("2. Перезаписать во все ячейки нули (0).");
        System.out.println("3. Вывести диагональ сверху вниз.");
        System.out.println("4. Вывести в шахматном порядке.");
        System.out.println("Решение:");
        //Создание массива с числами.
            int[][] array = {
                    {1, 56, 54, 872, 654, 23},
                    {34, 6556, 453, 21, 34, 86},
                    {646, 782, 22, 34, 12, 9},
                    {474, 747, 900, 90, 65, 41},
                    {7676, 930, 700, 691, 871, 333},
                    {326, 560, 78, 79, 56, 52},
            };

            for (int verticalIndex = 0; verticalIndex < array.length; verticalIndex++) {
                int[] nestedArray = array[verticalIndex];
                for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                    int number = nestedArray[horizontalIndex];
                    System.out.print(number + " ");
                }
                System.out.println();
            }

            for (int verticalIndex = 0; verticalIndex < array.length; verticalIndex++) {
                int[] nestedArray = array[verticalIndex];
                for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                    array[verticalIndex][horizontalIndex] = 0;
                    System.out.print(array[verticalIndex][horizontalIndex] + " ");
                }
                System.out.println();
            }

            for (int verticalIndex = 0; verticalIndex < array.length; verticalIndex++) {
                int[] nestedArray = array[verticalIndex];
                for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                    if (verticalIndex == horizontalIndex) {
                        int number = nestedArray[horizontalIndex];
                        System.out.print(number + " ");
                    } else {
                        System.out.print(" " + " ");
                    }
                }
                System.out.println();
            }

            for (int verticalIndex = 0; verticalIndex < array.length; verticalIndex++) {
                int[] nestedArray = array[verticalIndex];
                for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                    if ((verticalIndex + horizontalIndex) % 2 == 0) {
                        int number = nestedArray[horizontalIndex];
                        System.out.print(number + " ");
                    } else {
                        System.out.print(" " + " ");
                    }
                }
                System.out.println();
            }
        }
    }
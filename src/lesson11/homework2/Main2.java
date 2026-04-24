package lesson11.homework2;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        //Преобразуйте целое число int в строку String.
        int number1 = 50;
        String text = String.valueOf(number1);
        System.out.println(text);

        //Преобразуйте строку String, содержащую числовое значение в целочисленный тип int.
        int number2 = Integer.parseInt(text);
        System.out.println(number2);

        //Преобразуйте вещественное число double в целое число int с потерей дробной части.
        double number3 = 55.5;
        int number4 = (int) number3;
        System.out.println(number4);
        //или
        double number5 = 77.7;
        Double number6 = Double.valueOf(number5);
        Integer number7 = number6.intValue();
        System.out.println(number7);

        //Преобразуйте массив целых чисел int[] в список ArrayList<Integer> с использованием авто-упаковки.
        int[] array = {1, 23, 43, 213, 12};
        ArrayList<Integer> list = new ArrayList<>();

        for (int index = 0; index < array.length; index++){
            list.add(array[index]);
        }
        System.out.println(list);

        //или
        for (int index : array) {
            list.add(index);
        }
        System.out.println(list);
    }
}

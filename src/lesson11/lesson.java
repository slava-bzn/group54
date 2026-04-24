package lesson11;

public class lesson {
    public static void main(String[] args) {
        Integer number = 20;
        int intNumber = number;
        String num = String.valueOf(intNumber);
        System.out.println(num);

        double num1 = 0.6;
        Double num2 = num1;
        Double num3 = 0.5;
        System.out.println(num2.equals(num3));

        if (num2 > num3) {
            System.out.println("Переменная 1 больше переменной 2.");
        } else {
            System.out.println("Переменная 1 меньше переменной 2.");
        }

        String text = "5.78";
        Double num4 = Double.valueOf(text);
        int num5 = num4.intValue();
        System.out.println(num5);
    }
}

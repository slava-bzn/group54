package lesson05;

import java.util.Scanner;

public class FigureAreaCalculator {
    public static void printMenu() {
        System.out.println("1 - Треугольник.");
        System.out.println("2 - Квадрат.");
        System.out.println("3 - Круг.");
        System.out.println("4 - Трапеция.");
        System.out.println("5 - Овал.");
        System.out.println("0 - Завершить программу.");
    }
    public static void main(String[] args) {
        System.out.println("Добрый день! Я калькулятор площадей фигур.");
        System.out.println("Выберите фигуру, по которой вы хотите посчитать площадь:");
        printMenu();

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        while (userChoice != 0) {
            switch (userChoice) {
                case 1:
                    System.out.println("Введите длину основания треугольника:");
                    double baseOfTriangle = scanner.nextDouble();
                    System.out.println("Введите длину высоты треугольника:");
                    double heightOfTriangle = scanner.nextDouble();
                    double areaOfTriangle = MathUtils.calculateTriangleArea(baseOfTriangle, heightOfTriangle);
                    System.out.println("Площадь треугольника равна: " + areaOfTriangle);
                    break;

                case 2:
                    System.out.println("Введите длину любой стороны квадрата.");
                    double sideOfSquare = scanner.nextDouble();
                    double areaOfSquare = MathUtils.calculateSquareArea(sideOfSquare);
                    System.out.println("Площадь квадрата равна: " + areaOfSquare);
                    break;

                case 3:
                    System.out.println("Введите длину радиуса круга.");
                    double radiusOfCircle = scanner.nextDouble();
                    double areaOfCircle = MathUtils.calculateCircleArea(radiusOfCircle);
                    System.out.println("Площадь круга равна: " + areaOfCircle);
                    break;

                case 4:
                    System.out.println("Введите длину верхнего основания трапеции:");
                    double upperBaseOfTrapezium = scanner.nextDouble();
                    System.out.println("Введите длину нижнего основания трапеции:");
                    double lowerBaseOfTrapezium = scanner.nextDouble();
                    System.out.println("Введите длину высоты трапеции:");
                    double heightOfTrapezium = scanner.nextDouble();
                    double areaOfTrapezium = MathUtils.calculateTrapeziumArea(upperBaseOfTrapezium,
                            lowerBaseOfTrapezium, heightOfTrapezium);
                    System.out.println("Площадь трапеции равна: " + areaOfTrapezium);
                    break;

                case 5:
                    System.out.println("Введите длину большего радиуса:");
                    double largerRadius = scanner.nextDouble();
                    System.out.println("Введите длину меньшего радиуса:");
                    double smallerRadius = scanner.nextDouble();
                    double areaOfOval = MathUtils.calculateOvalArea(largerRadius, smallerRadius);
                    System.out.println("Площадь овала (эллипса) равна: " + areaOfOval);
                    break;

                default:
                    System.out.println("Такой функции еще нет. Выберите фигуру из списка.");
            }
            System.out.println("\nВыберите следующую фигуру по которой вы хотите посчитать площадь:");
            printMenu();
            userChoice = scanner.nextInt();
        }
        scanner.close();
    }
}


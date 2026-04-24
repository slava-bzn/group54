package lesson05;
public class MathUtils {
    //Сделаем метод, который посчитает площадь треугольника по основанию и высоте (которые ввел пользователь)
    public static double calculateTriangleArea(double baseOfTriangle, double heightOfTriangle) {
        double areaOfTriangle = (baseOfTriangle * heightOfTriangle) / 2;
        return areaOfTriangle;
    }

    //Сделаем метод, который посчитает площадь квадрата по 1 стороне (которую ввел пользователь)
    public static double calculateSquareArea(double sideOfSquare) {
        double areaOfSquare = sideOfSquare * sideOfSquare;
        return areaOfSquare;
    }

    //Сделаем метод, который посчитает площадь по радиусу круга (которую ввел пользователь)
    public static double calculateCircleArea(double radiusOfCircle) {
        double pi = Math.PI;
        double areaOfCircle = pi * Math.pow(radiusOfCircle, 2);
        return areaOfCircle;
    }

    //Сделаем метод, который посчитает площадь трапеции по верхнему, нижнему основаниям и высоте
    //(которые ввел пользователь)
    public static double calculateTrapeziumArea(double upperBaseOfTrapezium, double lowerBaseOfTrapezium, double heightOfTrapezium) {
        double areaOfTrapezium = ((upperBaseOfTrapezium + lowerBaseOfTrapezium) / 2) * heightOfTrapezium;
        return areaOfTrapezium;
    }

    //Сделаем метод, который посчитает площадь овала (эллипса) по меньшему и большему радиусам
    //(которые ввел пользователь)
    public static double calculateOvalArea(double largerRadius, double smallerRadius) {
        double pi = Math.PI;
        double areaOfOval = largerRadius * smallerRadius * pi;
        return areaOfOval;
    }
}

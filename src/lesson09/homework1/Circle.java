package lesson09.homework1;

import java.util.Scanner;

public class Circle extends Shape {

    public Circle(String typeOfShape) {
        super(typeOfShape);
    }

    @Override
    public void calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину радиуса круга.");
        double radiusOfCircle = scanner.nextDouble();
        double areaOfCircle = MathUtils.calculateCircleArea(radiusOfCircle);
        System.out.println("Площадь круга равна: " + areaOfCircle);
    }
}

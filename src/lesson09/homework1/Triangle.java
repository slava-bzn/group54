package lesson09.homework1;

import java.util.Scanner;

public class Triangle extends Shape {

    public Triangle(String typeOfShape) {
        super(typeOfShape);
    }

    @Override
    public void calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину основания треугольника:");
        double baseOfTriangle = scanner.nextDouble();
        System.out.println("Введите длину высоты треугольника:");
        double heightOfTriangle = scanner.nextDouble();
        double areaOfTriangle = MathUtils.calculateTriangleArea(baseOfTriangle, heightOfTriangle);
        System.out.println("Площадь треугольника равна: " + areaOfTriangle);
    }
}

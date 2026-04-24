package lesson09.homework1;

import java.util.Scanner;

public class Rectangle extends Shape {

    public Rectangle(String typeOfShape) {
        super(typeOfShape);
    }

    @Override
    public void calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину вертикальной стороны прямоугольника.");
        double verticalSide = scanner.nextDouble();
        System.out.println("Введите длину горизонтальной стороны прямоугольника.");
        double horizontalSide = scanner.nextDouble();
        double areaOfRectangle = MathUtils.calculateRectangleArea(verticalSide, horizontalSide);
        System.out.println("Площадь прямоугольника равна: " + areaOfRectangle);
    }
}

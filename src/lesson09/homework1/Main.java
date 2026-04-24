package lesson09.homework1;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Круг");
        Shape rectangle = new Rectangle("Прямоугольник");
        Shape triangle = new Triangle("Треугольник");

        System.out.println("Демонстрация работы программы по вычислению площадей фигур.");
        System.out.println("");
        System.out.println("Вычисление площади фигуры - " + circle.getTypeOfShape() + ".");
        circle.calculateArea();
        System.out.println("");
        System.out.println("Вычисление площади фигуры - " + rectangle.getTypeOfShape() + ".");
        rectangle.calculateArea();
        System.out.println("");
        System.out.println("Вычисление площади фигуры - " + triangle.getTypeOfShape() + ".");
        triangle.calculateArea();
    }
}

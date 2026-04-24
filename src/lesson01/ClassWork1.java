package lesson01;

public class ClassWork1 {
    public static void main(String[] args) {
        //Есть 3 стороны треугольника, напечатать на консоль его периметр
        //ctrl + alt + l (автоформатирование кода)
        //System.out.print - функция вывода в консоль
        //psvm - создать точку старта main
        //Дано
        int a = 5;
        int b = 7;
        int c = 17;
        //Решение
        int perimeter = a + b + c;
        //Вывод в консоль
        System.out.println("Задача 1. Есть 3 стороны треугольника, напечатать на консоль его периметр");
        System.out.println("Периметр треугольника равен: " + perimeter);

        //Есть ширина и длина стола, есть ширина и длина комнаты.
        //Вывести на консоль, сколько таких столов влезет в комнату?
        System.out.println("Задача 2. Есть ширина и длина стола, есть ширина и длина комнаты. Вывести на консоль, " +
                "сколько таких столов влезет в комнату?");

        //Дано
        double widthOfTable = 170.34;
        double lengthOfTable = 373.83274;
        double widthOfRoom = 1596.76;
        double lengthOfRoom = 34271.89;

        //Посчитаем площади стола и комнаты и посчитаем сколько площадей стола влезет в площадь комнаты
        double areaOfTable = widthOfTable * lengthOfTable;
        double areaOfRoom = widthOfRoom * lengthOfRoom;
        int quantityOfTables = (int) (areaOfRoom / areaOfTable);

        //Выводим результат в консоль
        System.out.println("В комнате поместится: " + quantityOfTables + " столов");
    }
}

package lesson09.homework1;

public class MathUtils {

    public static double calculateCircleArea(double radiusOfCircle) {
        double pi = Math.PI;
        double areaOfCircle = pi * Math.pow(radiusOfCircle, 2);
        return areaOfCircle;
    }

    public static double calculateRectangleArea(double verticalSide, double horizontalSide) {
        double areaOfRectangle = verticalSide * horizontalSide;
        return areaOfRectangle;
    }

    public static double calculateTriangleArea(double baseOfTriangle, double heightOfTriangle) {
        double areaOfTriangle = (baseOfTriangle * heightOfTriangle) / 2;
        return areaOfTriangle;
    }
}

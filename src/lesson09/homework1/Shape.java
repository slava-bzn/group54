package lesson09.homework1;

public abstract class Shape {
    private String typeOfShape;

    public Shape(String typeOfShape) {
        this.typeOfShape = typeOfShape;
    }

    public abstract void calculateArea();

    public String getTypeOfShape() {
        return typeOfShape;
    }

    public void setTypeOfShape(String typeOfShape) {
        this.typeOfShape = typeOfShape;
    }
}

package mypractice.task3;

public class FoodProduct extends Product {
    private int calories;

    public FoodProduct(String name, double weight, int price, String category, boolean expired, int calories) {
        super(name, weight, price, category, expired);
        this.calories = calories;
    }

    @Override
    public void getInfo() {
        System.out.println("Еда.");
    }

    @Override
    public String toString() {
        return (super.toString() + " Калории: " + calories + ".");
    }
}

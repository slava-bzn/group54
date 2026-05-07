package mypractice.task3;

public class DrinkProduct extends Product {
    private double volume;

    public DrinkProduct(String name, double weight, int price, String category, boolean expired, double volume) {
        super(name, weight, price, category, expired);
        this.volume = volume;
    }

    @Override
    public void getInfo() {
        System.out.println("Напитки.");
    }

    @Override
    public String toString() {
        return (super.toString() + " Объём: " + volume + ".");
    }
}

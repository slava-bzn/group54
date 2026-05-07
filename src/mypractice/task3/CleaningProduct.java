package mypractice.task3;

public class CleaningProduct extends Product {
    private boolean toxic;

    public CleaningProduct(String name, double weight, int price, String category, boolean expired, boolean toxic) {
        super(name, weight, price, category, expired);
        this.toxic = toxic;
    }

    @Override
    public void getInfo() {
        System.out.println("Бытовая химия.");
    }

    @Override
    public String toString() {
        return (super.toString() + " Токсичен? - " + toxic + ".");
    }
}

package mypractice.task4;

public class PremiumTaxiCar extends TaxiCar {
    private boolean hasBusinessClass;

    public PremiumTaxiCar(String brand, String model, int year,
                          double mileageKm, boolean isAvailable, boolean hasBusinessClass) {
        super(brand, model, year, mileageKm, isAvailable);
        this.hasBusinessClass = hasBusinessClass;
    }

    public boolean isHasBusinessClass() {
        return hasBusinessClass;
    }

    @Override
    public String toString() {
        return super.toString() + ", автомобиль бизнес-класса? - " + hasBusinessClass;
    }

    @Override
    public double calculateRideCost(double distanceKm) {
        return distanceKm * 50.0;
    }
}

package mypractice.task4;

public class TaxiCar implements RideCostCalculator, Comparable<TaxiCar> {

    private String brand;
    private String model;
    private int year;
    private double mileageKm;
    private boolean isAvailable;

    public TaxiCar(String brand, String model, int year,
                   double mileageKm, boolean isAvailable) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileageKm = mileageKm;
        this.isAvailable = isAvailable;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getMileageKm() {
        return mileageKm;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setMileageKm(double mileageKm) {
        if (mileageKm < 0.0) {
            return;
        } else if (mileageKm < this.mileageKm) {
            return;
        } else {
            this.mileageKm = mileageKm;
        }
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Автомобиль такси марки: " + brand + ", модель: " + model + ", " +  year +
                " года выпуска, пробег: " + mileageKm + ". Доступность - " + isAvailable;
    }


    @Override
    public double calculateRideCost(double distanceKm) {
        return distanceKm * 20.0;
    }

    @Override
    public int compareTo(TaxiCar o) {
        return Integer.compare(this.year, o.year);
    }
}

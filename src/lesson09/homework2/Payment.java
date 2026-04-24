package lesson09.homework2;

public abstract class Payment {
    private String typeOfPayment;
    private String typeOfCurrency;

    public abstract void pay();

    public Payment(String typeOfPayment, String typeOfCurrency) {
        this.typeOfPayment = typeOfPayment;
        this.typeOfCurrency = typeOfCurrency;
    }

    public String getTypeOfPayment() {
        return typeOfPayment;
    }

    public String getTypeOfCurrency() {
        return typeOfCurrency;
    }
}

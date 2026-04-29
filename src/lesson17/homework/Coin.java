package lesson17.homework;

import java.util.Comparator;
import java.util.Objects;

public class Coin implements Comparable<Coin> {
    private double diameter;
    private int year;
    private String nameMetal;
    private int nominal;

    public Coin(double diameter, int year, String nameMetal, int nominal) {
        this.diameter = diameter;
        this.year = year;
        this.nameMetal = nameMetal;
        this.nominal = nominal;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNameMetal() {
        return nameMetal;
    }

    public void setNameMetal(String nameMetal) {
        this.nameMetal = nameMetal;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "diameter=" + diameter +
                ", year=" + year +
                ", nameMetal='" + nameMetal + '\'' +
                ", nominal=" + nominal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return Double.compare(diameter, coin.diameter) == 0 && year == coin.year && nominal == coin.nominal && Objects.equals(nameMetal, coin.nameMetal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diameter, year, nameMetal, nominal);
    }

    @Override
    public int compareTo(Coin o) {
        return 0;
    }
}

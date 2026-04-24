package lesson06;

import java.util.Objects;

public class Pet {
    private String name;
    private int height;
    private int weight;
    private String color;
    private int quantityOfPaws;
    private String favoriteFood;

    public Pet(String name, int height, int weight, String color, int quantityOfPaws, String favoriteFood) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = color;
        this.quantityOfPaws = quantityOfPaws;
        this.favoriteFood = favoriteFood;
    }

    public Pet() {

    }

    public final void sayName() {
        System.out.println("Привет. Меня зовут " + name + ".");
    }

    public void sayHeight() {
        System.out.println("Мой рост " + height + "см.");
    }

    public void sayWeight() {
        System.out.println("Мой вес " + weight + "кг.");
    }

    public void sayColor() {
        System.out.println("Мой цвет " + color + ".");
    }

    public void sayQuantityOfPaws() {
        System.out.println("У меня " + quantityOfPaws + " лапки.");
    }

    public void sayFavoriteFood() {
        System.out.println("Моя любимая еда - " + favoriteFood + ".");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getQuantityOfPaws() {
        return quantityOfPaws;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", quantityOfPaws=" + quantityOfPaws +
                ", favoriteFood='" + favoriteFood + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return height == pet.height && weight == pet.weight && quantityOfPaws == pet.quantityOfPaws && Objects.equals(name, pet.name) && Objects.equals(color, pet.color) && Objects.equals(favoriteFood, pet.favoriteFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, weight, color, quantityOfPaws, favoriteFood);
    }
}


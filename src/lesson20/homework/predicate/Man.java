package lesson20.homework.predicate;

import java.util.Objects;

public abstract class Man {
    private String name;
    private int age;
    private int weight;
    private String nation;

    public Man(String name, int age, int weight, String nation) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.nation = nation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", nation='" + nation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return age == man.age && weight == man.weight && Objects.equals(name, man.name) && Objects.equals(nation, man.nation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight, nation);
    }
}

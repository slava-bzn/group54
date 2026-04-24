package lesson12;

import lesson12.interfaces.Flyable;
import lesson12.interfaces.Huntable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal eagle = new Eagle("Орёл", 5, "мышь", "коричневый");
        Animal elephant = new Elephant("Слон", 10, "арбузы", "серый");
        Animal giraffe = new Giraffe("Жираф", 7, "фрукты", "желтоватый с коричневыми пятнами");
        Animal swan = new Swan("Лебедь", 3, "растения", "белый");
        Animal tiger = new Tiger("Тигр", 11, "мясо", "оранжевый с коричневыми полосками");

        ArrayList<Animal> arrayListAnimal = new ArrayList<>();
        arrayListAnimal.add(eagle);
        arrayListAnimal.add(elephant);
        arrayListAnimal.add(giraffe);
        arrayListAnimal.add(swan);
        arrayListAnimal.add(tiger);

        for (Animal animal : arrayListAnimal) {
            animal.eat();
            animal.move();
            animal.sleep();
            if (animal instanceof Flyable) {
                Flyable flyableAnimal = (Flyable) animal;
                flyableAnimal.fly();
            }
            if (animal instanceof Huntable) {
                Huntable huntableAnimal = (Huntable) animal;
                huntableAnimal.hunt();
            }
            System.out.println("");
        }
        /*eagle.move();
        eagle.eat();
        eagle.sleep();
        System.out.println("");
        elephant.move();
        elephant.eat();
        elephant.sleep();
        System.out.println("");
        giraffe.move();
        giraffe.eat();
        giraffe.sleep();
        System.out.println("");
        swan.move();
        swan.eat();
        swan.sleep();
        System.out.println("");
        tiger.move();
        tiger.eat();
        tiger.sleep();
         */
    }
}

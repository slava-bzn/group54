package lesson09;

public class AnimalsExample {
    public static void main(String[] args) {
        Animal animalCat = new Cat(20, 5, "Оксана");
        Cat cat = new Cat(13, 4, "Мурзик");
        Dog dog = new Dog(9, 10, "Черри");
        Bird bird = new Bird(13, 1, "Кеша");

        System.out.println("Сравнение экземпляра класса Cat записанного в переменную типа Cat и Animal");
        System.out.println("Кошке " + cat.getAge() + " лет, ее вес: " + cat.getWeight());
        cat.eat();
        cat.move();
        cat.lookAtOwnerWithContempt();
        System.out.println();
        System.out.println("Кошке " + animalCat.getAge() + " лет, ее вес: " + animalCat.getWeight());
        animalCat.eat();
        animalCat.move();
//        animalCat.lookAtOwnerWithContempt();

        System.out.println("\nПакетная работа с экземплярами разных классов, которые являются родственниками");
        Animal[] animals = {animalCat, cat, dog, bird};
        for (Animal animal : animals) {
            System.out.println();
            System.out.println("Этому животному " + animal.getAge() + " лет, вес животного: " + animal.getWeight());
            animal.eat();
            animal.move();
            //Определяем какому типо относится данное животное
            if (animal instanceof Dog) {
                Dog dogFromArray = (Dog) animal;
                dogFromArray.beAGoodBoy();
                dogFromArray.runTheBall();
            } else if (animal instanceof Cat) {
                Cat catFromArray = (Cat) animal;
                catFromArray.lookAtOwnerWithContempt();
            } else if (animal instanceof Bird) {
                Bird birdFromArray = (Bird) animal;
                birdFromArray.fly();
            } else {
                System.out.println("Такого типа не предусмотрено.");
            }
        }
    }
}

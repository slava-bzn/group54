package lesson06;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("Snoop Dog", 180, 80, "чёрный", 2, "бургеры");
        Pet twinDog = new Pet("Snoop Dog", 181, 78, "чёрный", 2, "курица");
        Pet cartoonDog = new Pet("Scooby-Doo", 50, 20, "коричневый", 4, "собачий корм");
        System.out.println("");

        dog.sayName();
        dog.setHeight(181);
        dog.setWeight(78);
        dog.setFavoriteFood("курица");
        System.out.println("Мой рост " + dog.getHeight() + "см.");
        System.out.println("Мой вес " + dog.getWeight() + "кг.");
        System.out.println("Моя любимая еда - " + dog.getFavoriteFood() + ".");
        dog.sayColor();
        dog.sayQuantityOfPaws();
        System.out.println("");

        twinDog.sayName();
        twinDog.sayHeight();
        twinDog.sayWeight();
        twinDog.sayColor();
        twinDog.sayQuantityOfPaws();
        twinDog.sayFavoriteFood();
        System.out.println("");

        cartoonDog.sayName();
        cartoonDog.sayHeight();
        cartoonDog.sayWeight();
        cartoonDog.sayColor();
        cartoonDog.sayQuantityOfPaws();
        cartoonDog.sayFavoriteFood();

        System.out.println("\n" + dog.toString());
        System.out.println("Snoop Dog и близнец Snoop Dog одинаковые? " + dog.equals(twinDog));
        System.out.println("Snoop Dog и Scooby-Doo одинаковые? " + cartoonDog.equals(twinDog));
    }
}

package lesson20.homework.predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        System.out.println("\nСоздать Predicate для каждого варианта проверки, который проверяет у объекта:");
        System.out.println("1. Имя не пустое?");
        System.out.println("2. Возраст больше 18?");
        System.out.println("3. Вес - четное число?");
        System.out.println("4. Национальность начинается на заглавную букву Р?");

        Man slava = new Slava("Слава", 33, 85, "Русский");
        Man natalya = new Natalya ("Наталья", 37, 55,"Русская");

        System.out.println("\nСоздание Predicate по варианту 1:");
        ManNamePredicate predicate1 = new ManNamePredicate();
        if (predicate1.test(slava)) {
            System.out.printf("Значение имени - %s - не пустое.%n", slava.getName());
        } else {
            System.out.printf("Значение имени - %s - пустое.%n", slava.getName());
        }

        System.out.println("\nСоздание Predicate по варианту 2:");
        ManAgePredicate predicate2 = new ManAgePredicate();
        if (predicate2.test(slava)) {
            System.out.printf("Возраст - %d больше 18.%n", slava.getAge());
        } else {
            System.out.printf("Возраст - %d меньше 18.%n", slava.getAge());
        }

        System.out.println("\nСоздание Predicate по варианту 3:");
        ManWeightPredicate predicate3 = new ManWeightPredicate();
        if (predicate3.test(slava)) {
            System.out.printf("Вес - %d - четное число.%n", slava.getWeight());
        } else {
            System.out.printf("Вес - %d - нечетное число.%n", slava.getWeight());
        }

        System.out.println("\nСоздание Predicate по варианту 4:");
        ManNationPredicate predicate4 = new ManNationPredicate();
        if (predicate4.test(slava)) {
            System.out.printf("Национальность - %s - начинается на заглавную букву \"Р\".%n", slava.getNation());
        } else {
            System.out.printf("Национальность - %s - не начинается на заглавную букву \"Р\".%n", slava.getNation());
        }


        System.out.println("\nВыведем все варианты через лямбду:");
        Predicate<Man> predicate5 = man -> (man.getName() != null && !man.getName().isEmpty());
        if (predicate5.test(natalya)) {
            System.out.printf("Значение имени - %s - не пустое.%n", natalya.getName());
        } else {
            System.out.printf("Значение имени - %s - пустое.%n", natalya.getName());
        }

        Predicate<Man> predicate6 = man -> (man.getAge() > 18);
        if (predicate6.test(natalya)) {
            System.out.printf("Возраст - %d больше 18.%n", natalya.getAge());
        } else {
            System.out.printf("Возраст - %d меньше 18.%n", natalya.getAge());
        }

        Predicate<Man> predicate7 = man -> (man.getWeight() % 2 == 0);
        if (predicate7.test(natalya)) {
            System.out.printf("Вес - %d - четное число.%n", natalya.getWeight());
        } else {
            System.out.printf("Вес - %d - нечетное число.%n", natalya.getWeight());
        }

        Predicate<Man> predicate8 = man -> (man.getNation() != null && man.getNation().startsWith("Р"));
        if (predicate8.test(natalya)) {
            System.out.printf("Национальность - %s - начинается на заглавную букву \"Р\".%n", natalya.getNation());
        } else {
            System.out.printf("Национальность - %s - не начинается на заглавную букву \"Р\".%n", natalya.getNation());
        }
    }
}

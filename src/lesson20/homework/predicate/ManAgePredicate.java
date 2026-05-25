package lesson20.homework.predicate;

import java.util.function.Predicate;

public class ManAgePredicate implements Predicate<Man> {
    @Override
    public boolean test(Man man) {
        return (man.getAge() > 18);
    }
}

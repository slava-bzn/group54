package lesson20.homework.predicate;

import java.util.function.Predicate;

public class ManWeightPredicate implements Predicate<Man> {
    @Override
    public boolean test(Man man) {
        return (man.getWeight() % 2 == 0);
    }
}

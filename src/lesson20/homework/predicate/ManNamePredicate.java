package lesson20.homework.predicate;

import java.util.function.Predicate;

public class ManNamePredicate implements Predicate<Man> {
    @Override
    public boolean test(Man man) {
        return (man.getName() != null && !man.getName().isEmpty());
    }
}

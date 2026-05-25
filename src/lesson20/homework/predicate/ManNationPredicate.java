package lesson20.homework.predicate;

import java.util.function.Predicate;

public class ManNationPredicate implements Predicate<Man> {
    @Override
    public boolean test(Man man) {
        return (man.getNation() != null && man.getNation().startsWith("Р"));
    }
}

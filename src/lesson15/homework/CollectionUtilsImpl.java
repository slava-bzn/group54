package lesson15.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class CollectionUtilsImpl implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException();
        }
        Collection<Integer> resultOfUnion = new ArrayList<>();
        resultOfUnion.addAll(a);
        resultOfUnion.addAll(b);
        return resultOfUnion;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException();
        }
        Collection<Integer> resultOfIntersection = new ArrayList<>();

        for (Integer index : a) {
            if (b.contains(index)) {
                resultOfIntersection.add(index);
            }
        }
        return resultOfIntersection;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return Set.of();
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return Set.of();
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException();
        }
        Collection<Integer> resultOfDifference = new ArrayList<>();
        for (Integer index1 : a) {
            if (!b.contains(index1)) {
                resultOfDifference.add(index1);
            }
        }
        for (Integer index2 : b) {
                if (!a.contains(index2)) {
                    resultOfDifference.add(index2);
                }
            }
        return resultOfDifference;
    }
}

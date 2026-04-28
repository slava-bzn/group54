package lesson16.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

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
        if (a == null || b == null) {
            throw new NullPointerException();
        }
        Set<Integer> resultOfUnionWithoutDuplicate = new TreeSet<>();

        resultOfUnionWithoutDuplicate.addAll(a);
        resultOfUnionWithoutDuplicate.addAll(b);
        return resultOfUnionWithoutDuplicate;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException();
        }
        Set<Integer> resultOfIntersectionWithoutDuplicate = new TreeSet<>();

        for (Integer index : a) {
            if (b.contains(index)) {
                resultOfIntersectionWithoutDuplicate.add(index);
            }
        }
        return resultOfIntersectionWithoutDuplicate;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException();
        }
        Collection<Integer> resultOfDifference = new ArrayList<>();
        for (Integer index : a) {
            if (!b.contains(index)) {
                resultOfDifference.add(index);
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

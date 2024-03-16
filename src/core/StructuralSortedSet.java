package core;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class StructuralSortedSet<T extends Comparable<T>> extends StructuralSet<T> implements SortedSet<T> {
    @Override
    public void add(T x) {
        super.add(x);
        sort();
    }

    private void sort() {
        T[] src = (T[]) v;

        Arrays.sort(src, 0, size(), new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.compareTo(o2);
            }
        });
    }

    @Override
    public T first() {
        if(isEmpty()) throw new NoSuchElementException();
        return (T) v[0];
    }

    @Override
    public T last() {
        if(isEmpty()) throw new NoSuchElementException();
        return (T) v[size() - 1];
    }
}

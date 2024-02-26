package core;

public interface Collection<T> extends Iterable<T> {
    void add(T elem);

    default void addAll(Collection<T> c) {
        Iterator<T> it = c.iterator();
        while(it.hasNext()) {
            add(it.next());
        }
    }

    void clear();
    boolean contains(T elem);
    boolean isEmpty();
    void remove(T elem);
    int size();
}

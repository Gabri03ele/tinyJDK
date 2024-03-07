package core;

public interface Collection<T> extends Iterable<T> {
    void add(T elem);

    default void addAll(Collection<T> c) {
        Iterator<T> it = c.iterator();
        while(it.hasNext()) {
            add(it.next());
        }
    }
    default boolean contains(T elem) {
        Iterator<T> it = iterator();
        while(it.hasNext()) {
            T e = it.next();
            if(e.equals(elem)) {
                return true;
            }
        }
        return false;
    }
    void clear();
    boolean isEmpty();
    void remove(T elem);
    int size();
}

package core;

public interface List<T> extends Collection<T> {
    T get(int i);
    T set(int i, T elem);
    void add(int i, T elem);
    T remove(int i);
}

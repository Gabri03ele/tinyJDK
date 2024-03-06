package core;

public class StructuralSet<T> implements Set<T> {
    private List<T> l = new ArrayList<>();
    @Override
    public void add(T elem) {
        if(!l.contains(elem)) {
            l.add(elem);
        }
    }

    @Override
    public void clear() {
        l.clear();
    }

    @Override
    public boolean isEmpty() {
        return l.isEmpty();
    }

    @Override
    public void remove(T elem) {
        l.remove(elem);
    }

    @Override
    public int size() {
        return l.size();
    }

    @Override
    public Iterator<T> iterator() {
        return l.iterator();
    }
}

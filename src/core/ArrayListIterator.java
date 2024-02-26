package core;

public class ArrayListIterator<T> implements Iterator<T> {
    private int pos = 0;
    private ArrayList<T> enclosing;

    public ArrayListIterator(ArrayList<T> a) {
        this.enclosing = a;
    }
    @Override
    public boolean hasNext() {
        return pos < enclosing.size();
    }

    @Override
    public T next() {
        return enclosing.get(pos++);
    }
}

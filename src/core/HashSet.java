package core;

public class HashSet<T> extends AbstractResizableArray<T> implements Set<T> {

    @Override
    public void add(T elem) {
        if(!contains(elem)) {
            super.add(elem);
        }
    }

    @Override
    public boolean contains(T elem) {
        Iterator<T> it = iterator();
        int h = elem.hashCode();
        while(it.hasNext()) {
            T e = it.next();
            if(e.hashCode() == h) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void remove(T elem) {

    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}

package core;

public class ArrayList<T> implements List<T> {
    private Object[] v;
    private int sz;

    public ArrayList() {
        this.v = new Object[10];
        this.sz = 0;
    }

    @Override
    public void add(T elem) {
        if(sz >= v.length) {
            Object[] old = v;
            v = new Object[v.length * 2];
            for(int i = 0; i < old.length; i++) {
                v[i] = old[i];
            }
        }
        v[sz++] = elem;
    }

    @Override
    public void clear() {
        sz = 0;
    }

    @Override
    public boolean contains(T elem) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return sz == 0;
    }

    @Override
    public void remove(T elem) {

    }

    @Override
    public int size() {
        return sz;
    }


    private class MyIterator implements Iterator<T> {
        private int pos = 0;
        @Override
        public boolean hasNext() {
            return pos < size();
        }

        @Override
        public T next() {
            return get(pos++);
        }
    }



    /*
    // Terzo metodo: il tipo di ritorno di iterator è diverso
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public T next() {
                return null;
            }
        };
    }
    */
    @Override
    public Iterator<T> iterator() {
        return new MyIterator();

        // Ritorno nel secondo metodo:
        // return new ArrayListIterator<T>(this);
    }

    @Override
    public T get(int i) {
        if(i < sz) {
            return (T) v[i];
        } else {
            throw new RuntimeException(String.format("ArrayList.get(): index %d out of bounds %d", i, sz));
        }
    }

    @Override
    public T set(int i, T elem) {
        if(i < sz) {
            T old = get(i);
            v[i] = elem;

            return old;
        } else {
            throw new RuntimeException(String.format("ArrayList.set(): index %d out of bounds %d", i, sz));
        }
    }

    @Override
    public void add(int i, T elem) {

    }

    @Override
    public T remove(int i) {
        return null;
    }
}

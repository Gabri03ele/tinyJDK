package core;

public abstract class AbstractResizableArray<T> implements Collection<T> {
    protected Object[] v;
    protected int sz;

    public AbstractResizableArray() {
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
    public boolean isEmpty() {
        return sz == 0;
    }

    @Override
    public int size() {
        return sz;
    }

    public abstract void remove(T elem);
    @Override
    public abstract Iterator<T> iterator();

}


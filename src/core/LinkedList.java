package core;

import core.List;

public class LinkedList<T> implements List<T> {
    protected class Node {
        public T data;
        public Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    protected Node head;
    protected int sz;
    public LinkedList() {
        this.head = null;
        this.sz = 0;
    }

    @Override
    public void add(T elem) {
        if(head == null) {
            head = new Node(elem, null);
        } else {
            Node tmp = head;
            while(tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(elem, null);
        }
        sz++;
    }

    @Override
    public void clear() {
        head = null;
        sz = 0;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void remove(T elem) {
        Node n = head;
        if(n != null) {
            if (n.data.equals(elem)) {
                head = n.next;
                sz--;
            } else {
                while (n.next != null) {
                    if (n.next.data.equals(elem)) {
                        n.next = n.next.next;
                        sz--;
                        return;
                    }
                }
            }
        }
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node n = head;
            @Override
            public boolean hasNext() {
                return n != null;
            }

            @Override
            public T next() {
                T r = n.data;
                n = n.next;

                return r;
            }
        };
    }

    protected Node getNode(int i) {
        if(i < 0 || i >= size()) {
            throw new RuntimeException(String.format("LinkedList.get(): index %d is out of bounds (size = %d)", i , sz));
        }
        Node n = head;
        for(; i > 0; i--) {
            n = n.next;
        }
        return n;
    }

    @Override
    public T get(int i) {
        return getNode(i).data;
    }

    @Override
    public T set(int i, T elem) {
        Node n = getNode(i);
        T old = n.data;
        n.data = elem;

        return old;
    }

    @Override
    public void add(int i, T elem) {

    }

    @Override
    public T remove(int i) {
        return null;
    }
}

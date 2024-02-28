package core;

import core.List;

public class LinkedList<T> implements List<T> {
    private class Node {
        public T data;
        public Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    private Node head;
    private int sz;
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
    public boolean contains(T elem) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void remove(T elem) {

    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public T get(int i) {
        return null;
    }

    @Override
    public T set(int i, T elem) {
        return null;
    }

    @Override
    public void add(int i, T elem) {

    }

    @Override
    public T remove(int i) {
        return null;
    }
}

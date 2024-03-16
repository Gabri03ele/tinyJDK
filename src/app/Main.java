package app;

import core.*;

public class Main {
    public static<T> void main(String[] args) {
        List<Integer> l2 = new LinkedList<>();
        l2.add(10);
        l2.add(20);
        l2.add(30);

        l2.remove(10);

        l2.set(1, 100);

        System.out.println(l2.size());
        Iterator<Integer> it = l2.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(l2.size());

        List<Integer> l = new ArrayList<>();

        l.add(0, 10);
        l.add(1, 20);
        l.add(2, 30);
        l.add(3, 40);

        l.remove(2);

        for(int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }
}

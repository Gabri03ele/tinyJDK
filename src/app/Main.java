package app;

import core.ArrayList;
import core.List;

public class Main {
    public static<T> void main(String[] args) {
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

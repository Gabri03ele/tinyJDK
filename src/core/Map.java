package core;

public interface Map<K, V> extends Iterable<Pair<K, V>>{
    void put(K k, V v);

    // data una chiava mi ritorna il valore
    V get(K k) throws KeyNotFoundException;

    class KeyNotFoundException extends Exception {
        public KeyNotFoundException(Object k) {
            super(String.format("Key %s not found in map", k));
        }
    }
}

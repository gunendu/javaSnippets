package main.java.org.gunendu.generics.pojo;

public class StudentsPair<K, V> implements Pair<K, V>{

    private K key;
    private V value;

    public StudentsPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}

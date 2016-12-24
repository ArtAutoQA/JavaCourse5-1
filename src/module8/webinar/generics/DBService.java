package module8.webinar.generics;

import java.util.ArrayList;
import java.util.List;

public class DBService<T, K, V> implements DbServiceInterface<K> {
    //emulates DB
    private List<K> list = new ArrayList<>();

    private List<K> list1 = new ArrayList<>();

    @Override
    public K save(K k) {
        list.add(k);
        return k;
    }

    @Override
    public K delete(K k) {
        list.remove(k);
        return k;
    }

    boolean check(K k) {
        return k instanceof String;
    }
}

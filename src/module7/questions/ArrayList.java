package module7.questions;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by citsym on 09.12.16.
 */
public class ArrayList<E> implements Iterable<E>{

    int size;
    Object[] elementDate;

    public void add(E element){

    }

    @Override
    public Iterator<E> iterator() {
        return new Itr<E>();
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }


    class Itr<E> implements Iterator<E>{
        int cursor;

        @Override
        public boolean hasNext() {
            return cursor != size;
        }

        @Override
        public E next() {
            cursor = cursor +1;
            return (E) elementDate[cursor];
        }

        @Override
        public void remove() {
            ArrayList.this.remove(cursor);
        }
    }

    private void remove(int cursor) {

    }
}

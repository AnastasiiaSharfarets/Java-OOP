package model;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Object> {
    private MyArray array;
    private int size;
    private int position;

    public MyArrayIterator(MyArray array) {
        this.array = array;
        size = array.size();
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < 0;
    }

    @Override
    public Object next() {
//        Object temp = array.get(position++);
//        position++;
//        return temp;
        return array.get(position++);
    }
}


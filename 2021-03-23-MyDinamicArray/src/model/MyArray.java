package model;

import interfaces.IList;

import java.util.Arrays;
import java.util.Iterator;

public class MyArray implements IList {
    private static final int INITIAL_SIZE = 16;
    private Object[] array;
    private int size = 0;

    public MyArray(int capacity) {
        array = new Object[capacity];
    }

    public MyArray() {
        //  array = new Object[INITIAL_SIZE];
        this(INITIAL_SIZE);
    }

    //1
    @Override
    public boolean add(Object obj) {
        if (obj == null) return false;
        if (array.length == size)
            allocateArray();//"выделить" создает новый массив
        array[size++] = obj;
        return true;
    }

    private void allocateArray() {
       /* Object[] temp = new Object[array.length * 2];//увеличили длинну массива
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];//переносим элементы старого массива
        }
        array = temp;*/
        array = Arrays.copyOf(array, array.length * 2);

    }

    //2
    @Override
    public int size() {
        return size;
    }

    //3
    @Override
    public Object get(int index) {
        if (index < 0 || index >= size)
            return null;
        return array[index];
    }

    //4
    @Override
    public Object remove(int index) {
        //возвращает удаленный элемент массива
        if (index < 0 || index >= size)
            return null;
        Object temp = array[index];
        if (index < size - 1) {
//            for (int i = index; i < size - 1; i++) {
//                array[i] = array[i + 1];
//            }
            System.arraycopy(array, index + 1, array, index, size - index - 1);
        }
        array[size - 1] = null;
        size--;
        return temp;
    }

    //5
    @Override
    //*удаляет первый встреченный объект с головы(если их несколько), +null и нет объекта
    public boolean remove(Object obj) {
        if (obj == null)
            return false;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(obj)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    //6
    @Override
    //возвращает индекс первого встреченного с головы элемента, если такого эл-та нет, то возвращает -1
    public int indexOf(Object obj) {
        if (obj == null)
            return -1;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    //7
    @Override
    public int lastIndexOf(Object obj) {
        if (obj == null)
            return -1;
        //		int lastI = -1;
//		for(int i = 0; i < size; i++) {
//			if(array[i].equals(obj)) lastI = i;
//		}
//		return lastI;
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    //8
    @Override
    public boolean contains(Object obj) {
        if (obj == null)
            return false;
        for (int i = 0; i < size; i++) {
            if (array[i] == obj)
                return true;
        }
        return false;
    }

    //9
    @Override//возвращает массив актуальных объектов
    public Object[] toArray() {
        Object[] res = new Object[size];
//        for (int i = 0; i < size; i++) {
//            res[i] = array[i];
//        }
//        return res;
        System.arraycopy(array, 0, res, 0, size);
        return res;
    }

    @Override
    public void clear() {
//        for (int i = 0; i < size; i++) {
//            array[i] = null;
//        }
        Object[] temp = new Object[0];
        array = temp;
        size = 0;
    }

    @Override
    public Iterator<Object> iterator() {
//
        return new MyArrayIterator(this);
    }


}

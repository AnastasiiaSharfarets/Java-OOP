package model;

import iterators.MyStringAscendingIterator;

import java.util.Iterator;

public class MyString implements Iterable<Character>{
    char [] chars;

    public MyString(String str) {
        chars = str.toCharArray();
    }

    @Override
    public String toString() {
        return  new String(chars);
    }

    @Override
    public Iterator<Character> iterator(){
        return new MyStringAscendingIterator(chars);
    }

    public char[] getChars(){
        return chars;
    }
}

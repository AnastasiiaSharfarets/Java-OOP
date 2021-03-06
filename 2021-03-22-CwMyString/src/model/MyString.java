package model;

import iterators.MyStringIterator;

import java.util.Iterator;

public class MyString implements Iterable<Character>{
    private StringBuilder strB;

    public MyString(String str) {
        this.strB = new StringBuilder(str);
        //this.strB = new StringBuilder();
        //strB.append(str);
    }
    //CRUD
    public void addChar(char c){
        strB.append(c);
    }

    public void removeChar(char c){
        //int index = strB.indexOf(Character.toString(c));
        int index = strB.indexOf(Character.toString(c));
        strB.deleteCharAt(index);
    }

    @Override
    public String toString() {
        return strB.toString();
    }
    public StringBuilder getStrB(){
        return strB;
    }

   @Override
    public Iterator<Character> iterator(){
        return  new MyStringIterator(strB);
    }
}

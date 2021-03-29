package app;

import iterators.MyStringDescendingOperator;
import model.MyString;

import java.util.Iterator;

public class MyStringApp {
    public static void main(String[] args) {
        String str = "Hi, Berlin_14";
        MyString ms = new MyString(str);
        for (Character ch : ms) {
            System.out.println(ch + " ");
        }
        System.out.println();

        Iterator<Character> iterDesc = new MyStringDescendingOperator(ms.getChars());
        while (iterDesc.hasNext()) {
            System.out.println(iterDesc.next() + " ");
        }
        System.out.println();
    }
}

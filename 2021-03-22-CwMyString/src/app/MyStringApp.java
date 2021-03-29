package app;

import iterators.MyStringIterator;
import model.MyString;

import java.util.Iterator;

public class MyStringApp {
    public static void main(String[] args) {
        //							0123456789012345678901234
        MyString ms = new MyString("Two beer, or not two beer");
//								   "Two ber, or not two ber"
        System.out.println(ms);

        for (Character c : ms) {
            System.out.print(c + " ");
        }
        System.out.println();
//=====================================
        deleteChar(ms, 'e');
        System.out.println(ms);
    }

    public static void deleteChar(MyString ms, char ch) {
//		iterator -> size = 25, curPos = 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6
//		for(Character c : ms) {
//			if(c == ch) {
//				ms.removeChar(ch);
////				return;
//
//			}
//		}

        Iterator<Character> iter = new MyStringIterator(ms.getStrB());
        while (iter.hasNext()) {
            if (iter.next() == ch) iter.remove();
        }
    }
}

package iterators;

import java.util.Iterator;

public class MyStringDescendingOperator implements Iterator<Character> {
    char[] chars;
    int position;

    public MyStringDescendingOperator(char[] chars) {
        this.chars = chars;
        position = chars.length - 1;
    }

    @Override
    public boolean hasNext() {
        //	if(position>=0) return true;
        //return false;
        return position >= 0;
    }

    @Override
    public Character next() {
        return chars[position--];
    }
}

package iterators;

import java.util.Iterator;

public class MyStringAscendingIterator implements Iterator<Character> {
    char [] chars;
    int position;

    public MyStringAscendingIterator(char[] chars){
        this.chars = chars;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        //if(position<chars.length) return true;
        //return false;
        return position < chars.length;
    }

    @Override
    public Character next() {
        return chars[position++];
    }
}

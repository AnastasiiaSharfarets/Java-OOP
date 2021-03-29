package iterators;

import java.util.Iterator;

public class MyStringIterator implements Iterator<Character> {

    private StringBuilder strB;
    private int curPos;
    private int size;

    public MyStringIterator(StringBuilder strB){
        this.strB = strB;
        curPos = 0;
        size = strB.length();
    }

    @Override
    public boolean hasNext() {
        return curPos < size;
    }

    @Override
    public Character next() {
        /*Character current = strB.charAt(curPos);
        curPos++;
        return current;*/
        return strB.charAt(curPos++);
    }
    //01234
    //Hello

    @Override
    public void remove() {
        strB.deleteCharAt(--curPos);
        size--;
    }
}

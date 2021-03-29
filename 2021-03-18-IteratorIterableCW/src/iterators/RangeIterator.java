package iterators;

import item.Range;

import java.util.Iterator;

public class RangeIterator implements Iterator<Integer> {
    private Range range;
    private int position;

    public RangeIterator(Range range, int position) {
        this.range = range;
        position= range.getMin();
    }

    public RangeIterator(Range range) {
    }

    @Override
    public boolean hasNext() {
        if (position <= range.getMax())
            return true;
        return false;
    }

    @Override
    public Integer next() {
        Integer i = position;
       // position++;
      //  return i;
        return position++;
    }
}

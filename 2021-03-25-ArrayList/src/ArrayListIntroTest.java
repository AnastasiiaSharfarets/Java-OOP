import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ArrayListIntroTest {
    ArrayList<String> list = new ArrayList<String>();

    @Test
    public void isEmpty() {
        assertEquals(true, list.isEmpty());
        list.add("asd");
        assertEquals(false, list.isEmpty());
    }

    @Test
    public void listAdd() {
        assertEquals(0, list.size());
        list.add("2");
        assertEquals(1, list.size());
    }

    @Test
    public void listSet() {
        assertEquals("", "");
        list.add(0, "fgt");
        assertEquals("fgt", "fgt");
    }

    @Test
    public void listIndexOf() {
        assertEquals(0, 0);
        assertEquals(-1, list.indexOf(null));
        list.add(0, "2");
        assertEquals(0, list.indexOf("2"));
    }

    @Test
    public void listLastIndexOf() {
        assertEquals(0, 0);
        assertEquals(-1, list.lastIndexOf(null));
        ArrayList<String> temp = new ArrayList<String>();
        temp.add("1");
        temp.add("11");
        temp.add("111");
        assertEquals(2, temp.lastIndexOf("111"));
    }

    @Test
    public void listContains() {
        assertEquals(false, list.contains(""));
        assertEquals(false, list.contains(null));
        list.add("23");
        assertEquals(false, list.contains("2"));
        assertEquals(true, list.contains("23"));
    }

    @Test
    public void listAddAll() {
        ArrayList<String> temp = new ArrayList<String>();
        temp.add("1");
        temp.add("11");
        temp.add("111");
        list.addAll(temp);
        assertEquals(true, temp.addAll(list));
    }

    @Test
    public void listRemove() {
        ArrayList<String> temp = new ArrayList<String>();
        temp.add("1");
        temp.add("11");
        temp.add("111");
        list.remove("1");
        assertEquals("1", list.remove("1"));
    }

    @Test
    public void listRemoveAll() {
        ArrayList<String> temp = new ArrayList<String>();
        temp.add("1");
        temp.add("11");
        temp.add("111");
        list.removeAll(temp);
        assertEquals(false, list.removeAll(temp));

    }

    @Test
    public void listClear() {
        assertEquals(0, list.size());
    }
}
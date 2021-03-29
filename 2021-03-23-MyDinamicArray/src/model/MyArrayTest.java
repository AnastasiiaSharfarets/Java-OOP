package model;

import interfaces.IList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayTest {
    IList numbers;
    IList strings;
    Integer[] arNumbers = {10, 7, 11, -2, 13, 10, 2000};
    String[] arStrings = {"abc", "lmn", "fg", "abc"};

    @Before
    public void setUp() throws Exception {
        numbers = new MyArray();
        for (Integer number : arNumbers) {
            numbers.add(number);
        }
        System.out.println(numbers.size());
        strings = new MyArray();
        for (String string : arStrings) {
            strings.add(string);
        }
    }

    @Test
    public void testSetUp() {
        int sizeNumbers = numbers.size();
        int sizeStrings = strings.size();
        assertEquals(arNumbers.length, sizeNumbers);
        assertEquals(arStrings.length, sizeStrings);
        for (int i = 0; i < sizeNumbers; i++) {
            assertEquals(arNumbers[i], numbers.get(i));
        }
        for (int i = 0; i < sizeStrings; i++) {
            assertEquals(arStrings[i], strings.get(i));
        }
    }

    //4
    @Test
    public void testRemoveAtIndex() {
        //10, 7, 11, -2, 13, 10, 2000
        Integer[] aNumbers_2 = {10, 7, 11, 13, 10, 2000};
        assertEquals(null, numbers.remove(7));
        assertEquals(null, numbers.remove(17));//вышел за пределы актуальной части
        Integer res = (Integer) numbers.remove(3);
        assertEquals(-2, (int) res);
        assertEquals(arNumbers.length - 1, numbers.size());
        for (int i = 0; i < numbers.size(); i++) {
            assertNotEquals(-2, numbers.get(i));
        }

    }

    //1,2
    @Test
    public void testAddObject() {
        assertEquals(arNumbers.length, numbers.size());
        for (int i = 0; i < numbers.size(); i++) {
            assertEquals(arNumbers[i], numbers.get(i));
        }
    }

    //3
    @Test
    public void testGetObject() {
        for (int i = 0; i < numbers.size(); i++) {
            assertEquals(arNumbers[i], numbers.get(i));

        }

    }

    //5
    @Test
    public void testRemoveObject() {
        assertTrue(numbers.remove((Integer) 10));
        assertTrue(numbers.remove((Integer) (-2)));
        //assertEquals(arNumbers.length - 1, numbers.size());
        assertEquals(7, numbers.get(0));
        assertEquals(3, numbers.indexOf(10));
        assertFalse(numbers.remove((Integer) 101));
        assertFalse(numbers.remove(null));

        assertEquals(true, strings.remove("lmn"));
        assertEquals(false, strings.remove(null));
    }

    //6
    @Test
    public void testIndexOf() {
        assertEquals(0, numbers.indexOf(10));
        assertEquals(-1, numbers.indexOf(null));
        assertEquals(-1, numbers.indexOf(76));

        assertEquals(-1, strings.indexOf("he"));
        assertNotEquals(3, strings.indexOf("abc"));
    }


    //7
    @Test
    public void testLastIndexOf() {
    //{10, 7, 11, -2, 13, 10, 2000};
   //{"abc", "lmn", "fg", "abc"};
        assertEquals(6, numbers.lastIndexOf(2000));
        assertEquals(2, numbers.lastIndexOf(11));
        assertEquals(-1, numbers.lastIndexOf(null));
        assertEquals(-1, numbers.lastIndexOf(76));

        assertEquals(-1, strings.lastIndexOf(null));
        assertEquals(1, strings.lastIndexOf("lmn"));
        assertEquals(strings.size() - 1, strings.lastIndexOf("abc"));
    }

    //8
    @Test
    public void testContains() {
        assertEquals(true, numbers.contains(11));
        assertEquals(false, numbers.contains(null));
        assertEquals(false, numbers.contains(76));
        assertEquals(false, strings.contains("he"));
        assertEquals(true, strings.contains("abc"));

    }

    @Test
    public void testToArray() {
        Object[] exNumbers = { 10, 7, 11, -2, 13, 10, 2000 };
        Object[] exStrings = { "abc", "lmn", "fg", "abc" };
        assertArrayEquals(exNumbers, numbers.toArray());
        assertArrayEquals(exStrings, strings.toArray());
    }

    @Test
    public void testClear() {
        numbers.clear();
        assertEquals(0,numbers.size());
        strings.clear();
        assertEquals(0, strings.size());
    }
    @Test
    public void testIterable() {
//Integer[] arNumbers = { 10, 7, 11, -2, 13, 10, 2000 };
        int index = 0;
        for(Object o : numbers) {
            assertEquals(arNumbers[index++], o);
        }
        assertEquals(arNumbers.length, index);
    }
}
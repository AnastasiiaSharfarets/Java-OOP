package model;

import iterators.MyStringAscendingIterator;
import iterators.MyStringDescendingOperator;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyStringTest {
    String str = "Hello";
    MyString ms = new MyString(str);
    char[] expectedAscChar = {'H', 'e', 'l', 'l', 'p'};
    char[] expectedDescChar = {'o', 'l', 'l', 'e', 'H'};

    @Test
    public void testIterable() {
        //assertEquals(exAscChar.length, ms.getChars().length);
        int index = 0;
        for (char currentCharacter : ms) {
            //System.out.println(currentCharacter;
            assertEquals(expectedAscChar[index], currentCharacter);
            index++;
        }
        assertEquals(expectedAscChar.length, index);//проверка равной длины
    }

    @Test
    public void testAscendingIterator() {
        MyStringAscendingIterator ascIter = new MyStringAscendingIterator(ms.getChars());
        int index = 0;
        while (ascIter.hasNext()) {
            assertEquals(expectedAscChar[index++], (char) ascIter.next());
        }
        assertEquals(expectedAscChar.length, index);
    }

    @Test
    public void testDescIterator() {
        MyStringDescendingOperator descIter = new MyStringDescendingOperator(ms.getChars());
        int index = 0;
        while (descIter.hasNext()) {
            assertEquals(expectedDescChar[index++], (char) descIter.next());
        }
        assertEquals(expectedDescChar.length, index);
    }

    @Test
    public void testIterable_EmptyString() {
        //тест проверяет количество итераций.
        MyString str = new MyString("");
        int index = 0;
        for (char currentChar : str) {
            index++;
        }
        assertEquals(0, index);
    }


}
package test;

import model.MyString;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyStringTest {
    MyString ms = new MyString("Hello");
    char[] ex = {'H', 'e', 'l', 'l', 'o'};

   @Test
    public void test(){
        assertEquals(ms.getStrB().length(), ex.length);
        int count = 0;
        for (char c: ms){
            assertEquals(ex[count++], c);
        }
    }
}

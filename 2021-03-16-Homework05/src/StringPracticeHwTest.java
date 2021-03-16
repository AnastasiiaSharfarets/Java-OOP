import org.junit.Test;

import static org.junit.Assert.*;

public class StringPracticeHwTest {

    @Test
    public void testGetCountWords1() {
        String sent = "Two beers or not two beers";
        String word = "beer";

        int result = StringPracticeHw.getCountWords(sent, word);
        int expected = 2;

        assertEquals(expected, result);
    }

    @Test
    public void testGetCountWords2() {
        assertEquals(Integer.valueOf(2), StringPracticeHw.getCountWords("Two beers or not two beers", "beer"));
        assertNotEquals(Integer.valueOf(1), StringPracticeHw.getCountWords("", "beer"));
    }

    @Test
    public void testGetStrReverse(){
        assertEquals("olleh", StringPracticeHw.getStrReverse("hello"));
        assertNotEquals("аргентина манит негрА", StringPracticeHw.getStrReverse("Аргентина манит негра"));
    }

    @Test
    public void stringReverse(){
        assertEquals("азор", StringPracticeHw.stringReverse("роза"));
        assertNotEquals("амаМ", StringPracticeHw.stringReverse("мама"));
    }

    @Test
    public void reverseString(){
        assertEquals("ялО", StringPracticeHw.reverseString("Оля"));
        assertNotEquals("яло", StringPracticeHw.reverseString("Оля"));
    }

}
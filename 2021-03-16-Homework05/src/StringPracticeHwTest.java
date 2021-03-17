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
    @Test
    public void testGetStringReverse() {
        assertEquals("amaM", StringPracticeHw.reverseString("Mama"));
        assertEquals("amam", StringPracticeHw.reverseString("mama"));
        assertEquals("	amaM", StringPracticeHw.reverseString("Mama	"));
        //===========================Negative==========================
        assertNull(StringPracticeHw.reverseString(""));
        assertNull(StringPracticeHw.reverseString("			"));
        assertNull(StringPracticeHw.reverseString(null));
    }

    @Test
    public void testGetCountWords() {
        String input = "Two beer or not two beer Sheiks Beer";
        String word = "beer";
        assertEquals(2,(int)StringPracticeHw.getCountWords(input, word));
        assertEquals(1, (int)StringPracticeHw.getCountWords(input, "Beer"));
        assertEquals(0,(int)StringPracticeHw.getCountWords(input, "Hello"));
        assertEquals(2, (int)StringPracticeHw.getCountWords(input, " beer"));
        //==============================================================
        assertEquals(null, StringPracticeHw.getCountWords(input, null));
        assertEquals(null, StringPracticeHw.getCountWords(null, "beer"));
        assertEquals(null, StringPracticeHw.getCountWords(null, null));
        assertEquals(null, StringPracticeHw.getCountWords("", "beer"));
        assertEquals(null, StringPracticeHw.getCountWords(input, ""));
        assertEquals(null, StringPracticeHw.getCountWords("", ""));
        assertEquals(null, StringPracticeHw.getCountWords("		", "beer"));
        assertEquals(null, StringPracticeHw.getCountWords(input, "    "));
        assertEquals(null, StringPracticeHw.getCountWords("	", "		"));
    }


}
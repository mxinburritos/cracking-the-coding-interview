package Ch01_Arrays_and_Strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Q01_09_String_Rotation_Test {

    private Q01_09_String_Rotation s = new Q01_09_String_Rotation();

    @Test
    public void withEmpty() {
        assertTrue(s.rotated("", ""));
    }

    @Test
    public void withSameWord() {
        assertTrue(s.rotated("hello", "hello"));
    }

    @Test
    public void withRotated() {
        assertTrue(s.rotated("hello", "llohe"));
    }

    @Test
    public void withSubstring_ButDifferentSize() {
        assertFalse(s.rotated("hello", "llo"));
    }

    @Test
    public void withDifferentWords() {
        assertFalse(s.rotated("hello", "world"));
    }

    @Test
    public void withNotRotated() {
        assertFalse(s.rotated("hello", "oehll"));
    }

}
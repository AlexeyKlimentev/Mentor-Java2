package org.example;
import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void testReversString() {
        assertEquals("t@eb eht av$J!123", Main.reverseLetters("J@va the be$t!123"));
    }

    @Test
    void testEmptyString() {
        assertEquals("", Main.reverseLetters(""));
    }

    @Test
    void testOneLetter() {
        assertEquals("a", Main.reverseLetters("a"));
    }

    @Test
    void testOnlySpecialChars() {
        assertEquals("!@# 123", Main.reverseLetters("!@# 123"));
    }

    @Test
    void testOnlyLetters() {
        assertEquals("dcba", Main.reverseLetters("abcd"));
    }

    @Test
    void testNonLettersAtEdgesAndMiddle () {
        assertEquals("t@eb eht av$J!123", Main.reverseLetters("J@va the be$t!123"));
    }

    @Test
    void testRegister () {
        assertEquals("eDcBa", Main.reverseLetters("aBcDe "));
    }

}
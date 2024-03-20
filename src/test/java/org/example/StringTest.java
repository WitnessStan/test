package org.example;

import org.example.string.RemoveConsecutiveCharactersStrategy;
import org.example.string.ReplaceConsecutiveCharactersStrategy;
import org.example.string.StringProcessor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTest {

    @Test
    public void removeConsecutiveCharacters() {
        StringProcessor processor1 = new StringProcessor(new RemoveConsecutiveCharactersStrategy());
        assertEquals("aabaad", processor1.process("aabcccbbbaad"));
        assertEquals("", processor1.process(""));
        assertEquals("abc", processor1.process("abc"));
        assertEquals("aabbcc", processor1.process("aabbcc"));
        assertEquals("d", processor1.process("aabcccbbad"));
        assertEquals("aabad", processor1.process("aabcccbbbad"));
    }

    @Test
    public void replaceConsecutiveDuplicates() {
        StringProcessor processor2 = new StringProcessor(new ReplaceConsecutiveCharactersStrategy());
        assertEquals("d", processor2.process("abcccbad"));
        assertEquals("bad", processor2.process("aabcccbbad"));
        assertEquals("bbad", processor2.process("aabcccbbbad"));
        assertEquals("bbaad", processor2.process("aabcccbbbaad"));
        assertEquals("", processor2.process(""));
        assertEquals("abc", processor2.process("abc"));
        assertEquals("aabbcc", processor2.process("aabbcc"));
        assertEquals("aabbad", processor2.process("abbbbcccad"));
        assertEquals("abcc", processor2.process("abcddd"));
        assertEquals("a", processor2.process("aaaa"));
    }
}
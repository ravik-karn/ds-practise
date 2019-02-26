package com.ravi.ds.array;

import com.ravi.ds.array.UniqueCharInString;
import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueCharInStringTest {
    @Test
    public void shouldIdentifyIfStringHasAllUniqueChars() {
        UniqueCharInString str1 = new UniqueCharInString("banglore");
        assertTrue(str1.isUnique());

        UniqueCharInString str2 = new UniqueCharInString("bombay");
        assertFalse(str2.isUnique());
    }
}

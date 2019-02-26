package com.ravi.ds.array;

import com.ravi.ds.array.URLify;
import org.junit.Test;

import static org.junit.Assert.*;

public class URLifyTest {
    @Test
    public void shouldReplaceSpaceChars() {
        URLify url = new URLify("My John Smith     ".toCharArray(), 13);
        url.encode();
        assertEquals("", url.toString().toString());
    }
}

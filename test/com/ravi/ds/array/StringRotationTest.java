package com.ravi.ds.array;

import com.ravi.ds.array.StringRotation;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringRotationTest {
    @Test
    public void shouldCheckIfStringsAreRotated() {
        StringRotation stringRotation = new StringRotation("waterbottle", "erbottlewat");
        assertTrue(stringRotation.isRotated());
        stringRotation = new StringRotation("test", "sets");
        assertFalse(stringRotation.isRotated());
    }
}

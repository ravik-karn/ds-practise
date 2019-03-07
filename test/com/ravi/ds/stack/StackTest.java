package com.ravi.ds.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void shouldTestBasicStackOperations() {
        Stack stack = new Stack(4);
        assertTrue(stack.isEmpty());
        stack.push(4);
        stack.push(3);
        assertFalse(stack.isEmpty());
    }
}

package com.ravi.ds.array;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParanthesisCheckerTest {
    @Test
    public void shouldCheckParanthesis() {
        ParanthesisChecker checker = new ParanthesisChecker("{}{(}))}");
        assertFalse(checker.isMatch());

        ParanthesisChecker checker1 = new ParanthesisChecker("{}{()}");
        assertTrue(checker1.isMatch());
    }
}

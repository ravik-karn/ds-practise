package com.ravi.ds.array;

import com.ravi.ds.array.Permutation;
import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationTest {
    @Test
    public void shouldCheckIfTwoStringsArepermutaion() {
        Permutation test = new Permutation("god", "dog");
        assertTrue(test.isPermutaion());
    }
}

package com.ravi.ds.array;

import com.ravi.ds.array.PlaindromePermutation;
import org.junit.Test;

import static org.junit.Assert.*;

public class PaliandromePermutationTest {
    @Test
    public void shouldCheckIfStrinIsAPermutationOfAPalindrome() {
        PlaindromePermutation str = new PlaindromePermutation("taco act");
        assertTrue(str.isPermutaionOfPlaindrome());
    }
}

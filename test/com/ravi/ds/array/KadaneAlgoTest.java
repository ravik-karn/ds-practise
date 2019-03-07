package com.ravi.ds.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class KadaneAlgoTest {
    @Test
    public void shouldFindMaxSumOfSubArray() {
        KadaneAlgo algo = new KadaneAlgo(new int[]{-2, -3, 4, -1, -2, 1, 5, -3});
        assertEquals(7, algo.maxSum());
    }
}

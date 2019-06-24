package com.ravi.ds.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class KthLargestTest {
    @Test
    public void shouldFindKthLargest() {
        KthLargest algo = new KthLargest(new int[]{12, 14, 4, 11, 12, 1, 5, 13});
        assertEquals(12, algo.find(3));
    }
}

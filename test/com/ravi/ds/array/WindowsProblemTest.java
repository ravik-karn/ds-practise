package com.ravi.ds.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WindowsProblemTest {
    @Test
    public void shouldFindSubArrayWithGivenSum() {
        WindowsProblem algo = new WindowsProblem(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        assertEquals("1 5", algo.subArrayWithSum(15));

        WindowsProblem algo1 = new WindowsProblem(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        assertEquals("-1", algo1.subArrayWithSum(41));
    }
}

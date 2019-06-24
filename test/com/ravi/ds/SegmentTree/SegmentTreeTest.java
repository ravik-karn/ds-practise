package com.ravi.ds.SegmentTree;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SegmentTreeTest {
    @Test
    public void shouldConvertArrayToSegmentTree() {
        int[] originalArray = {6, 3, 4, 2, 10, 1};
        SegmentTree segmentTree = new SegmentTree(originalArray);
        assertEquals(Arrays.toString(new int[]{26, 13, 13, 9, 4, 12, 1, 6, 3, 0, 0, 2, 10, 0, 0}), segmentTree.toString());
    }

    @Test
    public void shouldConvertArrayToSegmentTreeWhenArrayIsEmpty() {
        int[] originalArray = {};
        SegmentTree segmentTree = new SegmentTree(originalArray);
        assertEquals(Arrays.toString(new int[]{}), segmentTree.toString());
    }

    @Test
    public void shouldConvertArrayToSegmentTreeWhenArrayOfOddSize() {
        int[] originalArray = {1, 2, 3};
        SegmentTree segmentTree = new SegmentTree(originalArray);
        assertEquals(Arrays.toString(new int[]{6, 3, 3, 1, 2, 0, 0, 0}), segmentTree.toString());
    }

    @Test
    public void shouldConvertArrayToSegmentTreeWhenArrayOfEvenSize() {
        int[] originalArray = {1, 2, 3, 4};
        SegmentTree segmentTree = new SegmentTree(originalArray);
        assertEquals(Arrays.toString(new int[]{10, 3, 7, 1, 2, 3, 4, 0}), segmentTree.toString());
    }

    @Test
    public void shouldGiveSumOfAllTheElementFromLtoR() {
        int[] originalArray = {6, 3, 4, 2, 10, 1};
        SegmentTree segmentTree = new SegmentTree(originalArray);
        assertEquals(19, segmentTree.sum(1, 4));
        assertEquals(3, segmentTree.sum(1, 1));
        assertEquals(0, segmentTree.sum(-1, 1));
        assertEquals(0, segmentTree.sum(0, 10));
        assertEquals(0, segmentTree.sum(3, 1));
    }
}

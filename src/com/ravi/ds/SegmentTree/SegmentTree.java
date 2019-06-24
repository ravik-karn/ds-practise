package com.ravi.ds.SegmentTree;

import java.util.Arrays;

public class SegmentTree {
    private int[] originalArray;
    private int[] segmentArray;

    public SegmentTree(int[] originalArray) {
        this.originalArray = originalArray;
        this.toTree();
    }

    private void toTree() {
        if (originalArray.length == 0) {
            this.segmentArray = new int[0];
            return;
        }
        int height = (int) Math.ceil(Math.log(originalArray.length) / Math.log(2));
        int size = (int) Math.pow(height + 1, 2) - 1;
        this.segmentArray = new int[size];
        constructSegmentTree(0, originalArray.length - 1, 0);
    }

    public int sum(int l, int r) {
        if (l < 0 || r > originalArray.length) {
            return 0;
        }
        return getSum(0, originalArray.length - 1, l, r, 0);
    }

    private int getSum(int start, int end, int l, int r, int index) {
        if (l <= start && r >= end) {
            return segmentArray[index];
        }
        if (end < l || start > r) {
            return 0;
        }
        int mid = (start + end) / 2;
        return getSum(start, mid, l, r, 2 * index + 1) + getSum(mid + 1, end, l, r, 2 * index + 2);
    }

    @Override
    public String toString() {
        return Arrays.toString(segmentArray);
    }

    private int constructSegmentTree(int l, int r, int index) {
        if (l == r) {
            segmentArray[index] = originalArray[l];
            return originalArray[l];
        }

        int mid = (l + r) / 2;
        segmentArray[index] = constructSegmentTree(l, mid, index * 2 + 1) + constructSegmentTree(mid + 1, r, index * 2 + 2);
        return segmentArray[index];
    }

}

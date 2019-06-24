package com.ravi.ds.array;

import java.util.List;

public class RotatedArray {
    private List<Integer> array;

    public RotatedArray(List<Integer> array) {
        this.array = array;
    }

    public int findElement(int element) {
        int pivot = findPivot();
        int index1 = binarySearch(array, 0, pivot - 1, element);
        int index2 = binarySearch(array, pivot, array.size(), element);
        return index1 != -1 ? index1 : index2;
    }

    private int binarySearch(List<Integer> array, int lo, int hi, int element) {
        int mid = (lo + hi) / 2;
        if (array.get(mid) == element) return mid;
            return -1;
    }

    private int findPivot() {
        int min = array.get(0), minIndex = 0;
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < min) {
                min = array.get(i);
                minIndex = i;
            }
        }
        return minIndex;
    }
}

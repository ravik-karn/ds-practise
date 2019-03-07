package com.ravi.ds.array;

public class KadaneAlgo {
    private int[] arr;

    public KadaneAlgo(int[] arr) {
        this.arr = arr;
    }

    public int maxSum() {
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}

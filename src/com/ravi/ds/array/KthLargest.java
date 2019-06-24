package com.ravi.ds.array;

import java.util.PriorityQueue;

public class KthLargest {
    private int[] arr;

    public KthLargest(int[] arr) {
        this.arr = arr;
    }

    public int find(int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>((x, y) -> y - x);
        for (int a : arr) {
            q.add(a);
        }
        while (k-- > 1) {
            q.remove();
        }
        return q.peek();
    }
}

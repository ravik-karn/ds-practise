package com.ravi.ds.array;

public class WindowsProblem {
    private int[] arr;

    public WindowsProblem(int[] arr) {
        this.arr = arr;
    }

    public String subArrayWithSum(int sum) {
        int start = 0;
        int end = 0;
        int tempSum = 0;

        for (int i : arr) {
            tempSum += i;
            end++;

            if (tempSum > sum) {
                while (start <= end && tempSum > sum) {
                    tempSum -= arr[start];
                    start++;
                }
            }
            if (tempSum == sum) {
                return start + 1 + " " + end;
            }

        }

        return "-1";
    }
}

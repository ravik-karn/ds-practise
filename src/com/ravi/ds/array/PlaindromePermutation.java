package com.ravi.ds.array;

public class PlaindromePermutation {
    private String str;

    public PlaindromePermutation(String str) {
        this.str = str;
    }

    public boolean isPermutaionOfPlaindrome() {
        int[] hash = new int[128];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                hash[str.charAt(i)]++;
            }
        }
        int c = 0;
        for (int elem : hash) {
            if (elem % 2 != 0) {
                c++;
            }
            if (c > 1) {
                return false;
            }
        }
        return true;
    }
}

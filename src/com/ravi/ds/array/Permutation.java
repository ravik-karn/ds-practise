package com.ravi.ds.array;

public class Permutation {
    private String str1, str2;

    public Permutation(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }


    public boolean isPermutaion() {
        if (str1.length() != str2.length()) return false;

        int[] hash = new int[128];
        for (int i = 0; i < str1.length(); i++) {
            int val = str1.charAt(i);
            hash[val]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            int val = str2.charAt(i);
            hash[val]--;
            if (hash[i] < 0) {
                return false;
            }
        }

        return true;
    }
}

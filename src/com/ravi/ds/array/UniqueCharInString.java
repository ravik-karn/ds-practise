package com.ravi.ds.array;

public class UniqueCharInString {
    private String str;

    public UniqueCharInString(String str) {
        this.str = str;
    }


    public boolean isUnique() {
        if (str.length() > 128) return false;

        int[] hash = new int[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (hash[val] == 1) {
                return false;
            }
            hash[val]++;
        }

        return true;
    }
}

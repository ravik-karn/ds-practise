package com.ravi.ds.array;

public class StringRotation {
    private String str1;
    private String str2;

    public StringRotation(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public boolean isRotated() {
        if (str1.length() != str2.length()) return false;
        int rotationIndex = 0;
        for (; rotationIndex < str2.length(); rotationIndex++)
            if (str1.charAt(0) == str2.charAt(rotationIndex)) break;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt((i + rotationIndex) % str2.length())) return false;
        }
        return true;
    }
}

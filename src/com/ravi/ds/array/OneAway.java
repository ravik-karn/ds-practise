package com.ravi.ds.array;

public class OneAway {
    private final String first;
    private final String second;

    public OneAway(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public boolean isAway() {
        switch (first.length() - second.length()) {
            case -1:
                return isInsertAway(first, second);
            case 0:
                return isOneRelpaceAway();
            case 1:
                return isInsertAway(second, first);
            default:
                return false;
        }
    }

    private boolean isInsertAway(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;
        while (index2 < s2.length() && index1 < s1.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    private boolean isOneRelpaceAway() {
        boolean foundDiff = false;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                if (foundDiff) {
                    return false;
                }
                foundDiff = true;
            }
        }
        return true;
    }
}

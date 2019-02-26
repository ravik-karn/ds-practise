package com.ravi.ds.array;

public class StringCompressor {
    private String original;

    public StringCompressor(String original) {
        this.original = original;
    }

    public String Compress() {
        int i = 0;
        String compressed = "";
        while (i < original.length()) {
            compressed += original.charAt(i);

            int c = 0;
            while (i + c < original.length() && original.charAt(i) == original.charAt(i + c)) {
                c++;
            }

            compressed += c;
            i += c;
        }

        return compressed;
    }
}

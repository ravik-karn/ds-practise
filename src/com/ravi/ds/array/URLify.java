package com.ravi.ds.array;

import java.util.Arrays;

public class URLify {
    private char[] url;
    private int trueLength;

    public URLify(char[] url, int trueLength) {
        this.url = url;
        this.trueLength = trueLength;
    }

    public void encode() {
        int spaceCount = 0, index, i = 0;
        for (i = 0; i < trueLength; i++) {
            if (url[i] == ' ') {
                spaceCount++;
            }
        }
        index = trueLength + spaceCount * 2;
        if (trueLength < url.length) url[trueLength] = '\0';
        for (i = trueLength - 1; i >= 0; i--) {
            if (url[i] == ' ') {
                url[index - 1] = '0';
                url[index - 2] = '2';
                url[index - 3] = '%';
                index = index - 3;
            } else {
                url[index - 1] = url[i];
            }
        }
    }

    @Override
    public String toString() {
        return url.toString();
    }
}

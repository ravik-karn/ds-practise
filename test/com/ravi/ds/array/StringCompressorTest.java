package com.ravi.ds.array;

import com.ravi.ds.array.StringCompressor;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCompressorTest {
    @Test
    public void shouldCompress() {
        StringCompressor compressor = new StringCompressor("aadddffffhhh");
        assertEquals("a2d3f4h3", compressor.Compress());
    }
}

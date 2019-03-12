package com.ravi.ds.heap;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HeapTest {
    @Test
    public void shouldInsert() {
        Heap heap = new Heap(10);

        heap.insert(10);
        heap.insert(1);
        heap.insert(8);
        heap.insert(6);
        heap.insert(4);
        heap.insert(2);

        assertArrayEquals(new Object[]{10, 6, 8, 1, 4, 2}, heap.getElements());
    }

    @Test
    public void shouldFindMax() {
        Heap heap = new Heap(10);

        heap.insert(1);
        assertEquals(1, heap.max());
        heap.insert(6);
        assertEquals(6, heap.max());
        heap.insert(8);
        assertEquals(8, heap.max());
        heap.insert(4);
        assertEquals(8, heap.max());
        heap.insert(2);
        assertEquals(8, heap.max());
    }

    @Test
    public void shouldDeleteMax() {
        Heap heap = new Heap(10);

        heap.insert(10);
        heap.insert(1);
        heap.insert(6);
        heap.insert(8);
        heap.insert(4);
        heap.insert(2);

        heap.deleteMax();
        assertArrayEquals(new Object[]{8, 6, 1, 4, 2}, heap.getElements());

        heap.deleteMax();
        assertArrayEquals(new Object[]{6, 1, 4, 2}, heap.getElements());

        heap.deleteMax();
        assertArrayEquals(new Object[]{4, 1, 2}, heap.getElements());
    }
}

package com.ravi.ds.linkedlist;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class AddLinkedListTest {
    @Test
    public void addLL() {
        LinkedList l1 = new LinkedList();
        l1.addAll(Arrays.asList(1, 1, 2, 3));

        LinkedList l2 = new LinkedList();
        l2.addAll(Arrays.asList(1, 1, 9, 2, 9));

        LinkedList res = new AddLinkedList().addTwoNumbers(l1, l2);
        assertEquals("[1, 3, 0, 5, 2]", res.toString());
    }
}

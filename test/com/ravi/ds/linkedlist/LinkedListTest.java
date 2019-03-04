package com.ravi.ds.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void shouldInsertInLinkedList() {
        LinkedList list = new LinkedList();
        list.insert(2);
        list.insert(1);

        assertEquals("12", list.print());
    }

    @Test
    public void shouldRemoveDuplicateInLinkedList() {
        LinkedList list = new LinkedList();
        list.insert(2);
        list.insert(1);
        list.insert(2);
        list.removeDuplicate();

        assertEquals("21", list.print());
    }

    @Test
    public void shouldKthToLastFromLinkedList() {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        assertEquals(3, list.kthFromLast(3));
    }
}

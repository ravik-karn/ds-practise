package com.ravi.ds.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void shouldDeleteMiddleFromLinkedList() {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.deleteMiddle();

        assertEquals("5421", list.print());
    }

    @Test
    public void shouldPartitionLinkedList() {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(10);
        list.insert(8);
        list.insert(5);
        list.insert(3);

        list.partition(5);

        assertEquals("1235810", list.print());
    }

    @Test
    public void shouldReverseLinkedList() {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);

        assertEquals("321", list.print());
        assertEquals("123", list.reverse().print());
    }

    @Test
    public void shouldCheckIfEqualLinkedList() {
        LinkedList list1 = new LinkedList();
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        LinkedList list2 = new LinkedList();
        list2.insert(1);
        list2.insert(2);
        list2.insert(3);

        assertTrue(list1.isEqual(list2));
    }

    @Test
    public void shouldCheckIfLinkedListIsPalindrome() {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(0);
        list.insert(2);
        list.insert(1);

        assertTrue(list.isPalindrome());
    }
}

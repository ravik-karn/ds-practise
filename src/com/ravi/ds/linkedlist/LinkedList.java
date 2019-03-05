package com.ravi.ds.linkedlist;

import java.util.HashSet;

public class LinkedList {
    private Node root;

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedList() {
        this(null);
    }

    public LinkedList(Node root) {
        this.root = root;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = root;
        root = newNode;
    }

    public void removeDuplicate() {
        HashSet<Integer> set = new HashSet<>();
        Node curr = root;
        Node prev = null;
        while (curr != null) {
            if (set.contains(curr.data)) {
                prev.next = curr.next;
            } else {
                set.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }
    }

    public String print() {
        Node curr = root;
        StringBuilder builder = new StringBuilder();
        while (curr != null) {
            builder.append(curr.data);
            curr = curr.next;
        }
        return builder.toString();
    }

    public int kthFromLast(int k) {
        Node curr = root;
        Node prev = root;
        while (k-- > 0) {
            curr = curr.next;
        }

        while (curr != null) {
            curr = curr.next;
            prev = prev.next;
        }

        return prev.data;
    }

    public void deleteMiddle() {
        Node fastPointer = root;
        Node slowPointer = root;
        Node prev = null;

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            prev = slowPointer;
            slowPointer = slowPointer.next;
        }

        if (prev != null && prev.next != null) {
            prev.next = prev.next.next;
        }
    }

    public void partition(int num) {
        Node curr = root;
        Node head = root;
        Node tail = root;

        while (curr != null) {
            Node next = curr.next;
            if (curr.data >= num) {
                tail.next = curr;
                tail = curr;
            } else {
                curr.next = head;
                head = curr;
            }
            curr = next;
        }
        tail.next = null;
        root = head;
    }

    public LinkedList reverse() {
        Node curr = root;
        Node head = null;

        while (curr != null) {
            Node newNode = new Node(curr.data);
            newNode.next = head;
            head = newNode;
            curr = curr.next;
        }

        return new LinkedList(head);
    }

    public boolean isEqual(LinkedList other) {
        Node curr1 = root;
        Node curr2 = other.root;

        while (curr1 != null && curr2 != null){
            if(curr1.data != curr2.data) return false;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return curr1 == null && curr2 == null;
    }

    public boolean isPalindrome() {
        return isEqual(reverse());
    }
}

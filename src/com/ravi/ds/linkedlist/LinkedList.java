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
        this.root = null;
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
}

package com.ravi.ds.linkedlist;

import java.util.LinkedList;
import java.util.Stack;

public class AddLinkedList {
    public LinkedList addTwoNumbers(LinkedList l1, LinkedList l2) {
        LinkedList res = new LinkedList();
        Stack s1 = new Stack<Integer>();
        Stack s2 = new Stack<Integer>();
        while (!l1.isEmpty()) {
            s1.push(l1.element());
            l1.removeFirst();
        }
        while (!l2.isEmpty()) {
            s2.push(l2.element());
            l2.removeFirst();
        }
        int carry = 0;
        while (!s1.isEmpty() && !s2.isEmpty()) {
            int val1 = (Integer) s1.pop();
            int val2 = (Integer) s2.pop();
            res.addFirst((val1 + val2 + carry) % 10);
            carry = (val1 + val2 + carry) / 10;
        }
        while (!s1.isEmpty()) {
            int val1 = (Integer) s1.pop();
            res.addFirst((val1 + carry) % 10);
            carry = (val1 + carry) / 10;
        }
        while (!s2.isEmpty()) {
            int val2 = (Integer) s2.pop();
            res.addFirst((val2 + carry) % 10);
            carry = (val2 + carry) / 10;
        }
        if (carry != 0) {
            res.addFirst(carry);
        }
        return res;
    }
}

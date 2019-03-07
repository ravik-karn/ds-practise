package com.ravi.ds.stack;

public class Stack {
    private int top;
    private int size;
    private int[] elements;

    public Stack(int size) {
        this.top = -1;
        this.size = size;
        elements = new int[size];
    }

    public void push(int elem) {
        if (!isFull()) {
            elements[++top] = elem;
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return elements[top--];
        }
        return -1;
    }

    public boolean isFull() {
        return top == size;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

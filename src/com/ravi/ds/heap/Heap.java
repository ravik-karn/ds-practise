package com.ravi.ds.heap;

import java.util.ArrayList;

public class Heap {
    private ArrayList<Integer> elements;

    public Heap(int size) {
        this.elements = new ArrayList<>(size);
    }

    public void insert(int element) {
        elements.add(element);

        int current = elements.size() - 1;
        while (elements.get(current) > elements.get(parent(current))) {
            swapElementsAtPosition(current, parent(current));
            current = parent(current);
        }
    }

    public int max() {
        return elements.get(0);
    }

    public void deleteMax() {
        elements.set(0, elements.get(elements.size() - 1));
        elements.remove(elements.get(elements.size() - 1));
        heapify(0);
    }

    private void heapify(int position) {
        if (isLeaf(position))
            return;

        if (elements.get(position) < elements.get(leftChild(position)) ||
                elements.get(position) < elements.get(rightChild(position))) {

            if (elements.get(leftChild(position)) > elements.get(rightChild(position))) {
                swapElementsAtPosition(position, leftChild(position));
                heapify(leftChild(position));
            } else {
                swapElementsAtPosition(position, rightChild(position));
                heapify(rightChild(position));
            }
        }
    }

    private int parent(int current) {
        return (current - 1) / 2;
    }

    private int leftChild(int position) {
        return (2 * position) + 1;
    }

    private int rightChild(int position) {
        return (2 * position) + 2;
    }

    private boolean isLeaf(int position) {
        return position > elements.size() / 2 - 1;
    }

    private void swapElementsAtPosition(int a, int b) {
        int temp = elements.get(a);
        elements.set(a, elements.get(b));
        elements.set(b, temp);
    }

    public Object[] getElements() {
        return elements.toArray();
    }
}

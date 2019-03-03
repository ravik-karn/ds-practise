package com.ravi.ds.trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    private Node root;

    Trie() {
        root = new Node();
    }

    private class Node {
        private Map<Character, Node> childrenNodes;
        private boolean isLast;

        Node() {
            childrenNodes = new HashMap<>();
            isLast = false;
        }

        @Override
        public String toString() {
            return "{" + childrenNodes + isLast + '}';
        }
    }

    public void insert(String elem) {
        Node currentNode = root;
        for (int i = 0; i < elem.length(); i++) {
            Node possibleNextNode = currentNode.childrenNodes.get(elem.charAt(i));
            if (possibleNextNode == null) {
                Node newNode = new Node();
                currentNode.childrenNodes.put(elem.charAt(i), newNode);
                currentNode = newNode;
            } else {
                currentNode = possibleNextNode;
            }
        }
        currentNode.isLast = true;
    }

    public void delete(String elem) {
        delete(root, elem, 0);
    }

    public boolean searchExact(String elem) {
        return isPresent(elem, true);
    }

    public boolean searchPrefix(String elem) {
        return isPresent(elem, false);
    }

    public String longestMatchingPrefix(String elem) {
        Node currentNode = root;
        int lastWordAt = 0;
        for (int i = 0; i < elem.length(); i++) {
            Node possibleNextNode = currentNode.childrenNodes.get(elem.charAt(i));
            if (possibleNextNode == null) {
                break;
            }
            if (possibleNextNode.isLast) {
                lastWordAt = i + 1;
            }
            currentNode = possibleNextNode;
        }

        return elem.substring(0, lastWordAt);
    }

    private boolean delete(Node current, String word, int index) {
        if (index == word.length()) {
            if (!current.isLast) {
                return false;
            }
            current.isLast = false;
            return current.childrenNodes.size() == 0;
        }
        char ch = word.charAt(index);
        Node node = current.childrenNodes.get(ch);
        if (node == null) {
            return false;
        }
        boolean shouldDeleteCurrentNode = delete(node, word, index + 1);

        if (shouldDeleteCurrentNode) {
            current.childrenNodes.remove(ch);
            return current.childrenNodes.size() == 0;
        }
        return false;
    }

    private boolean isPresent(String elem, boolean exact) {
        Node currentNode = root;
        for (int i = 0; i < elem.length(); i++) {
            Node possibleNextNode = currentNode.childrenNodes.get(elem.charAt(i));
            if (possibleNextNode == null) {
                return false;
            }
            currentNode = possibleNextNode;
        }

        return !exact || currentNode.isLast;
    }

    @Override
    public String toString() {
        return root.toString();
    }
}

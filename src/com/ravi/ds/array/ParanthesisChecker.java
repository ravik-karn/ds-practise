package com.ravi.ds.array;

import java.util.Stack;

public class ParanthesisChecker {
    private String str;

    public ParanthesisChecker(String str) {
        this.str = str;
    }

    public boolean isMatch() {
        if (str.length() == 0) {
            return true;
        }

        Stack<Character> stack = new Stack();
        stack.push(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            }

            if (stack.empty()) {
                return false;
            }

            Character ele = stack.pop();
            if (c == '}') {
                if (ele == '(' || ele == '[') {
                    return false;
                }
            }
            if (c == ']') {
                if (ele == '(' || ele == '{') {
                    return false;
                }
            }
            if (c == ')') {
                if (ele == '[' || ele == '{') {
                    return false;
                }
            }
        }

        return stack.empty();
    }
}

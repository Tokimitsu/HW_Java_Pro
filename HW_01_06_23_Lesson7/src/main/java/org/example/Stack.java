package org.example;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private final List<T> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(T value) {
        stack.add(value);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stack=" + stack +
                '}';
    }
}

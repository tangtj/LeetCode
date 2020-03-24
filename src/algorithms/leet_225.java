package algorithms;

import java.util.LinkedList;

public class leet_225 {

    private LinkedList<Integer> list = new LinkedList<>();

    /** Initialize your data structure here. */
    public leet_225() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        list.push(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return list.pop();
    }

    /** Get the top element. */
    public int top() {
        return list.getFirst();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return list.isEmpty();
    }
}

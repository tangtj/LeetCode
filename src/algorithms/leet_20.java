package algorithms;

import java.util.Stack;

public class leet_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        char[] ss = s.toCharArray();

        for (char c : ss) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()){
                    return false;
                }
                char ic = stack.pop();
                if (ic == '(' && c == ')') {
                } else if (ic == '{' && c == '}') {
                } else if (ic == '[' && c == ']') {
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

package algorithms;

import java.util.Stack;

public class leet_1047 {

    public String removeDuplicates(String S) {
        if (S.length() <= 1){
            return S;
        }
        char[] s = S.toCharArray();

        Stack<Character> stack = new Stack<>();
        for (int i = 0,j = S.length(); i < j; i++) {
            if (stack.isEmpty() || s[i] != stack.peek()){
                stack.push(s[i]);
            }else {
                stack.pop();
            }
        }
        StringBuilder str = new StringBuilder();
        for (Character c : stack) {
            str.append(c);
        }
        return str.toString();
    }
}

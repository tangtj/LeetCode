package algorithms;

import java.util.Stack;

public class leet_1021 {
    public String removeOuterParentheses(String S) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        char[] s = S.toCharArray();
        int begin = 1;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '('){
                stack.push(s[i]);
            }else {
                stack.pop();
                if (stack.isEmpty()){
                    ans.append(S, begin, i);
                    begin = i+2;
                }
            }
        }
        return ans.toString();
    }
}

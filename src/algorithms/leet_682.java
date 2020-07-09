package algorithms;

import java.util.LinkedList;

public class leet_682 {

    public int calPoints(String[] ops) {

        LinkedList<Integer> stack = new LinkedList<>();

        for (String op : ops) {
            switch (op) {
                case "+":
                    int size = stack.size() - 1;
                    Integer a = stack.get(size);
                    Integer b = stack.get(size - 1);
                    stack.add(a+b);
                    break;
                case "D":
                    Integer c = stack.getLast();
                    stack.add(c*2);
                    break;
                case "C":
                    stack.removeLast();
                    break;
                default:
                    stack.add(Integer.valueOf(op));
                    break;
            }
        }
        return stack.stream().mapToInt(i -> i).sum();
    }
}

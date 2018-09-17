package algorithms;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author : tang
 * @date : 2018/9/17
 */
public class leet_590 {

    public List<Integer> postorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        stack.push(root);
        LinkedList<Integer> list = new LinkedList<>();
        if (root == null)
            return list;
        while (!stack.isEmpty()){
            Node node = stack.pop();
            list.addFirst(node.val);
            if (node.children != null){
                for(Node item : node.children){
                    stack.push(item);
                }
            }
        }
        return list;
    }
}

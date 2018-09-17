package algorithms;

import java.util.LinkedList;
import java.util.List;

/**
 * @author : tang
 * @date : 2018/9/17
 */
public class leet_589 {

    public List<Integer> preorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        stack.push(root);
        LinkedList<Integer> list = new LinkedList<>();
        if (root == null)
            return list;
        while (!stack.isEmpty()){
            Node node = stack.poll();
            list.add(node.val);
            if (node.children != null){
                stack.addAll(0,node.children);
            }
        }
        return list;
    }
}

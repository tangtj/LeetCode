package algorithms;

import java.util.List;

public class leet_559 {
    public int maxDepth(Node root) {
        if (root == null){
            return 0;
        }

        List<Node> node = root.children;
        if (node == null || node.size() == 0){
            return 1;
        }
        int max = 0;

        for (Node node1 : node) {
            max = Math.max(max,maxDepth(node1));
        }
        return max + 1;
    }
}

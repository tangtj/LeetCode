package algorithms;

import java.util.List;

/**
 * @author tang
 * @date 2018/12/9
 */
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int val,List<Node> children) {
        this.val = val;
        this.children = children;
    }
};

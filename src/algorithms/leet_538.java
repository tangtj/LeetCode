package algorithms;

import java.util.ArrayList;

public class leet_538 {

    //TODO: 没做对
    public TreeNode convertBST(TreeNode root) {
        help(root,0);
        return root;
    }

    private int help(TreeNode node,int sum){
        if (node == null){
            return 0;
        }
        sum += help(node.right,sum);
        int s = node.val;
        int t = node.val + sum;
        node.val = t;
        help(node.left,t);
        return s;
    }

    public static void main(String[] args) {
        leet_538 l = new leet_538();
        TreeNode n = new TreeNode(2);
        n.left = new TreeNode(0);
        n.right = new TreeNode(3);
        TreeNode t = n.left;
        t.left = new TreeNode(-4);
        t.right = new TreeNode(1);
        l.convertBST(n);
    }
}

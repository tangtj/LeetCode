package algorithms;

public class leet_404 {

    private int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null){
            return 0;
        }
        return help(root.left,true) + help(root.right,true);
    }

    private int help(TreeNode node,boolean isLeft){
        if (node == null){
            return 0;
        }
        if (node.left == null && isLeft && node.right == null){
            return node.val;
        }else{
            return help(node.left, true) + help(node.right,false);
        }
    }
}

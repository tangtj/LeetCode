package algorithms;

public class leet_101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        return comp(root.left,root.right);
    }

    public boolean comp(TreeNode left, TreeNode right) {
        if (left == null && right != null) {
            return false;
        } else if (left != null && right == null) {
            return false;
        } else if (left == null && right == null) {
            return true;
        }
        if (left.val != right.val) {
            return false;
        }
        return comp(left.left,right.right) && comp(left.right,right.left);
    }
}

package algorithms;

public class leet_100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return depth(p,q);
    }

    private boolean depth(TreeNode a,TreeNode b){
        if (a == null && b == null){
            return true;
        } if (a == null || b == null){
            return false;
        }
        return depth(a.left,b.left) && depth(a.right,b.right) && a.val == b.val;
    }
}

package algorithms;

/**
 * @author tang
 * @date 2019/7/4
 */
public class leet_965 {

    public boolean isUnivalTree(TreeNode root) {

        return isUnivalTree(root,root.val);
    }

    public boolean isUnivalTree(TreeNode root,int val) {
        if (root == null){
            return true;
        }
        return isUnivalTree(root.left,val) && isUnivalTree(root.right,val) && root.val == val;
    }
}

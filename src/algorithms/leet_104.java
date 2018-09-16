package algorithms;

/**
 * @author : tang
 * @date : 2018/9/16
 */
public class leet_104 {

    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}

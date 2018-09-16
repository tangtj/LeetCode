package algorithms;

/**
 * @author : tangtj
 * @date : 2018/7/29 19:08
 */
public class leet_617 {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode node = null;
        if (t1 != null || t2 != null) {
            node = new TreeNode((t1 != null ? t1.val : 0) + (t2 != null ? t2.val : 0));
            node.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
            node.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
        }
        return node;
    }
}

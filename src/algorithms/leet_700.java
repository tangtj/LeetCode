package algorithms;

/**
 * @author tang
 * @date 2019/6/25
 */
public class leet_700 {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        if (root.left == null && root.right == null) {
            return null;
        }

        TreeNode left = searchBST(root.left, val);
        TreeNode right = searchBST(root.right, val);

        if (left != null) {
            return left;
        }
        if (right != null) {
            return right;
        }
        return null;

    }

}

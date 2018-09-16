package algorithms;

/**
 * @author : tang
 * @date : 2018/9/16
 */
public class leet_226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        TreeNode left =  invertTree(root.left);
        TreeNode right =  invertTree(root.right);
        TreeNode node = new TreeNode(root.val);
        node.left = right;
        node.right = left;
        return node;
    }
}

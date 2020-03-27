package algorithms;

public class leet_543 {

    private int ans = 1;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null){
            return 0;
        }
        depth(root);
        return ans -1;
    }

    private int depth(TreeNode root){
        if (root == null){
            return 0;
        }
        int l = depth(root.left);
        int r = depth(root.right);
        ans = Math.max(l+r+1,ans);
        return Math.max(l,r) + 1;
    }
}

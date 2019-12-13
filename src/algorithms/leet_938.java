package algorithms;

/**
 * @author tang
 * @date 2019/7/4
 */
public class leet_938 {

    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null){
            return 0;
        }

        if (root.val > L && root.val < R){
            return rangeSumBST(root.left,L,R) + rangeSumBST(root.right,L,R) + root.val;
        }else if (root.val < L){
            return rangeSumBST(root.right,L,R);
        }else if (root.val > R){
            return rangeSumBST(root.left,L,R);
        }else if (root.val == L){
            return rangeSumBST(root.right,L,R) + root.val;
        }else if (root.val == R){
            return rangeSumBST(root.left,L,R) + root.val;
        }
        return 0;
    }
}

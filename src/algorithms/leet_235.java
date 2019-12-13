package algorithms;

/**
 * @author tang
 * @date 2019/7/7
 */
public class leet_235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode l = p.val>q.val?q:p;

        TreeNode r = p.val<q.val?q:p;

        if (l.val < root.val && r.val > root.val){
            return root;
        }else if (root.val > l.val && root.val > r.val){
            return lowestCommonAncestor(root.left,p,q);
        }else if (root.val < l.val && root.val < r.val){
            return lowestCommonAncestor(root.right,p,q);
        }else if (root.val == l.val){
            return l;
        }else {
            return r;
        }
    }
}

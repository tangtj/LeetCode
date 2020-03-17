package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author tang
 * @date 2019/7/7
 */
public class leet_257 {

    private List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return result;
        }
        path(root, "");
        return result;
    }

    public void path(TreeNode root,String list) {
        String c = list;
        if (root == null) {
            return;
        } else {
            if (c.length() != 0) {
                c += "->";
            }
            c += root.val;
        }
        if (root.left == null && root.right == null){
            result.add(c);
            return;
        }
        path(root.left, c);
        path(root.right, c);
    }
}

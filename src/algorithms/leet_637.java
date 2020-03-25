package algorithms;

import java.util.*;

public class leet_637 {

    public List<Double> averageOfLevels(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Double> list = new ArrayList<>();
        while (!queue.isEmpty()){
            int size = queue.size();
            double sum = 0;
            for (int i = 0; i < size; i++) {

               TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
            sum = sum/size;
            list.add(sum);
        }
        return list;
    }
}

package algorithms;

import java.util.LinkedList;

public class leet_1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        LinkedList<Integer> res = new LinkedList<>();
        if (nums.length == 1){
            return nums;
        }
        for (int i = 0; i < index.length; i++) {
            res.add(index[i],nums[i]);
        }
        return res.stream().mapToInt(Integer::valueOf).toArray();
    }
}

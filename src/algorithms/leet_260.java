package algorithms;

import java.util.HashSet;

public class leet_260 {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])){
                set.remove(nums[i]);
            }else {
                set.add(nums[i]);
            }
        }
        return set.stream().mapToInt(i-> i).toArray();
    }
}

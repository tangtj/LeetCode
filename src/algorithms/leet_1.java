package algorithms;

/**
 * @author : tangj
 * @date : 2018/7/25 20:25
 */
public class leet_1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int sum = target - nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] == sum){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }
}

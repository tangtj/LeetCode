package algorithms;

public class leet_35 {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                return i;
            }
            int t = i-1;
            if (t < 0 && nums[i] > target){
                return 0;
            }
            if (i == nums.length -1 && nums[i] <target){
                return nums.length;
            }

            if (nums[i] > target){
                return i;
            }
        }
        return 0;
    }
}

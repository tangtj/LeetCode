package algorithms;

public class leet_219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int l = i + 1; l <= i + k && l <nums.length; l++) {
                if (nums[i] == nums[l]){
                    return true;
                }
            }
        }
        return false;
    }
}

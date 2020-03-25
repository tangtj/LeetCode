package algorithms;

public class leet_26 {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0){
            return 0;
        }
        int quick = 0;
        int slow = 0;
        for (slow = 0,quick =1; quick < nums.length; quick++) {
            if (nums[slow] == nums[quick]){
                continue;
            }else {
                slow++;
                nums[slow] = nums[quick];
            }
        }
        return slow + 1;

    }
}

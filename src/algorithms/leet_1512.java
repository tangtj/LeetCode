package algorithms;

public class leet_1512 {

	public int numIdenticalPairs(int[] nums) {
		if (nums == null || nums.length <= 0){
			return 0;
		}
		int count = 0;
		for (int i = 0,j = nums.length; i < j; i++) {
			for (int k = i + 1; k < j; k++) {
				if (nums[i] == nums[k]){
					count++;
				}
			}
		}
		return count;
	}
}

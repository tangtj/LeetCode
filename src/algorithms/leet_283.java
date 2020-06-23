package algorithms;

public class leet_283 {

    public void moveZeroes(int[] nums) {

        for (int i = nums.length - 1; i >= 0; i--) {
            int t = nums[i];
            if (t == 0){
                int j = i;
                for (; j < nums.length - 1 && nums[j+1] != 0 ; j++) {
                    nums[j] = nums[j+1];
                }
                nums[j] = 0;

            }
        }
    }

    public static void main(String[] args) {
        leet_283 l = new leet_283();
        l.moveZeroes(new int[]{0,1,0,3,12});
    }
}

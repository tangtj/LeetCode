package algorithms;

public class leet_27 {
    public int removeElement(int[] nums, int val) {
        int l = 0;
        int r = nums.length - 1;

        for (;l <= r;) {
            if (nums[l] == val && nums[r] != val){
                nums[l] = nums[r];
                l++;
                r--;
                continue;
            }
            if (nums[l] != val){
                l++;
            }
            if (nums[r] ==val){
                r--;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        leet_27 l = new leet_27();
        l.removeElement(new int[]{4,5},4);
    }
}

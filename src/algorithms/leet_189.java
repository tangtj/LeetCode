package algorithms;

public class leet_189 {

    public void rotate(int[] nums, int k) {
        int[] b = new int[nums.length];
        for (int i = 0,j = k; i < nums.length; i++,j++) {
            b[j%nums.length] = nums[i];
        }
        System.arraycopy(b, 0, nums, 0, b.length);
    }

    public static void main(String[] args) {
        leet_189 l = new leet_189();
        l.rotate(new int[]{1,2,3,4,5,6,7},1);
    }
}

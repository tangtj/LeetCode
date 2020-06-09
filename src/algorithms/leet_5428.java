package algorithms;

public class leet_5428 {

    public int[] shuffle(int[] nums, int n) {
        int[] news = new int[2*n];

        for (int i = 0,j = 0; j < 2*n; i++,j+=2) {
            news[j] = nums[i];
            news[j+1] = nums[i+n];
        }
        return news;
    }
}

package algorithms;

public class leet_204 {

    public int countPrimes(int n) {
        if (n <= 1){
            return 0;
        }
        int[] nums = new int[n];
        int count = n - 2;
        for (int i = 2; i < n; i++) {
            for (int j = i+i; j < n; j+=i) {
                if (nums[j] == 0){
                    count--;
                    nums[j] = 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        leet_204 l = new leet_204();
        l.countPrimes(10);
    }
}

package algorithms;

public class leet_167 {

    public int[] twoSum(int[] numbers, int target) {

        int l = 0;
        int r = 0;
       out: for (int i = numbers.length -1; i >= 0; i--) {
            if (numbers[i] > target && target > 0){
                continue;
            }
            int sum = target - numbers[i];
            for (int j = 0; j < i; j++) {
                if (numbers[j] == sum){
                    l = j;
                    r = i;
                    break out;
                }
            }
        }
        return new int[]{l+1,r+1};
    }

    public static void main(String[] args) {
        leet_167 l = new leet_167();
        l.twoSum(new int[]{-1,0},-1);
    }
}

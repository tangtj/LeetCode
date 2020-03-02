package algorithms;

public class leet_1304 {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int sum = 0;

        int len = 0;
        for (int i = 0; i <= n-2; i++) {
            arr[len++] = i;
            sum += i;
        }
        arr[len] = -sum;
        return arr;
    }
}

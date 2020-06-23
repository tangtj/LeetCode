package algorithms;

public class leet_1486 {

    public int xorOperation(int n, int start) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum ^= (start + i*2);
        }
        return sum;
    }
}

package algorithms;

public class leet_231 {
    public boolean isPowerOfTwo(int n) {
    return (n > 0)&&((n &(n-1)) == 0);
    }
}

package algorithms;

/**
 * @author : tangtj
 * @date : 2018/7/26 20:49
 */
public class leet_852 {
    public int peakIndexInMountainArray(int[] A) {
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            max = A[max] < A[i] ? i : max;
        }
        return max;
    }
}

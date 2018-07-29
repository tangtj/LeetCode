package algorithms;

/**
 * @author : tangtj
 * @date : 2018/7/25 21:18
 */
public class leet_832 {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                result[i][j] = 1^A[i][A[0].length  - 1- j];
            }
        }
        return result;
    }
}

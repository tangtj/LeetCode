package algorithms;

/**
 * @author : tang
 * @date : 2018/9/17
 */
public class leet_867 {

    public int[][] transpose(int[][] A) {
        int[][] marxist = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                marxist[j][i] = A[i][j];
            }
        }
        return marxist;
    }
}

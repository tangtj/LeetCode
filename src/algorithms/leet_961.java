package algorithms;

/**
 * @author tang
 * @date 2019/6/25
 */
public class leet_961 {

    public int repeatedNTimes(int[] A) {
        int t = A.length /2;
        int[] times = new int[10000 - 1];
        for (int i = 0; i < A.length; i++) {
            times[A[i]]++;
        }
        for (int i = 0;i < times.length;i++){
            if (t == times[i]){
                return i;
            }
        }
        return 0;
    }
}

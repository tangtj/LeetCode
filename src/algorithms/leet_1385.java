package algorithms;

public class leet_1385 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res = 0;
        a: for (int i = 0; i < arr1.length; i++) {
            for (int i1 = 0; i1 < arr2.length; i1++) {
                if (Math.abs(arr1[i]-arr2[i1]) <= d){
                  continue a;
                }
            }
            res++;
        }
        return res;
    }
}

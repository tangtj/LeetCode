package algorithms;

import java.util.Arrays;

/**
 * @author tang
 * @date 2018/12/9
 */
public class leet_922 {
    public int[] sortArrayByParityII(int[] A) {
        int odd = 1;
        int even = 0;
        for (; odd < A.length; odd += 2) {
            if (A[odd] % 2 == 0){
                for (; even < A.length; even+=2) {
                    if (A[even] % 2 == 1){
                        break;
                    }
                }

                if (even >= A.length){
                    break;
                }

                int temp = A[odd];
                A[odd] = A[even];
                A[even] = temp;
            }
        }
        return A;
    }
}

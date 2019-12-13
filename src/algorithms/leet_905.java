package algorithms;

/**
 * @author tang
 * @date 2018/12/9
 */
public class leet_905 {

    public int[] sortArrayByParity(int[] A) {
        int start = 0;
        int target;
        for (; start < A.length; start++) {
            // 判断是否为 偶数
            if (A[start] % 2 != 0) {
                target = start + 1;
                for (; target < A.length; target++) {
                    if (A[target] % 2 == 0) {
                        break;
                    }
                }
                //交换
                if (target >= A.length) {
                    break;
                }
                int temp = A[target];
                A[target] = A[start];
                A[start] = temp;
            }
        }
        return A;
    }
}

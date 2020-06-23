package algorithms;

public class leet_1317 {

    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            if((i + "").contains("0")){
            }else {
                int t = n -i;
                if (!(t+"").contains("0")){
                    return new int[]{i,t};
                }
            }
        }
        return null;
    }
}

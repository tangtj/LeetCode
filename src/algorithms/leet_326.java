package algorithms;

public class leet_326 {
    public boolean isPowerOfThree(int n) {
        if (n < 1){
            return false;
        }
        if (n == 1){
            return true;
        }
        int t = n;
        while (t %3 == 0 ){
             t/=3;
        }
        return t == 1;
    }
}

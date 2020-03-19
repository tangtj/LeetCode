package algorithms;

public class leet_509 {
    public int fib(int N) {
        if (N==0){
            return 0;
        }
        if (N <= 2){
            return 1;
        }
        int a = 1,b = 1;
        for (int i = 3; i <= N; i++) {
            int result = a+b;
            a = b;
            b = result;
        }
        return b;
    }
}

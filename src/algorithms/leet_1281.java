package algorithms;

public class leet_1281 {

    public int subtractProductAndSum(int n) {
            if (n < 10){
                return 0;
            }
            char[] num = (n+"").toCharArray();

            int sum = 0;
            int result = 1;

            for (int i = 0; i < num.length; i++) {
                int bit = num[i]-'0';
                sum = sum + bit;
                result *= bit;
            }
            return result - sum;
    }
}

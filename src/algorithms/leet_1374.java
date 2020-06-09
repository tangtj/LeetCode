package algorithms;

public class leet_1374 {


    public String generateTheString(int n) {
        final String b = "bc";
        final String a = "a";
        final String c = "bcd";
        if (n == 1){
            return a;
        } else if (n ==2){
            return b;
        }else {
            StringBuilder sb = new StringBuilder();
            if ((n-2)%2 == 0){
                for (int i = 0,j = n-3; i < j; i++) {
                    sb.append(a);
                }
                return sb.append(c).toString();
            }else {
                for (int i = 0,j = n-2; i < j; i++) {
                    sb.append(a);
                }
                return sb.append(b).toString();
            }
        }
    }
}

package algorithms;

public class leet_67 {
    public String addBinary(String a, String b) {
        int al = a.length();
        int bl = b.length();
        if ("0".equals(a)){
            return b;
        }
        if ("0".equals(b)){
            return a;
        }
        StringBuilder build = new StringBuilder();
        int bit = 0;
        for (int i = al-1,j = bl-1;i>=0 || j >= 0; i--,j--) {
            int sum;
            if (i >= 0 && j >= 0){
                int ac = a.charAt(i) - '0';
                int bc = b.charAt(j) - '0';
                sum = ac + bc + bit;
            }else if (i >= 0){
                int ac = a.charAt(i) - '0';
                sum = ac + bit;
            }else {
                int bc = b.charAt(j) - '0';
                sum = bc + bit;
            }

            if (sum == 0 || sum == 1){
                build.append(sum);
                bit = 0;
            }else if (sum == 2){
                build.append(0);
                bit = 1;
            }else if (sum == 3){
                build.append(1);
                bit = 1;
            }
        }
        if (bit == 1){
            build.append(1);
        }

        return build.reverse().toString();
    }

    public static void main(String[] args) {
        leet_67 l = new leet_67();
        l.addBinary("11","11");
    }
}

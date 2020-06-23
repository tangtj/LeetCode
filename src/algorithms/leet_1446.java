package algorithms;

public class leet_1446 {

    public int maxPower(String s) {
        if (s.length()  == 1){
            return 1;
        }
        int max = 1;
        int result = 1;
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i-1]){
                max++;
            }else {
                result = Math.max(max, result);
                max = 1;
            }
        }
        result = Math.max(max, result);
        return result;
    }

    public static void main(String[] args) {
        leet_1446 l = new leet_1446();
        l.maxPower("cc");
    }
}

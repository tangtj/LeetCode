package algorithms;

public class leet_66 {
    public int[] plusOne(int[] digits) {

        int[] b;
        boolean up = false;
        if (digits[0] == 9){
            up = true;
        }

        int plus = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = digits[i] + plus;
            if (digits[i] == 10){
                digits[i] = 0;
                plus = 1;
            }else {
                plus = 0;
                break;
            }
        }
        if (digits[0] == 0 && plus == 1){
          b = new int[digits.length+1];
          b[0] = 1;
          b[1] = 0;
            if (digits.length - 2 - 2 >= 0) System.arraycopy(digits, 1, b, 2, digits.length - 2 - 2);
            return b;
        }else {
            return digits;
        }
    }

    public static void main(String[] args) {
        leet_66 l = new leet_66();
        l.plusOne(new int[]{9});
    }
}

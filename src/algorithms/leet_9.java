package algorithms;

public class leet_9 {

    public boolean isPalindrome(int x) {
        String num = x +"";

        char[] numChar = num.toCharArray();

        for (int i = 0,j = numChar.length - 1; i < j; i++,j--) {
            if (i == j){
                return true;
            }
            if (numChar[i] != numChar[j]){
                return false;
            }
        }
        return true;
    }
}

package algorithms;

public class leet_58 {

    public int lengthOfLastWord(String s) {
        if (s == null || s.isBlank()){
            return 0;
        }
        char[] ss= s.toCharArray();
        int l = 0;
        for (int i = ss.length - 1; i >= 0; i--) {
            if (ss[i] !=' '){
                l++;
            }else if (ss[i] ==' ' && l > 0){
                return l;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        leet_58 l = new leet_58();
        l.lengthOfLastWord("a ");
    }
}

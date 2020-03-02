package algorithms;

public class leet_58 {

    public String reverseLeftWords(String s, int n) {
        int length = s.length();
        int end  = n + length;
        StringBuilder sb = new StringBuilder();
        sb.append(s).append(s);
        return sb.subSequence(n,end).toString();
    }
}

package algorithms;

public class leet_1370 {
    public String sortString(String s) {
        int[] pool = new int[26];

        char[] sc = s.toCharArray();

        int length = sc.length;

        for (char c : sc) {
            pool[c - 'a']++;
        }

        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (count < length){

            for (int i = 0; i < pool.length; i++) {
                if (pool[i] > 0){
                    pool[i]--;
                    sb.append((char)(i+'a'));
                    count++;
                }

            }
            for (int i = pool.length -1; i > 0; i--) {
                if (pool[i] > 0){
                    pool[i]--;
                    sb.append((char)(i+'a'));
                    count++;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        leet_1370 l = new leet_1370();
        l.sortString("aaaabbbbcccc");
    }
}

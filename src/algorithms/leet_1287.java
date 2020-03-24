package algorithms;

public class leet_1287 {
    public int findSpecialInteger(int[] arr) {
        int s = 0;
        int l = arr.length /4;
        while (l<arr.length){
            if (arr[s]==arr[l]){
                return arr[s];
            }
            s++;
            l++;
        }
        return -1;
    }
}
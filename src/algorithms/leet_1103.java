package algorithms;

public class leet_1103 {
    public int[] distributeCandies(int candies, int num_people) {
        int[] p = new int[num_people];

        int i =0;
        int count = 1;
        while (candies > 0){
            i = i% (num_people);
            if (count > candies){
                count = candies;
                candies = 0;
            }else {
                candies -= count;
            }
            p[i] += count;
            i++;
            count++;
        }
        return p;
    }

    public static void main(String[] args) {
        var leet_1103 = new leet_1103();

        leet_1103.distributeCandies(7,4);
    }
}

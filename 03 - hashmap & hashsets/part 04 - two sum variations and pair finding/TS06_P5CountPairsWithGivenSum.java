import java.util.HashMap;

public class TS06_P5CountPairsWithGivenSum {

    public static int countPairs(int[] arr, int k) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int complement = k - num;
            count += freq.getOrDefault(complement, 0);

            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        
        System.out.println(countPairs(new int[]{1, 5, 7, -1, 5}, 6));
        System.out.println(countPairs(new int[]{1, 1, 1, 1}, 2));
        System.out.println(countPairs(new int[]{1, 2, 3, 4, 5}, 10));
    }
}
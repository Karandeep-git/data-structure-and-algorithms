import java.util.*;

public class TS05_P4ParisWithDifferenceK {

    public static int countPairsWithDiffK(int[] arr, int k) {

        if (k == 0) {
            HashMap<Integer, Integer> freq = new HashMap<>();

            for (int num : arr) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }

            int count = 0;

            for (int f : freq.values()) {
                count += f * (f - 1) / 2;
            }

            return count;
        }

        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for (int num : arr) {
            if (set.contains(num + k)) {
                count++;
            }
            if (set.contains(num - k)) {
                count++;
            }

            set.add(num);
        }

        return count;
    }
    
    public static int countPairsTwoPointers(int[] arr, int k) {
        Arrays.sort(arr);

        int left = 0;
        int right = 1;
        int count = 0;

        while (right < arr.length) {
            int diff = arr[right] - arr[left];

            if (diff == k) {
                count++;
                left++;
                right++;
            } else if (diff < k) {
                right++;
            } else {
                left++;
            }

            if (left == right) {
                right++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        
        System.out.println(countPairsWithDiffK(new int[] { 1, 5, 3, 4, 2 }, 3));
        System.out.println(countPairsWithDiffK(new int[]{8, 12, 16, 4, 0, 20}, 4));
        System.out.println(countPairsWithDiffK(new int[]{1, 2, 3, 4, 5}, 0));

        System.out.println(countPairsTwoPointers(new int[]{1, 5, 3, 4, 2}, 3));
        System.out.println(countPairsTwoPointers(new int[]{8, 12, 16, 4, 0, 20}, 4));
    }
}

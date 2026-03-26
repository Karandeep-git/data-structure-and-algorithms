
import java.util.HashMap;

public class Kadane03_P3LongestSubarrayWithSumK {
    
    public static int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            int need = prefixSum - k;

            if (map.containsKey(need)) {
                int len = i - map.get(need);
                maxLen = Math.max(maxLen, len);
            }

            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        return maxLen;
    }
    
    public static void main(String[] args) {
        
        System.out.println(longestSubarray(new int[]{1, -1, 5, -2, 3},3));
        System.out.println(longestSubarray(new int[]{2, -1, 2, 1},1));
        System.out.println(longestSubarray(new int[]{1, 2, 3},3));
    }
}

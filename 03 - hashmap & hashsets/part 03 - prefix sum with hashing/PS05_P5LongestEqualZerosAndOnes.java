
import java.util.HashMap;

public class PS05_P5LongestEqualZerosAndOnes {
    
    public static int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            prefixSum += (nums[i] == 0) ? -1 : 1;

            if (map.containsKey(prefixSum)) {

                int len = i - map.get(prefixSum);
                maxLen = Math.max(maxLen, len);
            } else {
                map.put(prefixSum, i);
            }
        }

        return maxLen;
    }
    
    public static void main(String[] args) {
        
        System.out.println(findMaxLength(new int[]{0, 1, 0, 0, 1, 1, 0}));
        System.out.println(findMaxLength(new int[]{0, 0, 0, 1, 1, 1}));
        System.out.println(findMaxLength(new int[]{0, 0, 1, 1, 1}));
        System.out.println(findMaxLength(new int[]{0, 1}));
        System.out.println(findMaxLength(new int[]{0, 0, 0}));
    }
}

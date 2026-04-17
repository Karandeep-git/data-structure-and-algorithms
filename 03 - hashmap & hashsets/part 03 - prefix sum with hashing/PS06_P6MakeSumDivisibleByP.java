
import java.util.HashMap;

public class PS06_P6MakeSumDivisibleByP {
    
    public static int minSubarray(int[] nums, int p) {

        int totalRem = 0;

        for (int num : nums) {
            totalRem = (totalRem + num) % p;
        }

        if (totalRem == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int prefixSum = 0;
        int minLen = nums.length;

        for (int i = 0; i < nums.length; i++) {

            prefixSum = (prefixSum + nums[i]) % p;

            int need = (prefixSum - totalRem + p) % p;

            if (map.containsKey(need)) {
                int len = i - map.get(need);
                minLen = Math.min(minLen, len);
            }

            map.put(prefixSum, i);
        }

        return minLen < nums.length ? minLen : -1;
    }

    public static void main(String[] args) {
        
        System.out.println(minSubarray(new int[]{3, 1, 4, 2}, 6));
        System.out.println(minSubarray(new int[]{6, 3, 5, 2}, 9));
        System.out.println(minSubarray(new int[]{1, 2, 3}, 3));
        System.out.println(minSubarray(new int[]{1, 2, 3}, 7));
        System.out.println(minSubarray(new int[]{4, 4, 2}, 7));
    }
}

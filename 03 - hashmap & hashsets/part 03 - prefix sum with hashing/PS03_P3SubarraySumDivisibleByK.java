
import java.util.HashMap;

public class PS03_P3SubarraySumDivisibleByK {

    public static int subarrayDivByK(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            prefixSum += nums[i];

            int rem = ((prefixSum % k) + k) % k;
            count += map.getOrDefault(rem, 0);
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        
        System.out.println(subarrayDivByK(new int[]{4, 5, 0, -2, -3, 1}, 5));
        System.out.println(subarrayDivByK(new int[]{5}, 9));
        System.out.println(subarrayDivByK(new int[]{-1, 2, 9}, 2));
    }
}
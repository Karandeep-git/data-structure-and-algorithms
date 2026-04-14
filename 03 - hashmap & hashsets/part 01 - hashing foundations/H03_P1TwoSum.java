
import java.util.HashMap;

public class H03_P1TwoSum {
    
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        
        int[] r1 = twoSum(new int[] { 2, 7, 11, 15 }, 9);
        System.out.println(r1[0] + ", " + r1[1]);

        int[] r2 = twoSum(new int[] { 3, 2, 4 }, 6);
        System.out.println(r2[0] + ", " + r2[1]);

        int[] r3 = twoSum(new int[] { 3, 3 }, 6);
        System.out.println(r3[0] + ", " + r3[1]);
    }
}


import java.util.HashMap;

public class TPSW01_P1SubarrayWithKDifferentIntegers {

    private static int atMost(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {

            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while (map.size() > k) {

                int leftVal = nums[left];
                map.put(leftVal, map.get(leftVal) - 1);

                if (map.get(leftVal) == 0) {
                    map.remove(leftVal);
                }

                left++;
            }

            count += right - left + 1;
        }

        return count;
    }

    public static int subarrayWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public static void main(String[] args) {

        System.out.println(subarrayWithKDistinct(new int[]{1, 2, 1, 2, 3}, 2));
        System.out.println(subarrayWithKDistinct(new int[]{1, 2, 1, 3, 4}, 3));
        System.out.println(subarrayWithKDistinct(new int[]{1, 2, 3, 4, 5}, 1));
    }
}

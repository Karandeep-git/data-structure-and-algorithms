public class SlidingWindow01_P1MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int windowSum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            windowSum += nums[right];

            while (windowSum >= target) {

                minLen = Math.min(minLen, right - left + 1);
                windowSum -= nums[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        
        System.out.println(minSubArrayLen(7, new int[] { 2, 3, 1, 2, 4, 3 }));
        System.out.println(minSubArrayLen(4, new int[] { 1, 4, 4 }));
        System.out.println(minSubArrayLen(11, new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 }));
        System.out.println(minSubArrayLen(15, new int[]{1, 2, 3, 4, 5}));
    }
}
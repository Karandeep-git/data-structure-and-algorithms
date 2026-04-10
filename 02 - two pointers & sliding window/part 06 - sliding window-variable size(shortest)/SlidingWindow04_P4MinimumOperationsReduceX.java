public class SlidingWindow04_P4MinimumOperationsReduceX {
    
    public static int minOperations(int[] nums, int x) {

        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int middleTarget = totalSum - x;

        if (middleTarget < 0) {
            return -1;
        }

        if (middleTarget == 0) {
            return nums.length;
        }

        int left = 0;
        int windowSum = 0;
        int maxMiddleLen = -1;

        for (int right = 0; right < nums.length; right++) {

            windowSum += nums[right];

            while (windowSum > middleTarget && left <= right) {
                windowSum -= nums[left];
                left++;
            }

            if (windowSum == middleTarget) {
                maxMiddleLen = Math.max(maxMiddleLen, right - left + 1);
            }
        }

        if (maxMiddleLen == -1) {
            return -1;
        }

        return nums.length - maxMiddleLen;
    }

    public static void main(String[] args) {
        
        System.out.println(minOperations(new int[]{1, 1, 4, 2, 3}, 5));
        System.out.println(minOperations(new int[]{5, 6, 7, 8, 9}, 4));
        System.out.println(minOperations(new int[]{3, 2, 20, 1, 1, 3}, 5));
        System.out.println(minOperations(new int[]{1, 1}, 3));
        System.out.println(minOperations(new int[]{1, 1, 1, 1, 1}, 5));
    }
}

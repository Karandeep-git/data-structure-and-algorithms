public class TPSW03_P3BinarySubarrayWithSum {

    private static int atMostK(int[] nums, int k) {

        if (k < 0) {
            return 0;
        }

        int left = 0;
        int windowSum = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {

            windowSum += nums[right];

            while (windowSum > k) {
                windowSum -= nums[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }

    public static int numsSubarrayWithSum(int[] nums, int goal) {
        return atMostK(nums, goal) - atMostK(nums, goal - 1);
    }

    public static void main(String[] args) {
        
        System.out.println(numsSubarrayWithSum(new int[]{1, 0, 1, 0, 1}, 2));
        System.out.println(numsSubarrayWithSum(new int[]{0, 0, 0, 0, 0}, 0));
        System.out.println(numsSubarrayWithSum(new int[]{1, 1, 1, 1}, 2));
        System.out.println(numsSubarrayWithSum(new int[]{0, 1, 1, 0, 1}, 2));
    }
}
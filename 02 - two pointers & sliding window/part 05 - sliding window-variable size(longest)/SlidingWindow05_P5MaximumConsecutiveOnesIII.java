public class SlidingWindow05_P5MaximumConsecutiveOnesIII {
    
    public static int longestOnes(int[] nums, int k) {

        int zerosInWindow = 0;
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                zerosInWindow++;
            }

            while (zerosInWindow > k) {

                if (nums[left] == 0) {
                    zerosInWindow--;
                }

                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        
        System.out.println(longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
        System.out.println(longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3));
        System.out.println(longestOnes(new int[]{1, 1, 1, 1}, 0));
        System.out.println(longestOnes(new int[]{0, 0, 0}, 0));
    }
}

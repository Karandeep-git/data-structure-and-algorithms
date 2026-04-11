public class TPSW05_P5LongestSubarrayOnesAfterDeletion {
    
    public static int longestSubarray(int[] nums) {

        int left = 0;
        int zerosInWindow = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                zerosInWindow++;
            }

            while (zerosInWindow > 1) {

                if (nums[left] == 0) {
                    zerosInWindow--;
                }

                left++;
            }

            maxLen = Math.max(maxLen, right - left);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        
        System.out.println(longestSubarray(new int[]{1, 1, 0, 1}));
        System.out.println(longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}));
        System.out.println(longestSubarray(new int[]{1, 1, 1}));
        System.out.println(longestSubarray(new int[]{0, 0, 0}));
        System.out.println(longestSubarray(new int[]{1, 0, 1, 1, 0, 0, 1, 1}));
    }
}

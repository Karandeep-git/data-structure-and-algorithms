public class TPSW02_P2CountNumberOfNiceSubarrays {

    private static int atMostK(int[] nums, int k) {

        int left = 0;
        int oddsInWindow = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] % 2 == 1) {
                oddsInWindow++;
            }

            while (oddsInWindow > k) {
                if (nums[left] % 2 == 1) {
                    oddsInWindow--;
                }
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }

    public static void main(String[] args) {
        
        System.out.println(numberOfSubarrays(new int[]{1, 1, 2, 1, 1}, 3));
        System.out.println(numberOfSubarrays(new int[]{2, 4, 6}, 1));
        System.out.println(numberOfSubarrays(new int[]{2, 2, 2, 1, 2, 2, 1, 2, 2, 2}, 2));
    }
}
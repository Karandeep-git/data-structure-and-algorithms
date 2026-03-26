public class Kadane02_P2MaximumProductSubarray {
    
    public static int maxProduct(int[] nums) {

        int maxP = nums[0];
        int minP = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int val = nums[i];

            int candidate1 = val;
            int candidate2 = maxP * val;
            int candidate3 = minP * val;

            maxP = Math.max(candidate1, Math.max(candidate2, candidate3));
            minP = Math.min(candidate1, Math.min(candidate2, candidate3));

            result = Math.max(result, maxP);
        }

        return result;
    }

    public static void main(String[] args) {
        
        System.out.println(maxProduct(new int[] { 2, 3, -2, 4 }));
        System.out.println(maxProduct(new int[]{-2, 0, -1}));
        System.out.println(maxProduct(new int[]{-2, 3, -4}));
    }
}

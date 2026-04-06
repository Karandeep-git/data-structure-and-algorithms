public class SlidingWindow04_MaximumSumSubarrayK {
    
    public static int maxSumSubarray(int[] arr, int k) {

        if (arr.length < k) {
            return -1;
        }

        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        
        System.out.println(maxSumSubarray(new int[]{2, 1, 5, 1, 3, 2}, 3));
        System.out.println(maxSumSubarray(new int[]{2, 3, 4, 1, 5}, 2));
        System.out.println(maxSumSubarray(new int[]{-1, -2, -3, -4}, 2));
        System.out.println(maxSumSubarray(new int[] { 1, 2, 3, 4, 5 }, 3));
    }
}

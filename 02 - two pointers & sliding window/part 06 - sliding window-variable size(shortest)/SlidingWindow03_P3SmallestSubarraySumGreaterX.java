public class SlidingWindow03_P3SmallestSubarraySumGreaterX {
    
    public static int smallestSubarray(int[] arr, int x) {

        int left = 0;
        int windowSum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {

            windowSum += arr[right];

            while (windowSum > x) {

                minLen = Math.min(minLen, right - left + 1);
                windowSum -= arr[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        
        System.out.println(smallestSubarray(new int[]{1, 2, 3, 4, 5}, 6));
        System.out.println(smallestSubarray(new int[]{1, 1, 1, 1, 1}, 10));
        System.out.println(smallestSubarray(new int[]{1, 4, 45, 6, 10, 19}, 51));
        System.out.println(smallestSubarray(new int[]{1, 2, 3, 4, 5}, 100));
    }
}

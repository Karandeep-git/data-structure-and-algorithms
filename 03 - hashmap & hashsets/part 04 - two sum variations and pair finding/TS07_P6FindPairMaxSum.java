public class TS07_P6FindPairMaxSum {
    
    public static int maxSumSort(int[] arr) {
        java.util.Arrays.sort(arr);
        int n = arr.length;
        return arr[n - 1] + arr[n - 2];
    }

    public static int maxSumTwoMax(int[] arr) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return max1 + max2;
    }

    public static int[] maxSumPairWithIndices(int[] arr) {

        int max1Idx = 0;
        int max2Idx = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[max1Idx]) {
                max2Idx = max1Idx;
                max1Idx = i;
            } else if (max2Idx == -1 || arr[i] > arr[max2Idx]) {
                max2Idx = i;
            }
        }

        System.out.println("Pair: (" + arr[max1Idx] + ", " + arr[max2Idx] + ")");
        return new int[]{ max1Idx, max2Idx };
    }

    public static void main(String[] args) {
        
        System.out.println(maxSumSort(new int[]{1, 2, 3, 4, 5}));
        System.out.println(maxSumTwoMax(new int[] { 10, -1, 3, 8, 15 }));
        maxSumPairWithIndices(new int[] { 10, -1, 3, 8, 15 });
    }
}

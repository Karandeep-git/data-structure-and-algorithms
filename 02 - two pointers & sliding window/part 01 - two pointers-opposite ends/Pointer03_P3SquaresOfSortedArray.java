
import java.util.Arrays;

public class Pointer03_P3SquaresOfSortedArray {

    public static int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int pos = n - 1;

        while (left <= right) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[pos] = leftSquare;
                left++;
            } else {
                result[pos] = rightSquare;
                right--;
            }

            pos--;
        }

        return result;
    }
    
    public static void main(String[] args) {
        
        int[] r1 = sortedSquares(new int[] { -4, -1, 0, 3, 10 });
        System.out.println(Arrays.toString(r1));

        int[] r2 = sortedSquares(new int[] { -7, -3, 2, 3, 11 });
        System.out.println(Arrays.toString(r2));
    }
}
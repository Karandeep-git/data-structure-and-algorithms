
import java.util.Arrays;

public class Array05_FindTheMissingNumber {

    public static int missingNumberSort(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }

        return nums.length;
    }

    public static int missingNumberMath(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static int missingNumberXOR(int[] nums) {
        int xor = nums.length;

        for (int i = 0; i < nums.length; i++) {
            xor ^= i ^ nums[i];
        }

        return xor;
    }

    public static void main(String[] args) {
        System.out.println(missingNumberMath(new int[]{3, 0, 1}));         
        System.out.println(missingNumberMath(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 }));
        System.out.println(missingNumberSort(new int[]{3, 0, 1}));        
        System.out.println(missingNumberXOR(new int[]{3, 0, 1}));        
    }
}

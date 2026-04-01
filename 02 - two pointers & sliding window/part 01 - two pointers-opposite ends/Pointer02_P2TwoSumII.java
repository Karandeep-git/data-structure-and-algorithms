
public class Pointer02_P2TwoSumII {

    public static int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        
        int[] r1 = twoSum(new int[] { 2, 7, 11, 15 }, 9);
        System.out.println(r1[0] + ", " + r1[1]);

        int[] r2 = twoSum(new int[] { 2, 3, 4 }, 6);
        System.out.println(r2[0] + ", " + r2[1]);

        int[] r3 = twoSum(new int[] { -1, 0 }, -1);
        System.out.println(r3[0] + ", " + r3[1]);
    }
}

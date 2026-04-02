public class Pointer03_P3MoveZeroes {

    public static void moveZeroes(int[] nums) {

        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {

            if (nums[fast] != 0) {

                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;

                slow++;
            }
        }
    }

    public static void main(String[] args) {
        
        int[] nums1 = { 0, 1, 0, 3, 12 };
        moveZeroes(nums1);
        for (int x : nums1) {
            System.out.print(x + " ");
        }

        System.out.println();

        int[] nums2 = { 0, 0, 1 };
        moveZeroes(nums2);
        for (int x : nums2) {
            System.out.print(x + " ");
        }
        System.out.println();

        int[] nums3 = { 1, 0, 0, 0, 3, 12 };
        moveZeroes(nums3);
        for (int x : nums3) {
            System.out.print(x + " ");
        }
    }
}

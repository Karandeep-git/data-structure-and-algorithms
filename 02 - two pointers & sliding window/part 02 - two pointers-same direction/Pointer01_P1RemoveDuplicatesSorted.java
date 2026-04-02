public class Pointer01_P1RemoveDuplicatesSorted {

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int slow = 0;

        for (int fast = 1; fast < nums.length; fast++) {

            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }

        return slow + 1;
    }

    public static void main(String[] args) {
        
        int[] nums1 = { 1, 1, 2 };
        System.out.println(removeDuplicates(nums1));

        int[] nums2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int k = removeDuplicates(nums2);
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums2[i] + " ");
        }
    }
}
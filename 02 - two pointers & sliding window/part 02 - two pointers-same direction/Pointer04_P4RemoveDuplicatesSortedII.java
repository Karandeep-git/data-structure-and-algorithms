public class Pointer04_P4RemoveDuplicatesSortedII {
    
    public static int removeDuplicates(int[] nums) {

        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {

            if (slow < 2 || nums[fast] != nums[slow - 2]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }

        return slow;
    }

    public static void main(String[] args) {
        
        int[] nums1 = { 1, 1, 1, 2, 2, 3 };
        int k1 = removeDuplicates(nums1);
        System.out.println(k1);
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        int[] nums2 = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        int k2 = removeDuplicates(nums2);
        System.out.println(k2);
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " ");
        }
    }


}
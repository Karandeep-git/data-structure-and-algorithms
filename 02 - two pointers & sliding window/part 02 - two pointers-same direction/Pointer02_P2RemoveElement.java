public class Pointer02_P2RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {

            if (nums[fast] != val) {

                nums[slow] = nums[fast];
                slow++;
            }
        }

        return slow;
    }

    public static void main(String[] args) {
        
        int[] nums1 = { 3, 2, 2, 3 };
        System.out.println(removeElement(nums1, 3));

        int[] nums2 = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int k = removeElement(nums2, 2);
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums2[i] + " ");
        }
    }
}
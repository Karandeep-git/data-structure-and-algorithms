public class Pointer05_P5SortColors {
    
    public static void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }

        }
    }
    
    private static void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
    
    public static void main(String[] args) {
        
        int[] nums1 = { 2, 0, 2, 1, 1, 0 };
        sortColors(nums1);
        for (int x : nums1) {
            System.out.print(x + " ");
        }
        System.out.println();

        int[] nums2 = { 2, 0, 1 };
        sortColors(nums2);
        for (int x : nums2) {
            System.out.print(x + " ");
        }
        System.out.println();
        int[] nums3 = { 0 };
        sortColors(nums3);
        for (int x : nums3) {
            System.out.print(x + " ");
        }
        System.out.println();

        int[] nums4 = { 1, 2, 0 };
        sortColors(nums4);
        for (int x : nums4) {
            System.out.print(x + " ");
        }
        
    }
}

public class Pointer01_P1MergeSortedArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] >= nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }

    public static void main(String[] args) {
        
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        merge(nums1, 3, nums2, 3);
        System.out.println("Elements of nums1 after merging:");
        for (int x : nums1) {
            System.out.print(x + " ");
        }
        System.out.println();

        int[] nums3 = { 4, 5, 6, 0, 0, 0};
        int[] nums4 = {1, 2, 3};
        merge(nums3, 3, nums4, 3);
        System.out.println("Elements of nums3 after merging: ");
        for (int x : nums3) {
            System.out.print(x + " ");
        }
    }
}
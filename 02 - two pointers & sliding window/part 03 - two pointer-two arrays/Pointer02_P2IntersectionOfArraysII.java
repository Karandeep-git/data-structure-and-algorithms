
import java.util.*;

public class Pointer02_P2IntersectionOfArraysII {
    
    public static int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;
        List<Integer> result = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] ans = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            ans[k] = result.get(k);
        }

        return ans;
    }

    public static void main(String[] args) {
        
        System.out.println(Arrays.toString((intersect(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 }))));
        
        System.out.println(Arrays.toString((intersect(new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 }))));
        
        System.out.println(Arrays.toString((intersect(new int[]{1, 2, 3}, new int[]{4, 5, 6}))));
    }

}

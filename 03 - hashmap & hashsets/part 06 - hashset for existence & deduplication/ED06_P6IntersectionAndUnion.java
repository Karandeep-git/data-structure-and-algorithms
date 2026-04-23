import java.util.*;

public class ED06_P6IntersectionAndUnion {
    
    public static int[] intersectionOfTwoArraysI(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        HashSet<Integer> result = new HashSet<>();

        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }

        int[] ans = new int[result.size()];

        int i = 0;
        for (int num : result) {
            ans[i++] = num;
        }

        return ans;
    }

    public static int[] union(int[] nums1, int[] nums2) {

        HashSet<Integer> unionSet = new HashSet<>();

        for (int num : nums1) {
            unionSet.add(num);
        }

        for (int num : nums2) {
            unionSet.add(num);
        }

        int[] ans = new int[unionSet.size()];

        int i = 0;
        for (int num : unionSet) {
            ans[i++] = num;
        }

        return ans;
    }

    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(intersectionOfTwoArraysI(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        System.out.println(Arrays.toString(union(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }

}

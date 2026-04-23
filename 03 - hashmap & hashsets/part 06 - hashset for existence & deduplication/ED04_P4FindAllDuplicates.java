import java.util.*;

public class ED04_P4FindAllDuplicates {
    
    public static List<Integer> findDuplicatesSet(int[] nums) {

        List<Integer> result = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                result.add(num);
            }
        }

        return result;
    }

    public static List<Integer> findDuplicates(int[] nums) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int val = Math.abs(nums[i]);
            int idx = val - 1;

            if (nums[idx] < 0) {
                result.add(val);
            } else {
                nums[idx] = -nums[idx];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        
        System.out.println(findDuplicatesSet(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println(findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}

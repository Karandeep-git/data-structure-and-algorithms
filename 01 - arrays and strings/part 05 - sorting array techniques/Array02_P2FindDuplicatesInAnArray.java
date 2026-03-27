import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array02_P2FindDuplicatesInAnArray {

    public static List<Integer> findDuplicatesSort(int[] nums) {

        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                result.add(nums[i]);
            }
        }

        return result;
    }
    
    public static List<Integer> findDuplicatesOptimal(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                result.add(index + 1);
            } else {
                nums[index] = -nums[index];
            }
        }

        return result;
    }
    public static void main(String[] args) {
        
        System.out.println(findDuplicatesSort(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 }));
        System.out.println(findDuplicatesOptimal(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 }));
        
    }
}

import java.util.HashMap;
import java.util.HashSet;

public class H05_P3ContainsDuplicateII {
    
    public static boolean containsNearbyDuplicateMap(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }

            map.put(nums[i], i);
        }

        return false;
    }

    public static boolean containsNearbyDuplicateSet(int[] nums, int k) {

        HashSet<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (window.contains(nums[i])) {
                return true;
            }

            window.add(nums[i]);

            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        
        System.out.println(containsNearbyDuplicateMap(new int[]{1, 2, 3, 1}, 3));
        System.out.println(containsNearbyDuplicateSet(new int[]{1, 2, 3, 1}, 3));
    }

}
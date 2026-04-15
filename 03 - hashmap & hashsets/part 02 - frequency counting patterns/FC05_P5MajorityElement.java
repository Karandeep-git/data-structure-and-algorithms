import java.util.*;

public class FC05_P5MajorityElement {
    
    public static int majorityElementMap(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        int n = nums.length;

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);

            if (freq.get(num) > n / 2) {
                return num;
            }
        }

        return -1;
    }

    public static int majorityElementBoyerMoore(int[] nums) {

        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {

            if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        
        System.out.println(majorityElementMap(new int[]{3, 2, 3}));
        System.out.println(majorityElementMap(new int[]{2, 2, 1, 1, 2, 2}));
        System.out.println(majorityElementBoyerMoore(new int[]{3, 2, 3}));
        System.out.println(majorityElementBoyerMoore(new int[]{2, 2, 1, 1, 2, 2}));
    }
}

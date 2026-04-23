import java.util.*;

public class ED03_P3SetMismatch {

    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        HashSet<Integer> seen = new HashSet<>();

        int duplicate = -1;

        for (int num : nums) {
            if (seen.contains(num)) {
                duplicate = num;
            } else {
                seen.add(num);
            }
        }

        int missing = -1;

        for (int i = 1; i <= n; i++) {
            if (!seen.contains(i)) {
                missing = i;
                break;
            }
        }

        return new int[] { duplicate, missing };
    }

    public static void main(String[] args) {
        
        int[] r1 = findErrorNums(new int[] { 1, 2, 2, 4 });
        System.out.println(r1[0] + ", " + r1[1]);

        int[] r2 = findErrorNums(new int[] { 1, 1 });
        System.out.println(r2[0] + ", " + r2[1]);
    }
}

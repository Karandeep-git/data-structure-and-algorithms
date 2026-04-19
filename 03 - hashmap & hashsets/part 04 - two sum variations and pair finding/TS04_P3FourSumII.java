
import java.util.HashMap;

public class TS04_P3FourSumII {
    
    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        HashMap<Integer, Integer> abSums = new HashMap<>();

        for (int a : A) {
            for (int b : B) {
                int sum = a + b;
                abSums.put(sum, abSums.getOrDefault(sum, 0) + 1);
            }
        }

        int count = 0;

        for (int c : C) {
            for (int d : D) {
                int sum = c + d;
                int need = -sum;

                count += abSums.getOrDefault(need, 0);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        
        System.out.println(fourSumCount(
            new int[]{1, 2}, 
            new int[] { -2, -1 },
            new int[]{-1, 2}, 
            new int[] { 0, 2 })
        );

        System.out.println(fourSumCount(
            new int[]{ 0 }, 
            new int[] { 0 },
            new int[]{ 0 }, 
            new int[] { 0 })
        );
        
        System.out.println(fourSumCount(
            new int[]{ -1, -1}, 
            new int[] { -1, 1 },
            new int[]{ -1, 1}, 
            new int[] { 1, -1 })
        );
    }
}

import java.util.HashMap;

public class PS04_EqualZerosAndOnes {

    public static int countSubarray(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            prefixSum += (arr[i] == 0) ? -1 : 1;

            int need = prefixSum - 0;
            count += map.getOrDefault(need, 0);

            map.put(need, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        
        System.out.println(countSubarray(new int[]{0, 1, 0, 1, 1, 0}));
        System.out.println(countSubarray(new int[]{0, 0, 0, 1, 1, 1}));
        System.out.println(countSubarray(new int[]{0, 1}));
        System.out.println(countSubarray(new int[]{0, 0, 1, 1, 0}));
    }
}
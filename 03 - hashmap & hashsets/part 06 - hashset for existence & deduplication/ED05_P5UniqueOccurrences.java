import java.util.*;

public class ED05_P5UniqueOccurrences {
    
    public static boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> seen = new HashSet<>();

        for (int count : freq.values()) {

            if (!seen.add(count)) {
                return false;
            }
        }

        return true;
    }

    public static boolean uniqueOccurrencesOneLinear(int[] arr) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        return new HashSet<>(freq.values()).size() == freq.size();
    }
    public static void main(String[] args) {
        
        System.out.println(uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
        System.out.println(uniqueOccurrences(new int[]{1, 2}));
        System.out.println(uniqueOccurrencesOneLinear(new int[]{1, 2}));
    }
}

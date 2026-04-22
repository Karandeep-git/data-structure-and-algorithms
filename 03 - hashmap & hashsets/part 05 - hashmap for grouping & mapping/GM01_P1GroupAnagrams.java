import java.util.*;

public class GM01_P1GroupAnagrams {

    public static List<List<String>> groupAnagramsSort(String[] strs) {

        HashMap<String, List<String>> group = new HashMap<>();

        for (String s : strs) {

            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            group.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(group.values());
    }
    
    public static List<List<String>> groupAnagramsCount(String[] strs) {

        HashMap<String, List<String>> groups = new HashMap<>();

        for (String s : strs) {

            int[] count = new int[26];

            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < 26; i++) {
                sb.append(count[i]);
                sb.append("#");
            }

            String key = sb.toString();

            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);

        }

        return new ArrayList<>(groups.values());
    }

    public static List<List<String>> groupAnagramsPrime(String[] strs) {

        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
                101 };

        HashMap<Long, List<String>> groups = new HashMap<>();

        for (String s : strs) {

            long key = 1;

            for (char c : s.toCharArray()) {
                key *= primes[c - 'a'];
            }

            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(groups.values());
    }
    
    public static void main(String[] args) {
        
        String[] input = { "eat", "tea", "tan", "ate", "nat", "bat" };

        System.out.println(groupAnagramsSort(input));
        System.out.println(groupAnagramsCount(input));
        System.out.println(groupAnagramsPrime(input));
    }
}
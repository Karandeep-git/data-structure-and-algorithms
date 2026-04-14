import java.util.*;

public class H06_P4ValidAnagram {

    public static boolean isAnagramSort(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] sc = s.toCharArray();
        char[] tc = s.toCharArray();

        Arrays.sort(sc);
        Arrays.sort(tc);

        return Arrays.equals(sc, tc);
    }
    
    public static boolean isAnagramArray(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAnagramMap(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {

            if (!map.containsKey(c)) {
                return false;
            }

            map.put(c, map.get(c) - 1);

            if (map.get(c) == 0) {
                map.remove(c);
            }
        }

        return map.isEmpty();
    }

    public static void main(String[] args) {
        
        System.out.println(isAnagramSort("anagram", "nagaram"));
        System.out.println(isAnagramArray("anagram", "nagaram"));
        System.out.println(isAnagramMap("anagram", "nagaram"));
    }
}
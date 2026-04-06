import java.util.*;

public class SlidingWindow02_FindAllAnagrams {

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        int[] pCount = new int[26];
        int[] windowCount = new int[26];

        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int k = p.length();

        for (int i = 0; i < k; i++) {
            windowCount[s.charAt(i) - 'a']++;
        }

        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (pCount[i] == windowCount[i]) {
                matches++;
            }
        }

        if (matches == 26) {
            result.add(0);
        }

        for (int i = k; i < s.length(); i++) {
            char entering = s.charAt(i);
            int eIdx = entering - 'a';

            if (windowCount[eIdx] == pCount[eIdx]) {
                matches--;
            }
                
            windowCount[eIdx]++;

            if (windowCount[eIdx] == pCount[eIdx]) {
                matches++;
            }

            char leaving = s.charAt(i - k);
            int lIdx = leaving - 'a';

            if (windowCount[lIdx] == pCount[lIdx]) {
                matches--;
            }
                
            windowCount[lIdx]--;

            if (windowCount[lIdx] == pCount[lIdx]) {
                matches++;
            }

            if (matches == 26) {
                result.add(i - k + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        
        System.out.println(findAnagrams("cbaebabacd", "abc"));
        System.out.println(findAnagrams("abab", "ab"));
        System.out.println(findAnagrams("aa", "bb"));
    }
}
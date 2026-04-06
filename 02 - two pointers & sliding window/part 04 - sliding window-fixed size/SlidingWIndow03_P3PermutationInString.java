public class SlidingWIndow03_P3PermutationInString {
    
    public static boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }

        int k = s1.length();

        for (int i = 0; i < k; i++) {
            windowCount[s2.charAt(i) - 'a']++;
        }

        int matches = 0;

        for (int i = 0; i < 26; i++) {
            if (s1Count[i] == windowCount[i]) {
                matches++;
            }
        }

        if (matches == 26) {
            return true;
        }

        for (int i = k; i < s2.length(); i++) {

            char entering = s2.charAt(i);
            int eIdx = entering - 'a';

            if (windowCount[eIdx] == s1Count[eIdx]) {
                matches--;
            }

            windowCount[eIdx]++;

            if (windowCount[eIdx] == s1Count[eIdx]) {
                matches++;
            }

            char leaving = s2.charAt(i - k);
            int lIdx = leaving - 'a';

            if (windowCount[lIdx] == s1Count[lIdx]) {
                matches--;
            }

            windowCount[lIdx]--;

            if (windowCount[lIdx] == s1Count[lIdx]) {
                matches++;
            }

            if (matches == 26) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        
        System.out.println(checkInclusion("ab", "eidbaooo"));
        System.out.println(checkInclusion("ab", "eidboaoo"));
        System.out.println(checkInclusion("adc", "dcda"));
        System.out.println(checkInclusion("hello", "ooolleoooleh"));
    }
}

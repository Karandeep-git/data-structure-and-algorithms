public class SlidingWindow04_P4LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {

        int[] count = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            int rightIdx = s.charAt(right) - 'A';

            count[rightIdx]++;

            maxFreq = Math.max(maxFreq, count[rightIdx]);

            int windowSize = right - left + 1;

            if (windowSize - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        
        System.out.println(characterReplacement("ABAB", 2));
        System.out.println(characterReplacement("AABABBA", 1));
        System.out.println(characterReplacement("AAAA", 2));
        System.out.println(characterReplacement("ABCDE", 1));
    }
}
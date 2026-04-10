public class SlidingWindow02_P2MinimumWindowSubstring {
    
    public static String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        int[] tCount = new int[128];
        int[] windowCount = new int[128];

        for (char c : t.toCharArray()) {
            tCount[c]++;
        }

        int required = 0;
        for (int i = 0; i < 128; i++) {
            if (tCount[i] > 0) {
                required++;
            }
        }

        int formed = 0;
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int resultLeft = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);

            windowCount[rightChar]++;

            if (tCount[rightChar] > 0 && windowCount[rightChar] == tCount[rightChar]) {
                formed++;
            }

            while (formed == required) {

                int windowLen = right - left + 1;

                if (windowLen < minLen) {
                    minLen = windowLen;
                    resultLeft = left;
                }

                char leftChar = s.charAt(left);
                windowCount[leftChar]--;

                if (tCount[leftChar] > 0 && windowCount[leftChar] < tCount[leftChar]) {
                    formed--;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(resultLeft, resultLeft + minLen);
    }

    public static void main(String[] args) {
        
        System.out.println(minWindow("ADODECODEBANC", "ABC"));
        System.out.println(minWindow("a", "a"));
        System.out.println(minWindow("aa", "aa"));
        System.out.println(minWindow("ab", "b"));
    }
}

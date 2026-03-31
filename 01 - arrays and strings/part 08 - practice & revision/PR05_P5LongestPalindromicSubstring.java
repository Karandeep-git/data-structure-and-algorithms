public class PR05_P5LongestPalindromicSubstring {
    
    private static int start = 0;
    private static int maxLen = 1;

    public static String longestPalindrome(String s) {

        if (s.length() < 2) {
            return s;
        }

        start = 0;
        maxLen = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            expandAroundCenter(s, i, i);
            expandAroundCenter(s, i, i + 1);
        }

        return s.substring(start, start + maxLen);
    }

    private static void expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        int len = right - left - 1;

        if (len > maxLen) {
            maxLen = len;
            start = left + 1;
        }
    }

    public static void main(String[] args) {
        
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("racecar"));
        System.out.println(longestPalindrome("a"));
    }
}

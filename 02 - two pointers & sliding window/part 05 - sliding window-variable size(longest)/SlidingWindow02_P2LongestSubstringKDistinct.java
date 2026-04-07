
import java.util.HashMap;

public class SlidingWindow02_P2LongestSubstringKDistinct {
    
    public static int lengthOfLongestSubstringKDistinct(String s, int k) {

        if (k == 0 || s.length() == 0) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            char rightChar = s.charAt(right);

            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

            while (map.size() > k) {

                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);

        }

        return maxLen;
    }

    public static void main(String[] args) {
        
        System.out.println(lengthOfLongestSubstringKDistinct("eceba", 2));
        System.out.println(lengthOfLongestSubstringKDistinct("aa", 1));
        System.out.println(lengthOfLongestSubstringKDistinct("acbebebe", 3));
        System.out.println(lengthOfLongestSubstringKDistinct("a", 0));
    }
}

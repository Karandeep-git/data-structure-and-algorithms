
import java.util.HashMap;

public class SlidingWindow03_P3LongestSubstringTwoDistinct {
    
    public static int lengthOfLongestSubstringTowDistinct(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            char rightChar = s.charAt(right);

            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

            while (map.size() > 2) {

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
        
        System.out.println(lengthOfLongestSubstringTowDistinct("eceba"));
        System.out.println(lengthOfLongestSubstringTowDistinct("ccaabbb"));
        System.out.println(lengthOfLongestSubstringTowDistinct("a"));
        System.out.println(lengthOfLongestSubstringTowDistinct("abcabcabc"));
    }
}

import java.util.*;

public class PR05_P5SubstringConcatenationAllWords {
 
    public static List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();

        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalCount = wordLen * wordCount;

        Map<String, Integer> wordMap = new HashMap<>();

        for (String w : words) {
            wordMap.put(w, wordMap.getOrDefault(w, 0) + 1);
        }

        for (int offset = 0; offset < wordLen; offset++) {

            Map<String, Integer> windowMap = new HashMap<>();

            int left = offset;
            int matched = 0;

            for (int right = offset; right + wordLen <= s.length(); right += wordLen) {

                String word = s.substring(right, right + wordLen);

                if (wordMap.containsKey(word)) {
                    windowMap.put(word, windowMap.getOrDefault(word, 0) + 1);
                    matched++;

                    while (windowMap.get(word) > wordMap.get(word)) {

                        String leftWord = s.substring(left, left + wordLen);
                        windowMap.put(leftWord, windowMap.get(leftWord) - 1);
                        matched--;
                        left += wordLen;
                    }

                    if (matched == wordCount) {
                        result.add(left);
                        String leftWord = s.substring(left, left + wordLen);
                        windowMap.put(leftWord, windowMap.get(leftWord) - 1);
                        matched--;
                        left += wordLen;
                    }
                } else {
                    windowMap.clear();
                    matched = 0;
                    left = right + wordLen;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        
        System.out.println(findSubstring("barfoothefoobarman", new String[]{"foo", "bar"}));
        System.out.println(findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "good"}));
        System.out.println(findSubstring("barbar", new String[]{"bar", "bar"}));
        System.out.println(findSubstring("aa", new String[]{"a"}));
    }

}

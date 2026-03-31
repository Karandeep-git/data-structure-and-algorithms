
import java.util.*;

public class PR06_P6GroupAnagrams {
    
    public static List<List<String>> groupAnaggrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        
        String[] input = { "eat", "tea", "tan", "ate", "nat", "bat" };

        List<List<String>> result = groupAnaggrams(input);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}

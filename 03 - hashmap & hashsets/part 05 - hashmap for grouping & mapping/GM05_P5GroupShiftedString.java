
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GM05_P5GroupShiftedString {
    public static List<List<String>> groupStrings(String[] strings) {

        HashMap<String, List<String>> groups = new HashMap<>();

        for (String s : strings) {
            String key = getKey(s);
            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(groups.values());
    }

    private static String getKey(String s) {

        if (s.length() == 1) {
            return "#";
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < s.length(); i++) {
            int diff = (s.charAt(i) - s.charAt(i - 1) + 26) % 26;
            sb.append(diff);
            sb.append("#");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        
        String[] input = { "abc", "bcd", "acef", "xyz", "az", "ba", "a", "z" };

        List<List<String>> result = groupStrings(input);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}

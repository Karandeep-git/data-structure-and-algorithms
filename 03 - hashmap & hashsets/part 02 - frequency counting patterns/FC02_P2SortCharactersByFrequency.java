
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FC02_P2SortCharactersByFrequency {
    
    public static String frequencySortMap(String s) {

        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        List<Character> chars = new ArrayList<>(freq.keySet());
        chars.sort((a, b) -> freq.get(b) - freq.get(a));

        StringBuilder sb = new StringBuilder();

        for (char c : chars) {
            int count = freq.get(c);
            for (int i = 0; i < count; i++) {
                sb.append(c);
            }
        }

        return sb.toString();

    }

    public static String frequencySortBucket(String s) {

        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        List<List<Character>> buckets = new ArrayList<>();

        for (int i = 0; i <= s.length(); i++) {
            buckets.add(new ArrayList<>());
        }

        for (char c : freq.keySet()) {
            buckets.get(freq.get(c)).add(c);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = s.length(); i >= 1; i--) {
            for (char c : buckets.get(i)) {
                for (int j = 0; j < i; j++) {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        
        System.out.println(frequencySortMap("tree"));
        System.out.println(frequencySortBucket("tree"));
    }

}

import java.util.HashMap;

public class H01_HashingBasics {
 
    public static void main(String[] args) {
        
        // HashMap — key-value, unordered, O(1) average

        HashMap<String, Integer> map = new HashMap<>();

        map.put("apple", 1);
        System.out.println(map.get("apple"));
        System.out.println(map.getOrDefault("mango", 0));
        System.out.println(map.containsKey("apple"));
        System.out.println(map.containsValue(1));
        System.out.println(map.remove("apple"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());

        
    }
}
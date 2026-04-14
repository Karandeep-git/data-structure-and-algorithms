
import java.util.HashSet;

public class H02_HashSetBasics {
    
    public static void main(String[] args) {
        
        // HashSet — unique elements, unordered, O(1) average

        HashSet<Integer> set = new HashSet<>();

        System.out.println(set.add(5));
        System.out.println(set.contains(5));
        System.out.println(set.remove(5));
        System.out.println(set.size());
    }
}

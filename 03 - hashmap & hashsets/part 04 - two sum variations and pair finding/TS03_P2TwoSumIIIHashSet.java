import java.util.*;

public class TS03_P2TwoSumIIIHashSet {
    
    @SuppressWarnings("FieldMayBeFinal")
    private List<Integer> nums = new ArrayList<>();
    @SuppressWarnings("FieldMayBeFinal")
    private HashSet<Integer> sums = new HashSet<>();

    public void add(int number) {
        for (int existing : nums) {
            sums.add(existing + number);
        }

        nums.add(number);
    }

    public boolean find(int value) {
        return sums.contains(value);
    }

    public static void main(String[] args) {
        
        TS03_P2TwoSumIIIHashSet ds2 = new TS03_P2TwoSumIIIHashSet();

        ds2.add(1);
        ds2.add(3);
        ds2.add(5);

        System.out.println(ds2.find(4));
        System.out.println(ds2.find(7));
        System.out.println(ds2.find(6));
    }
}

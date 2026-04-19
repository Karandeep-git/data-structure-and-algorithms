
import java.util.*;

public class TS02_P2TwoSumIIIHashMap {

    @SuppressWarnings("FieldMayBeFinal")
    private HashMap<Integer, Integer> freq = new HashMap<>();

    public void add(int number) {
        freq.put(number, freq.getOrDefault(number, 0) + 1);
    }

    public boolean find(int value) {
        for (int key : freq.keySet()) {
            int complement = value - key;

            if (complement == key) {
                if (freq.get(key) >= 2) {
                    return true;
                }
            } else {
                if (freq.containsKey(complement)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        TS02_P2TwoSumIIIHashMap ds1 = new TS02_P2TwoSumIIIHashMap();
        ds1.add(1);
        ds1.add(3);
        ds1.add(5);

        System.out.println(ds1.find(4));
        System.out.println(ds1.find(7));
        System.out.println(ds1.find(10));
    }
}


import java.util.HashMap;

public class String03_P3RomanToInteger {
    
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = map.get(s.charAt(i));

            if (curr < prev) {
                result -= curr;
            } else {
                result += curr;
            }

            prev = curr;
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("LVIII"));
    }
}

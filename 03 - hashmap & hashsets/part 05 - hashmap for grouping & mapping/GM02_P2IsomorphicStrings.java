import java.util.*;

public class GM02_P2IsomorphicStrings {
    
    public static boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> sToT = new HashMap<>();
        HashMap<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (sToT.containsKey(sc)) {
                if (sToT.get(sc) != tc) {
                    return false;
                }
            } else {
                if (tToS.containsKey(tc)) {
                    return false;
                }
            }

            sToT.put(sc, tc);
            tToS.put(tc, sc);
        }

        return true;
    }

    public static void main(String[] args) {
        
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("badc", "baba"));
        System.out.println(isIsomorphic("ab", "aa"));
    }
}

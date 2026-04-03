

public class Pointer04_P4IsSubsequence {
    
    public static boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            j++;
        }

        return i == s.length();
    }

    public static void main(String[] args) {
        
        System.out.println(isSubsequence("ace", "abcde"));
        System.out.println(isSubsequence("aec", "abcde"));
        System.out.println(isSubsequence("", "ahbgdc"));
        System.out.println(isSubsequence("b", "abc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }
}
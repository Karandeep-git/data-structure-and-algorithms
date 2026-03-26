public class String05_P5CheckIfTwoStringsAreAnagram {
    
    public static boolean isAnagram(String s1, String s2) {

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("Hello", "World"));
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}

public class FC01_P1FirstUniqueCharacter {

    public static int firstUniqueChar(String s) {

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {

            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(firstUniqueChar("leetcode"));
        System.out.println(firstUniqueChar("loveleetcode"));
        System.out.println(firstUniqueChar("aabb"));
        System.out.println(firstUniqueChar("z"));
    }
}
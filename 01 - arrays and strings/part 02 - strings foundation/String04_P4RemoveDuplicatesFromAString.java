public class String04_P4RemoveDuplicatesFromAString {
    
    public static String removeDuplicates(String s) {

        boolean[] seen = new boolean[26];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a';

            if (!seen[index]) {
                seen[index] = true;
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        
        System.out.println(removeDuplicates("programming"));
        System.out.println(removeDuplicates("aabbcc"));
    }
}

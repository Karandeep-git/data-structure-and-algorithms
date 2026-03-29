public class String01_P1LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String reference = strs[0];

        for (int i = 0; i < reference.length(); i++) {
            char c = reference.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return reference.substring(0, i);
                }
            }
        }

        return reference;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix((new String[]{"flower", "flow", "flight"})));
        System.out.println(longestCommonPrefix((new String[]{"dog", "racecar", "car"})));
        System.out.println(longestCommonPrefix((new String[]{"interview", "intern", "internal"})));
    }
}
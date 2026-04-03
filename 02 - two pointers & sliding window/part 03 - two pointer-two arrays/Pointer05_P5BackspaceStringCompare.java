public class Pointer05_P5BackspaceStringCompare {
    
    public static boolean backspaceCompareSimple(String s, String t) {
        return processString(s).equals(processString(t));
    }

    private static String processString(String str) {

        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != '#') {
                sb.append(c);
            } else if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }

    public static boolean backspaceCompare(String s, String t) {

        int i = s.length() - 1;
        int j = t.length() - 1;

        while (i >= 0 || j >= 0) {

            i = findNextValid(s, i);
            j = findNextValid(t, j);

            if (i < 0 && j < 0) {
                return true;
            }

            if (i < 0 || j < 0) {
                return false;
            }

            if (s.charAt(i) != t.charAt(j)) {
                return false;
            }

            i--;
            j--;
        }

        return true;
    }

    private static int findNextValid(String str, int index) {

        int skip = 0;

        while (index >= 0) {

            if (str.charAt(index) == '#') {
                skip++;
                index--;
            } else if (skip > 0) {
                skip--;
                index--;
            } else {
                break;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        
        System.out.println(backspaceCompare("ab#c", "ad#c"));
        System.out.println(backspaceCompare("ab##", "c#d#"));
        System.out.println(backspaceCompare("a#c", "b"));
        System.out.println(backspaceCompare("a##c", "#a#c"));
        System.out.println(backspaceCompare("y#fo##f", "y#f#0##f"));
    }
}

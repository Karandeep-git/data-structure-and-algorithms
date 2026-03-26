public class String02_P2CheckIfAStringIsAPalidrome {
    
    public static boolean isPalidrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
    
        System.out.println(isPalidrome("racecar"));
        System.out.println(isPalidrome("madam"));
        System.out.println(isPalidrome("hello"));
    }
}

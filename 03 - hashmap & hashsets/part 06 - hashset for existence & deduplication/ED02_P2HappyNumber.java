import java.util.*;

public class ED02_P2HappyNumber {

    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1) {

            if (seen.contains(n)) {
                return false;
            }

            seen.add(n);
            n = getSumOfSquares(n);
        }

        return true;
    }

    private static int getSumOfSquares(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
        System.out.println(isHappy(1));
        System.out.println(isHappy(7));
    }
}

import java.util.Arrays;



public class Prefix01_Fundamentals {
    
    public static void main(String[] args) {
        
        int[] arr = { 3, 1, 4, 1, 5, 9, 2 };
        int n = arr.length;

        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Prefix Sum Array: " + Arrays.toString(prefix));
    }
}
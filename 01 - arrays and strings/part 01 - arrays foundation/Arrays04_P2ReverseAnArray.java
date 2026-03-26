
import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays04_P2ReverseAnArray {
    
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println("Original array: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}

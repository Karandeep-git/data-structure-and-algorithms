
import java.util.Arrays;

public class Arrays06_LeftRotateAnArrayByOnePosition {
    
    public static void rotateByOne(int[] arr) {

        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = first;
    }

    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Original array: " + Arrays.toString(arr));
        rotateByOne(arr);
        System.out.println("Rotated array: " + Arrays.toString(arr));

        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }
    }
}

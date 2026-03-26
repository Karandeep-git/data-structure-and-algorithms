public class Arrays02_TraversalInArray {
    public static void main(String[] args) {
        
        int[] arr = { 10, 20, 30, 40, 50 };

        // Method 1 - normal for loop (use when you need the index)
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Method 2 - enhanced for loop (use when you just need the value)
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

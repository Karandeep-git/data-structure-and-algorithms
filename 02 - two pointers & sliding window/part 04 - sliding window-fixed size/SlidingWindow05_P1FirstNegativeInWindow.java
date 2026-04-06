import java.util.*;

public class SlidingWindow05_P1FirstNegativeInWindow {
    
    public static int[] firstNegative(int[] arr, int k) {

        int n = arr.length;
        int[] result = new int[n - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {

            if (arr[i] < 0) {
                deque.addLast(i);
            }
        }

        result[0] = deque.isEmpty() ? 0 : arr[deque.peekFirst()];

        for (int i = k; i < n; i++) {

            if (arr[i] < 0) {
                deque.addLast(i);
            }

            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.removeFirst();
            }

            result[i - k + 1] = deque.isEmpty() ? 0 : arr[deque.peekFirst()];
        }

        return result;
    }

    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(firstNegative(new int[]{12, -1, -7, 8, -15, 30, 16, 28}, 3)));
        System.out.println(Arrays.toString(firstNegative(new int[]{-8, 2, -6, -5, 3}, 2)));
        System.out.println(Arrays.toString(firstNegative(new int[]{1, 2, 3, 4}, 3)));
    }

}

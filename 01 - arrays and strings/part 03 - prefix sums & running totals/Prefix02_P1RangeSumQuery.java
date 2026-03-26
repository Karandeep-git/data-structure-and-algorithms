public class Prefix02_P1RangeSumQuery {
    
    static int[] prefix;

    public static void buildPrefix(int[] arr) {
        int n = arr.length;
        prefix = new int[n];

        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

    }

    public static int rangeSum(int L, int R) {
        if (L == 0) {
            return prefix[R];
        }

        return prefix[R] - prefix[L - 1];
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2};

        buildPrefix(arr);

        System.out.println(rangeSum(2, 5));
        System.out.println(rangeSum(0, 3));
        System.out.println(rangeSum(1, 1));
    }
}
